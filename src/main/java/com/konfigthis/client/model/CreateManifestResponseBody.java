/*
 * ShipEngine API
 * ShipEngine's easy-to-use REST API lets you manage all of your shipping needs without worrying about the complexities of different carrier APIs and protocols. We handle all the heavy lifting so you can focus on providing a first-class shipping experience for your customers at the best possible prices.  Each of ShipEngine's features can be used by itself or in conjunction with each other to build powerful shipping functionality into your application or service.  ## Getting Started If you're new to REST APIs then be sure to read our [introduction to REST](https://www.shipengine.com/docs/rest/) to understand the basics.  Learn how to [authenticate yourself to ShipEngine](https://www.shipengine.com/docs/auth/), and then use our [sandbox environment](https://www.shipengine.com/docs/sandbox/) to kick the tires and get familiar with our API. If you run into any problems, then be sure to check the [error handling guide](https://www.shipengine.com/docs/errors/) for tips.  Here are some step-by-step **tutorials** to get you started:    - [Learn how to create your first shipping label](https://www.shipengine.com/docs/labels/create-a-label/)   - [Calculate shipping costs and compare rates across carriers](https://www.shipengine.com/docs/rates/)   - [Track packages on-demand or in real time](https://www.shipengine.com/docs/tracking/)   - [Validate mailing addresses anywhere on Earth](https://www.shipengine.com/docs/addresses/validation/)   ## Shipping Labels for Every Major Carrier ShipEngine makes it easy to [create shipping labels for any carrier](https://www.shipengine.com/docs/labels/create-a-label/) and [download them](https://www.shipengine.com/docs/labels/downloading/) in a [variety of file formats](https://www.shipengine.com/docs/labels/formats/). You can even customize labels with your own [messages](https://www.shipengine.com/docs/labels/messages/) and [images](https://www.shipengine.com/docs/labels/branding/).   ## Real-Time Package Tracking With ShipEngine you can [get the current status of a package](https://www.shipengine.com/docs/tracking/) or [subscribe to real-time tracking updates](https://www.shipengine.com/docs/tracking/webhooks/) via webhooks. You can also create [custimized tracking pages](https://www.shipengine.com/docs/tracking/branded-tracking-page/) with your own branding so your customers will always know where their package is.   ## Compare Shipping Costs Across Carriers Make sure you ship as cost-effectively as possible by [comparing rates across carriers](https://www.shipengine.com/docs/rates/get-shipment-rates/) using the ShipEngine Rates API. Or if you don't know the full shipment details yet, then you can [get rate estimates](https://www.shipengine.com/docs/rates/estimate/) with limited address info.   ## Worldwide Address Validation ShipEngine supports [address validation](https://www.shipengine.com/docs/addresses/validation/) for virtually [every country on Earth](https://www.shipengine.com/docs/addresses/validation/countries/), including the United States, Canada, Great Britain, Australia, Germany, France, Norway, Spain, Sweden, Israel, Italy, and over 160 others. 
 *
 * The version of the OpenAPI document: 1.1.202403202303
 * Contact: sales@shipengine.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.Manifest;
import com.konfigthis.client.model.ManifestDownload;
import com.konfigthis.client.model.ManifestRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * A create manifest response body
 */
@ApiModel(description = "A create manifest response body")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateManifestResponseBody {
  public static final String SERIALIZED_NAME_MANIFESTS = "manifests";
  @SerializedName(SERIALIZED_NAME_MANIFESTS)
  private List<Manifest> manifests = null;

  public static final String SERIALIZED_NAME_MANIFEST_REQUESTS = "manifest_requests";
  @SerializedName(SERIALIZED_NAME_MANIFEST_REQUESTS)
  private List<ManifestRequest> manifestRequests = null;

  public static final String SERIALIZED_NAME_MANIFEST_ID = "manifest_id";
  @SerializedName(SERIALIZED_NAME_MANIFEST_ID)
  private String manifestId;

  public static final String SERIALIZED_NAME_FORM_ID = "form_id";
  @SerializedName(SERIALIZED_NAME_FORM_ID)
  private String formId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_SHIP_DATE = "ship_date";
  @SerializedName(SERIALIZED_NAME_SHIP_DATE)
  private OffsetDateTime shipDate;

  public static final String SERIALIZED_NAME_SHIPMENTS = "shipments";
  @SerializedName(SERIALIZED_NAME_SHIPMENTS)
  private Integer shipments;

  public static final String SERIALIZED_NAME_WAREHOUSE_ID = "warehouse_id";
  @SerializedName(SERIALIZED_NAME_WAREHOUSE_ID)
  private String warehouseId;

  public static final String SERIALIZED_NAME_SUBMISSION_ID = "submission_id";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ID)
  private String submissionId;

  public static final String SERIALIZED_NAME_CARRIER_ID = "carrier_id";
  @SerializedName(SERIALIZED_NAME_CARRIER_ID)
  private String carrierId;

  public static final String SERIALIZED_NAME_MANIFEST_DOWNLOAD = "manifest_download";
  @SerializedName(SERIALIZED_NAME_MANIFEST_DOWNLOAD)
  private ManifestDownload manifestDownload;

  public static final String SERIALIZED_NAME_LABEL_IDS = "label_ids";
  @SerializedName(SERIALIZED_NAME_LABEL_IDS)
  private List<String> labelIds = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private UUID requestId;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = new ArrayList<>();

  public CreateManifestResponseBody() {
  }

  
  public CreateManifestResponseBody(
     Integer shipments, 
     List<String> labelIds, 
     List<Error> errors
  ) {
    this();
    this.shipments = shipments;
    this.labelIds = labelIds;
    this.errors = errors;
  }

  public CreateManifestResponseBody manifests(List<Manifest> manifests) {
    
    
    
    
    this.manifests = manifests;
    return this;
  }

  public CreateManifestResponseBody addManifestsItem(Manifest manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

   /**
   * Resulting Manifests
   * @return manifests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resulting Manifests")

  public List<Manifest> getManifests() {
    return manifests;
  }


  public void setManifests(List<Manifest> manifests) {
    
    
    
    this.manifests = manifests;
  }


  public CreateManifestResponseBody manifestRequests(List<ManifestRequest> manifestRequests) {
    
    
    
    
    this.manifestRequests = manifestRequests;
    return this;
  }

  public CreateManifestResponseBody addManifestRequestsItem(ManifestRequest manifestRequestsItem) {
    if (this.manifestRequests == null) {
      this.manifestRequests = new ArrayList<>();
    }
    this.manifestRequests.add(manifestRequestsItem);
    return this;
  }

   /**
   * Resulting manifest requests with statuses
   * @return manifestRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resulting manifest requests with statuses")

  public List<ManifestRequest> getManifestRequests() {
    return manifestRequests;
  }


  public void setManifestRequests(List<ManifestRequest> manifestRequests) {
    
    
    
    this.manifestRequests = manifestRequests;
  }


  public CreateManifestResponseBody manifestId(String manifestId) {
    
    
    if (manifestId != null && manifestId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for manifestId. Length must be greater than or equal to 1.");
    }
    
    this.manifestId = manifestId;
    return this;
  }

   /**
   * A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
   * @return manifestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "se-28529731", required = true, value = "A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.")

  public String getManifestId() {
    return manifestId;
  }


  public void setManifestId(String manifestId) {
    
    
    if (manifestId != null && manifestId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for manifestId. Length must be greater than or equal to 1.");
    }
    this.manifestId = manifestId;
  }


  public CreateManifestResponseBody formId(String formId) {
    
    
    if (formId != null && formId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for formId. Length must be greater than or equal to 1.");
    }
    
    this.formId = formId;
    return this;
  }

   /**
   * A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
   * @return formId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "se-28529731", required = true, value = "A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.")

  public String getFormId() {
    return formId;
  }


  public void setFormId(String formId) {
    
    
    if (formId != null && formId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for formId. Length must be greater than or equal to 1.");
    }
    this.formId = formId;
  }


  public CreateManifestResponseBody createdAt(OffsetDateTime createdAt) {
    
    
    if (createdAt != null && createdAt.length() < 1) {
      throw new IllegalArgumentException("Invalid value for createdAt. Length must be greater than or equal to 1.");
    }
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date-time that the manifest was created
   * @return createdAt
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-07-12T13:37:39.050Z", required = true, value = "The date-time that the manifest was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    if (createdAt != null && createdAt.length() < 1) {
      throw new IllegalArgumentException("Invalid value for createdAt. Length must be greater than or equal to 1.");
    }
    this.createdAt = createdAt;
  }


  public CreateManifestResponseBody shipDate(OffsetDateTime shipDate) {
    
    
    if (shipDate != null && shipDate.length() < 1) {
      throw new IllegalArgumentException("Invalid value for shipDate. Length must be greater than or equal to 1.");
    }
    
    this.shipDate = shipDate;
    return this;
  }

   /**
   * The date-time that the manifests shipments will be picked up
   * @return shipDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-07-12T13:37:39.050Z", required = true, value = "The date-time that the manifests shipments will be picked up")

  public OffsetDateTime getShipDate() {
    return shipDate;
  }


  public void setShipDate(OffsetDateTime shipDate) {
    
    
    if (shipDate != null && shipDate.length() < 1) {
      throw new IllegalArgumentException("Invalid value for shipDate. Length must be greater than or equal to 1.");
    }
    this.shipDate = shipDate;
  }


   /**
   * The number of shipments that are included in this manifest
   * minimum: 1
   * @return shipments
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "The number of shipments that are included in this manifest")

  public Integer getShipments() {
    return shipments;
  }




  public CreateManifestResponseBody warehouseId(String warehouseId) {
    
    
    if (warehouseId != null && warehouseId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for warehouseId. Length must be greater than or equal to 1.");
    }
    
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
   * @return warehouseId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "se-28529731", required = true, value = "A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.")

  public String getWarehouseId() {
    return warehouseId;
  }


  public void setWarehouseId(String warehouseId) {
    
    
    if (warehouseId != null && warehouseId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for warehouseId. Length must be greater than or equal to 1.");
    }
    this.warehouseId = warehouseId;
  }


  public CreateManifestResponseBody submissionId(String submissionId) {
    
    
    if (submissionId != null && submissionId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for submissionId. Length must be greater than or equal to 1.");
    }
    
    this.submissionId = submissionId;
    return this;
  }

   /**
   * A string that uniquely identifies the submission
   * @return submissionId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9475711899564878915476", required = true, value = "A string that uniquely identifies the submission")

  public String getSubmissionId() {
    return submissionId;
  }


  public void setSubmissionId(String submissionId) {
    
    
    if (submissionId != null && submissionId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for submissionId. Length must be greater than or equal to 1.");
    }
    this.submissionId = submissionId;
  }


  public CreateManifestResponseBody carrierId(String carrierId) {
    
    
    if (carrierId != null && carrierId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for carrierId. Length must be greater than or equal to 1.");
    }
    
    this.carrierId = carrierId;
    return this;
  }

   /**
   * A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
   * @return carrierId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "se-28529731", required = true, value = "A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.")

  public String getCarrierId() {
    return carrierId;
  }


  public void setCarrierId(String carrierId) {
    
    
    if (carrierId != null && carrierId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for carrierId. Length must be greater than or equal to 1.");
    }
    this.carrierId = carrierId;
  }


  public CreateManifestResponseBody manifestDownload(ManifestDownload manifestDownload) {
    
    
    
    
    this.manifestDownload = manifestDownload;
    return this;
  }

   /**
   * Get manifestDownload
   * @return manifestDownload
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ManifestDownload getManifestDownload() {
    return manifestDownload;
  }


  public void setManifestDownload(ManifestDownload manifestDownload) {
    
    
    
    this.manifestDownload = manifestDownload;
  }


   /**
   * An array of the label ids used in this manifest.
   * @return labelIds
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of the label ids used in this manifest.")

  public List<String> getLabelIds() {
    return labelIds;
  }




  public CreateManifestResponseBody requestId(UUID requestId) {
    
    
    if (requestId != null && requestId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for requestId. Length must be greater than or equal to 36.");
    }
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A UUID (a.k.a. GUID) that uniquely identifies a resource
   * @return requestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "aa3d8e8e-462b-4476-9618-72db7f7b7009", required = true, value = "A UUID (a.k.a. GUID) that uniquely identifies a resource")

  public UUID getRequestId() {
    return requestId;
  }


  public void setRequestId(UUID requestId) {
    
    
    if (requestId != null && requestId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for requestId. Length must be greater than or equal to 36.");
    }
    this.requestId = requestId;
  }


   /**
   * The errors associated with the failed API call
   * @return errors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The errors associated with the failed API call")

  public List<Error> getErrors() {
    return errors;
  }



  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateManifestResponseBody instance itself
   */
  public CreateManifestResponseBody putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateManifestResponseBody createManifestResponseBody = (CreateManifestResponseBody) o;
    return Objects.equals(this.manifests, createManifestResponseBody.manifests) &&
        Objects.equals(this.manifestRequests, createManifestResponseBody.manifestRequests) &&
        Objects.equals(this.manifestId, createManifestResponseBody.manifestId) &&
        Objects.equals(this.formId, createManifestResponseBody.formId) &&
        Objects.equals(this.createdAt, createManifestResponseBody.createdAt) &&
        Objects.equals(this.shipDate, createManifestResponseBody.shipDate) &&
        Objects.equals(this.shipments, createManifestResponseBody.shipments) &&
        Objects.equals(this.warehouseId, createManifestResponseBody.warehouseId) &&
        Objects.equals(this.submissionId, createManifestResponseBody.submissionId) &&
        Objects.equals(this.carrierId, createManifestResponseBody.carrierId) &&
        Objects.equals(this.manifestDownload, createManifestResponseBody.manifestDownload) &&
        Objects.equals(this.labelIds, createManifestResponseBody.labelIds) &&
        Objects.equals(this.requestId, createManifestResponseBody.requestId) &&
        Objects.equals(this.errors, createManifestResponseBody.errors)&&
        Objects.equals(this.additionalProperties, createManifestResponseBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifests, manifestRequests, manifestId, formId, createdAt, shipDate, shipments, warehouseId, submissionId, carrierId, manifestDownload, labelIds, requestId, errors, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateManifestResponseBody {\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    manifestRequests: ").append(toIndentedString(manifestRequests)).append("\n");
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    manifestDownload: ").append(toIndentedString(manifestDownload)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("manifests");
    openapiFields.add("manifest_requests");
    openapiFields.add("manifest_id");
    openapiFields.add("form_id");
    openapiFields.add("created_at");
    openapiFields.add("ship_date");
    openapiFields.add("shipments");
    openapiFields.add("warehouse_id");
    openapiFields.add("submission_id");
    openapiFields.add("carrier_id");
    openapiFields.add("manifest_download");
    openapiFields.add("label_ids");
    openapiFields.add("request_id");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("manifest_id");
    openapiRequiredFields.add("form_id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("ship_date");
    openapiRequiredFields.add("shipments");
    openapiRequiredFields.add("warehouse_id");
    openapiRequiredFields.add("submission_id");
    openapiRequiredFields.add("carrier_id");
    openapiRequiredFields.add("manifest_download");
    openapiRequiredFields.add("request_id");
    openapiRequiredFields.add("errors");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateManifestResponseBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateManifestResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateManifestResponseBody is not found in the empty JSON string", CreateManifestResponseBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateManifestResponseBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("manifests") != null && !jsonObj.get("manifests").isJsonNull()) {
        JsonArray jsonArraymanifests = jsonObj.getAsJsonArray("manifests");
        if (jsonArraymanifests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("manifests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `manifests` to be an array in the JSON string but got `%s`", jsonObj.get("manifests").toString()));
          }

          // validate the optional field `manifests` (array)
          for (int i = 0; i < jsonArraymanifests.size(); i++) {
            Manifest.validateJsonObject(jsonArraymanifests.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("manifest_requests") != null && !jsonObj.get("manifest_requests").isJsonNull()) {
        JsonArray jsonArraymanifestRequests = jsonObj.getAsJsonArray("manifest_requests");
        if (jsonArraymanifestRequests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("manifest_requests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `manifest_requests` to be an array in the JSON string but got `%s`", jsonObj.get("manifest_requests").toString()));
          }

          // validate the optional field `manifest_requests` (array)
          for (int i = 0; i < jsonArraymanifestRequests.size(); i++) {
            ManifestRequest.validateJsonObject(jsonArraymanifestRequests.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("manifest_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manifest_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manifest_id").toString()));
      }
      if (!jsonObj.get("form_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `form_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("form_id").toString()));
      }
      if (!jsonObj.get("warehouse_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warehouse_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warehouse_id").toString()));
      }
      if (!jsonObj.get("submission_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submission_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submission_id").toString()));
      }
      if (!jsonObj.get("carrier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_id").toString()));
      }
      // validate the required field `manifest_download`
      ManifestDownload.validateJsonObject(jsonObj.getAsJsonObject("manifest_download"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("label_ids") != null && !jsonObj.get("label_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_ids` to be an array in the JSON string but got `%s`", jsonObj.get("label_ids").toString()));
      }
      if (!jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }

      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      // validate the required field `errors` (array)
      for (int i = 0; i < jsonArrayerrors.size(); i++) {
        Error.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateManifestResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateManifestResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateManifestResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateManifestResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateManifestResponseBody>() {
           @Override
           public void write(JsonWriter out, CreateManifestResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateManifestResponseBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateManifestResponseBody instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateManifestResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateManifestResponseBody
  * @throws IOException if the JSON string is invalid with respect to CreateManifestResponseBody
  */
  public static CreateManifestResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateManifestResponseBody.class);
  }

 /**
  * Convert an instance of CreateManifestResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

