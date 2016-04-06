
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Self"
})
public class Links_ {

    @JsonProperty("Self")
    private Self Self;

    /**
     * 
     * @return
     *     The Self
     */
    @JsonProperty("Self")
    public Self getSelf() {
        return Self;
    }

    /**
     * 
     * @param Self
     *     The Self
     */
    @JsonProperty("Self")
    public void setSelf(Self Self) {
        this.Self = Self;
    }

}
