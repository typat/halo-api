
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Gamertag",
    "Xuid"
})
public class Player_ {

    @JsonProperty("Gamertag")
    private String Gamertag;
    @JsonProperty("Xuid")
    private Object Xuid;

    /**
     * 
     * @return
     *     The Gamertag
     */
    @JsonProperty("Gamertag")
    public String getGamertag() {
        return Gamertag;
    }

    /**
     * 
     * @param Gamertag
     *     The Gamertag
     */
    @JsonProperty("Gamertag")
    public void setGamertag(String Gamertag) {
        this.Gamertag = Gamertag;
    }

    /**
     * 
     * @return
     *     The Xuid
     */
    @JsonProperty("Xuid")
    public Object getXuid() {
        return Xuid;
    }

    /**
     * 
     * @param Xuid
     *     The Xuid
     */
    @JsonProperty("Xuid")
    public void setXuid(Object Xuid) {
        this.Xuid = Xuid;
    }

}
