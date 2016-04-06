
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "x",
    "y",
    "z"
})
public class KillerWorldLocation {

    @JsonProperty("x")
    private double x;
    @JsonProperty("y")
    private double y;
    @JsonProperty("z")
    private double z;

    /**
     * 
     * @return
     *     The x
     */
    @JsonProperty("x")
    public double getX() {
        return x;
    }

    /**
     * 
     * @param x
     *     The x
     */
    @JsonProperty("x")
    public void setX(double x) {
        this.x = x;
    }

    /**
     * 
     * @return
     *     The y
     */
    @JsonProperty("y")
    public double getY() {
        return y;
    }

    /**
     * 
     * @param y
     *     The y
     */
    @JsonProperty("y")
    public void setY(double y) {
        this.y = y;
    }

    /**
     * 
     * @return
     *     The z
     */
    @JsonProperty("z")
    public double getZ() {
        return z;
    }

    /**
     * 
     * @param z
     *     The z
     */
    @JsonProperty("z")
    public void setZ(double z) {
        this.z = z;
    }

}
