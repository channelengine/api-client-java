/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantShipmentRequest {
  public static final String SERIALIZED_NAME_MERCHANT_SHIPMENT_NO = "MerchantShipmentNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_SHIPMENT_NO)
  private String merchantShipmentNo;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "MerchantOrderNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<MerchantShipmentLineRequest> lines = new ArrayList<MerchantShipmentLineRequest>();

  public static final String SERIALIZED_NAME_TRACK_TRACE_NO = "TrackTraceNo";
  @SerializedName(SERIALIZED_NAME_TRACK_TRACE_NO)
  private String trackTraceNo;

  public static final String SERIALIZED_NAME_TRACK_TRACE_URL = "TrackTraceUrl";
  @SerializedName(SERIALIZED_NAME_TRACK_TRACE_URL)
  private String trackTraceUrl;

  public static final String SERIALIZED_NAME_RETURN_TRACK_TRACE_NO = "ReturnTrackTraceNo";
  @SerializedName(SERIALIZED_NAME_RETURN_TRACK_TRACE_NO)
  private String returnTrackTraceNo;

  public static final String SERIALIZED_NAME_METHOD = "Method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;


  public MerchantShipmentRequest merchantShipmentNo(String merchantShipmentNo) {
    
    this.merchantShipmentNo = merchantShipmentNo;
    return this;
  }

   /**
   * The unique shipment reference used by the Merchant.
   * @return merchantShipmentNo
  **/
  @ApiModelProperty(required = true, value = "The unique shipment reference used by the Merchant.")

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
   * The unique order reference used by the Merchant.
   * @return merchantOrderNo
  **/
  @ApiModelProperty(required = true, value = "The unique order reference used by the Merchant.")

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
   * The unique shipping reference used by the Shipping carrier (track&amp;trace number).
   * @return trackTraceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique shipping reference used by the Shipping carrier (track&trace number).")

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
   * A link to a page of the carrier where the customer can track the shipping of her package.
   * @return trackTraceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A link to a page of the carrier where the customer can track the shipping of her package.")

  public String getTrackTraceUrl() {
    return trackTraceUrl;
  }


  public void setTrackTraceUrl(String trackTraceUrl) {
    this.trackTraceUrl = trackTraceUrl;
  }


  public MerchantShipmentRequest returnTrackTraceNo(String returnTrackTraceNo) {
    
    this.returnTrackTraceNo = returnTrackTraceNo;
    return this;
  }

   /**
   * The unique return shipping reference that may be used by the Shipping carrier (track &amp; trace number) if the shipment is returned.
   * @return returnTrackTraceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique return shipping reference that may be used by the Shipping carrier (track & trace number) if the shipment is returned.")

  public String getReturnTrackTraceNo() {
    return returnTrackTraceNo;
  }


  public void setReturnTrackTraceNo(String returnTrackTraceNo) {
    this.returnTrackTraceNo = returnTrackTraceNo;
  }


  public MerchantShipmentRequest method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Shipment method: the carrier used for shipping the package. E.g. DHL, postNL.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipment method: the carrier used for shipping the package. E.g. DHL, postNL.")

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
        Objects.equals(this.returnTrackTraceNo, merchantShipmentRequest.returnTrackTraceNo) &&
        Objects.equals(this.method, merchantShipmentRequest.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantShipmentNo, merchantOrderNo, lines, trackTraceNo, trackTraceUrl, returnTrackTraceNo, method);
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
    sb.append("    returnTrackTraceNo: ").append(toIndentedString(returnTrackTraceNo)).append("\n");
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

