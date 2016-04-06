
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ResourceType",
    "ResourceId",
    "OwnerType",
    "Owner"
})
public class MapVariant {

    @JsonProperty("ResourceType")
    private int ResourceType;
    @JsonProperty("ResourceId")
    private String ResourceId;
    @JsonProperty("OwnerType")
    private int OwnerType;
    @JsonProperty("Owner")
    private String Owner;

    /**
     * 
     * @return
     *     The ResourceType
     */
    @JsonProperty("ResourceType")
    public int getResourceType() {
        return ResourceType;
    }

    /**
     * 
     * @param ResourceType
     *     The ResourceType
     */
    @JsonProperty("ResourceType")
    public void setResourceType(int ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * 
     * @return
     *     The ResourceId
     */
    @JsonProperty("ResourceId")
    public String getResourceId() {
        return ResourceId;
    }

    /**
     * 
     * @param ResourceId
     *     The ResourceId
     */
    @JsonProperty("ResourceId")
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * 
     * @return
     *     The OwnerType
     */
    @JsonProperty("OwnerType")
    public int getOwnerType() {
        return OwnerType;
    }

    /**
     * 
     * @param OwnerType
     *     The OwnerType
     */
    @JsonProperty("OwnerType")
    public void setOwnerType(int OwnerType) {
        this.OwnerType = OwnerType;
    }

    /**
     * 
     * @return
     *     The Owner
     */
    @JsonProperty("Owner")
    public String getOwner() {
        return Owner;
    }

    /**
     * 
     * @param Owner
     *     The Owner
     */
    @JsonProperty("Owner")
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

}
