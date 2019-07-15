/*
 * Harmony Connect
 * An easy to use API that helps you access the Factom blockchain.
 *
 * OpenAPI spec version: 1.0.19
 * Contact: harmony-support@factom.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package harmony_connect_client.model;

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
 * An object that contains the Chain Hash (ID) as well as a URL for the chain.
 */
@ApiModel(description = "An object that contains the Chain Hash (ID) as well as a URL for the chain.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-03T22:54:40.268681300Z[UTC]")
public class EntryListChain {
  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public EntryListChain chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The ID for this chain on the Factom blockchain.
   * @return chainId
  **/
  @ApiModelProperty(value = "The ID for this chain on the Factom blockchain.")
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public EntryListChain href(String href) {
    this.href = href;
    return this;
  }

   /**
   * An API link to retrieve all information about this chain.
   * @return href
  **/
  @ApiModelProperty(value = "An API link to retrieve all information about this chain.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryListChain entryListChain = (EntryListChain) o;
    return Objects.equals(this.chainId, entryListChain.chainId) &&
        Objects.equals(this.href, entryListChain.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryListChain {\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

