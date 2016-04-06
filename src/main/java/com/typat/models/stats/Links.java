
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "StatsMatchDetails",
    "UgcFilmManifest"
})
public class Links {

    @JsonProperty("StatsMatchDetails")
    private StatsMatchDetails StatsMatchDetails;
    @JsonProperty("UgcFilmManifest")
    private UgcFilmManifest UgcFilmManifest;

    /**
     * 
     * @return
     *     The StatsMatchDetails
     */
    @JsonProperty("StatsMatchDetails")
    public StatsMatchDetails getStatsMatchDetails() {
        return StatsMatchDetails;
    }

    /**
     * 
     * @param StatsMatchDetails
     *     The StatsMatchDetails
     */
    @JsonProperty("StatsMatchDetails")
    public void setStatsMatchDetails(StatsMatchDetails StatsMatchDetails) {
        this.StatsMatchDetails = StatsMatchDetails;
    }

    /**
     * 
     * @return
     *     The UgcFilmManifest
     */
    @JsonProperty("UgcFilmManifest")
    public UgcFilmManifest getUgcFilmManifest() {
        return UgcFilmManifest;
    }

    /**
     * 
     * @param UgcFilmManifest
     *     The UgcFilmManifest
     */
    @JsonProperty("UgcFilmManifest")
    public void setUgcFilmManifest(UgcFilmManifest UgcFilmManifest) {
        this.UgcFilmManifest = UgcFilmManifest;
    }

}
