
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Id",
    "Score",
    "Rank"
})
public class Team {

    @JsonProperty("Id")
    private int Id;
    @JsonProperty("Score")
    private int Score;
    @JsonProperty("Rank")
    private int Rank;

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("Id")
    public int getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    @JsonProperty("Id")
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The Score
     */
    @JsonProperty("Score")
    public int getScore() {
        return Score;
    }

    /**
     * 
     * @param Score
     *     The Score
     */
    @JsonProperty("Score")
    public void setScore(int Score) {
        this.Score = Score;
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

}
