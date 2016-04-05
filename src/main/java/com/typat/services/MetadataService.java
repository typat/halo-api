package com.typat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author typat
 * @since 4/5/16
 */
@Service
public class MetadataService {
	private static final String GET_CAMPAIGN_MISSIONS = "/metadata/h5/metadata/campaign-missions";

	@Autowired
	RestTemplate restTemplate;

	public void getCampaignMissions() {
		ResponseEntity<String> forEntity = restTemplate.getForEntity(ServiceConfig.HOST + GET_CAMPAIGN_MISSIONS, String.class);
	}
}