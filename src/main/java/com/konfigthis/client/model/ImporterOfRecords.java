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
 * importer of records address, anywhere in the world. 
 */
@ApiModel(description = "importer of records address, anywhere in the world. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ImporterOfRecords {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_ADDRESS_LINE3 = "address_line3";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE3)
  private String addressLine3;

  public static final String SERIALIZED_NAME_CITY_LOCALITY = "city_locality";
  @SerializedName(SERIALIZED_NAME_CITY_LOCALITY)
  private String cityLocality;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "state_province";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public ImporterOfRecords() {
  }

  public ImporterOfRecords name(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * The name of a contact person at this address. Either &#x60;name&#x60; or the &#x60;company_name&#x60; field should always be set. 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "John Doe", required = true, value = "The name of a contact person at this address. Either `name` or the `company_name` field should always be set. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    this.name = name;
  }


  public ImporterOfRecords phone(String phone) {
    
    
    if (phone != null && phone.length() < 1) {
      throw new IllegalArgumentException("Invalid value for phone. Length must be greater than or equal to 1.");
    }
    
    this.phone = phone;
    return this;
  }

   /**
   * The phone number of a contact person at this address.  The format of this phone number varies depending on the country. 
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+1 204-253-9411 ext. 123", value = "The phone number of a contact person at this address.  The format of this phone number varies depending on the country. ")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    if (phone != null && phone.length() < 1) {
      throw new IllegalArgumentException("Invalid value for phone. Length must be greater than or equal to 1.");
    }
    this.phone = phone;
  }


  public ImporterOfRecords email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Email for the address owner. 
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@example.com", value = "Email for the address owner. ")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public ImporterOfRecords companyName(String companyName) {
    
    
    if (companyName != null && companyName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for companyName. Length must be greater than or equal to 1.");
    }
    
    this.companyName = companyName;
    return this;
  }

   /**
   * If this is a business address, then the company name should be specified here. Either &#x60;name&#x60; or the &#x60;company_name&#x60; field should always be set. 
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The Home Depot", value = "If this is a business address, then the company name should be specified here. Either `name` or the `company_name` field should always be set. ")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    
    
    if (companyName != null && companyName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for companyName. Length must be greater than or equal to 1.");
    }
    this.companyName = companyName;
  }


  public ImporterOfRecords addressLine1(String addressLine1) {
    
    
    if (addressLine1 != null && addressLine1.length() < 1) {
      throw new IllegalArgumentException("Invalid value for addressLine1. Length must be greater than or equal to 1.");
    }
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the street address.  For some addresses, this may be the only line.  Other addresses may require 2 or 3 lines. 
   * @return addressLine1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1999 Bishop Grandin Blvd.", required = true, value = "The first line of the street address.  For some addresses, this may be the only line.  Other addresses may require 2 or 3 lines. ")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    
    
    if (addressLine1 != null && addressLine1.length() < 1) {
      throw new IllegalArgumentException("Invalid value for addressLine1. Length must be greater than or equal to 1.");
    }
    this.addressLine1 = addressLine1;
  }


  public ImporterOfRecords addressLine2(String addressLine2) {
    
    
    if (addressLine2 != null && addressLine2.length() < 1) {
      throw new IllegalArgumentException("Invalid value for addressLine2. Length must be greater than or equal to 1.");
    }
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the street address.  For some addresses, this line may not be needed. 
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Unit 408", value = "The second line of the street address.  For some addresses, this line may not be needed. ")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    
    
    if (addressLine2 != null && addressLine2.length() < 1) {
      throw new IllegalArgumentException("Invalid value for addressLine2. Length must be greater than or equal to 1.");
    }
    this.addressLine2 = addressLine2;
  }


  public ImporterOfRecords addressLine3(String addressLine3) {
    
    
    if (addressLine3 != null && addressLine3.length() < 1) {
      throw new IllegalArgumentException("Invalid value for addressLine3. Length must be greater than or equal to 1.");
    }
    
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * The third line of the street address.  For some addresses, this line may not be needed. 
   * @return addressLine3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Building #7", value = "The third line of the street address.  For some addresses, this line may not be needed. ")

  public String getAddressLine3() {
    return addressLine3;
  }


  public void setAddressLine3(String addressLine3) {
    
    
    if (addressLine3 != null && addressLine3.length() < 1) {
      throw new IllegalArgumentException("Invalid value for addressLine3. Length must be greater than or equal to 1.");
    }
    this.addressLine3 = addressLine3;
  }


  public ImporterOfRecords cityLocality(String cityLocality) {
    
    
    if (cityLocality != null && cityLocality.length() < 1) {
      throw new IllegalArgumentException("Invalid value for cityLocality. Length must be greater than or equal to 1.");
    }
    
    this.cityLocality = cityLocality;
    return this;
  }

   /**
   * The name of the city or locality
   * @return cityLocality
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Winnipeg", required = true, value = "The name of the city or locality")

  public String getCityLocality() {
    return cityLocality;
  }


  public void setCityLocality(String cityLocality) {
    
    
    if (cityLocality != null && cityLocality.length() < 1) {
      throw new IllegalArgumentException("Invalid value for cityLocality. Length must be greater than or equal to 1.");
    }
    this.cityLocality = cityLocality;
  }


  public ImporterOfRecords stateProvince(String stateProvince) {
    
    
    if (stateProvince != null && stateProvince.length() < 1) {
      throw new IllegalArgumentException("Invalid value for stateProvince. Length must be greater than or equal to 1.");
    }
    
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * The state or province.  For some countries (including the U.S.) only abbreviations are allowed.  Other countries allow the full name or abbreviation. 
   * @return stateProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Manitoba", value = "The state or province.  For some countries (including the U.S.) only abbreviations are allowed.  Other countries allow the full name or abbreviation. ")

  public String getStateProvince() {
    return stateProvince;
  }


  public void setStateProvince(String stateProvince) {
    
    
    if (stateProvince != null && stateProvince.length() < 1) {
      throw new IllegalArgumentException("Invalid value for stateProvince. Length must be greater than or equal to 1.");
    }
    this.stateProvince = stateProvince;
  }


  public ImporterOfRecords postalCode(String postalCode) {
    
    
    if (postalCode != null && postalCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for postalCode. Length must be greater than or equal to 1.");
    }
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * postal code
   * @return postalCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "78756-3717", required = true, value = "postal code")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    
    
    if (postalCode != null && postalCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for postalCode. Length must be greater than or equal to 1.");
    }
    this.postalCode = postalCode;
  }


  public ImporterOfRecords countryCode(String countryCode) {
    
    
    if (countryCode != null && countryCode.length() < 2) {
      throw new IllegalArgumentException("Invalid value for countryCode. Length must be greater than or equal to 2.");
    }
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1) 
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CA", required = true, value = "A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1) ")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    
    
    if (countryCode != null && countryCode.length() < 2) {
      throw new IllegalArgumentException("Invalid value for countryCode. Length must be greater than or equal to 2.");
    }
    this.countryCode = countryCode;
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
   * @return the ImporterOfRecords instance itself
   */
  public ImporterOfRecords putAdditionalProperty(String key, Object value) {
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
    ImporterOfRecords importerOfRecords = (ImporterOfRecords) o;
    return Objects.equals(this.name, importerOfRecords.name) &&
        Objects.equals(this.phone, importerOfRecords.phone) &&
        Objects.equals(this.email, importerOfRecords.email) &&
        Objects.equals(this.companyName, importerOfRecords.companyName) &&
        Objects.equals(this.addressLine1, importerOfRecords.addressLine1) &&
        Objects.equals(this.addressLine2, importerOfRecords.addressLine2) &&
        Objects.equals(this.addressLine3, importerOfRecords.addressLine3) &&
        Objects.equals(this.cityLocality, importerOfRecords.cityLocality) &&
        Objects.equals(this.stateProvince, importerOfRecords.stateProvince) &&
        Objects.equals(this.postalCode, importerOfRecords.postalCode) &&
        Objects.equals(this.countryCode, importerOfRecords.countryCode)&&
        Objects.equals(this.additionalProperties, importerOfRecords.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, email, companyName, addressLine1, addressLine2, addressLine3, cityLocality, stateProvince, postalCode, countryCode, additionalProperties);
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
    sb.append("class ImporterOfRecords {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    cityLocality: ").append(toIndentedString(cityLocality)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("phone");
    openapiFields.add("email");
    openapiFields.add("company_name");
    openapiFields.add("address_line1");
    openapiFields.add("address_line2");
    openapiFields.add("address_line3");
    openapiFields.add("city_locality");
    openapiFields.add("state_province");
    openapiFields.add("postal_code");
    openapiFields.add("country_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("address_line1");
    openapiRequiredFields.add("city_locality");
    openapiRequiredFields.add("postal_code");
    openapiRequiredFields.add("country_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ImporterOfRecords
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ImporterOfRecords.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImporterOfRecords is not found in the empty JSON string", ImporterOfRecords.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImporterOfRecords.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (!jsonObj.get("email").isJsonNull() && (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("company_name").isJsonNull() && (jsonObj.get("company_name") != null && !jsonObj.get("company_name").isJsonNull()) && !jsonObj.get("company_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_name").toString()));
      }
      if (!jsonObj.get("address_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line1").toString()));
      }
      if (!jsonObj.get("address_line2").isJsonNull() && (jsonObj.get("address_line2") != null && !jsonObj.get("address_line2").isJsonNull()) && !jsonObj.get("address_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line2").toString()));
      }
      if (!jsonObj.get("address_line3").isJsonNull() && (jsonObj.get("address_line3") != null && !jsonObj.get("address_line3").isJsonNull()) && !jsonObj.get("address_line3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line3").toString()));
      }
      if (!jsonObj.get("city_locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_locality").toString()));
      }
      if ((jsonObj.get("state_province") != null && !jsonObj.get("state_province").isJsonNull()) && !jsonObj.get("state_province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_province").toString()));
      }
      if (!jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if (!jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImporterOfRecords.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImporterOfRecords' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImporterOfRecords> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImporterOfRecords.class));

       return (TypeAdapter<T>) new TypeAdapter<ImporterOfRecords>() {
           @Override
           public void write(JsonWriter out, ImporterOfRecords value) throws IOException {
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
           public ImporterOfRecords read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ImporterOfRecords instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ImporterOfRecords given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ImporterOfRecords
  * @throws IOException if the JSON string is invalid with respect to ImporterOfRecords
  */
  public static ImporterOfRecords fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImporterOfRecords.class);
  }

 /**
  * Convert an instance of ImporterOfRecords to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

