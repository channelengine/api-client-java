/*
 * ChannelEngine API V2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.apiclient.model;

import java.util.Objects;
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
 * OrderFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T08:29:46.200+02:00")
public class OrderFilter {
  /**
   * Gets or Sets statuses
   */
  @JsonAdapter(StatusesEnum.Adapter.class)
  public enum StatusesEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    SHIPPED("SHIPPED"),
    
    IN_BACKORDER("IN_BACKORDER"),
    
    CANCELED("CANCELED"),
    
    MANCO("MANCO"),
    
    IN_COMBI("IN_COMBI"),
    
    CLOSED("CLOSED"),
    
    NEW("NEW"),
    
    RETURNED("RETURNED"),
    
    REQUIRES_CORRECTION("REQUIRES_CORRECTION");

    private String value;

    StatusesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusesEnum fromValue(String text) {
      for (StatusesEnum b : StatusesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Statuses")
  private List<StatusesEnum> statuses = null;

  @SerializedName("MerchantOrderNos")
  private List<String> merchantOrderNos = null;

  @SerializedName("ExcludeMarketplaceFulfilledOrdersAndLines")
  private Boolean excludeMarketplaceFulfilledOrdersAndLines = null;

  /**
   * Filter orders on fulfillment type. This will include all orders lines, even if they are partially fulfilled by the marketplace.  To exclude orders and lines that are fulfilled by the marketplace from the response, set ExcludeMarketplaceFulfilledOrdersAndLines to true.
   */
  @JsonAdapter(FulfillmentTypeEnum.Adapter.class)
  public enum FulfillmentTypeEnum {
    ALL("ALL"),
    
    ONLY_MERCHANT("ONLY_MERCHANT"),
    
    ONLY_CHANNEL("ONLY_CHANNEL"),
    
    MIXED("MIXED");

    private String value;

    FulfillmentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FulfillmentTypeEnum fromValue(String text) {
      for (FulfillmentTypeEnum b : FulfillmentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FulfillmentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FulfillmentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FulfillmentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FulfillmentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("FulfillmentType")
  private FulfillmentTypeEnum fulfillmentType = null;

  @SerializedName("Page")
  private Integer page = null;

  public OrderFilter statuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
    return this;
  }

  public OrderFilter addStatusesItem(StatusesEnum statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<StatusesEnum>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @ApiModelProperty(value = "")
  public List<StatusesEnum> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
  }

  public OrderFilter merchantOrderNos(List<String> merchantOrderNos) {
    this.merchantOrderNos = merchantOrderNos;
    return this;
  }

  public OrderFilter addMerchantOrderNosItem(String merchantOrderNosItem) {
    if (this.merchantOrderNos == null) {
      this.merchantOrderNos = new ArrayList<String>();
    }
    this.merchantOrderNos.add(merchantOrderNosItem);
    return this;
  }

   /**
   * Get merchantOrderNos
   * @return merchantOrderNos
  **/
  @ApiModelProperty(value = "")
  public List<String> getMerchantOrderNos() {
    return merchantOrderNos;
  }

  public void setMerchantOrderNos(List<String> merchantOrderNos) {
    this.merchantOrderNos = merchantOrderNos;
  }

  public OrderFilter excludeMarketplaceFulfilledOrdersAndLines(Boolean excludeMarketplaceFulfilledOrdersAndLines) {
    this.excludeMarketplaceFulfilledOrdersAndLines = excludeMarketplaceFulfilledOrdersAndLines;
    return this;
  }

   /**
   * Get excludeMarketplaceFulfilledOrdersAndLines
   * @return excludeMarketplaceFulfilledOrdersAndLines
  **/
  @ApiModelProperty(value = "")
  public Boolean isExcludeMarketplaceFulfilledOrdersAndLines() {
    return excludeMarketplaceFulfilledOrdersAndLines;
  }

  public void setExcludeMarketplaceFulfilledOrdersAndLines(Boolean excludeMarketplaceFulfilledOrdersAndLines) {
    this.excludeMarketplaceFulfilledOrdersAndLines = excludeMarketplaceFulfilledOrdersAndLines;
  }

  public OrderFilter fulfillmentType(FulfillmentTypeEnum fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
    return this;
  }

   /**
   * Filter orders on fulfillment type. This will include all orders lines, even if they are partially fulfilled by the marketplace.  To exclude orders and lines that are fulfilled by the marketplace from the response, set ExcludeMarketplaceFulfilledOrdersAndLines to true.
   * @return fulfillmentType
  **/
  @ApiModelProperty(value = "Filter orders on fulfillment type. This will include all orders lines, even if they are partially fulfilled by the marketplace.  To exclude orders and lines that are fulfilled by the marketplace from the response, set ExcludeMarketplaceFulfilledOrdersAndLines to true.")
  public FulfillmentTypeEnum getFulfillmentType() {
    return fulfillmentType;
  }

  public void setFulfillmentType(FulfillmentTypeEnum fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
  }

  public OrderFilter page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFilter orderFilter = (OrderFilter) o;
    return Objects.equals(this.statuses, orderFilter.statuses) &&
        Objects.equals(this.merchantOrderNos, orderFilter.merchantOrderNos) &&
        Objects.equals(this.excludeMarketplaceFulfilledOrdersAndLines, orderFilter.excludeMarketplaceFulfilledOrdersAndLines) &&
        Objects.equals(this.fulfillmentType, orderFilter.fulfillmentType) &&
        Objects.equals(this.page, orderFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses, merchantOrderNos, excludeMarketplaceFulfilledOrdersAndLines, fulfillmentType, page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFilter {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    merchantOrderNos: ").append(toIndentedString(merchantOrderNos)).append("\n");
    sb.append("    excludeMarketplaceFulfilledOrdersAndLines: ").append(toIndentedString(excludeMarketplaceFulfilledOrdersAndLines)).append("\n");
    sb.append("    fulfillmentType: ").append(toIndentedString(fulfillmentType)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

