/*
 * ChannelEngine API V2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.apiclient.model;

import java.util.Objects;
import com.channelengine.apiclient.model.ChannelProductResponse;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelProductChangesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-06T12:09:51.366+02:00")
public class ChannelProductChangesResponse {
  @SerializedName("ToBeCreated")
  private List<ChannelProductResponse> toBeCreated = new ArrayList<ChannelProductResponse>();

  @SerializedName("ToBeUpdated")
  private List<ChannelProductResponse> toBeUpdated = new ArrayList<ChannelProductResponse>();

  @SerializedName("ToBeRemoved")
  private List<String> toBeRemoved = new ArrayList<String>();

  public ChannelProductChangesResponse toBeCreated(List<ChannelProductResponse> toBeCreated) {
    this.toBeCreated = toBeCreated;
    return this;
  }

  public ChannelProductChangesResponse addToBeCreatedItem(ChannelProductResponse toBeCreatedItem) {
    this.toBeCreated.add(toBeCreatedItem);
    return this;
  }

   /**
   * Get toBeCreated
   * @return toBeCreated
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ChannelProductResponse> getToBeCreated() {
    return toBeCreated;
  }

  public void setToBeCreated(List<ChannelProductResponse> toBeCreated) {
    this.toBeCreated = toBeCreated;
  }

  public ChannelProductChangesResponse toBeUpdated(List<ChannelProductResponse> toBeUpdated) {
    this.toBeUpdated = toBeUpdated;
    return this;
  }

  public ChannelProductChangesResponse addToBeUpdatedItem(ChannelProductResponse toBeUpdatedItem) {
    this.toBeUpdated.add(toBeUpdatedItem);
    return this;
  }

   /**
   * Get toBeUpdated
   * @return toBeUpdated
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ChannelProductResponse> getToBeUpdated() {
    return toBeUpdated;
  }

  public void setToBeUpdated(List<ChannelProductResponse> toBeUpdated) {
    this.toBeUpdated = toBeUpdated;
  }

  public ChannelProductChangesResponse toBeRemoved(List<String> toBeRemoved) {
    this.toBeRemoved = toBeRemoved;
    return this;
  }

  public ChannelProductChangesResponse addToBeRemovedItem(String toBeRemovedItem) {
    this.toBeRemoved.add(toBeRemovedItem);
    return this;
  }

   /**
   * Get toBeRemoved
   * @return toBeRemoved
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getToBeRemoved() {
    return toBeRemoved;
  }

  public void setToBeRemoved(List<String> toBeRemoved) {
    this.toBeRemoved = toBeRemoved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelProductChangesResponse channelProductChangesResponse = (ChannelProductChangesResponse) o;
    return Objects.equals(this.toBeCreated, channelProductChangesResponse.toBeCreated) &&
        Objects.equals(this.toBeUpdated, channelProductChangesResponse.toBeUpdated) &&
        Objects.equals(this.toBeRemoved, channelProductChangesResponse.toBeRemoved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toBeCreated, toBeUpdated, toBeRemoved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelProductChangesResponse {\n");
    
    sb.append("    toBeCreated: ").append(toIndentedString(toBeCreated)).append("\n");
    sb.append("    toBeUpdated: ").append(toIndentedString(toBeUpdated)).append("\n");
    sb.append("    toBeRemoved: ").append(toIndentedString(toBeRemoved)).append("\n");
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
