package com.typat.controllers;

import com.typat.services.MetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ddctgregory
 * @since 4/5/16
 */
@Component
@RestController
public class TestController {

	@Autowired
	MetadataService metadataService;

	@RequestMapping("/")
	public void test() {
		metadataService.getCampaignMissions();
	}
}