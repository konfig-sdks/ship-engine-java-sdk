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
import com.konfigthis.client.model.DisplayScheme;
import com.konfigthis.client.model.LabelChargeEvent;
import com.konfigthis.client.model.LabelDownloadType;
import com.konfigthis.client.model.LabelFormat;
import com.konfigthis.client.model.LabelLayout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * A create return label request body
 */
@ApiModel(description = "A create return label request body")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateReturnLabelRequestBody {
  public static final String SERIALIZED_NAME_CHARGE_EVENT = "charge_event";
  @SerializedName(SERIALIZED_NAME_CHARGE_EVENT)
  private LabelChargeEvent chargeEvent;

  public static final String SERIALIZED_NAME_LABEL_LAYOUT = "label_layout";
  @SerializedName(SERIALIZED_NAME_LABEL_LAYOUT)
  private LabelLayout labelLayout;

  public static final String SERIALIZED_NAME_LABEL_FORMAT = "label_format";
  @SerializedName(SERIALIZED_NAME_LABEL_FORMAT)
  private LabelFormat labelFormat;

  public static final String SERIALIZED_NAME_LABEL_DOWNLOAD_TYPE = "label_download_type";
  @SerializedName(SERIALIZED_NAME_LABEL_DOWNLOAD_TYPE)
  private LabelDownloadType labelDownloadType;

  public static final String SERIALIZED_NAME_DISPLAY_SCHEME = "display_scheme";
  @SerializedName(SERIALIZED_NAME_DISPLAY_SCHEME)
  private DisplayScheme displayScheme;

  public static final String SERIALIZED_NAME_LABEL_IMAGE_ID = "label_image_id";
  @SerializedName(SERIALIZED_NAME_LABEL_IMAGE_ID)
  private String labelImageId;

  public CreateReturnLabelRequestBody() {
  }

  public CreateReturnLabelRequestBody chargeEvent(LabelChargeEvent chargeEvent) {
    
    
    
    
    this.chargeEvent = chargeEvent;
    return this;
  }

   /**
   * The label charge event. 
   * @return chargeEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label charge event. ")

  public LabelChargeEvent getChargeEvent() {
    return chargeEvent;
  }


  public void setChargeEvent(LabelChargeEvent chargeEvent) {
    
    
    
    this.chargeEvent = chargeEvent;
  }


  public CreateReturnLabelRequestBody labelLayout(LabelLayout labelLayout) {
    
    
    
    
    this.labelLayout = labelLayout;
    return this;
  }

   /**
   * The layout (size) that you want the label to be in.  The &#x60;label_format&#x60; determines which sizes are allowed.  &#x60;4x6&#x60; is supported for all label formats, whereas &#x60;letter&#x60; (8.5\&quot; x 11\&quot;) is only supported for &#x60;pdf&#x60; format. 
   * @return labelLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The layout (size) that you want the label to be in.  The `label_format` determines which sizes are allowed.  `4x6` is supported for all label formats, whereas `letter` (8.5\" x 11\") is only supported for `pdf` format. ")

  public LabelLayout getLabelLayout() {
    return labelLayout;
  }


  public void setLabelLayout(LabelLayout labelLayout) {
    
    
    
    this.labelLayout = labelLayout;
  }


  public CreateReturnLabelRequestBody labelFormat(LabelFormat labelFormat) {
    
    
    
    
    this.labelFormat = labelFormat;
    return this;
  }

   /**
   * The file format that you want the label to be in.  We recommend &#x60;pdf&#x60; format because it is supported by all carriers, whereas some carriers do not support the &#x60;png&#x60; or &#x60;zpl&#x60; formats. 
   * @return labelFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file format that you want the label to be in.  We recommend `pdf` format because it is supported by all carriers, whereas some carriers do not support the `png` or `zpl` formats. ")

  public LabelFormat getLabelFormat() {
    return labelFormat;
  }


  public void setLabelFormat(LabelFormat labelFormat) {
    
    
    
    this.labelFormat = labelFormat;
  }


  public CreateReturnLabelRequestBody labelDownloadType(LabelDownloadType labelDownloadType) {
    
    
    
    
    this.labelDownloadType = labelDownloadType;
    return this;
  }

   /**
   * Get labelDownloadType
   * @return labelDownloadType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelDownloadType getLabelDownloadType() {
    return labelDownloadType;
  }


  public void setLabelDownloadType(LabelDownloadType labelDownloadType) {
    
    
    
    this.labelDownloadType = labelDownloadType;
  }


  public CreateReturnLabelRequestBody displayScheme(DisplayScheme displayScheme) {
    
    
    
    
    this.displayScheme = displayScheme;
    return this;
  }

   /**
   * The display format that the label should be shown in.
   * @return displayScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display format that the label should be shown in.")

  public DisplayScheme getDisplayScheme() {
    return displayScheme;
  }


  public void setDisplayScheme(DisplayScheme displayScheme) {
    
    
    
    this.displayScheme = displayScheme;
  }


  public CreateReturnLabelRequestBody labelImageId(String labelImageId) {
    
    
    if (labelImageId != null && labelImageId.length() < 4) {
      throw new IllegalArgumentException("Invalid value for labelImageId. Length must be greater than or equal to 4.");
    }
    
    this.labelImageId = labelImageId;
    return this;
  }

   /**
   * Used to identify an image resource.
   * @return labelImageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "img_DtBXupDBxREpHnwEXhTfgK", value = "Used to identify an image resource.")

  public String getLabelImageId() {
    return labelImageId;
  }


  public void setLabelImageId(String labelImageId) {
    
    
    if (labelImageId != null && labelImageId.length() < 4) {
      throw new IllegalArgumentException("Invalid value for labelImageId. Length must be greater than or equal to 4.");
    }
    this.labelImageId = labelImageId;
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
   * @return the CreateReturnLabelRequestBody instance itself
   */
  public CreateReturnLabelRequestBody putAdditionalProperty(String key, Object value) {
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
    CreateReturnLabelRequestBody createReturnLabelRequestBody = (CreateReturnLabelRequestBody) o;
    return Objects.equals(this.chargeEvent, createReturnLabelRequestBody.chargeEvent) &&
        Objects.equals(this.labelLayout, createReturnLabelRequestBody.labelLayout) &&
        Objects.equals(this.labelFormat, createReturnLabelRequestBody.labelFormat) &&
        Objects.equals(this.labelDownloadType, createReturnLabelRequestBody.labelDownloadType) &&
        Objects.equals(this.displayScheme, createReturnLabelRequestBody.displayScheme) &&
        Objects.equals(this.labelImageId, createReturnLabelRequestBody.labelImageId)&&
        Objects.equals(this.additionalProperties, createReturnLabelRequestBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeEvent, labelLayout, labelFormat, labelDownloadType, displayScheme, labelImageId, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReturnLabelRequestBody {\n");
    sb.append("    chargeEvent: ").append(toIndentedString(chargeEvent)).append("\n");
    sb.append("    labelLayout: ").append(toIndentedString(labelLayout)).append("\n");
    sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
    sb.append("    labelDownloadType: ").append(toIndentedString(labelDownloadType)).append("\n");
    sb.append("    displayScheme: ").append(toIndentedString(displayScheme)).append("\n");
    sb.append("    labelImageId: ").append(toIndentedString(labelImageId)).append("\n");
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
    openapiFields.add("charge_event");
    openapiFields.add("label_layout");
    openapiFields.add("label_format");
    openapiFields.add("label_download_type");
    openapiFields.add("display_scheme");
    openapiFields.add("label_image_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateReturnLabelRequestBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateReturnLabelRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateReturnLabelRequestBody is not found in the empty JSON string", CreateReturnLabelRequestBody.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("label_image_id").isJsonNull() && (jsonObj.get("label_image_id") != null && !jsonObj.get("label_image_id").isJsonNull()) && !jsonObj.get("label_image_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_image_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_image_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateReturnLabelRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateReturnLabelRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateReturnLabelRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateReturnLabelRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateReturnLabelRequestBody>() {
           @Override
           public void write(JsonWriter out, CreateReturnLabelRequestBody value) throws IOException {
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
           public CreateReturnLabelRequestBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateReturnLabelRequestBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateReturnLabelRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateReturnLabelRequestBody
  * @throws IOException if the JSON string is invalid with respect to CreateReturnLabelRequestBody
  */
  public static CreateReturnLabelRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateReturnLabelRequestBody.class);
  }

 /**
  * Convert an instance of CreateReturnLabelRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

