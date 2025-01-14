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
import com.konfigthis.client.model.BatchStatus;
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.LabelDownload;
import com.konfigthis.client.model.LabelFormat;
import com.konfigthis.client.model.LabelLayout;
import com.konfigthis.client.model.OptionalLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * Batches are an advanced feature of ShipEngine designed for users who need to generate hundreds or thousands of labels at a time. 
 */
@ApiModel(description = "Batches are an advanced feature of ShipEngine designed for users who need to generate hundreds or thousands of labels at a time. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Batch {
  public static final String SERIALIZED_NAME_LABEL_LAYOUT = "label_layout";
  @SerializedName(SERIALIZED_NAME_LABEL_LAYOUT)
  private LabelLayout labelLayout;

  public static final String SERIALIZED_NAME_LABEL_FORMAT = "label_format";
  @SerializedName(SERIALIZED_NAME_LABEL_FORMAT)
  private LabelFormat labelFormat;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId;

  public static final String SERIALIZED_NAME_BATCH_NUMBER = "batch_number";
  @SerializedName(SERIALIZED_NAME_BATCH_NUMBER)
  private String batchNumber;

  public static final String SERIALIZED_NAME_EXTERNAL_BATCH_ID = "external_batch_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_BATCH_ID)
  private String externalBatchId;

  public static final String SERIALIZED_NAME_BATCH_NOTES = "batch_notes";
  @SerializedName(SERIALIZED_NAME_BATCH_NOTES)
  private String batchNotes = "";

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PROCESSED_AT = "processed_at";
  @SerializedName(SERIALIZED_NAME_PROCESSED_AT)
  private OffsetDateTime processedAt;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Integer errors;

  public static final String SERIALIZED_NAME_PROCESS_ERRORS = "process_errors";
  @SerializedName(SERIALIZED_NAME_PROCESS_ERRORS)
  private List<Error> processErrors = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private Integer warnings;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private Integer completed;

  public static final String SERIALIZED_NAME_FORMS = "forms";
  @SerializedName(SERIALIZED_NAME_FORMS)
  private Integer forms;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_BATCH_SHIPMENTS_URL = "batch_shipments_url";
  @SerializedName(SERIALIZED_NAME_BATCH_SHIPMENTS_URL)
  private OptionalLink batchShipmentsUrl;

  public static final String SERIALIZED_NAME_BATCH_LABELS_URL = "batch_labels_url";
  @SerializedName(SERIALIZED_NAME_BATCH_LABELS_URL)
  private OptionalLink batchLabelsUrl;

  public static final String SERIALIZED_NAME_BATCH_ERRORS_URL = "batch_errors_url";
  @SerializedName(SERIALIZED_NAME_BATCH_ERRORS_URL)
  private OptionalLink batchErrorsUrl;

  public static final String SERIALIZED_NAME_LABEL_DOWNLOAD = "label_download";
  @SerializedName(SERIALIZED_NAME_LABEL_DOWNLOAD)
  private LabelDownload labelDownload;

  public static final String SERIALIZED_NAME_FORM_DOWNLOAD = "form_download";
  @SerializedName(SERIALIZED_NAME_FORM_DOWNLOAD)
  private OptionalLink formDownload;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BatchStatus status;

  public Batch() {
  }

  
  public Batch(
     String batchNumber, 
     String externalBatchId, 
     String batchNotes, 
     Integer errors, 
     List<Error> processErrors, 
     Integer warnings, 
     Integer completed, 
     Integer forms, 
     Integer count
  ) {
    this();
    this.batchNumber = batchNumber;
    this.externalBatchId = externalBatchId;
    this.batchNotes = batchNotes;
    this.errors = errors;
    this.processErrors = processErrors;
    this.warnings = warnings;
    this.completed = completed;
    this.forms = forms;
    this.count = count;
  }

  public Batch labelLayout(LabelLayout labelLayout) {
    
    
    
    
    this.labelLayout = labelLayout;
    return this;
  }

   /**
   * label layout
   * @return labelLayout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "label layout")

  public LabelLayout getLabelLayout() {
    return labelLayout;
  }


  public void setLabelLayout(LabelLayout labelLayout) {
    
    
    
    this.labelLayout = labelLayout;
  }


  public Batch labelFormat(LabelFormat labelFormat) {
    
    
    
    
    this.labelFormat = labelFormat;
    return this;
  }

   /**
   * Get labelFormat
   * @return labelFormat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LabelFormat getLabelFormat() {
    return labelFormat;
  }


  public void setLabelFormat(LabelFormat labelFormat) {
    
    
    
    this.labelFormat = labelFormat;
  }


  public Batch batchId(String batchId) {
    
    
    if (batchId != null && batchId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for batchId. Length must be greater than or equal to 1.");
    }
    
    this.batchId = batchId;
    return this;
  }

   /**
   * A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
   * @return batchId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "se-28529731", required = true, value = "A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.")

  public String getBatchId() {
    return batchId;
  }


  public void setBatchId(String batchId) {
    
    
    if (batchId != null && batchId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for batchId. Length must be greater than or equal to 1.");
    }
    this.batchId = batchId;
  }


   /**
   * The batch number.
   * @return batchNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The batch number.")

  public String getBatchNumber() {
    return batchNumber;
  }




   /**
   * A string that uniquely identifies the external batch
   * @return externalBatchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string that uniquely identifies the external batch")

  public String getExternalBatchId() {
    return externalBatchId;
  }




   /**
   * Custom notes you can add for each created batch
   * @return batchNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Batch for morning shipment", required = true, value = "Custom notes you can add for each created batch")

  public String getBatchNotes() {
    return batchNotes;
  }




  public Batch createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2018-09-23T15:00Z", required = true, value = "An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. ")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public Batch processedAt(OffsetDateTime processedAt) {
    
    
    
    
    this.processedAt = processedAt;
    return this;
  }

   /**
   * An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
   * @return processedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-23T15:00Z", required = true, value = "An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. ")

  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }


  public void setProcessedAt(OffsetDateTime processedAt) {
    
    
    
    this.processedAt = processedAt;
  }


   /**
   * The number of errors that occurred while generating the batch
   * minimum: 0
   * @return errors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The number of errors that occurred while generating the batch")

  public Integer getErrors() {
    return errors;
  }




   /**
   * The errors associated with the failed API call
   * @return processErrors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The errors associated with the failed API call")

  public List<Error> getProcessErrors() {
    return processErrors;
  }




   /**
   * The number of warnings that occurred while generating the batch
   * minimum: 0
   * @return warnings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of warnings that occurred while generating the batch")

  public Integer getWarnings() {
    return warnings;
  }




   /**
   * The number of labels generated in the batch
   * minimum: 0
   * @return completed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of labels generated in the batch")

  public Integer getCompleted() {
    return completed;
  }




   /**
   * The number of forms for customs that are available for download
   * minimum: 0
   * @return forms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "The number of forms for customs that are available for download")

  public Integer getForms() {
    return forms;
  }




   /**
   * The total of errors, warnings, and completed properties
   * minimum: 0
   * @return count
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The total of errors, warnings, and completed properties")

  public Integer getCount() {
    return count;
  }




  public Batch batchShipmentsUrl(OptionalLink batchShipmentsUrl) {
    
    
    
    
    this.batchShipmentsUrl = batchShipmentsUrl;
    return this;
  }

   /**
   * The batch shipments endpoint
   * @return batchShipmentsUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The batch shipments endpoint")

  public OptionalLink getBatchShipmentsUrl() {
    return batchShipmentsUrl;
  }


  public void setBatchShipmentsUrl(OptionalLink batchShipmentsUrl) {
    
    
    
    this.batchShipmentsUrl = batchShipmentsUrl;
  }


  public Batch batchLabelsUrl(OptionalLink batchLabelsUrl) {
    
    
    
    
    this.batchLabelsUrl = batchLabelsUrl;
    return this;
  }

   /**
   * Link to batch labels query
   * @return batchLabelsUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Link to batch labels query")

  public OptionalLink getBatchLabelsUrl() {
    return batchLabelsUrl;
  }


  public void setBatchLabelsUrl(OptionalLink batchLabelsUrl) {
    
    
    
    this.batchLabelsUrl = batchLabelsUrl;
  }


  public Batch batchErrorsUrl(OptionalLink batchErrorsUrl) {
    
    
    
    
    this.batchErrorsUrl = batchErrorsUrl;
    return this;
  }

   /**
   * Link to batch errors endpoint
   * @return batchErrorsUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Link to batch errors endpoint")

  public OptionalLink getBatchErrorsUrl() {
    return batchErrorsUrl;
  }


  public void setBatchErrorsUrl(OptionalLink batchErrorsUrl) {
    
    
    
    this.batchErrorsUrl = batchErrorsUrl;
  }


  public Batch labelDownload(LabelDownload labelDownload) {
    
    
    
    
    this.labelDownload = labelDownload;
    return this;
  }

   /**
   * The label download for the batch
   * @return labelDownload
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The label download for the batch")

  public LabelDownload getLabelDownload() {
    return labelDownload;
  }


  public void setLabelDownload(LabelDownload labelDownload) {
    
    
    
    this.labelDownload = labelDownload;
  }


  public Batch formDownload(OptionalLink formDownload) {
    
    
    
    
    this.formDownload = formDownload;
    return this;
  }

   /**
   * The form download for any customs that are needed
   * @return formDownload
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The form download for any customs that are needed")

  public OptionalLink getFormDownload() {
    return formDownload;
  }


  public void setFormDownload(OptionalLink formDownload) {
    
    
    
    this.formDownload = formDownload;
  }


  public Batch status(BatchStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BatchStatus getStatus() {
    return status;
  }


  public void setStatus(BatchStatus status) {
    
    
    
    this.status = status;
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
   * @return the Batch instance itself
   */
  public Batch putAdditionalProperty(String key, Object value) {
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
    Batch batch = (Batch) o;
    return Objects.equals(this.labelLayout, batch.labelLayout) &&
        Objects.equals(this.labelFormat, batch.labelFormat) &&
        Objects.equals(this.batchId, batch.batchId) &&
        Objects.equals(this.batchNumber, batch.batchNumber) &&
        Objects.equals(this.externalBatchId, batch.externalBatchId) &&
        Objects.equals(this.batchNotes, batch.batchNotes) &&
        Objects.equals(this.createdAt, batch.createdAt) &&
        Objects.equals(this.processedAt, batch.processedAt) &&
        Objects.equals(this.errors, batch.errors) &&
        Objects.equals(this.processErrors, batch.processErrors) &&
        Objects.equals(this.warnings, batch.warnings) &&
        Objects.equals(this.completed, batch.completed) &&
        Objects.equals(this.forms, batch.forms) &&
        Objects.equals(this.count, batch.count) &&
        Objects.equals(this.batchShipmentsUrl, batch.batchShipmentsUrl) &&
        Objects.equals(this.batchLabelsUrl, batch.batchLabelsUrl) &&
        Objects.equals(this.batchErrorsUrl, batch.batchErrorsUrl) &&
        Objects.equals(this.labelDownload, batch.labelDownload) &&
        Objects.equals(this.formDownload, batch.formDownload) &&
        Objects.equals(this.status, batch.status)&&
        Objects.equals(this.additionalProperties, batch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelLayout, labelFormat, batchId, batchNumber, externalBatchId, batchNotes, createdAt, processedAt, errors, processErrors, warnings, completed, forms, count, batchShipmentsUrl, batchLabelsUrl, batchErrorsUrl, labelDownload, formDownload, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    sb.append("    labelLayout: ").append(toIndentedString(labelLayout)).append("\n");
    sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    externalBatchId: ").append(toIndentedString(externalBatchId)).append("\n");
    sb.append("    batchNotes: ").append(toIndentedString(batchNotes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    processedAt: ").append(toIndentedString(processedAt)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    processErrors: ").append(toIndentedString(processErrors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    batchShipmentsUrl: ").append(toIndentedString(batchShipmentsUrl)).append("\n");
    sb.append("    batchLabelsUrl: ").append(toIndentedString(batchLabelsUrl)).append("\n");
    sb.append("    batchErrorsUrl: ").append(toIndentedString(batchErrorsUrl)).append("\n");
    sb.append("    labelDownload: ").append(toIndentedString(labelDownload)).append("\n");
    sb.append("    formDownload: ").append(toIndentedString(formDownload)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("label_layout");
    openapiFields.add("label_format");
    openapiFields.add("batch_id");
    openapiFields.add("batch_number");
    openapiFields.add("external_batch_id");
    openapiFields.add("batch_notes");
    openapiFields.add("created_at");
    openapiFields.add("processed_at");
    openapiFields.add("errors");
    openapiFields.add("process_errors");
    openapiFields.add("warnings");
    openapiFields.add("completed");
    openapiFields.add("forms");
    openapiFields.add("count");
    openapiFields.add("batch_shipments_url");
    openapiFields.add("batch_labels_url");
    openapiFields.add("batch_errors_url");
    openapiFields.add("label_download");
    openapiFields.add("form_download");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("label_layout");
    openapiRequiredFields.add("label_format");
    openapiRequiredFields.add("batch_id");
    openapiRequiredFields.add("batch_number");
    openapiRequiredFields.add("external_batch_id");
    openapiRequiredFields.add("batch_notes");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("processed_at");
    openapiRequiredFields.add("errors");
    openapiRequiredFields.add("process_errors");
    openapiRequiredFields.add("warnings");
    openapiRequiredFields.add("completed");
    openapiRequiredFields.add("forms");
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("batch_shipments_url");
    openapiRequiredFields.add("batch_labels_url");
    openapiRequiredFields.add("batch_errors_url");
    openapiRequiredFields.add("label_download");
    openapiRequiredFields.add("form_download");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Batch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Batch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Batch is not found in the empty JSON string", Batch.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Batch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_id").toString()));
      }
      if (!jsonObj.get("batch_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_number").toString()));
      }
      if (!jsonObj.get("external_batch_id").isJsonNull() && !jsonObj.get("external_batch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_batch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_batch_id").toString()));
      }
      if (!jsonObj.get("batch_notes").isJsonNull() && !jsonObj.get("batch_notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_notes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("process_errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `process_errors` to be an array in the JSON string but got `%s`", jsonObj.get("process_errors").toString()));
      }

      JsonArray jsonArrayprocessErrors = jsonObj.getAsJsonArray("process_errors");
      // validate the required field `process_errors` (array)
      for (int i = 0; i < jsonArrayprocessErrors.size(); i++) {
        Error.validateJsonObject(jsonArrayprocessErrors.get(i).getAsJsonObject());
      };
      // validate the required field `batch_shipments_url`
      OptionalLink.validateJsonObject(jsonObj.getAsJsonObject("batch_shipments_url"));
      // validate the required field `batch_labels_url`
      OptionalLink.validateJsonObject(jsonObj.getAsJsonObject("batch_labels_url"));
      // validate the required field `batch_errors_url`
      OptionalLink.validateJsonObject(jsonObj.getAsJsonObject("batch_errors_url"));
      // validate the required field `label_download`
      LabelDownload.validateJsonObject(jsonObj.getAsJsonObject("label_download"));
      // validate the required field `form_download`
      OptionalLink.validateJsonObject(jsonObj.getAsJsonObject("form_download"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Batch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Batch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Batch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Batch.class));

       return (TypeAdapter<T>) new TypeAdapter<Batch>() {
           @Override
           public void write(JsonWriter out, Batch value) throws IOException {
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
           public Batch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Batch instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Batch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Batch
  * @throws IOException if the JSON string is invalid with respect to Batch
  */
  public static Batch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Batch.class);
  }

 /**
  * Convert an instance of Batch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

