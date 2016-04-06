package com.typat.models.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ddctgregory
 * @since 4/6/16
 */
public class Map {
	private String name;
	private String description;
	private List<String> supportedGameModes = new ArrayList<>();
	private String imageUrl;
	private String id;
	private String contentId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getSupportedGameModes() {
		return supportedGameModes;
	}

	public void setSupportedGameModes(List<String> supportedGameModes) {
		this.supportedGameModes = supportedGameModes;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
}
