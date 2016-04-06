package com.typat.models.metadata;

/**
 * @author ddctgregory
 * @since 4/6/16
 */
public class FlexibleStat {
	private String name;
	private String type;
	private String id;
	private String contentId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
