package com.typat.models.metadata;

/**
 * @author ddctgregory
 * @since 4/6/16
 */
public class Vehicle {
	private String name;
	private String description;
	private String largeIconImageUrl;
	private String smallIconImageUrl;
	private Boolean isUsableByPlayer;
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

	public String getLargeIconImageUrl() {
		return largeIconImageUrl;
	}

	public void setLargeIconImageUrl(String largeIconImageUrl) {
		this.largeIconImageUrl = largeIconImageUrl;
	}

	public String getSmallIconImageUrl() {
		return smallIconImageUrl;
	}

	public void setSmallIconImageUrl(String smallIconImageUrl) {
		this.smallIconImageUrl = smallIconImageUrl;
	}

	public Boolean getUsableByPlayer() {
		return isUsableByPlayer;
	}

	public void setUsableByPlayer(Boolean usableByPlayer) {
		isUsableByPlayer = usableByPlayer;
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
