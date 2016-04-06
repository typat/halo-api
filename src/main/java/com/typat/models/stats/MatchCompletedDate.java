
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ISO8601Date"
})
public class MatchCompletedDate {

    @JsonProperty("ISO8601Date")
    private String ISO8601Date;

    /**
     * 
     * @return
     *     The ISO8601Date
     */
    @JsonProperty("ISO8601Date")
    public String getISO8601Date() {
        return ISO8601Date;
    }

    /**
     * 
     * @param ISO8601Date
     *     The ISO8601Date
     */
    @JsonProperty("ISO8601Date")
    public void setISO8601Date(String ISO8601Date) {
        this.ISO8601Date = ISO8601Date;
    }

}
