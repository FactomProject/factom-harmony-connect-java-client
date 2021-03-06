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
 * The directory block that contains this entry credit block.
 */
@ApiModel(description = "The directory block that contains this entry credit block.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-03T22:54:40.268681300Z[UTC]")
public class ECBlockLongDblock {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public ECBlockLongDblock hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The SHA256 hash of this directory block.
   * @return hash
  **/
  @ApiModelProperty(value = "The SHA256 hash of this directory block.")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public ECBlockLongDblock href(String href) {
    this.href = href;
    return this;
  }

   /**
   * An API link to this directory block.
   * @return href
  **/
  @ApiModelProperty(value = "An API link to this directory block.")
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
    ECBlockLongDblock ecBlockLongDblock = (ECBlockLongDblock) o;
    return Objects.equals(this.hash, ecBlockLongDblock.hash) &&
        Objects.equals(this.href, ecBlockLongDblock.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECBlockLongDblock {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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

