package com.typat.models.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ddctgregory
 * @since 4/6/16
 */
public class Commendation {
	private String type;
	private String name;
	private String description;
	private String iconImageUrl;
	private List<Level> levels = new ArrayList<>();
	private List<Object> requiredLevels = new ArrayList<>();
	private Object reward;
	private Category category;
	private String id;
	private String contentId;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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

	public String getIconImageUrl() {
		return iconImageUrl;
	}

	public void setIconImageUrl(String iconImageUrl) {
		this.iconImageUrl = iconImageUrl;
	}

	public List<Level> getLevels() {
		return levels;
	}

	public void setLevels(List<Level> levels) {
		this.levels = levels;
	}

	public List<Object> getRequiredLevels() {
		return requiredLevels;
	}

	public void setRequiredLevels(List<Object> requiredLevels) {
		this.requiredLevels = requiredLevels;
	}

	public Object getReward() {
		return reward;
	}

	public void setReward(Object reward) {
		this.reward = reward;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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
