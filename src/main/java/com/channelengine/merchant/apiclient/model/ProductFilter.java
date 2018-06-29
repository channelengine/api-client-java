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
 * ProductFilter
 */

public class ProductFilter {
  @SerializedName("Search")
  private String search = null;

  @SerializedName("Page")
  private Integer page = null;

  public ProductFilter search(String search) {
    this.search = search;
    return this;
  }

   /**
   * Search products by Name, MerchantProductNo, Ean or Brand
   * @return search
  **/
  @ApiModelProperty(value = "Search products by Name, MerchantProductNo, Ean or Brand")
  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  public ProductFilter page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * The page to filter on. Starts at 1.
   * @return page
  **/
  @ApiModelProperty(value = "The page to filter on. Starts at 1.")
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
    ProductFilter productFilter = (ProductFilter) o;
    return Objects.equals(this.search, productFilter.search) &&
        Objects.equals(this.page, productFilter.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(search, page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFilter {\n");
    
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
