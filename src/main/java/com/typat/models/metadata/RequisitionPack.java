package com.typat.models.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ddctgregory
 * @since 4/6/16
 */
public class RequisitionPack {
	private String name;
	private String description;
	private String largeImageUrl;
	private Boolean isStack;
	private Boolean isFeatured;
	private Boolean isNew;
	private Integer creditPrice;
	private Boolean isPurchasableWithCredits;
	private Boolean isPurchasableFromMarketplace;
	private Object xboxMarketplaceProductId;
	private Object xboxMarketplaceProductUrl;
	private Integer merchandisingOrder;
	private Object flair;
	private List<Object> stackedRequisitionPacks = new ArrayList<>();
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

	public String getLargeImageUrl() {
		return largeImageUrl;
	}

	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}

	public Boolean getStack() {
		return isStack;
	}

	public void setStack(Boolean stack) {
		isStack = stack;
	}

	public Boolean getFeatured() {
		return isFeatured;
	}

	public void setFeatured(Boolean featured) {
		isFeatured = featured;
	}

	public Boolean getNew() {
		return isNew;
	}

	public void setNew(Boolean aNew) {
		isNew = aNew;
	}

	public Integer getCreditPrice() {
		return creditPrice;
	}

	public void setCreditPrice(Integer creditPrice) {
		this.creditPrice = creditPrice;
	}

	public Boolean getPurchasableWithCredits() {
		return isPurchasableWithCredits;
	}

	public void setPurchasableWithCredits(Boolean purchasableWithCredits) {
		isPurchasableWithCredits = purchasableWithCredits;
	}

	public Boolean getPurchasableFromMarketplace() {
		return isPurchasableFromMarketplace;
	}

	public void setPurchasableFromMarketplace(Boolean purchasableFromMarketplace) {
		isPurchasableFromMarketplace = purchasableFromMarketplace;
	}

	public Object getXboxMarketplaceProductId() {
		return xboxMarketplaceProductId;
	}

	public void setXboxMarketplaceProductId(Object xboxMarketplaceProductId) {
		this.xboxMarketplaceProductId = xboxMarketplaceProductId;
	}

	public Object getXboxMarketplaceProductUrl() {
		return xboxMarketplaceProductUrl;
	}

	public void setXboxMarketplaceProductUrl(Object xboxMarketplaceProductUrl) {
		this.xboxMarketplaceProductUrl = xboxMarketplaceProductUrl;
	}

	public Integer getMerchandisingOrder() {
		return merchandisingOrder;
	}

	public void setMerchandisingOrder(Integer merchandisingOrder) {
		this.merchandisingOrder = merchandisingOrder;
	}

	public Object getFlair() {
		return flair;
	}

	public void setFlair(Object flair) {
		this.flair = flair;
	}

	public List<Object> getStackedRequisitionPacks() {
		return stackedRequisitionPacks;
	}

	public void setStackedRequisitionPacks(List<Object> stackedRequisitionPacks) {
		this.stackedRequisitionPacks = stackedRequisitionPacks;
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
