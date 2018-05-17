/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * OpenAPI spec version: 2.6.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MerchantShipmentTrackingRequest
 */

public class MerchantShipmentTrackingRequest {
  @SerializedName("Method")
  private String method = null;

  @SerializedName("TrackTraceNo")
  private String trackTraceNo = null;

  @SerializedName("TrackTraceUrl")
  private String trackTraceUrl = null;

  public MerchantShipmentTrackingRequest method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public MerchantShipmentTrackingRequest trackTraceNo(String trackTraceNo) {
    this.trackTraceNo = trackTraceNo;
    return this;
  }

   /**
   * Get trackTraceNo
   * @return trackTraceNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTrackTraceNo() {
    return trackTraceNo;
  }

  public void setTrackTraceNo(String trackTraceNo) {
    this.trackTraceNo = trackTraceNo;
  }

  public MerchantShipmentTrackingRequest trackTraceUrl(String trackTraceUrl) {
    this.trackTraceUrl = trackTraceUrl;
    return this;
  }

   /**
   * Get trackTraceUrl
   * @return trackTraceUrl
  **/
  @ApiModelProperty(value = "")
  public String getTrackTraceUrl() {
    return trackTraceUrl;
  }

  public void setTrackTraceUrl(String trackTraceUrl) {
    this.trackTraceUrl = trackTraceUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantShipmentTrackingRequest merchantShipmentTrackingRequest = (MerchantShipmentTrackingRequest) o;
    return Objects.equals(this.method, merchantShipmentTrackingRequest.method) &&
        Objects.equals(this.trackTraceNo, merchantShipmentTrackingRequest.trackTraceNo) &&
        Objects.equals(this.trackTraceUrl, merchantShipmentTrackingRequest.trackTraceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, trackTraceNo, trackTraceUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantShipmentTrackingRequest {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    trackTraceNo: ").append(toIndentedString(trackTraceNo)).append("\n");
    sb.append("    trackTraceUrl: ").append(toIndentedString(trackTraceUrl)).append("\n");
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

