package com.typat.services;

import com.typat.models.metadata.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author typat
 * @since 4/5/16
 */
@Service
public class MetadataService {
	private static final String METADATA_URI = "/metadata/h5/metadata/";

	@Autowired
	RestTemplate restTemplate;

	public CampaignMission[] getCampaignMissions() {
		String url = ServiceConfig.HOST + METADATA_URI + "campaign_missions";
		ResponseEntity<CampaignMission[]> forEntity = restTemplate.getForEntity(url, CampaignMission[].class);
		if (forEntity.getStatusCode().equals(HttpStatus.OK)) {
			return forEntity.getBody();
		}
		return null;
	}

	public Commendation[] getCommendations() {
		String url = ServiceConfig.HOST + METADATA_URI + "commendations";
		ResponseEntity<Commendation[]> forEntity = restTemplate.getForEntity(url, Commendation[].class);
		if (forEntity.getStatusCode().equals(HttpStatus.OK)) {
			return forEntity.getBody();
		}
		return null;
	}

	public Map[] getMaps() {
		String url = ServiceConfig.HOST + METADATA_URI + "maps";
		ResponseEntity<Map[]> forEntity = restTemplate.getForEntity(url, Map[].class);
		if (forEntity.getStatusCode().equals(HttpStatus.OK)) {
			return forEntity.getBody();
		}
		return null;
	}

	public Weapon[] getWeapons() {
		String url = ServiceConfig.HOST + METADATA_URI + "weapons";
		ResponseEntity<Weapon[]> forEntity = restTemplate.getForEntity(url, Weapon[].class);
		if (forEntity.getStatusCode().equals(HttpStatus.OK)) {
			return forEntity.getBody();
		}
		return null;
	}

	public Vehicle[] getVehicles() {
		String url = ServiceConfig.HOST + METADATA_URI + "weapons";
		ResponseEntity<Vehicle[]> forEntity = restTemplate.getForEntity(url, Vehicle[].class);
		if (forEntity.getStatusCode().equals(HttpStatus.OK)) {
			return forEntity.getBody();
		}
		return null;
	}

	public FlexibleStat[] getFlexibleStats() {
		String url = ServiceConfig.HOST + METADATA_URI + "weapons";
		ResponseEntity<FlexibleStat[]> forEntity = restTemplate.getForEntity(url, FlexibleStat[].class);
		if (forEntity.getStatusCode().equals(HttpStatus.OK)) {
			return forEntity.getBody();
		}
		return null;
	}
}