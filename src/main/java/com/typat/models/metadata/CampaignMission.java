package com.typat.models.metadata;

/**
 * @author ddctgregory
 * @since 4/6/16
 */
public class CampaignMission {
	private int missionNumber;
	private String name;
	private String description;
	private String imageUrl;
	private String type;
	private String id;
	private String contentId;

	public int getMissionNumber() {
		return missionNumber;
	}

	public void setMissionNumber(int missionNumber) {
		this.missionNumber = missionNumber;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
