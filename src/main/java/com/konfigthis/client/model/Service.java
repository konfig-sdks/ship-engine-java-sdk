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
 * A service offered by the carrier
 */
@ApiModel(description = "A service offered by the carrier")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Service {
  public static final String SERIALIZED_NAME_CARRIER_ID = "carrier_id";
  @SerializedName(SERIALIZED_NAME_CARRIER_ID)
  private String carrierId;

  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrier_code";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOMESTIC = "domestic";
  @SerializedName(SERIALIZED_NAME_DOMESTIC)
  private Boolean domestic;

  public static final String SERIALIZED_NAME_INTERNATIONAL = "international";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL)
  private Boolean international;

  public static final String SERIALIZED_NAME_IS_MULTI_PACKAGE_SUPPORTED = "is_multi_package_supported";
  @SerializedName(SERIALIZED_NAME_IS_MULTI_PACKAGE_SUPPORTED)
  private Boolean isMultiPackageSupported;

  public Service() {
  }

  
  public Service(
     String serviceCode, 
     String name, 
     Boolean domestic, 
     Boolean international, 
     Boolean isMultiPackageSupported
  ) {
    this();
    this.serviceCode = serviceCode;
    this.name = name;
    this.domestic = domestic;
    this.international = international;
    this.isMultiPackageSupported = isMultiPackageSupported;
  }

  public Service carrierId(String carrierId) {
    
    
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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "se-28529731", value = "A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.")

  public String getCarrierId() {
    return carrierId;
  }


  public void setCarrierId(String carrierId) {
    
    
    if (carrierId != null && carrierId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for carrierId. Length must be greater than or equal to 1.");
    }
    this.carrierId = carrierId;
  }


  public Service carrierCode(String carrierCode) {
    
    
    if (carrierCode != null && carrierCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for carrierCode. Length must be greater than or equal to 1.");
    }
    
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
   * @return carrierCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "se-28529731", value = "A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.")

  public String getCarrierCode() {
    return carrierCode;
  }


  public void setCarrierCode(String carrierCode) {
    
    
    if (carrierCode != null && carrierCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for carrierCode. Length must be greater than or equal to 1.");
    }
    this.carrierCode = carrierCode;
  }


   /**
   * service code
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usps_media_mail", value = "service code")

  public String getServiceCode() {
    return serviceCode;
  }




   /**
   * User friendly service name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USPS First Class Mail", value = "User friendly service name")

  public String getName() {
    return name;
  }




   /**
   * Supports domestic shipping
   * @return domestic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Supports domestic shipping")

  public Boolean getDomestic() {
    return domestic;
  }




   /**
   * Supports international shipping.
   * @return international
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Supports international shipping.")

  public Boolean getInternational() {
    return international;
  }




   /**
   * Carrier supports multiple packages per shipment
   * @return isMultiPackageSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Carrier supports multiple packages per shipment")

  public Boolean getIsMultiPackageSupported() {
    return isMultiPackageSupported;
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
   * @return the Service instance itself
   */
  public Service putAdditionalProperty(String key, Object value) {
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
    Service service = (Service) o;
    return Objects.equals(this.carrierId, service.carrierId) &&
        Objects.equals(this.carrierCode, service.carrierCode) &&
        Objects.equals(this.serviceCode, service.serviceCode) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.domestic, service.domestic) &&
        Objects.equals(this.international, service.international) &&
        Objects.equals(this.isMultiPackageSupported, service.isMultiPackageSupported)&&
        Objects.equals(this.additionalProperties, service.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, carrierCode, serviceCode, name, domestic, international, isMultiPackageSupported, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domestic: ").append(toIndentedString(domestic)).append("\n");
    sb.append("    international: ").append(toIndentedString(international)).append("\n");
    sb.append("    isMultiPackageSupported: ").append(toIndentedString(isMultiPackageSupported)).append("\n");
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
    openapiFields.add("carrier_id");
    openapiFields.add("carrier_code");
    openapiFields.add("service_code");
    openapiFields.add("name");
    openapiFields.add("domestic");
    openapiFields.add("international");
    openapiFields.add("is_multi_package_supported");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Service
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Service.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Service is not found in the empty JSON string", Service.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("carrier_id") != null && !jsonObj.get("carrier_id").isJsonNull()) && !jsonObj.get("carrier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_id").toString()));
      }
      if ((jsonObj.get("carrier_code") != null && !jsonObj.get("carrier_code").isJsonNull()) && !jsonObj.get("carrier_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_code").toString()));
      }
      if ((jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonNull()) && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Service.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Service' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Service> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Service.class));

       return (TypeAdapter<T>) new TypeAdapter<Service>() {
           @Override
           public void write(JsonWriter out, Service value) throws IOException {
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
           public Service read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Service instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Service given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Service
  * @throws IOException if the JSON string is invalid with respect to Service
  */
  public static Service fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Service.class);
  }

 /**
  * Convert an instance of Service to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
