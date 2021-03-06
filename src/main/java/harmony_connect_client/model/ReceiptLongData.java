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
import harmony_connect_client.model.DBlockLink;
import harmony_connect_client.model.EBlockLink;
import harmony_connect_client.model.MerkleNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains the receipt information for the desired entry.
 */
@ApiModel(description = "Contains the receipt information for the desired entry.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-03T22:54:40.268681300Z[UTC]")
public class ReceiptLongData {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ENTRY_SERIALIZED = "entry_serialized";
  @SerializedName(SERIALIZED_NAME_ENTRY_SERIALIZED)
  private String entrySerialized;

  public static final String SERIALIZED_NAME_ENTRY_HASH = "entry_hash";
  @SerializedName(SERIALIZED_NAME_ENTRY_HASH)
  private String entryHash;

  public static final String SERIALIZED_NAME_MERKLE_BRANCH = "merkle_branch";
  @SerializedName(SERIALIZED_NAME_MERKLE_BRANCH)
  private List<MerkleNode> merkleBranch = new ArrayList<MerkleNode>();

  public static final String SERIALIZED_NAME_EBLOCK = "eblock";
  @SerializedName(SERIALIZED_NAME_EBLOCK)
  private EBlockLink eblock = null;

  public static final String SERIALIZED_NAME_DBLOCK = "dblock";
  @SerializedName(SERIALIZED_NAME_DBLOCK)
  private DBlockLink dblock = null;

  public ReceiptLongData createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The timestamp for this entry. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60;
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The timestamp for this entry. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: `YYYY-MM-DDThh:mm:ssZ`")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ReceiptLongData entrySerialized(String entrySerialized) {
    this.entrySerialized = entrySerialized;
    return this;
  }

   /**
   * The raw data that makes up the entry.
   * @return entrySerialized
  **/
  @ApiModelProperty(required = true, value = "The raw data that makes up the entry.")
  public String getEntrySerialized() {
    return entrySerialized;
  }

  public void setEntrySerialized(String entrySerialized) {
    this.entrySerialized = entrySerialized;
  }

  public ReceiptLongData entryHash(String entryHash) {
    this.entryHash = entryHash;
    return this;
  }

   /**
   * The unique identitfier of the entry.
   * @return entryHash
  **/
  @ApiModelProperty(required = true, value = "The unique identitfier of the entry.")
  public String getEntryHash() {
    return entryHash;
  }

  public void setEntryHash(String entryHash) {
    this.entryHash = entryHash;
  }

  public ReceiptLongData merkleBranch(List<MerkleNode> merkleBranch) {
    this.merkleBranch = merkleBranch;
    return this;
  }

  public ReceiptLongData addMerkleBranchItem(MerkleNode merkleBranchItem) {
    this.merkleBranch.add(merkleBranchItem);
    return this;
  }

   /**
   * The branch of the merkle tree that represents this entry. Presented as an array of Merkle nodes.
   * @return merkleBranch
  **/
  @ApiModelProperty(required = true, value = "The branch of the merkle tree that represents this entry. Presented as an array of Merkle nodes.")
  public List<MerkleNode> getMerkleBranch() {
    return merkleBranch;
  }

  public void setMerkleBranch(List<MerkleNode> merkleBranch) {
    this.merkleBranch = merkleBranch;
  }

  public ReceiptLongData eblock(EBlockLink eblock) {
    this.eblock = eblock;
    return this;
  }

   /**
   * Get eblock
   * @return eblock
  **/
  @ApiModelProperty(required = true, value = "")
  public EBlockLink getEblock() {
    return eblock;
  }

  public void setEblock(EBlockLink eblock) {
    this.eblock = eblock;
  }

  public ReceiptLongData dblock(DBlockLink dblock) {
    this.dblock = dblock;
    return this;
  }

   /**
   * Get dblock
   * @return dblock
  **/
  @ApiModelProperty(required = true, value = "")
  public DBlockLink getDblock() {
    return dblock;
  }

  public void setDblock(DBlockLink dblock) {
    this.dblock = dblock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptLongData receiptLongData = (ReceiptLongData) o;
    return Objects.equals(this.createdAt, receiptLongData.createdAt) &&
        Objects.equals(this.entrySerialized, receiptLongData.entrySerialized) &&
        Objects.equals(this.entryHash, receiptLongData.entryHash) &&
        Objects.equals(this.merkleBranch, receiptLongData.merkleBranch) &&
        Objects.equals(this.eblock, receiptLongData.eblock) &&
        Objects.equals(this.dblock, receiptLongData.dblock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, entrySerialized, entryHash, merkleBranch, eblock, dblock);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptLongData {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    entrySerialized: ").append(toIndentedString(entrySerialized)).append("\n");
    sb.append("    entryHash: ").append(toIndentedString(entryHash)).append("\n");
    sb.append("    merkleBranch: ").append(toIndentedString(merkleBranch)).append("\n");
    sb.append("    eblock: ").append(toIndentedString(eblock)).append("\n");
    sb.append("    dblock: ").append(toIndentedString(dblock)).append("\n");
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

