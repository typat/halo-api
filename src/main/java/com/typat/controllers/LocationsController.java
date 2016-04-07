package com.typat.controllers;

import com.typat.models.metadata.Weapon;
import com.typat.models.stats.EventsForMatch;
import com.typat.models.stats.GameEvent;
import com.typat.models.stats.KillerWorldLocation;
import com.typat.models.stats.Result;
import com.typat.services.MetadataService;
import com.typat.services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ddctgregory
 * @since 4/5/16
 */
@Component
@RestController
@RequestMapping("/locations")
public class LocationsController {

	@Autowired
	MetadataService metadataService;

	@Autowired
	StatsService statsService;

	@RequestMapping("/")
	public void test() throws URISyntaxException {
		statsService.getMatchesForPlayer("typat", null, null, null);
//		Weapon[] weapons = metadataService.getWeapons();
	}

	@RequestMapping("/gun/{gun}")
	public List<KillerWorldLocation> getShotgunKills(@PathVariable("gun") String gun) throws URISyntaxException {
		Long weaponId = 0L;
		for (Weapon weapon : metadataService.getWeapons()) {
			if (weapon.getName().equalsIgnoreCase(gun)) {
				weaponId = Long.valueOf(weapon.getId());
			}
		}

		List<KillerWorldLocation> killerWorldLocationList = new ArrayList<>();

		List<Result> matches = statsService.getMatchesForPlayer("typat", null, null, "5").getResults();
		List<EventsForMatch> eventsForMatches = matches.parallelStream().map(match ->
				statsService.getEventsForMatch(match.getId().getMatchId())).collect(Collectors.toList());

		Long finalWeaponId = weaponId;
		for (EventsForMatch eventsForMatch : eventsForMatches) {
			killerWorldLocationList.addAll(eventsForMatch.getGameEvents().parallelStream().filter(gameEvent ->
					gameEvent.getKillerWeaponStockId() == finalWeaponId).map(GameEvent::getKillerWorldLocation).collect(Collectors.toList()));
		}

		killerWorldLocationList.sort((o1, o2) -> Double.compare(o1.getX(), o2.getX()));
		return killerWorldLocationList;
	}
}