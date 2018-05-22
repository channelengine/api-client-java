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
import com.channelengine.merchant.apiclient.model.ProductMessage;
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
 * ProductCreationResult
 */

public class ProductCreationResult {
  @SerializedName("RejectedCount")
  private Integer rejectedCount = null;

  @SerializedName("AcceptedCount")
  private Integer acceptedCount = null;

  @SerializedName("ProductMessages")
  private List<ProductMessage> productMessages = null;

   /**
   * Get rejectedCount
   * @return rejectedCount
  **/
  @ApiModelProperty(value = "")
  public Integer getRejectedCount() {
    return rejectedCount;
  }

   /**
   * Get acceptedCount
   * @return acceptedCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAcceptedCount() {
    return acceptedCount;
  }

  public ProductCreationResult productMessages(List<ProductMessage> productMessages) {
    this.productMessages = productMessages;
    return this;
  }

  public ProductCreationResult addProductMessagesItem(ProductMessage productMessagesItem) {
    if (this.productMessages == null) {
      this.productMessages = new ArrayList<ProductMessage>();
    }
    this.productMessages.add(productMessagesItem);
    return this;
  }

   /**
   * Messages about the rejected products.
   * @return productMessages
  **/
  @ApiModelProperty(value = "Messages about the rejected products.")
  public List<ProductMessage> getProductMessages() {
    return productMessages;
  }

  public void setProductMessages(List<ProductMessage> productMessages) {
    this.productMessages = productMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCreationResult productCreationResult = (ProductCreationResult) o;
    return Objects.equals(this.rejectedCount, productCreationResult.rejectedCount) &&
        Objects.equals(this.acceptedCount, productCreationResult.acceptedCount) &&
        Objects.equals(this.productMessages, productCreationResult.productMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedCount, acceptedCount, productMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCreationResult {\n");
    
    sb.append("    rejectedCount: ").append(toIndentedString(rejectedCount)).append("\n");
    sb.append("    acceptedCount: ").append(toIndentedString(acceptedCount)).append("\n");
    sb.append("    productMessages: ").append(toIndentedString(productMessages)).append("\n");
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

