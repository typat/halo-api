
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Player",
    "TeamId",
    "Rank",
    "Result",
    "TotalKills",
    "TotalDeaths",
    "TotalAssists",
    "PreMatchRatings",
    "PostMatchRatings"
})
public class Player {

    @JsonProperty("Player")
    private Player_ Player;
    @JsonProperty("TeamId")
    private int TeamId;
    @JsonProperty("Rank")
    private int Rank;
    @JsonProperty("Result")
    private int Result;
    @JsonProperty("TotalKills")
    private int TotalKills;
    @JsonProperty("TotalDeaths")
    private int TotalDeaths;
    @JsonProperty("TotalAssists")
    private int TotalAssists;
    @JsonProperty("PreMatchRatings")
    private Object PreMatchRatings;
    @JsonProperty("PostMatchRatings")
    private Object PostMatchRatings;

    /**
     * 
     * @return
     *     The Player
     */
    @JsonProperty("Player")
    public Player_ getPlayer() {
        return Player;
    }

    /**
     * 
     * @param Player
     *     The Player
     */
    @JsonProperty("Player")
    public void setPlayer(Player_ Player) {
        this.Player = Player;
    }

    /**
     * 
     * @return
     *     The TeamId
     */
    @JsonProperty("TeamId")
    public int getTeamId() {
        return TeamId;
    }

    /**
     * 
     * @param TeamId
     *     The TeamId
     */
    @JsonProperty("TeamId")
    public void setTeamId(int TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * 
     * @return
     *     The Rank
     */
    @JsonProperty("Rank")
    public int getRank() {
        return Rank;
    }

    /**
     * 
     * @param Rank
     *     The Rank
     */
    @JsonProperty("Rank")
    public void setRank(int Rank) {
        this.Rank = Rank;
    }

    /**
     * 
     * @return
     *     The Result
     */
    @JsonProperty("Result")
    public int getResult() {
        return Result;
    }

    /**
     * 
     * @param Result
     *     The Result
     */
    @JsonProperty("Result")
    public void setResult(int Result) {
        this.Result = Result;
    }

    /**
     * 
     * @return
     *     The TotalKills
     */
    @JsonProperty("TotalKills")
    public int getTotalKills() {
        return TotalKills;
    }

    /**
     * 
     * @param TotalKills
     *     The TotalKills
     */
    @JsonProperty("TotalKills")
    public void setTotalKills(int TotalKills) {
        this.TotalKills = TotalKills;
    }

    /**
     * 
     * @return
     *     The TotalDeaths
     */
    @JsonProperty("TotalDeaths")
    public int getTotalDeaths() {
        return TotalDeaths;
    }

    /**
     * 
     * @param TotalDeaths
     *     The TotalDeaths
     */
    @JsonProperty("TotalDeaths")
    public void setTotalDeaths(int TotalDeaths) {
        this.TotalDeaths = TotalDeaths;
    }

    /**
     * 
     * @return
     *     The TotalAssists
     */
    @JsonProperty("TotalAssists")
    public int getTotalAssists() {
        return TotalAssists;
    }

    /**
     * 
     * @param TotalAssists
     *     The TotalAssists
     */
    @JsonProperty("TotalAssists")
    public void setTotalAssists(int TotalAssists) {
        this.TotalAssists = TotalAssists;
    }

    /**
     * 
     * @return
     *     The PreMatchRatings
     */
    @JsonProperty("PreMatchRatings")
    public Object getPreMatchRatings() {
        return PreMatchRatings;
    }

    /**
     * 
     * @param PreMatchRatings
     *     The PreMatchRatings
     */
    @JsonProperty("PreMatchRatings")
    public void setPreMatchRatings(Object PreMatchRatings) {
        this.PreMatchRatings = PreMatchRatings;
    }

    /**
     * 
     * @return
     *     The PostMatchRatings
     */
    @JsonProperty("PostMatchRatings")
    public Object getPostMatchRatings() {
        return PostMatchRatings;
    }

    /**
     * 
     * @param PostMatchRatings
     *     The PostMatchRatings
     */
    @JsonProperty("PostMatchRatings")
    public void setPostMatchRatings(Object PostMatchRatings) {
        this.PostMatchRatings = PostMatchRatings;
    }

}
