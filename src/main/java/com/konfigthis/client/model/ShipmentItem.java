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
import com.konfigthis.client.model.OrderSourceName;
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
 * A shipment item
 */
@ApiModel(description = "A shipment item")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ShipmentItem {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SALES_ORDER_ID = "sales_order_id";
  @SerializedName(SERIALIZED_NAME_SALES_ORDER_ID)
  private String salesOrderId;

  public static final String SERIALIZED_NAME_SALES_ORDER_ITEM_ID = "sales_order_item_id";
  @SerializedName(SERIALIZED_NAME_SALES_ORDER_ITEM_ID)
  private String salesOrderItemId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_EXTERNAL_ORDER_ID = "external_order_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ORDER_ID)
  private String externalOrderId;

  public static final String SERIALIZED_NAME_EXTERNAL_ORDER_ITEM_ID = "external_order_item_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ORDER_ITEM_ID)
  private String externalOrderItemId;

  public static final String SERIALIZED_NAME_ASIN = "asin";
  @SerializedName(SERIALIZED_NAME_ASIN)
  private String asin;

  public static final String SERIALIZED_NAME_ORDER_SOURCE_CODE = "order_source_code";
  @SerializedName(SERIALIZED_NAME_ORDER_SOURCE_CODE)
  private OrderSourceName orderSourceCode;

  public ShipmentItem() {
  }

  public ShipmentItem name(String name) {
    
    
    if (name != null && name.length() < 0) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 0.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * item name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "item name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 0) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 0.");
    }
    this.name = name;
  }


  public ShipmentItem salesOrderId(String salesOrderId) {
    
    
    
    
    this.salesOrderId = salesOrderId;
    return this;
  }

   /**
   * sales order id
   * @return salesOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sales order id")

  public String getSalesOrderId() {
    return salesOrderId;
  }


  public void setSalesOrderId(String salesOrderId) {
    
    
    
    this.salesOrderId = salesOrderId;
  }


  public ShipmentItem salesOrderItemId(String salesOrderItemId) {
    
    
    
    
    this.salesOrderItemId = salesOrderItemId;
    return this;
  }

   /**
   * sales order item id
   * @return salesOrderItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sales order item id")

  public String getSalesOrderItemId() {
    return salesOrderItemId;
  }


  public void setSalesOrderItemId(String salesOrderItemId) {
    
    
    
    this.salesOrderItemId = salesOrderItemId;
  }


  public ShipmentItem quantity(Integer quantity) {
    if (quantity != null && quantity < 0) {
      throw new IllegalArgumentException("Invalid value for quantity. Must be greater than or equal to 0.");
    }
    
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of this item included in the shipment
   * minimum: 0
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quantity of this item included in the shipment")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    if (quantity != null && quantity < 0) {
      throw new IllegalArgumentException("Invalid value for quantity. Must be greater than or equal to 0.");
    }
    
    
    this.quantity = quantity;
  }


  public ShipmentItem sku(String sku) {
    
    
    
    
    this.sku = sku;
    return this;
  }

   /**
   * Item Stock Keeping Unit
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item Stock Keeping Unit")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    
    
    
    this.sku = sku;
  }


  public ShipmentItem externalOrderId(String externalOrderId) {
    
    
    
    
    this.externalOrderId = externalOrderId;
    return this;
  }

   /**
   * external order id
   * @return externalOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "external order id")

  public String getExternalOrderId() {
    return externalOrderId;
  }


  public void setExternalOrderId(String externalOrderId) {
    
    
    
    this.externalOrderId = externalOrderId;
  }


  public ShipmentItem externalOrderItemId(String externalOrderItemId) {
    
    
    
    
    this.externalOrderItemId = externalOrderItemId;
    return this;
  }

   /**
   * external order item id
   * @return externalOrderItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "external order item id")

  public String getExternalOrderItemId() {
    return externalOrderItemId;
  }


  public void setExternalOrderItemId(String externalOrderItemId) {
    
    
    
    this.externalOrderItemId = externalOrderItemId;
  }


  public ShipmentItem asin(String asin) {
    
    
    if (asin != null && asin.length() < 10) {
      throw new IllegalArgumentException("Invalid value for asin. Length must be greater than or equal to 10.");
    }
    
    this.asin = asin;
    return this;
  }

   /**
   * Amazon Standard Identification Number
   * @return asin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B00005N5PF", value = "Amazon Standard Identification Number")

  public String getAsin() {
    return asin;
  }


  public void setAsin(String asin) {
    
    
    if (asin != null && asin.length() < 10) {
      throw new IllegalArgumentException("Invalid value for asin. Length must be greater than or equal to 10.");
    }
    this.asin = asin;
  }


  public ShipmentItem orderSourceCode(OrderSourceName orderSourceCode) {
    
    
    
    
    this.orderSourceCode = orderSourceCode;
    return this;
  }

   /**
   * Get orderSourceCode
   * @return orderSourceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderSourceName getOrderSourceCode() {
    return orderSourceCode;
  }


  public void setOrderSourceCode(OrderSourceName orderSourceCode) {
    
    
    
    this.orderSourceCode = orderSourceCode;
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
   * @return the ShipmentItem instance itself
   */
  public ShipmentItem putAdditionalProperty(String key, Object value) {
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
    ShipmentItem shipmentItem = (ShipmentItem) o;
    return Objects.equals(this.name, shipmentItem.name) &&
        Objects.equals(this.salesOrderId, shipmentItem.salesOrderId) &&
        Objects.equals(this.salesOrderItemId, shipmentItem.salesOrderItemId) &&
        Objects.equals(this.quantity, shipmentItem.quantity) &&
        Objects.equals(this.sku, shipmentItem.sku) &&
        Objects.equals(this.externalOrderId, shipmentItem.externalOrderId) &&
        Objects.equals(this.externalOrderItemId, shipmentItem.externalOrderItemId) &&
        Objects.equals(this.asin, shipmentItem.asin) &&
        Objects.equals(this.orderSourceCode, shipmentItem.orderSourceCode)&&
        Objects.equals(this.additionalProperties, shipmentItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, salesOrderId, salesOrderItemId, quantity, sku, externalOrderId, externalOrderItemId, asin, orderSourceCode, additionalProperties);
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
    sb.append("class ShipmentItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    salesOrderId: ").append(toIndentedString(salesOrderId)).append("\n");
    sb.append("    salesOrderItemId: ").append(toIndentedString(salesOrderItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    externalOrderId: ").append(toIndentedString(externalOrderId)).append("\n");
    sb.append("    externalOrderItemId: ").append(toIndentedString(externalOrderItemId)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    orderSourceCode: ").append(toIndentedString(orderSourceCode)).append("\n");
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
    openapiFields.add("sales_order_id");
    openapiFields.add("sales_order_item_id");
    openapiFields.add("quantity");
    openapiFields.add("sku");
    openapiFields.add("external_order_id");
    openapiFields.add("external_order_item_id");
    openapiFields.add("asin");
    openapiFields.add("order_source_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShipmentItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShipmentItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShipmentItem is not found in the empty JSON string", ShipmentItem.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("sales_order_id").isJsonNull() && (jsonObj.get("sales_order_id") != null && !jsonObj.get("sales_order_id").isJsonNull()) && !jsonObj.get("sales_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sales_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sales_order_id").toString()));
      }
      if (!jsonObj.get("sales_order_item_id").isJsonNull() && (jsonObj.get("sales_order_item_id") != null && !jsonObj.get("sales_order_item_id").isJsonNull()) && !jsonObj.get("sales_order_item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sales_order_item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sales_order_item_id").toString()));
      }
      if (!jsonObj.get("sku").isJsonNull() && (jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if (!jsonObj.get("external_order_id").isJsonNull() && (jsonObj.get("external_order_id") != null && !jsonObj.get("external_order_id").isJsonNull()) && !jsonObj.get("external_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_order_id").toString()));
      }
      if (!jsonObj.get("external_order_item_id").isJsonNull() && (jsonObj.get("external_order_item_id") != null && !jsonObj.get("external_order_item_id").isJsonNull()) && !jsonObj.get("external_order_item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_order_item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_order_item_id").toString()));
      }
      if (!jsonObj.get("asin").isJsonNull() && (jsonObj.get("asin") != null && !jsonObj.get("asin").isJsonNull()) && !jsonObj.get("asin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShipmentItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShipmentItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShipmentItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShipmentItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ShipmentItem>() {
           @Override
           public void write(JsonWriter out, ShipmentItem value) throws IOException {
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
           public ShipmentItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShipmentItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShipmentItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShipmentItem
  * @throws IOException if the JSON string is invalid with respect to ShipmentItem
  */
  public static ShipmentItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShipmentItem.class);
  }

 /**
  * Convert an instance of ShipmentItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

