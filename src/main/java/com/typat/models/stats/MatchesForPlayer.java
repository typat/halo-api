
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
    "Start",
    "Count",
    "ResultCount",
    "Results",
    "Links"
})
public class MatchesForPlayer {

    @JsonProperty("Start")
    private int Start;
    @JsonProperty("Count")
    private int Count;
    @JsonProperty("ResultCount")
    private int ResultCount;
    @JsonProperty("Results")
    private List<Result> Results = new ArrayList<Result>();
    @JsonProperty("Links")
    private Links_ Links;

    /**
     * 
     * @return
     *     The Start
     */
    @JsonProperty("Start")
    public int getStart() {
        return Start;
    }

    /**
     * 
     * @param Start
     *     The Start
     */
    @JsonProperty("Start")
    public void setStart(int Start) {
        this.Start = Start;
    }

    /**
     * 
     * @return
     *     The Count
     */
    @JsonProperty("Count")
    public int getCount() {
        return Count;
    }

    /**
     * 
     * @param Count
     *     The Count
     */
    @JsonProperty("Count")
    public void setCount(int Count) {
        this.Count = Count;
    }

    /**
     * 
     * @return
     *     The ResultCount
     */
    @JsonProperty("ResultCount")
    public int getResultCount() {
        return ResultCount;
    }

    /**
     * 
     * @param ResultCount
     *     The ResultCount
     */
    @JsonProperty("ResultCount")
    public void setResultCount(int ResultCount) {
        this.ResultCount = ResultCount;
    }

    /**
     * 
     * @return
     *     The Results
     */
    @JsonProperty("Results")
    public List<Result> getResults() {
        return Results;
    }

    /**
     * 
     * @param Results
     *     The Results
     */
    @JsonProperty("Results")
    public void setResults(List<Result> Results) {
        this.Results = Results;
    }

    /**
     * 
     * @return
     *     The Links
     */
    @JsonProperty("Links")
    public Links_ getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The Links
     */
    @JsonProperty("Links")
    public void setLinks(Links_ Links) {
        this.Links = Links;
    }

}
