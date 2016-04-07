
package com.typat.models.stats;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "AuthorityId",
    "Path",
    "QueryString",
    "RetryPolicyId",
    "TopicName",
    "AcknowledgementTypeId",
    "AuthenticationLifetimeExtensionSupported"
})
public class UgcFilmManifest {

    @JsonProperty("AuthorityId")
    private String AuthorityId;
    @JsonProperty("Path")
    private String Path;
    @JsonProperty("QueryString")
    private String QueryString;
    @JsonProperty("RetryPolicyId")
    private String RetryPolicyId;
    @JsonProperty("TopicName")
    private String TopicName;
    @JsonProperty("AcknowledgementTypeId")
    private long AcknowledgementTypeId;
    @JsonProperty("AuthenticationLifetimeExtensionSupported")
    private boolean AuthenticationLifetimeExtensionSupported;

    /**
     * 
     * @return
     *     The AuthorityId
     */
    @JsonProperty("AuthorityId")
    public String getAuthorityId() {
        return AuthorityId;
    }

    /**
     * 
     * @param AuthorityId
     *     The AuthorityId
     */
    @JsonProperty("AuthorityId")
    public void setAuthorityId(String AuthorityId) {
        this.AuthorityId = AuthorityId;
    }

    /**
     * 
     * @return
     *     The Path
     */
    @JsonProperty("Path")
    public String getPath() {
        return Path;
    }

    /**
     * 
     * @param Path
     *     The Path
     */
    @JsonProperty("Path")
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * 
     * @return
     *     The QueryString
     */
    @JsonProperty("QueryString")
    public String getQueryString() {
        return QueryString;
    }

    /**
     * 
     * @param QueryString
     *     The QueryString
     */
    @JsonProperty("QueryString")
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * 
     * @return
     *     The RetryPolicyId
     */
    @JsonProperty("RetryPolicyId")
    public String getRetryPolicyId() {
        return RetryPolicyId;
    }

    /**
     * 
     * @param RetryPolicyId
     *     The RetryPolicyId
     */
    @JsonProperty("RetryPolicyId")
    public void setRetryPolicyId(String RetryPolicyId) {
        this.RetryPolicyId = RetryPolicyId;
    }

    /**
     * 
     * @return
     *     The TopicName
     */
    @JsonProperty("TopicName")
    public String getTopicName() {
        return TopicName;
    }

    /**
     * 
     * @param TopicName
     *     The TopicName
     */
    @JsonProperty("TopicName")
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * 
     * @return
     *     The AcknowledgementTypeId
     */
    @JsonProperty("AcknowledgementTypeId")
    public long getAcknowledgementTypeId() {
        return AcknowledgementTypeId;
    }

    /**
     * 
     * @param AcknowledgementTypeId
     *     The AcknowledgementTypeId
     */
    @JsonProperty("AcknowledgementTypeId")
    public void setAcknowledgementTypeId(long AcknowledgementTypeId) {
        this.AcknowledgementTypeId = AcknowledgementTypeId;
    }

    /**
     * 
     * @return
     *     The AuthenticationLifetimeExtensionSupported
     */
    @JsonProperty("AuthenticationLifetimeExtensionSupported")
    public boolean isAuthenticationLifetimeExtensionSupported() {
        return AuthenticationLifetimeExtensionSupported;
    }

    /**
     * 
     * @param AuthenticationLifetimeExtensionSupported
     *     The AuthenticationLifetimeExtensionSupported
     */
    @JsonProperty("AuthenticationLifetimeExtensionSupported")
    public void setAuthenticationLifetimeExtensionSupported(boolean AuthenticationLifetimeExtensionSupported) {
        this.AuthenticationLifetimeExtensionSupported = AuthenticationLifetimeExtensionSupported;
    }

}
