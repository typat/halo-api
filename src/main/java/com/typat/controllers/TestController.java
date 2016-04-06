package com.typat.controllers;

import com.typat.models.metadata.Weapon;
import com.typat.services.MetadataService;
import com.typat.services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

/**
 * @author ddctgregory
 * @since 4/5/16
 */
@Component
@RestController
public class TestController {

	@Autowired
	MetadataService metadataService;

	@Autowired
	StatsService statsService;

	@RequestMapping("/")
	public void test() throws URISyntaxException {
		statsService.getMatchesForPlayer("typat", null, null, null);
//		Weapon[] weapons = metadataService.getWeapons();
	}
}