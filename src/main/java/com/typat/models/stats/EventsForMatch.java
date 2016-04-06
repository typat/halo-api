
package com.typat.models.stats;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Links",
    "GameEvents",
    "IsCompleteSetOfEvents"
})
public class EventsForMatch {

    @JsonProperty("Links")
    private Links Links;
    @JsonProperty("GameEvents")
    private List<GameEvent> GameEvents = new ArrayList<GameEvent>();
    @JsonProperty("IsCompleteSetOfEvents")
    private boolean IsCompleteSetOfEvents;

    /**
     * 
     * @return
     *     The Links
     */
    @JsonProperty("Links")
    public Links getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The Links
     */
    @JsonProperty("Links")
    public void setLinks(Links Links) {
        this.Links = Links;
    }

    /**
     * 
     * @return
     *     The GameEvents
     */
    @JsonProperty("GameEvents")
    public List<GameEvent> getGameEvents() {
        return GameEvents;
    }

    /**
     * 
     * @param GameEvents
     *     The GameEvents
     */
    @JsonProperty("GameEvents")
    public void setGameEvents(List<GameEvent> GameEvents) {
        this.GameEvents = GameEvents;
    }

    /**
     * 
     * @return
     *     The IsCompleteSetOfEvents
     */
    @JsonProperty("IsCompleteSetOfEvents")
    public boolean isIsCompleteSetOfEvents() {
        return IsCompleteSetOfEvents;
    }

    /**
     * 
     * @param IsCompleteSetOfEvents
     *     The IsCompleteSetOfEvents
     */
    @JsonProperty("IsCompleteSetOfEvents")
    public void setIsCompleteSetOfEvents(boolean IsCompleteSetOfEvents) {
        this.IsCompleteSetOfEvents = IsCompleteSetOfEvents;
    }

}
