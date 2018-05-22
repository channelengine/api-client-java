/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * OpenAPI spec version: 2.0.0
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
 * MerchantStockPriceUpdateRequest
 */

public class MerchantStockPriceUpdateRequest {
  @SerializedName("MerchantProductNo")
  private String merchantProductNo = null;

  @SerializedName("Stock")
  private Integer stock = null;

  @SerializedName("Price")
  private Double price = null;

  public MerchantStockPriceUpdateRequest merchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * Get merchantProductNo
   * @return merchantProductNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMerchantProductNo() {
    return merchantProductNo;
  }

  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }

  public MerchantStockPriceUpdateRequest stock(Integer stock) {
    this.stock = stock;
    return this;
  }

   /**
   * Get stock
   * @return stock
  **/
  @ApiModelProperty(value = "")
  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public MerchantStockPriceUpdateRequest price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantStockPriceUpdateRequest merchantStockPriceUpdateRequest = (MerchantStockPriceUpdateRequest) o;
    return Objects.equals(this.merchantProductNo, merchantStockPriceUpdateRequest.merchantProductNo) &&
        Objects.equals(this.stock, merchantStockPriceUpdateRequest.stock) &&
        Objects.equals(this.price, merchantStockPriceUpdateRequest.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantProductNo, stock, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantStockPriceUpdateRequest {\n");
    
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

