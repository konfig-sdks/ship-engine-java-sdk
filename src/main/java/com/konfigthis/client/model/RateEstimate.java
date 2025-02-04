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
import com.konfigthis.client.model.MonetaryValue;
import com.konfigthis.client.model.RateType;
import com.konfigthis.client.model.ValidationStatus;
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
 * A rate estimate
 */
@ApiModel(description = "A rate estimate")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RateEstimate {
  public static final String SERIALIZED_NAME_RATE_TYPE = "rate_type";
  @SerializedName(SERIALIZED_NAME_RATE_TYPE)
  private RateType rateType;

  public static final String SERIALIZED_NAME_CARRIER_ID = "carrier_id";
  @SerializedName(SERIALIZED_NAME_CARRIER_ID)
  private String carrierId;

  public static final String SERIALIZED_NAME_SHIPPING_AMOUNT = "shipping_amount";
  @SerializedName(SERIALIZED_NAME_SHIPPING_AMOUNT)
  private MonetaryValue shippingAmount;

  public static final String SERIALIZED_NAME_INSURANCE_AMOUNT = "insurance_amount";
  @SerializedName(SERIALIZED_NAME_INSURANCE_AMOUNT)
  private MonetaryValue insuranceAmount;

  public static final String SERIALIZED_NAME_CONFIRMATION_AMOUNT = "confirmation_amount";
  @SerializedName(SERIALIZED_NAME_CONFIRMATION_AMOUNT)
  private MonetaryValue confirmationAmount;

  public static final String SERIALIZED_NAME_OTHER_AMOUNT = "other_amount";
  @SerializedName(SERIALIZED_NAME_OTHER_AMOUNT)
  private MonetaryValue otherAmount;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private MonetaryValue taxAmount;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private Integer zone;

  public static final String SERIALIZED_NAME_PACKAGE_TYPE = "package_type";
  @SerializedName(SERIALIZED_NAME_PACKAGE_TYPE)
  private String packageType;

  public static final String SERIALIZED_NAME_DELIVERY_DAYS = "delivery_days";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DAYS)
  private Integer deliveryDays;

  public static final String SERIALIZED_NAME_GUARANTEED_SERVICE = "guaranteed_service";
  @SerializedName(SERIALIZED_NAME_GUARANTEED_SERVICE)
  private Boolean guaranteedService;

  public static final String SERIALIZED_NAME_ESTIMATED_DELIVERY_DATE = "estimated_delivery_date";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DELIVERY_DATE)
  private OffsetDateTime estimatedDeliveryDate;

  public static final String SERIALIZED_NAME_CARRIER_DELIVERY_DAYS = "carrier_delivery_days";
  @SerializedName(SERIALIZED_NAME_CARRIER_DELIVERY_DAYS)
  private String carrierDeliveryDays;

  public static final String SERIALIZED_NAME_SHIP_DATE = "ship_date";
  @SerializedName(SERIALIZED_NAME_SHIP_DATE)
  private OffsetDateTime shipDate;

  public static final String SERIALIZED_NAME_NEGOTIATED_RATE = "negotiated_rate";
  @SerializedName(SERIALIZED_NAME_NEGOTIATED_RATE)
  private Boolean negotiatedRate;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "service_type";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_TRACKABLE = "trackable";
  @SerializedName(SERIALIZED_NAME_TRACKABLE)
  private Boolean trackable;

  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrier_code";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_CARRIER_NICKNAME = "carrier_nickname";
  @SerializedName(SERIALIZED_NAME_CARRIER_NICKNAME)
  private String carrierNickname;

  public static final String SERIALIZED_NAME_CARRIER_FRIENDLY_NAME = "carrier_friendly_name";
  @SerializedName(SERIALIZED_NAME_CARRIER_FRIENDLY_NAME)
  private String carrierFriendlyName;

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "validation_status";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private ValidationStatus validationStatus;

  public static final String SERIALIZED_NAME_WARNING_MESSAGES = "warning_messages";
  @SerializedName(SERIALIZED_NAME_WARNING_MESSAGES)
  private List<String> warningMessages = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERROR_MESSAGES = "error_messages";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGES)
  private List<String> errorMessages = new ArrayList<>();

  public RateEstimate() {
  }

  
  public RateEstimate(
     Integer zone, 
     String packageType, 
     Integer deliveryDays, 
     Boolean guaranteedService, 
     String carrierDeliveryDays, 
     OffsetDateTime shipDate, 
     Boolean negotiatedRate, 
     String serviceType, 
     String serviceCode, 
     Boolean trackable, 
     String carrierCode, 
     String carrierNickname, 
     String carrierFriendlyName, 
     List<String> warningMessages, 
     List<String> errorMessages
  ) {
    this();
    this.zone = zone;
    this.packageType = packageType;
    this.deliveryDays = deliveryDays;
    this.guaranteedService = guaranteedService;
    this.carrierDeliveryDays = carrierDeliveryDays;
    this.shipDate = shipDate;
    this.negotiatedRate = negotiatedRate;
    this.serviceType = serviceType;
    this.serviceCode = serviceCode;
    this.trackable = trackable;
    this.carrierCode = carrierCode;
    this.carrierNickname = carrierNickname;
    this.carrierFriendlyName = carrierFriendlyName;
    this.warningMessages = warningMessages;
    this.errorMessages = errorMessages;
  }

  public RateEstimate rateType(RateType rateType) {
    
    
    
    
    this.rateType = rateType;
    return this;
  }

   /**
   * Get rateType
   * @return rateType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RateType getRateType() {
    return rateType;
  }


  public void setRateType(RateType rateType) {
    
    
    
    this.rateType = rateType;
  }


  public RateEstimate carrierId(String carrierId) {
    
    
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


  public RateEstimate shippingAmount(MonetaryValue shippingAmount) {
    
    
    
    
    this.shippingAmount = shippingAmount;
    return this;
  }

   /**
   * The shipping amount
   * @return shippingAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The shipping amount")

  public MonetaryValue getShippingAmount() {
    return shippingAmount;
  }


  public void setShippingAmount(MonetaryValue shippingAmount) {
    
    
    
    this.shippingAmount = shippingAmount;
  }


  public RateEstimate insuranceAmount(MonetaryValue insuranceAmount) {
    
    
    
    
    this.insuranceAmount = insuranceAmount;
    return this;
  }

   /**
   * The insurance amount
   * @return insuranceAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The insurance amount")

  public MonetaryValue getInsuranceAmount() {
    return insuranceAmount;
  }


  public void setInsuranceAmount(MonetaryValue insuranceAmount) {
    
    
    
    this.insuranceAmount = insuranceAmount;
  }


  public RateEstimate confirmationAmount(MonetaryValue confirmationAmount) {
    
    
    
    
    this.confirmationAmount = confirmationAmount;
    return this;
  }

   /**
   * The confirmation amount
   * @return confirmationAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The confirmation amount")

  public MonetaryValue getConfirmationAmount() {
    return confirmationAmount;
  }


  public void setConfirmationAmount(MonetaryValue confirmationAmount) {
    
    
    
    this.confirmationAmount = confirmationAmount;
  }


  public RateEstimate otherAmount(MonetaryValue otherAmount) {
    
    
    
    
    this.otherAmount = otherAmount;
    return this;
  }

   /**
   * Any other charges associated with this rate
   * @return otherAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Any other charges associated with this rate")

  public MonetaryValue getOtherAmount() {
    return otherAmount;
  }


  public void setOtherAmount(MonetaryValue otherAmount) {
    
    
    
    this.otherAmount = otherAmount;
  }


  public RateEstimate taxAmount(MonetaryValue taxAmount) {
    
    
    
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Tariff and additional taxes associated with an international shipment.
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tariff and additional taxes associated with an international shipment.")

  public MonetaryValue getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(MonetaryValue taxAmount) {
    
    
    
    this.taxAmount = taxAmount;
  }


   /**
   * Certain carriers base [their rates](https://blog.stamps.com/2017/09/08/usps-postal-zones/) off of custom zones that vary depending upon the ship_to and ship_from location 
   * minimum: 0
   * @return zone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", required = true, value = "Certain carriers base [their rates](https://blog.stamps.com/2017/09/08/usps-postal-zones/) off of custom zones that vary depending upon the ship_to and ship_from location ")

  public Integer getZone() {
    return zone;
  }




   /**
   * package type that this rate was estimated for
   * @return packageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "package", required = true, value = "package type that this rate was estimated for")

  public String getPackageType() {
    return packageType;
  }




   /**
   * The number of days estimated for delivery, this will show the _actual_ delivery time if for example, the package gets shipped on a Friday 
   * minimum: 1
   * @return deliveryDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The number of days estimated for delivery, this will show the _actual_ delivery time if for example, the package gets shipped on a Friday ")

  public Integer getDeliveryDays() {
    return deliveryDays;
  }




   /**
   * Indicates if the rate is guaranteed.
   * @return guaranteedService
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates if the rate is guaranteed.")

  public Boolean getGuaranteedService() {
    return guaranteedService;
  }




  public RateEstimate estimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
    
    
    
    
    this.estimatedDeliveryDate = estimatedDeliveryDate;
    return this;
  }

   /**
   * An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date, but not a specific time.  The value _may_ contain a time component, but it will be set to &#x60;00:00:00&#x60; UTC by ShipEngine. 
   * @return estimatedDeliveryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-23T00:00Z", value = "An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date, but not a specific time.  The value _may_ contain a time component, but it will be set to `00:00:00` UTC by ShipEngine. ")

  public OffsetDateTime getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }


  public void setEstimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
    
    
    
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }


   /**
   * The carrier delivery days
   * @return carrierDeliveryDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The carrier delivery days")

  public String getCarrierDeliveryDays() {
    return carrierDeliveryDays;
  }




   /**
   * ship date
   * @return shipDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ship date")

  public OffsetDateTime getShipDate() {
    return shipDate;
  }




   /**
   * Indicates if the rates been negotiated
   * @return negotiatedRate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates if the rates been negotiated")

  public Boolean getNegotiatedRate() {
    return negotiatedRate;
  }




   /**
   * service type
   * @return serviceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "service type")

  public String getServiceType() {
    return serviceType;
  }




   /**
   * service code for the rate
   * @return serviceCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "service code for the rate")

  public String getServiceCode() {
    return serviceCode;
  }




   /**
   * Indicates if rate is trackable
   * @return trackable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates if rate is trackable")

  public Boolean getTrackable() {
    return trackable;
  }




   /**
   * A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as &#x60;fedex&#x60;, &#x60;dhl_express&#x60;, &#x60;stamps_com&#x60;, etc.
   * @return carrierCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as `fedex`, `dhl_express`, `stamps_com`, etc.")

  public String getCarrierCode() {
    return carrierCode;
  }




   /**
   * carrier nickname
   * @return carrierNickname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "carrier nickname")

  public String getCarrierNickname() {
    return carrierNickname;
  }




   /**
   * carrier friendly name
   * @return carrierFriendlyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "carrier friendly name")

  public String getCarrierFriendlyName() {
    return carrierFriendlyName;
  }




  public RateEstimate validationStatus(ValidationStatus validationStatus) {
    
    
    
    
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * Get validationStatus
   * @return validationStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ValidationStatus getValidationStatus() {
    return validationStatus;
  }


  public void setValidationStatus(ValidationStatus validationStatus) {
    
    
    
    this.validationStatus = validationStatus;
  }


   /**
   * The warning messages
   * @return warningMessages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The warning messages")

  public List<String> getWarningMessages() {
    return warningMessages;
  }




   /**
   * The error messages
   * @return errorMessages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The error messages")

  public List<String> getErrorMessages() {
    return errorMessages;
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
   * @return the RateEstimate instance itself
   */
  public RateEstimate putAdditionalProperty(String key, Object value) {
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
    RateEstimate rateEstimate = (RateEstimate) o;
    return Objects.equals(this.rateType, rateEstimate.rateType) &&
        Objects.equals(this.carrierId, rateEstimate.carrierId) &&
        Objects.equals(this.shippingAmount, rateEstimate.shippingAmount) &&
        Objects.equals(this.insuranceAmount, rateEstimate.insuranceAmount) &&
        Objects.equals(this.confirmationAmount, rateEstimate.confirmationAmount) &&
        Objects.equals(this.otherAmount, rateEstimate.otherAmount) &&
        Objects.equals(this.taxAmount, rateEstimate.taxAmount) &&
        Objects.equals(this.zone, rateEstimate.zone) &&
        Objects.equals(this.packageType, rateEstimate.packageType) &&
        Objects.equals(this.deliveryDays, rateEstimate.deliveryDays) &&
        Objects.equals(this.guaranteedService, rateEstimate.guaranteedService) &&
        Objects.equals(this.estimatedDeliveryDate, rateEstimate.estimatedDeliveryDate) &&
        Objects.equals(this.carrierDeliveryDays, rateEstimate.carrierDeliveryDays) &&
        Objects.equals(this.shipDate, rateEstimate.shipDate) &&
        Objects.equals(this.negotiatedRate, rateEstimate.negotiatedRate) &&
        Objects.equals(this.serviceType, rateEstimate.serviceType) &&
        Objects.equals(this.serviceCode, rateEstimate.serviceCode) &&
        Objects.equals(this.trackable, rateEstimate.trackable) &&
        Objects.equals(this.carrierCode, rateEstimate.carrierCode) &&
        Objects.equals(this.carrierNickname, rateEstimate.carrierNickname) &&
        Objects.equals(this.carrierFriendlyName, rateEstimate.carrierFriendlyName) &&
        Objects.equals(this.validationStatus, rateEstimate.validationStatus) &&
        Objects.equals(this.warningMessages, rateEstimate.warningMessages) &&
        Objects.equals(this.errorMessages, rateEstimate.errorMessages)&&
        Objects.equals(this.additionalProperties, rateEstimate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateType, carrierId, shippingAmount, insuranceAmount, confirmationAmount, otherAmount, taxAmount, zone, packageType, deliveryDays, guaranteedService, estimatedDeliveryDate, carrierDeliveryDays, shipDate, negotiatedRate, serviceType, serviceCode, trackable, carrierCode, carrierNickname, carrierFriendlyName, validationStatus, warningMessages, errorMessages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateEstimate {\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    shippingAmount: ").append(toIndentedString(shippingAmount)).append("\n");
    sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    sb.append("    confirmationAmount: ").append(toIndentedString(confirmationAmount)).append("\n");
    sb.append("    otherAmount: ").append(toIndentedString(otherAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    deliveryDays: ").append(toIndentedString(deliveryDays)).append("\n");
    sb.append("    guaranteedService: ").append(toIndentedString(guaranteedService)).append("\n");
    sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
    sb.append("    carrierDeliveryDays: ").append(toIndentedString(carrierDeliveryDays)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    negotiatedRate: ").append(toIndentedString(negotiatedRate)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    trackable: ").append(toIndentedString(trackable)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierNickname: ").append(toIndentedString(carrierNickname)).append("\n");
    sb.append("    carrierFriendlyName: ").append(toIndentedString(carrierFriendlyName)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    warningMessages: ").append(toIndentedString(warningMessages)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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
    openapiFields.add("rate_type");
    openapiFields.add("carrier_id");
    openapiFields.add("shipping_amount");
    openapiFields.add("insurance_amount");
    openapiFields.add("confirmation_amount");
    openapiFields.add("other_amount");
    openapiFields.add("tax_amount");
    openapiFields.add("zone");
    openapiFields.add("package_type");
    openapiFields.add("delivery_days");
    openapiFields.add("guaranteed_service");
    openapiFields.add("estimated_delivery_date");
    openapiFields.add("carrier_delivery_days");
    openapiFields.add("ship_date");
    openapiFields.add("negotiated_rate");
    openapiFields.add("service_type");
    openapiFields.add("service_code");
    openapiFields.add("trackable");
    openapiFields.add("carrier_code");
    openapiFields.add("carrier_nickname");
    openapiFields.add("carrier_friendly_name");
    openapiFields.add("validation_status");
    openapiFields.add("warning_messages");
    openapiFields.add("error_messages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rate_type");
    openapiRequiredFields.add("carrier_id");
    openapiRequiredFields.add("shipping_amount");
    openapiRequiredFields.add("insurance_amount");
    openapiRequiredFields.add("confirmation_amount");
    openapiRequiredFields.add("other_amount");
    openapiRequiredFields.add("zone");
    openapiRequiredFields.add("package_type");
    openapiRequiredFields.add("guaranteed_service");
    openapiRequiredFields.add("negotiated_rate");
    openapiRequiredFields.add("service_type");
    openapiRequiredFields.add("service_code");
    openapiRequiredFields.add("trackable");
    openapiRequiredFields.add("carrier_code");
    openapiRequiredFields.add("carrier_nickname");
    openapiRequiredFields.add("carrier_friendly_name");
    openapiRequiredFields.add("validation_status");
    openapiRequiredFields.add("warning_messages");
    openapiRequiredFields.add("error_messages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RateEstimate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RateEstimate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RateEstimate is not found in the empty JSON string", RateEstimate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RateEstimate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("carrier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_id").toString()));
      }
      // validate the required field `shipping_amount`
      MonetaryValue.validateJsonObject(jsonObj.getAsJsonObject("shipping_amount"));
      // validate the required field `insurance_amount`
      MonetaryValue.validateJsonObject(jsonObj.getAsJsonObject("insurance_amount"));
      // validate the required field `confirmation_amount`
      MonetaryValue.validateJsonObject(jsonObj.getAsJsonObject("confirmation_amount"));
      // validate the required field `other_amount`
      MonetaryValue.validateJsonObject(jsonObj.getAsJsonObject("other_amount"));
      // validate the optional field `tax_amount`
      if (jsonObj.get("tax_amount") != null && !jsonObj.get("tax_amount").isJsonNull()) {
        MonetaryValue.validateJsonObject(jsonObj.getAsJsonObject("tax_amount"));
      }
      if (!jsonObj.get("package_type").isJsonNull() && !jsonObj.get("package_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_type").toString()));
      }
      if ((jsonObj.get("carrier_delivery_days") != null && !jsonObj.get("carrier_delivery_days").isJsonNull()) && !jsonObj.get("carrier_delivery_days").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_delivery_days` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_delivery_days").toString()));
      }
      if (!jsonObj.get("service_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_type").toString()));
      }
      if (!jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (!jsonObj.get("carrier_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_code").toString()));
      }
      if (!jsonObj.get("carrier_nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_nickname").toString()));
      }
      if (!jsonObj.get("carrier_friendly_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier_friendly_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier_friendly_name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("warning_messages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("warning_messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warning_messages` to be an array in the JSON string but got `%s`", jsonObj.get("warning_messages").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("error_messages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("error_messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_messages` to be an array in the JSON string but got `%s`", jsonObj.get("error_messages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RateEstimate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RateEstimate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RateEstimate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RateEstimate.class));

       return (TypeAdapter<T>) new TypeAdapter<RateEstimate>() {
           @Override
           public void write(JsonWriter out, RateEstimate value) throws IOException {
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
           public RateEstimate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RateEstimate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RateEstimate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RateEstimate
  * @throws IOException if the JSON string is invalid with respect to RateEstimate
  */
  public static RateEstimate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RateEstimate.class);
  }

 /**
  * Convert an instance of RateEstimate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

