
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
    "Assistants",
    "DeathDisposition",
    "IsAssassination",
    "IsGroundPound",
    "IsHeadshot",
    "IsMelee",
    "IsShoulderBash",
    "IsWeapon",
    "Killer",
    "KillerAgent",
    "KillerWeaponAttachmentIds",
    "KillerWeaponStockId",
    "KillerWorldLocation",
    "Victim",
    "VictimAgent",
    "VictimAttachmentIds",
    "VictimStockId",
    "VictimWorldLocation",
    "EventName",
    "TimeSinceStart"
})
public class GameEvent {

    @JsonProperty("Assistants")
    private List<Object> Assistants = new ArrayList<>();
    @JsonProperty("DeathDisposition")
    private long DeathDisposition;
    @JsonProperty("IsAssassination")
    private boolean IsAssassination;
    @JsonProperty("IsGroundPound")
    private boolean IsGroundPound;
    @JsonProperty("IsHeadshot")
    private boolean IsHeadshot;
    @JsonProperty("IsMelee")
    private boolean IsMelee;
    @JsonProperty("IsShoulderBash")
    private boolean IsShoulderBash;
    @JsonProperty("IsWeapon")
    private boolean IsWeapon;
    @JsonProperty("Killer")
    private Killer Killer;
    @JsonProperty("KillerAgent")
    private long KillerAgent;
    @JsonProperty("KillerWeaponAttachmentIds")
    private List<Long> KillerWeaponAttachmentIds = new ArrayList<>();
    @JsonProperty("KillerWeaponStockId")
    private long KillerWeaponStockId;
    @JsonProperty("KillerWorldLocation")
    private KillerWorldLocation KillerWorldLocation;
    @JsonProperty("Victim")
    private Victim Victim;
    @JsonProperty("VictimAgent")
    private long VictimAgent;
    @JsonProperty("VictimAttachmentIds")
    private List<Object> VictimAttachmentIds = new ArrayList<>();
    @JsonProperty("VictimStockId")
    private long VictimStockId;
    @JsonProperty("VictimWorldLocation")
    private VictimWorldLocation VictimWorldLocation;
    @JsonProperty("EventName")
    private String EventName;
    @JsonProperty("TimeSinceStart")
    private String TimeSinceStart;

    /**
     * 
     * @return
     *     The Assistants
     */
    @JsonProperty("Assistants")
    public List<Object> getAssistants() {
        return Assistants;
    }

    /**
     * 
     * @param Assistants
     *     The Assistants
     */
    @JsonProperty("Assistants")
    public void setAssistants(List<Object> Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * 
     * @return
     *     The DeathDisposition
     */
    @JsonProperty("DeathDisposition")
    public long getDeathDisposition() {
        return DeathDisposition;
    }

    /**
     * 
     * @param DeathDisposition
     *     The DeathDisposition
     */
    @JsonProperty("DeathDisposition")
    public void setDeathDisposition(long DeathDisposition) {
        this.DeathDisposition = DeathDisposition;
    }

    /**
     * 
     * @return
     *     The IsAssassination
     */
    @JsonProperty("IsAssassination")
    public boolean isIsAssassination() {
        return IsAssassination;
    }

    /**
     * 
     * @param IsAssassination
     *     The IsAssassination
     */
    @JsonProperty("IsAssassination")
    public void setIsAssassination(boolean IsAssassination) {
        this.IsAssassination = IsAssassination;
    }

    /**
     * 
     * @return
     *     The IsGroundPound
     */
    @JsonProperty("IsGroundPound")
    public boolean isIsGroundPound() {
        return IsGroundPound;
    }

    /**
     * 
     * @param IsGroundPound
     *     The IsGroundPound
     */
    @JsonProperty("IsGroundPound")
    public void setIsGroundPound(boolean IsGroundPound) {
        this.IsGroundPound = IsGroundPound;
    }

    /**
     * 
     * @return
     *     The IsHeadshot
     */
    @JsonProperty("IsHeadshot")
    public boolean isIsHeadshot() {
        return IsHeadshot;
    }

    /**
     * 
     * @param IsHeadshot
     *     The IsHeadshot
     */
    @JsonProperty("IsHeadshot")
    public void setIsHeadshot(boolean IsHeadshot) {
        this.IsHeadshot = IsHeadshot;
    }

    /**
     * 
     * @return
     *     The IsMelee
     */
    @JsonProperty("IsMelee")
    public boolean isIsMelee() {
        return IsMelee;
    }

    /**
     * 
     * @param IsMelee
     *     The IsMelee
     */
    @JsonProperty("IsMelee")
    public void setIsMelee(boolean IsMelee) {
        this.IsMelee = IsMelee;
    }

    /**
     * 
     * @return
     *     The IsShoulderBash
     */
    @JsonProperty("IsShoulderBash")
    public boolean isIsShoulderBash() {
        return IsShoulderBash;
    }

    /**
     * 
     * @param IsShoulderBash
     *     The IsShoulderBash
     */
    @JsonProperty("IsShoulderBash")
    public void setIsShoulderBash(boolean IsShoulderBash) {
        this.IsShoulderBash = IsShoulderBash;
    }

    /**
     * 
     * @return
     *     The IsWeapon
     */
    @JsonProperty("IsWeapon")
    public boolean isIsWeapon() {
        return IsWeapon;
    }

    /**
     * 
     * @param IsWeapon
     *     The IsWeapon
     */
    @JsonProperty("IsWeapon")
    public void setIsWeapon(boolean IsWeapon) {
        this.IsWeapon = IsWeapon;
    }

    /**
     * 
     * @return
     *     The Killer
     */
    @JsonProperty("Killer")
    public Killer getKiller() {
        return Killer;
    }

    /**
     * 
     * @param Killer
     *     The Killer
     */
    @JsonProperty("Killer")
    public void setKiller(Killer Killer) {
        this.Killer = Killer;
    }

    /**
     * 
     * @return
     *     The KillerAgent
     */
    @JsonProperty("KillerAgent")
    public long getKillerAgent() {
        return KillerAgent;
    }

    /**
     * 
     * @param KillerAgent
     *     The KillerAgent
     */
    @JsonProperty("KillerAgent")
    public void setKillerAgent(long KillerAgent) {
        this.KillerAgent = KillerAgent;
    }

    /**
     * 
     * @return
     *     The KillerWeaponAttachmentIds
     */
    @JsonProperty("KillerWeaponAttachmentIds")
    public List<Long> getKillerWeaponAttachmentIds() {
        return KillerWeaponAttachmentIds;
    }

    /**
     * 
     * @param KillerWeaponAttachmentIds
     *     The KillerWeaponAttachmentIds
     */
    @JsonProperty("KillerWeaponAttachmentIds")
    public void setKillerWeaponAttachmentIds(List<Long> KillerWeaponAttachmentIds) {
        this.KillerWeaponAttachmentIds = KillerWeaponAttachmentIds;
    }

    /**
     * 
     * @return
     *     The KillerWeaponStockId
     */
    @JsonProperty("KillerWeaponStockId")
    public long getKillerWeaponStockId() {
        return KillerWeaponStockId;
    }

    /**
     * 
     * @param KillerWeaponStockId
     *     The KillerWeaponStockId
     */
    @JsonProperty("KillerWeaponStockId")
    public void setKillerWeaponStockId(long KillerWeaponStockId) {
        this.KillerWeaponStockId = KillerWeaponStockId;
    }

    /**
     * 
     * @return
     *     The KillerWorldLocation
     */
    @JsonProperty("KillerWorldLocation")
    public KillerWorldLocation getKillerWorldLocation() {
        return KillerWorldLocation;
    }

    /**
     * 
     * @param KillerWorldLocation
     *     The KillerWorldLocation
     */
    @JsonProperty("KillerWorldLocation")
    public void setKillerWorldLocation(KillerWorldLocation KillerWorldLocation) {
        this.KillerWorldLocation = KillerWorldLocation;
    }

    /**
     * 
     * @return
     *     The Victim
     */
    @JsonProperty("Victim")
    public Victim getVictim() {
        return Victim;
    }

    /**
     * 
     * @param Victim
     *     The Victim
     */
    @JsonProperty("Victim")
    public void setVictim(Victim Victim) {
        this.Victim = Victim;
    }

    /**
     * 
     * @return
     *     The VictimAgent
     */
    @JsonProperty("VictimAgent")
    public long getVictimAgent() {
        return VictimAgent;
    }

    /**
     * 
     * @param VictimAgent
     *     The VictimAgent
     */
    @JsonProperty("VictimAgent")
    public void setVictimAgent(long VictimAgent) {
        this.VictimAgent = VictimAgent;
    }

    /**
     * 
     * @return
     *     The VictimAttachmentIds
     */
    @JsonProperty("VictimAttachmentIds")
    public List<Object> getVictimAttachmentIds() {
        return VictimAttachmentIds;
    }

    /**
     * 
     * @param VictimAttachmentIds
     *     The VictimAttachmentIds
     */
    @JsonProperty("VictimAttachmentIds")
    public void setVictimAttachmentIds(List<Object> VictimAttachmentIds) {
        this.VictimAttachmentIds = VictimAttachmentIds;
    }

    /**
     * 
     * @return
     *     The VictimStockId
     */
    @JsonProperty("VictimStockId")
    public long getVictimStockId() {
        return VictimStockId;
    }

    /**
     * 
     * @param VictimStockId
     *     The VictimStockId
     */
    @JsonProperty("VictimStockId")
    public void setVictimStockId(long VictimStockId) {
        this.VictimStockId = VictimStockId;
    }

    /**
     * 
     * @return
     *     The VictimWorldLocation
     */
    @JsonProperty("VictimWorldLocation")
    public VictimWorldLocation getVictimWorldLocation() {
        return VictimWorldLocation;
    }

    /**
     * 
     * @param VictimWorldLocation
     *     The VictimWorldLocation
     */
    @JsonProperty("VictimWorldLocation")
    public void setVictimWorldLocation(VictimWorldLocation VictimWorldLocation) {
        this.VictimWorldLocation = VictimWorldLocation;
    }

    /**
     * 
     * @return
     *     The EventName
     */
    @JsonProperty("EventName")
    public String getEventName() {
        return EventName;
    }

    /**
     * 
     * @param EventName
     *     The EventName
     */
    @JsonProperty("EventName")
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * 
     * @return
     *     The TimeSinceStart
     */
    @JsonProperty("TimeSinceStart")
    public String getTimeSinceStart() {
        return TimeSinceStart;
    }

    /**
     * 
     * @param TimeSinceStart
     *     The TimeSinceStart
     */
    @JsonProperty("TimeSinceStart")
    public void setTimeSinceStart(String TimeSinceStart) {
        this.TimeSinceStart = TimeSinceStart;
    }

}
