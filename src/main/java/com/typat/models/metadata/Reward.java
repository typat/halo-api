package com.typat.models.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ddctgregory
 * @since 4/6/16
 */
public class Reward {
	private Integer xp;
	private List<RequisitionPack> requisitionPacks = new ArrayList<>();
	private String id;
	private String contentId;

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public List<RequisitionPack> getRequisitionPacks() {
		return requisitionPacks;
	}

	public void setRequisitionPacks(List<RequisitionPack> requisitionPacks) {
		this.requisitionPacks = requisitionPacks;
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
