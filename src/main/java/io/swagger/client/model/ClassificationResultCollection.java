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
import io.swagger.client.model.ClassificationPolicy;
import io.swagger.client.model.ClassificationResult;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection of results from classification of a document against one or more policies, one result per policy.
 */
@ApiModel(description = "Collection of results from classification of a document against one or more policies, one result per policy.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T22:54:18.445Z")
public class ClassificationResultCollection {
  @SerializedName("totalItems")
  private Integer totalItems = null;

  @SerializedName("items")
  private List<ClassificationResult> items = new ArrayList<ClassificationResult>();

  @SerializedName("policies")
  private List<ClassificationPolicy> policies = new ArrayList<ClassificationPolicy>();

  public ClassificationResultCollection totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public ClassificationResultCollection items(List<ClassificationResult> items) {
    this.items = items;
    return this;
  }

  public ClassificationResultCollection addItemsItem(ClassificationResult itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ClassificationResult> getItems() {
    return items;
  }

  public void setItems(List<ClassificationResult> items) {
    this.items = items;
  }

  public ClassificationResultCollection policies(List<ClassificationPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public ClassificationResultCollection addPoliciesItem(ClassificationPolicy policiesItem) {
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * The policies used for this classification.  Can be used to track changes in the default set of policies used for classification.
   * @return policies
  **/
  @ApiModelProperty(example = "null", value = "The policies used for this classification.  Can be used to track changes in the default set of policies used for classification.")
  public List<ClassificationPolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<ClassificationPolicy> policies) {
    this.policies = policies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationResultCollection classificationResultCollection = (ClassificationResultCollection) o;
    return Objects.equals(this.totalItems, classificationResultCollection.totalItems) &&
        Objects.equals(this.items, classificationResultCollection.items) &&
        Objects.equals(this.policies, classificationResultCollection.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalItems, items, policies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationResultCollection {\n");
    
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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

