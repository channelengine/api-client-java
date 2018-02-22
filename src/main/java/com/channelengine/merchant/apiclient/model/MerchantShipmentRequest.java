/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * OpenAPI spec version: 2.5.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.MerchantShipmentLineRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MerchantShipmentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-22T11:13:12.420+01:00")
public class MerchantShipmentRequest {
  @SerializedName("MerchantShipmentNo")
  private String merchantShipmentNo = null;

  @SerializedName("MerchantOrderNo")
  private String merchantOrderNo = null;

  @SerializedName("Lines")
  private List<MerchantShipmentLineRequest> lines = new ArrayList<MerchantShipmentLineRequest>();

  @SerializedName("TrackTraceNo")
  private String trackTraceNo = null;

  @SerializedName("TrackTraceUrl")
  private String trackTraceUrl = null;

  @SerializedName("Method")
  private String method = null;

  public MerchantShipmentRequest merchantShipmentNo(String merchantShipmentNo) {
    this.merchantShipmentNo = merchantShipmentNo;
    return this;
  }

   /**
   * Get merchantShipmentNo
   * @return merchantShipmentNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMerchantShipmentNo() {
    return merchantShipmentNo;
  }

  public void setMerchantShipmentNo(String merchantShipmentNo) {
    this.merchantShipmentNo = merchantShipmentNo;
  }

  public MerchantShipmentRequest merchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * Get merchantOrderNo
   * @return merchantOrderNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }

  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }

  public MerchantShipmentRequest lines(List<MerchantShipmentLineRequest> lines) {
    this.lines = lines;
    return this;
  }

  public MerchantShipmentRequest addLinesItem(MerchantShipmentLineRequest linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "")
  public List<MerchantShipmentLineRequest> getLines() {
    return lines;
  }

  public void setLines(List<MerchantShipmentLineRequest> lines) {
    this.lines = lines;
  }

  public MerchantShipmentRequest trackTraceNo(String trackTraceNo) {
    this.trackTraceNo = trackTraceNo;
    return this;
  }

   /**
   * Get trackTraceNo
   * @return trackTraceNo
  **/
  @ApiModelProperty(value = "")
  public String getTrackTraceNo() {
    return trackTraceNo;
  }

  public void setTrackTraceNo(String trackTraceNo) {
    this.trackTraceNo = trackTraceNo;
  }

  public MerchantShipmentRequest trackTraceUrl(String trackTraceUrl) {
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

  public MerchantShipmentRequest method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantShipmentRequest merchantShipmentRequest = (MerchantShipmentRequest) o;
    return Objects.equals(this.merchantShipmentNo, merchantShipmentRequest.merchantShipmentNo) &&
        Objects.equals(this.merchantOrderNo, merchantShipmentRequest.merchantOrderNo) &&
        Objects.equals(this.lines, merchantShipmentRequest.lines) &&
        Objects.equals(this.trackTraceNo, merchantShipmentRequest.trackTraceNo) &&
        Objects.equals(this.trackTraceUrl, merchantShipmentRequest.trackTraceUrl) &&
        Objects.equals(this.method, merchantShipmentRequest.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantShipmentNo, merchantOrderNo, lines, trackTraceNo, trackTraceUrl, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantShipmentRequest {\n");
    
    sb.append("    merchantShipmentNo: ").append(toIndentedString(merchantShipmentNo)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    trackTraceNo: ").append(toIndentedString(trackTraceNo)).append("\n");
    sb.append("    trackTraceUrl: ").append(toIndentedString(trackTraceUrl)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

