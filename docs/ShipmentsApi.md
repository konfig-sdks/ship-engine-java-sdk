# ShipmentsApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByExternalId**](ShipmentsApi.md#getByExternalId) | **GET** /v1/shipments/external_shipment_id/{external_shipment_id} | Get Shipment By External ID |
| [**getById**](ShipmentsApi.md#getById) | **GET** /v1/shipments/{shipment_id} | Get Shipment By ID |
| [**getRatesForShipment**](ShipmentsApi.md#getRatesForShipment) | **GET** /v1/shipments/{shipment_id}/rates | Get Shipment Rates |
| [**getTagsById**](ShipmentsApi.md#getTagsById) | **GET** /v1/shipments/{shipment_id}/tags | Get Shipment Tags |
| [**shipment**](ShipmentsApi.md#shipment) | **PUT** /v1/shipments/recognize | Parse shipping info |
| [**shipment_0**](ShipmentsApi.md#shipment_0) | **PUT** /v1/shipments/{shipment_id} | Update Shipment By ID |
| [**shipment_1**](ShipmentsApi.md#shipment_1) | **POST** /v1/shipments/{shipment_id}/tags/{tag_name} | Add Tag to Shipment |
| [**shipment_2**](ShipmentsApi.md#shipment_2) | **DELETE** /v1/shipments/{shipment_id}/tags/{tag_name} | Remove Tag from Shipment |
| [**shipments**](ShipmentsApi.md#shipments) | **GET** /v1/shipments | List Shipments |
| [**shipments_0**](ShipmentsApi.md#shipments_0) | **POST** /v1/shipments | Create Shipments |
| [**shipments_1**](ShipmentsApi.md#shipments_1) | **PUT** /v1/shipments/{shipment_id}/cancel | Cancel a Shipment |
| [**updateTags**](ShipmentsApi.md#updateTags) | **PUT** /v1/shipments/tags | Update Shipments Tags |


<a name="getByExternalId"></a>
# **getByExternalId**
> PartialShipment getByExternalId(externalShipmentId).execute();

Get Shipment By External ID

Query Shipments created using your own custom ID convention using this endpint

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String externalShipmentId = "0bcb569d-1727-4ff9-ab49-b2fec0cee5ae";
    try {
      PartialShipment result = client
              .shipments
              .getByExternalId(externalShipmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getShipmentId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getServiceCode());
      System.out.println(result.getExternalOrderId());
      System.out.println(result.getItems());
      System.out.println(result.getTaxIdentifiers());
      System.out.println(result.getExternalShipmentId());
      System.out.println(result.getShipmentNumber());
      System.out.println(result.getShipDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getShipmentStatus());
      System.out.println(result.getShipTo());
      System.out.println(result.getShipFrom());
      System.out.println(result.getWarehouseId());
      System.out.println(result.getReturnTo());
      System.out.println(result.getIsReturn());
      System.out.println(result.getConfirmation());
      System.out.println(result.getCustoms());
      System.out.println(result.getAdvancedOptions());
      System.out.println(result.getInsuranceProvider());
      System.out.println(result.getOrderSourceCode());
      System.out.println(result.getPackages());
      System.out.println(result.getTotalWeight());
      System.out.println(result.getComparisonRateType());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getByExternalId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PartialShipment> response = client
              .shipments
              .getByExternalId(externalShipmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getByExternalId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **externalShipmentId** | **String**|  | |

### Return type

[**PartialShipment**](PartialShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getById"></a>
# **getById**
> PartialShipment getById(shipmentId).execute();

Get Shipment By ID

Get an individual shipment based on its ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String shipmentId = "shipmentId_example"; // Shipment ID
    try {
      PartialShipment result = client
              .shipments
              .getById(shipmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getShipmentId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getServiceCode());
      System.out.println(result.getExternalOrderId());
      System.out.println(result.getItems());
      System.out.println(result.getTaxIdentifiers());
      System.out.println(result.getExternalShipmentId());
      System.out.println(result.getShipmentNumber());
      System.out.println(result.getShipDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getShipmentStatus());
      System.out.println(result.getShipTo());
      System.out.println(result.getShipFrom());
      System.out.println(result.getWarehouseId());
      System.out.println(result.getReturnTo());
      System.out.println(result.getIsReturn());
      System.out.println(result.getConfirmation());
      System.out.println(result.getCustoms());
      System.out.println(result.getAdvancedOptions());
      System.out.println(result.getInsuranceProvider());
      System.out.println(result.getOrderSourceCode());
      System.out.println(result.getPackages());
      System.out.println(result.getTotalWeight());
      System.out.println(result.getComparisonRateType());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PartialShipment> response = client
              .shipments
              .getById(shipmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shipmentId** | **String**| Shipment ID | |

### Return type

[**PartialShipment**](PartialShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getRatesForShipment"></a>
# **getRatesForShipment**
> RatesInformation getRatesForShipment(shipmentId).createdAtStart(createdAtStart).execute();

Get Shipment Rates

Get Rates for the shipment information associated with the shipment ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String shipmentId = "shipmentId_example"; // Shipment ID
    OffsetDateTime createdAtStart = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Used to create a filter for when a resource was created (ex. A shipment that was created after a certain time)
    try {
      RatesInformation result = client
              .shipments
              .getRatesForShipment(shipmentId)
              .createdAtStart(createdAtStart)
              .execute();
      System.out.println(result);
      System.out.println(result.getRates());
      System.out.println(result.getInvalidRates());
      System.out.println(result.getRateRequestId());
      System.out.println(result.getShipmentId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getStatus());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getRatesForShipment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RatesInformation> response = client
              .shipments
              .getRatesForShipment(shipmentId)
              .createdAtStart(createdAtStart)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getRatesForShipment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shipmentId** | **String**| Shipment ID | |
| **createdAtStart** | **OffsetDateTime**| Used to create a filter for when a resource was created (ex. A shipment that was created after a certain time) | [optional] |

### Return type

[**RatesInformation**](RatesInformation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getTagsById"></a>
# **getTagsById**
> TagShipmentResponseBody getTagsById(shipmentId).execute();

Get Shipment Tags

Get Shipment tags based on its ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String shipmentId = "shipmentId_example"; // Shipment ID
    try {
      TagShipmentResponseBody result = client
              .shipments
              .getTagsById(shipmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getTagsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagShipmentResponseBody> response = client
              .shipments
              .getTagsById(shipmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#getTagsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shipmentId** | **String**| Shipment ID | |

### Return type

[**TagShipmentResponseBody**](TagShipmentResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="shipment"></a>
# **shipment**
> ParseShipmentResponseBody shipment(parseShipmentRequestBody).execute();

Parse shipping info

The shipment-recognition API makes it easy for you to extract shipping data from unstructured text, including people&#39;s names, addresses, package weights and dimensions, insurance and delivery requirements, and more.  Data often enters your system as unstructured text (for example: emails, SMS messages, support tickets, or other documents). ShipEngine&#39;s shipment-recognition API helps you extract meaningful, structured data from this unstructured text. The parsed shipment data is returned in the same structure that&#39;s used for other ShipEngine APIs, so you can easily use the parsed data to create a shipping label.  &gt; **Note:** Shipment recognition is currently supported for the United States, Canada, Australia, New Zealand, the United Kingdom, and Ireland. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String text = "text_example"; // The unstructured text that contains shipping-related entities
    PartialShipment shipment = new PartialShipment(); // You can optionally provide a `shipment` object containing any already-known values. For example, you probably already know the `ship_from` address, and you may also already know what carrier and service you want to use. 
    try {
      ParseShipmentResponseBody result = client
              .shipments
              .shipment(text)
              .shipment(shipment)
              .execute();
      System.out.println(result);
      System.out.println(result.getScore());
      System.out.println(result.getShipment());
      System.out.println(result.getEntities());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ParseShipmentResponseBody> response = client
              .shipments
              .shipment(text)
              .shipment(shipment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parseShipmentRequestBody** | [**ParseShipmentRequestBody**](ParseShipmentRequestBody.md)| The only required field is &#x60;text&#x60;, which is the text to be parsed. You can optionally also provide a &#x60;shipment&#x60; containing any already-known values. For example, you probably already know the &#x60;ship_from&#x60; address, and you may also already know what carrier and service you want to use.  | |

### Return type

[**ParseShipmentResponseBody**](ParseShipmentResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the parsed shipment, as well as a confidence score and a list of all the shipping entities that were recognized in the text.  |  -  |

<a name="shipment_0"></a>
# **shipment_0**
> CreateAndValidateShipment shipment_0(shipmentId, updateShipmentRequestBody).execute();

Update Shipment By ID

Update a shipment object based on its ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    ShippingAddressTo shipTo = new ShippingAddressTo(); // The recipient's mailing address
    ShippingAddress shipFrom = new ShippingAddress(); // The shipment's origin address. If you frequently ship from the same location, consider [creating a warehouse](https://www.shipengine.com/docs/reference/create-warehouse/).  Then you can simply specify the `warehouse_id` rather than the complete address each time. 
    String shipmentId = "shipmentId_example"; // Shipment ID
    List<Tag> tags = Arrays.asList(); // Arbitrary tags associated with this shipment.  Tags can be used to categorize shipments, and shipments can be queried by their tags. 
    String shipmentId = "shipmentId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    String carrierId = "carrierId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    String serviceCode = "serviceCode_example"; // A [carrier service](https://www.shipengine.com/docs/shipping/use-a-carrier-service/), such as `fedex_ground`, `usps_first_class_mail`, `flat_rate_envelope`, etc. 
    String externalOrderId = "externalOrderId_example"; // ID that the Order Source assigned
    List<ShipmentItem> items = Arrays.asList(); // Describe the packages included in this shipment as related to potential metadata that was imported from external order sources 
    List<TaxIdentifier> taxIdentifiers = Arrays.asList();
    String externalShipmentId = "externalShipmentId_example"; // A unique user-defined key to identify a shipment.  This can be used to retrieve the shipment.  > **Warning:** The `external_shipment_id` is limited to 50 characters. Any additional characters will be truncated. 
    String shipmentNumber = "shipmentNumber_example"; // A non-unique user-defined number used to identify a shipment.  If undefined, this will match the external_shipment_id of the shipment.  > **Warning:** The `shipment_number` is limited to 50 characters. Any additional characters will be truncated. 
    OffsetDateTime shipDate = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date, but not a specific time.  The value _may_ contain a time component, but it will be set to `00:00:00` UTC by ShipEngine. 
    OffsetDateTime createdAt = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    OffsetDateTime modifiedAt = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    ShipmentStatus shipmentStatus = ShipmentStatus.fromValue("pending"); // The current status of the shipment
    String warehouseId = "warehouseId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    ShippingAddress returnTo = new ShippingAddress(); // The return address for this shipment.  Defaults to the `ship_from` address. 
    Boolean isReturn = false; // An optional indicator if the shipment is intended to be a return. Defaults to false if not provided. 
    DeliveryConfirmation confirmation = DeliveryConfirmation.fromValue("none"); // The type of delivery confirmation that is required for this shipment.
    InternationalShipmentOptionsNullable customs = new InternationalShipmentOptionsNullable(); // Customs information.  This is usually only needed for international shipments. 
    AdvancedShipmentOptions advancedOptions = new AdvancedShipmentOptions(); // Advanced shipment options.  These are entirely optional.
    InsuranceProvider insuranceProvider = InsuranceProvider.fromValue("none"); // The insurance provider to use for any insured packages in the shipment. 
    OrderSourceName orderSourceCode = OrderSourceName.fromValue("amazon_ca");
    List<ModelPackage> packages = Arrays.asList(); // The packages in the shipment.  > **Note:** Some carriers only allow one package per shipment.  If you attempt to create a multi-package shipment for a carrier that doesn't allow it, an error will be returned. 
    Weight totalWeight = new Weight(); // The combined weight of all packages in the shipment
    String comparisonRateType = "comparisonRateType_example"; // Calculate a rate for this shipment with the requested carrier using a ratecard that differs from the default.  Only supported for UPS and USPS.
    ValidateAddress validateAddress = ValidateAddress.fromValue("no_validation");
    try {
      CreateAndValidateShipment result = client
              .shipments
              .shipment_0(shipTo, shipFrom, shipmentId)
              .tags(tags)
              .shipmentId(shipmentId)
              .carrierId(carrierId)
              .serviceCode(serviceCode)
              .externalOrderId(externalOrderId)
              .items(items)
              .taxIdentifiers(taxIdentifiers)
              .externalShipmentId(externalShipmentId)
              .shipmentNumber(shipmentNumber)
              .shipDate(shipDate)
              .createdAt(createdAt)
              .modifiedAt(modifiedAt)
              .shipmentStatus(shipmentStatus)
              .warehouseId(warehouseId)
              .returnTo(returnTo)
              .isReturn(isReturn)
              .confirmation(confirmation)
              .customs(customs)
              .advancedOptions(advancedOptions)
              .insuranceProvider(insuranceProvider)
              .orderSourceCode(orderSourceCode)
              .packages(packages)
              .totalWeight(totalWeight)
              .comparisonRateType(comparisonRateType)
              .validateAddress(validateAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getShipmentId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getServiceCode());
      System.out.println(result.getExternalOrderId());
      System.out.println(result.getItems());
      System.out.println(result.getTaxIdentifiers());
      System.out.println(result.getExternalShipmentId());
      System.out.println(result.getShipmentNumber());
      System.out.println(result.getShipDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getShipmentStatus());
      System.out.println(result.getShipTo());
      System.out.println(result.getShipFrom());
      System.out.println(result.getWarehouseId());
      System.out.println(result.getReturnTo());
      System.out.println(result.getIsReturn());
      System.out.println(result.getConfirmation());
      System.out.println(result.getCustoms());
      System.out.println(result.getAdvancedOptions());
      System.out.println(result.getInsuranceProvider());
      System.out.println(result.getOrderSourceCode());
      System.out.println(result.getPackages());
      System.out.println(result.getTotalWeight());
      System.out.println(result.getComparisonRateType());
      System.out.println(result.getErrors());
      System.out.println(result.getAddressValidation());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipment_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateAndValidateShipment> response = client
              .shipments
              .shipment_0(shipTo, shipFrom, shipmentId)
              .tags(tags)
              .shipmentId(shipmentId)
              .carrierId(carrierId)
              .serviceCode(serviceCode)
              .externalOrderId(externalOrderId)
              .items(items)
              .taxIdentifiers(taxIdentifiers)
              .externalShipmentId(externalShipmentId)
              .shipmentNumber(shipmentNumber)
              .shipDate(shipDate)
              .createdAt(createdAt)
              .modifiedAt(modifiedAt)
              .shipmentStatus(shipmentStatus)
              .warehouseId(warehouseId)
              .returnTo(returnTo)
              .isReturn(isReturn)
              .confirmation(confirmation)
              .customs(customs)
              .advancedOptions(advancedOptions)
              .insuranceProvider(insuranceProvider)
              .orderSourceCode(orderSourceCode)
              .packages(packages)
              .totalWeight(totalWeight)
              .comparisonRateType(comparisonRateType)
              .validateAddress(validateAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipment_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shipmentId** | **String**| Shipment ID | |
| **updateShipmentRequestBody** | [**UpdateShipmentRequestBody**](UpdateShipmentRequestBody.md)|  | |

### Return type

[**CreateAndValidateShipment**](CreateAndValidateShipment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="shipment_1"></a>
# **shipment_1**
> TagShipmentResponseBody shipment_1(shipmentId, tagName).execute();

Add Tag to Shipment

Add a tag to the shipment object

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String shipmentId = "shipmentId_example"; // Shipment ID
    String tagName = "tagName_example";
    try {
      TagShipmentResponseBody result = client
              .shipments
              .shipment_1(shipmentId, tagName)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipment_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TagShipmentResponseBody> response = client
              .shipments
              .shipment_1(shipmentId, tagName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipment_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shipmentId** | **String**| Shipment ID | |
| **tagName** | **String**|  | |

### Return type

[**TagShipmentResponseBody**](TagShipmentResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested object creation was a success. |  -  |

<a name="shipment_2"></a>
# **shipment_2**
> String shipment_2(shipmentId, tagName).execute();

Remove Tag from Shipment

Remove an existing tag from the Shipment object

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String shipmentId = "shipmentId_example"; // Shipment ID
    String tagName = "tagName_example";
    try {
      String result = client
              .shipments
              .shipment_2(shipmentId, tagName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipment_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .shipments
              .shipment_2(shipmentId, tagName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipment_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shipmentId** | **String**| Shipment ID | |
| **tagName** | **String**|  | |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The request was successful. |  -  |

<a name="shipments"></a>
# **shipments**
> ListShipmentsResponseBody shipments().shipmentStatus(shipmentStatus).batchId(batchId).tag(tag).createdAtStart(createdAtStart).createdAtEnd(createdAtEnd).modifiedAtStart(modifiedAtStart).modifiedAtEnd(modifiedAtEnd).page(page).pageSize(pageSize).salesOrderId(salesOrderId).sortDir(sortDir).sortBy(sortBy).execute();

List Shipments

Get list of Shipments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    ShipmentStatus shipmentStatus = ShipmentStatus.fromValue("pending");
    String batchId = "batchId_example"; // Batch ID
    String tag = "Letters_to_santa"; // Search for shipments based on the custom tag added to the shipment object
    OffsetDateTime createdAtStart = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Used to create a filter for when a resource was created (ex. A shipment that was created after a certain time)
    OffsetDateTime createdAtEnd = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Used to create a filter for when a resource was created, (ex. A shipment that was created before a certain time)
    OffsetDateTime modifiedAtStart = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Used to create a filter for when a resource was modified (ex. A shipment that was modified after a certain time)
    OffsetDateTime modifiedAtEnd = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Used to create a filter for when a resource was modified (ex. A shipment that was modified before a certain time)
    Integer page = 1; // Return a specific page of results. Defaults to the first page. If set to a number that's greater than the number of pages of results, an empty page is returned. 
    Integer pageSize = 25; // The number of results to return per response.
    String salesOrderId = "salesOrderId_example"; // Sales Order ID
    SortDir sortDir = SortDir.fromValue("asc"); // Controls the sort order of the query.
    ShipmentsSortBy sortBy = ShipmentsSortBy.fromValue("modified_at");
    try {
      ListShipmentsResponseBody result = client
              .shipments
              .shipments()
              .shipmentStatus(shipmentStatus)
              .batchId(batchId)
              .tag(tag)
              .createdAtStart(createdAtStart)
              .createdAtEnd(createdAtEnd)
              .modifiedAtStart(modifiedAtStart)
              .modifiedAtEnd(modifiedAtEnd)
              .page(page)
              .pageSize(pageSize)
              .salesOrderId(salesOrderId)
              .sortDir(sortDir)
              .sortBy(sortBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getShipments());
      System.out.println(result.getTotal());
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListShipmentsResponseBody> response = client
              .shipments
              .shipments()
              .shipmentStatus(shipmentStatus)
              .batchId(batchId)
              .tag(tag)
              .createdAtStart(createdAtStart)
              .createdAtEnd(createdAtEnd)
              .modifiedAtStart(modifiedAtStart)
              .modifiedAtEnd(modifiedAtEnd)
              .page(page)
              .pageSize(pageSize)
              .salesOrderId(salesOrderId)
              .sortDir(sortDir)
              .sortBy(sortBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shipmentStatus** | [**ShipmentStatus**](.md)|  | [optional] [enum: pending, processing, label_purchased, cancelled] |
| **batchId** | **String**| Batch ID | [optional] |
| **tag** | **String**| Search for shipments based on the custom tag added to the shipment object | [optional] |
| **createdAtStart** | **OffsetDateTime**| Used to create a filter for when a resource was created (ex. A shipment that was created after a certain time) | [optional] |
| **createdAtEnd** | **OffsetDateTime**| Used to create a filter for when a resource was created, (ex. A shipment that was created before a certain time) | [optional] |
| **modifiedAtStart** | **OffsetDateTime**| Used to create a filter for when a resource was modified (ex. A shipment that was modified after a certain time) | [optional] |
| **modifiedAtEnd** | **OffsetDateTime**| Used to create a filter for when a resource was modified (ex. A shipment that was modified before a certain time) | [optional] |
| **page** | **Integer**| Return a specific page of results. Defaults to the first page. If set to a number that&#39;s greater than the number of pages of results, an empty page is returned.  | [optional] [default to 1] |
| **pageSize** | **Integer**| The number of results to return per response. | [optional] [default to 25] |
| **salesOrderId** | **String**| Sales Order ID | [optional] |
| **sortDir** | [**SortDir**](.md)| Controls the sort order of the query. | [optional] [enum: asc, desc] |
| **sortBy** | [**ShipmentsSortBy**](.md)|  | [optional] [enum: modified_at, created_at] |

### Return type

[**ListShipmentsResponseBody**](ListShipmentsResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="shipments_0"></a>
# **shipments_0**
> CreateShipmentsResponseBody shipments_0(createShipmentsRequestBody).execute();

Create Shipments

Create one or multiple shipments.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    List<AddressValidatingShipment> shipments = Arrays.asList(); // An array of shipments to be created.
    try {
      CreateShipmentsResponseBody result = client
              .shipments
              .shipments_0(shipments)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasErrors());
      System.out.println(result.getShipments());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipments_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateShipmentsResponseBody> response = client
              .shipments
              .shipments_0(shipments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipments_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createShipmentsRequestBody** | [**CreateShipmentsRequestBody**](CreateShipmentsRequestBody.md)|  | |

### Return type

[**CreateShipmentsResponseBody**](CreateShipmentsResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested object creation was a success. |  -  |

<a name="shipments_1"></a>
# **shipments_1**
> String shipments_1(shipmentId).execute();

Cancel a Shipment

Mark a shipment cancelled, if it is no longer needed or being used by your organized. Any label associated with the shipment needs to be voided first An example use case would be if a batch label creation job is going to run at a set time and only queries &#x60;pending&#x60; shipments. Marking a shipment as cancelled would remove it from this process 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String shipmentId = "shipmentId_example"; // Shipment ID
    try {
      String result = client
              .shipments
              .shipments_1(shipmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipments_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .shipments
              .shipments_1(shipmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#shipments_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **shipmentId** | **String**| Shipment ID | |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The request was successful. |  -  |

<a name="updateTags"></a>
# **updateTags**
> updateTags(updateShipmentsTags).execute();

Update Shipments Tags

Update Shipments Tags

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShipmentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    List<UpdateShipmentsTagsShipmentsTagsInner> shipmentsTags = Arrays.asList();
    try {
      client
              .shipments
              .updateTags()
              .shipmentsTags(shipmentsTags)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#updateTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .shipments
              .updateTags()
              .shipmentsTags(shipmentsTags)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#updateTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateShipmentsTags** | [**UpdateShipmentsTags**](UpdateShipmentsTags.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | NoContent |  -  |

