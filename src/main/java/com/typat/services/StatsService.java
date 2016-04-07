package com.typat.services;


import com.typat.models.stats.EventsForMatch;
import com.typat.models.stats.MatchesForPlayer;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

/**
 * @author ddctgregory
 * @since 4/6/16
 */
@Service
public class StatsService {
	private static final String STATS_URI = ServiceConfig.HOST + "/stats/h5";

	@Autowired
	RestTemplate restTemplate;

	public MatchesForPlayer getMatchesForPlayer(String player, String modes, String start, String count) throws URISyntaxException {
		String url = STATS_URI + "/players/" + player + "/matches";
		URIBuilder b = new URIBuilder(url);
		if (modes != null) {
			b.addParameter("modes", modes);
		}
		if (start != null) {
			b.addParameter("start", start);
		}
		if (count != null) {
			b.addParameter("count", count);
		}
		String finalUrl = b.build().toString();
		ResponseEntity<MatchesForPlayer> forEntity = restTemplate.getForEntity(finalUrl, MatchesForPlayer.class);
		if (forEntity.getStatusCode().equals(HttpStatus.OK)) {
			return forEntity.getBody();
		}
		return null;
	}

	public EventsForMatch getEventsForMatch(String matchId) {
		String url = STATS_URI + "/matches/" + matchId + "/events";
		ResponseEntity<EventsForMatch> forEntity = restTemplate.getForEntity(url, EventsForMatch.class);
		if (forEntity.getStatusCode().equals(HttpStatus.OK)) {
			return forEntity.getBody();
		}
		return null;
	}
}