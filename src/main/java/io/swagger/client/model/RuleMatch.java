/*
 * Veritas Information Classifier (VIC)
 * APIs
 *
 * OpenAPI spec version: Resource Specific
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContentMatch;
import java.util.ArrayList;
import java.util.List;

/**
 * A classification match for a document against a single rule.  May contain multiple content matches.
 */
@ApiModel(description = "A classification match for a document against a single rule.  May contain multiple content matches.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T22:54:18.445Z")
public class RuleMatch {
  @SerializedName("ruleId")
  private String ruleId = null;

  @SerializedName("ruleName")
  private String ruleName = null;

  @SerializedName("confidence")
  private Double confidence = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("contentMatches")
  private List<ContentMatch> contentMatches = new ArrayList<ContentMatch>();

  public RuleMatch ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public RuleMatch ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public RuleMatch confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Confidence in the rule match, as a percentage.  A higher value means a higher likelihood that the content matches the intent of the rule.
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "Confidence in the rule match, as a percentage.  A higher value means a higher likelihood that the content matches the intent of the rule.")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public RuleMatch count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of individual content matches within the rule match.
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "The number of individual content matches within the rule match.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RuleMatch contentMatches(List<ContentMatch> contentMatches) {
    this.contentMatches = contentMatches;
    return this;
  }

  public RuleMatch addContentMatchesItem(ContentMatch contentMatchesItem) {
    this.contentMatches.add(contentMatchesItem);
    return this;
  }

   /**
   * A collection of content matches within the overall rule match, if known.  May be empty for certain types of rule.
   * @return contentMatches
  **/
  @ApiModelProperty(example = "null", value = "A collection of content matches within the overall rule match, if known.  May be empty for certain types of rule.")
  public List<ContentMatch> getContentMatches() {
    return contentMatches;
  }

  public void setContentMatches(List<ContentMatch> contentMatches) {
    this.contentMatches = contentMatches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleMatch ruleMatch = (RuleMatch) o;
    return Objects.equals(this.ruleId, ruleMatch.ruleId) &&
        Objects.equals(this.ruleName, ruleMatch.ruleName) &&
        Objects.equals(this.confidence, ruleMatch.confidence) &&
        Objects.equals(this.count, ruleMatch.count) &&
        Objects.equals(this.contentMatches, ruleMatch.contentMatches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, confidence, count, contentMatches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleMatch {\n");
    
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    contentMatches: ").append(toIndentedString(contentMatches)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

