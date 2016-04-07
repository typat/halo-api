package com.typat.models.metadata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
		"name",
		"description",
		"type",
		"largeIconImageUrl",
		"smallIconImageUrl",
		"isUsableByPlayer",
		"id",
		"contentId"
})
public class Weapon {

	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("type")
	private String type;
	@JsonProperty("largeIconImageUrl")
	private String largeIconImageUrl;
	@JsonProperty("smallIconImageUrl")
	private String smallIconImageUrl;
	@JsonProperty("isUsableByPlayer")
	private boolean isUsableByPlayer;
	@JsonProperty("id")
	private String id;
	@JsonProperty("contentId")
	private String contentId;

	/**
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * @param name The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The description
	 */
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	/**
	 * @param description The description
	 */
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 * @param type The type
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return The largeIconImageUrl
	 */
	@JsonProperty("largeIconImageUrl")
	public String getLargeIconImageUrl() {
		return largeIconImageUrl;
	}

	/**
	 * @param largeIconImageUrl The largeIconImageUrl
	 */
	@JsonProperty("largeIconImageUrl")
	public void setLargeIconImageUrl(String largeIconImageUrl) {
		this.largeIconImageUrl = largeIconImageUrl;
	}

	/**
	 * @return The smallIconImageUrl
	 */
	@JsonProperty("smallIconImageUrl")
	public String getSmallIconImageUrl() {
		return smallIconImageUrl;
	}

	/**
	 * @param smallIconImageUrl The smallIconImageUrl
	 */
	@JsonProperty("smallIconImageUrl")
	public void setSmallIconImageUrl(String smallIconImageUrl) {
		this.smallIconImageUrl = smallIconImageUrl;
	}

	/**
	 * @return The isUsableByPlayer
	 */
	@JsonProperty("isUsableByPlayer")
	public boolean isIsUsableByPlayer() {
		return isUsableByPlayer;
	}

	/**
	 * @param isUsableByPlayer The isUsableByPlayer
	 */
	@JsonProperty("isUsableByPlayer")
	public void setIsUsableByPlayer(boolean isUsableByPlayer) {
		this.isUsableByPlayer = isUsableByPlayer;
	}

	/**
	 * @return The id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * @param id The id
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return The contentId
	 */
	@JsonProperty("contentId")
	public String getContentId() {
		return contentId;
	}

	/**
	 * @param contentId The contentId
	 */
	@JsonProperty("contentId")
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
}