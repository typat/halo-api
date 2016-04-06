
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
    "Id",
    "HopperId",
    "MapId",
    "MapVariant",
    "GameBaseVariantId",
    "GameVariant",
    "MatchDuration",
    "MatchCompletedDate",
    "Teams",
    "Players",
    "IsTeamGame",
    "SeasonId",
    "MatchCompletedDateFidelity"
})
public class Result {

    @JsonProperty("Links")
    private Links Links;
    @JsonProperty("Id")
    private Id Id;
    @JsonProperty("HopperId")
    private String HopperId;
    @JsonProperty("MapId")
    private String MapId;
    @JsonProperty("MapVariant")
    private MapVariant MapVariant;
    @JsonProperty("GameBaseVariantId")
    private String GameBaseVariantId;
    @JsonProperty("GameVariant")
    private GameVariant GameVariant;
    @JsonProperty("MatchDuration")
    private String MatchDuration;
    @JsonProperty("MatchCompletedDate")
    private MatchCompletedDate MatchCompletedDate;
    @JsonProperty("Teams")
    private List<Team> Teams = new ArrayList<Team>();
    @JsonProperty("Players")
    private List<Player> Players = new ArrayList<Player>();
    @JsonProperty("IsTeamGame")
    private boolean IsTeamGame;
    @JsonProperty("SeasonId")
    private Object SeasonId;
    @JsonProperty("MatchCompletedDateFidelity")
    private int MatchCompletedDateFidelity;

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
     *     The Id
     */
    @JsonProperty("Id")
    public Id getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    @JsonProperty("Id")
    public void setId(Id Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The HopperId
     */
    @JsonProperty("HopperId")
    public String getHopperId() {
        return HopperId;
    }

    /**
     * 
     * @param HopperId
     *     The HopperId
     */
    @JsonProperty("HopperId")
    public void setHopperId(String HopperId) {
        this.HopperId = HopperId;
    }

    /**
     * 
     * @return
     *     The MapId
     */
    @JsonProperty("MapId")
    public String getMapId() {
        return MapId;
    }

    /**
     * 
     * @param MapId
     *     The MapId
     */
    @JsonProperty("MapId")
    public void setMapId(String MapId) {
        this.MapId = MapId;
    }

    /**
     * 
     * @return
     *     The MapVariant
     */
    @JsonProperty("MapVariant")
    public MapVariant getMapVariant() {
        return MapVariant;
    }

    /**
     * 
     * @param MapVariant
     *     The MapVariant
     */
    @JsonProperty("MapVariant")
    public void setMapVariant(MapVariant MapVariant) {
        this.MapVariant = MapVariant;
    }

    /**
     * 
     * @return
     *     The GameBaseVariantId
     */
    @JsonProperty("GameBaseVariantId")
    public String getGameBaseVariantId() {
        return GameBaseVariantId;
    }

    /**
     * 
     * @param GameBaseVariantId
     *     The GameBaseVariantId
     */
    @JsonProperty("GameBaseVariantId")
    public void setGameBaseVariantId(String GameBaseVariantId) {
        this.GameBaseVariantId = GameBaseVariantId;
    }

    /**
     * 
     * @return
     *     The GameVariant
     */
    @JsonProperty("GameVariant")
    public GameVariant getGameVariant() {
        return GameVariant;
    }

    /**
     * 
     * @param GameVariant
     *     The GameVariant
     */
    @JsonProperty("GameVariant")
    public void setGameVariant(GameVariant GameVariant) {
        this.GameVariant = GameVariant;
    }

    /**
     * 
     * @return
     *     The MatchDuration
     */
    @JsonProperty("MatchDuration")
    public String getMatchDuration() {
        return MatchDuration;
    }

    /**
     * 
     * @param MatchDuration
     *     The MatchDuration
     */
    @JsonProperty("MatchDuration")
    public void setMatchDuration(String MatchDuration) {
        this.MatchDuration = MatchDuration;
    }

    /**
     * 
     * @return
     *     The MatchCompletedDate
     */
    @JsonProperty("MatchCompletedDate")
    public MatchCompletedDate getMatchCompletedDate() {
        return MatchCompletedDate;
    }

    /**
     * 
     * @param MatchCompletedDate
     *     The MatchCompletedDate
     */
    @JsonProperty("MatchCompletedDate")
    public void setMatchCompletedDate(MatchCompletedDate MatchCompletedDate) {
        this.MatchCompletedDate = MatchCompletedDate;
    }

    /**
     * 
     * @return
     *     The Teams
     */
    @JsonProperty("Teams")
    public List<Team> getTeams() {
        return Teams;
    }

    /**
     * 
     * @param Teams
     *     The Teams
     */
    @JsonProperty("Teams")
    public void setTeams(List<Team> Teams) {
        this.Teams = Teams;
    }

    /**
     * 
     * @return
     *     The Players
     */
    @JsonProperty("Players")
    public List<Player> getPlayers() {
        return Players;
    }

    /**
     * 
     * @param Players
     *     The Players
     */
    @JsonProperty("Players")
    public void setPlayers(List<Player> Players) {
        this.Players = Players;
    }

    /**
     * 
     * @return
     *     The IsTeamGame
     */
    @JsonProperty("IsTeamGame")
    public boolean isIsTeamGame() {
        return IsTeamGame;
    }

    /**
     * 
     * @param IsTeamGame
     *     The IsTeamGame
     */
    @JsonProperty("IsTeamGame")
    public void setIsTeamGame(boolean IsTeamGame) {
        this.IsTeamGame = IsTeamGame;
    }

    /**
     * 
     * @return
     *     The SeasonId
     */
    @JsonProperty("SeasonId")
    public Object getSeasonId() {
        return SeasonId;
    }

    /**
     * 
     * @param SeasonId
     *     The SeasonId
     */
    @JsonProperty("SeasonId")
    public void setSeasonId(Object SeasonId) {
        this.SeasonId = SeasonId;
    }

    /**
     * 
     * @return
     *     The MatchCompletedDateFidelity
     */
    @JsonProperty("MatchCompletedDateFidelity")
    public int getMatchCompletedDateFidelity() {
        return MatchCompletedDateFidelity;
    }

    /**
     * 
     * @param MatchCompletedDateFidelity
     *     The MatchCompletedDateFidelity
     */
    @JsonProperty("MatchCompletedDateFidelity")
    public void setMatchCompletedDateFidelity(int MatchCompletedDateFidelity) {
        this.MatchCompletedDateFidelity = MatchCompletedDateFidelity;
    }

}
