
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "MatchId",
    "GameMode"
})
public class Id {

    @JsonProperty("MatchId")
    private String MatchId;
    @JsonProperty("GameMode")
    private int GameMode;

    /**
     * 
     * @return
     *     The MatchId
     */
    @JsonProperty("MatchId")
    public String getMatchId() {
        return MatchId;
    }

    /**
     * 
     * @param MatchId
     *     The MatchId
     */
    @JsonProperty("MatchId")
    public void setMatchId(String MatchId) {
        this.MatchId = MatchId;
    }

    /**
     * 
     * @return
     *     The GameMode
     */
    @JsonProperty("GameMode")
    public int getGameMode() {
        return GameMode;
    }

    /**
     * 
     * @param GameMode
     *     The GameMode
     */
    @JsonProperty("GameMode")
    public void setGameMode(int GameMode) {
        this.GameMode = GameMode;
    }

}
