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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Reference to the various downloadable file formats for the generated label 
 */
@ApiModel(description = "Reference to the various downloadable file formats for the generated label ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LabelDownload {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_PDF = "pdf";
  @SerializedName(SERIALIZED_NAME_PDF)
  private String pdf;

  public static final String SERIALIZED_NAME_PNG = "png";
  @SerializedName(SERIALIZED_NAME_PNG)
  private String png;

  public static final String SERIALIZED_NAME_ZPL = "zpl";
  @SerializedName(SERIALIZED_NAME_ZPL)
  private String zpl;

  public LabelDownload() {
  }

  public LabelDownload href(String href) {
    
    
    if (href != null && href.length() < 1) {
      throw new IllegalArgumentException("Invalid value for href. Length must be greater than or equal to 1.");
    }
    
    this.href = href;
    return this;
  }

   /**
   * A URL
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://api.shipengine.com/v1/labels/se-28529731", value = "A URL")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    
    
    if (href != null && href.length() < 1) {
      throw new IllegalArgumentException("Invalid value for href. Length must be greater than or equal to 1.");
    }
    this.href = href;
  }


  public LabelDownload pdf(String pdf) {
    
    
    if (pdf != null && pdf.length() < 1) {
      throw new IllegalArgumentException("Invalid value for pdf. Length must be greater than or equal to 1.");
    }
    
    this.pdf = pdf;
    return this;
  }

   /**
   * A URL
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://api.shipengine.com/v1/labels/se-28529731", value = "A URL")

  public String getPdf() {
    return pdf;
  }


  public void setPdf(String pdf) {
    
    
    if (pdf != null && pdf.length() < 1) {
      throw new IllegalArgumentException("Invalid value for pdf. Length must be greater than or equal to 1.");
    }
    this.pdf = pdf;
  }


  public LabelDownload png(String png) {
    
    
    if (png != null && png.length() < 1) {
      throw new IllegalArgumentException("Invalid value for png. Length must be greater than or equal to 1.");
    }
    
    this.png = png;
    return this;
  }

   /**
   * A URL
   * @return png
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://api.shipengine.com/v1/labels/se-28529731", value = "A URL")

  public String getPng() {
    return png;
  }


  public void setPng(String png) {
    
    
    if (png != null && png.length() < 1) {
      throw new IllegalArgumentException("Invalid value for png. Length must be greater than or equal to 1.");
    }
    this.png = png;
  }


  public LabelDownload zpl(String zpl) {
    
    
    if (zpl != null && zpl.length() < 1) {
      throw new IllegalArgumentException("Invalid value for zpl. Length must be greater than or equal to 1.");
    }
    
    this.zpl = zpl;
    return this;
  }

   /**
   * A URL
   * @return zpl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://api.shipengine.com/v1/labels/se-28529731", value = "A URL")

  public String getZpl() {
    return zpl;
  }


  public void setZpl(String zpl) {
    
    
    if (zpl != null && zpl.length() < 1) {
      throw new IllegalArgumentException("Invalid value for zpl. Length must be greater than or equal to 1.");
    }
    this.zpl = zpl;
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
   * @return the LabelDownload instance itself
   */
  public LabelDownload putAdditionalProperty(String key, Object value) {
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
    LabelDownload labelDownload = (LabelDownload) o;
    return Objects.equals(this.href, labelDownload.href) &&
        Objects.equals(this.pdf, labelDownload.pdf) &&
        Objects.equals(this.png, labelDownload.png) &&
        Objects.equals(this.zpl, labelDownload.zpl)&&
        Objects.equals(this.additionalProperties, labelDownload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, pdf, png, zpl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelDownload {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    png: ").append(toIndentedString(png)).append("\n");
    sb.append("    zpl: ").append(toIndentedString(zpl)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("pdf");
    openapiFields.add("png");
    openapiFields.add("zpl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LabelDownload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LabelDownload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LabelDownload is not found in the empty JSON string", LabelDownload.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("pdf") != null && !jsonObj.get("pdf").isJsonNull()) && !jsonObj.get("pdf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pdf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pdf").toString()));
      }
      if ((jsonObj.get("png") != null && !jsonObj.get("png").isJsonNull()) && !jsonObj.get("png").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `png` to be a primitive type in the JSON string but got `%s`", jsonObj.get("png").toString()));
      }
      if ((jsonObj.get("zpl") != null && !jsonObj.get("zpl").isJsonNull()) && !jsonObj.get("zpl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zpl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zpl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LabelDownload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LabelDownload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LabelDownload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LabelDownload.class));

       return (TypeAdapter<T>) new TypeAdapter<LabelDownload>() {
           @Override
           public void write(JsonWriter out, LabelDownload value) throws IOException {
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
           public LabelDownload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LabelDownload instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LabelDownload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LabelDownload
  * @throws IOException if the JSON string is invalid with respect to LabelDownload
  */
  public static LabelDownload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LabelDownload.class);
  }

 /**
  * Convert an instance of LabelDownload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

