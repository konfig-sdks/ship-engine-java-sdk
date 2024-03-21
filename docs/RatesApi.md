# RatesApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBulkShipmentRates**](RatesApi.md#getBulkShipmentRates) | **POST** /v1/rates/bulk | Get Bulk Rates |
| [**getById**](RatesApi.md#getById) | **GET** /v1/rates/{rate_id} | Get Rate By ID |
| [**rates**](RatesApi.md#rates) | **POST** /v1/rates | Get Shipping Rates |
| [**rates_0**](RatesApi.md#rates_0) | **POST** /v1/rates/estimate | Estimate Rates |


<a name="getBulkShipmentRates"></a>
# **getBulkShipmentRates**
> List&lt;BulkRate&gt; getBulkShipmentRates(rateRequestRateOptions).execute();

Get Bulk Rates

Get Bulk Shipment Rates

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    RateRequestBody rateOptions = new RateRequestBody(); // The rate options
    try {
      List<BulkRate> result = client
              .rates
              .getBulkShipmentRates()
              .rateOptions(rateOptions)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#getBulkShipmentRates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<BulkRate>> response = client
              .rates
              .getBulkShipmentRates()
              .rateOptions(rateOptions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#getBulkShipmentRates");
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
| **rateRequestRateOptions** | [**RateRequestRateOptions**](RateRequestRateOptions.md)|  | |

### Return type

[**List&lt;BulkRate&gt;**](BulkRate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getById"></a>
# **getById**
> Rate getById(rateId).execute();

Get Rate By ID

Retrieve a previously queried rate by its ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String rateId = "rateId_example"; // Rate ID
    try {
      Rate result = client
              .rates
              .getById(rateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRateId());
      System.out.println(result.getRateType());
      System.out.println(result.getCarrierId());
      System.out.println(result.getShippingAmount());
      System.out.println(result.getInsuranceAmount());
      System.out.println(result.getConfirmationAmount());
      System.out.println(result.getOtherAmount());
      System.out.println(result.getRequestedComparisonAmount());
      System.out.println(result.getTaxAmount());
      System.out.println(result.getZone());
      System.out.println(result.getPackageType());
      System.out.println(result.getDeliveryDays());
      System.out.println(result.getGuaranteedService());
      System.out.println(result.getEstimatedDeliveryDate());
      System.out.println(result.getCarrierDeliveryDays());
      System.out.println(result.getShipDate());
      System.out.println(result.getNegotiatedRate());
      System.out.println(result.getServiceType());
      System.out.println(result.getServiceCode());
      System.out.println(result.getTrackable());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getCarrierNickname());
      System.out.println(result.getCarrierFriendlyName());
      System.out.println(result.getValidationStatus());
      System.out.println(result.getWarningMessages());
      System.out.println(result.getErrorMessages());
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Rate> response = client
              .rates
              .getById(rateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#getById");
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
| **rateId** | **String**| Rate ID | |

### Return type

[**Rate**](Rate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="rates"></a>
# **rates**
> CalculateRatesResponseBody rates(rateRequestOptions).execute();

Get Shipping Rates

It&#39;s not uncommon that you want to give your customer the choice between whether they want to ship the fastest, cheapest, or the most trusted route. Most companies don&#39;t solely ship things using a single shipping option; so we provide functionality to show you all your options! 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    RateRequestBody rateOptions = new RateRequestBody(); // The rate options
    try {
      CalculateRatesResponseBody result = client
              .rates
              .rates()
              .rateOptions(rateOptions)
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
      System.out.println(result.getRateResponse());
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#rates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CalculateRatesResponseBody> response = client
              .rates
              .rates()
              .rateOptions(rateOptions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#rates");
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
| **rateRequestOptions** | [**RateRequestOptions**](RateRequestOptions.md)|  | |

### Return type

[**CalculateRatesResponseBody**](CalculateRatesResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="rates_0"></a>
# **rates_0**
> List&lt;RateEstimate&gt; rates_0(rateEstimateOptions).execute();

Estimate Rates

Get Rate Estimates

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RatesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String fromCountryCode = "fromCountryCode_example"; // A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1) 
    String fromPostalCode = "fromPostalCode_example"; // postal code
    String fromCityLocality = "fromCityLocality_example"; // from postal code
    String fromStateProvince = "fromStateProvince_example"; // From state province
    String toCountryCode = "toCountryCode_example"; // A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1) 
    String toPostalCode = "toPostalCode_example"; // postal code
    String toCityLocality = "toCityLocality_example"; // The city locality the package is being shipped to
    String toStateProvince = "toStateProvince_example"; // To state province
    Weight weight = new Weight(); // The weight of the package
    Dimensions dimensions = new Dimensions(); // The dimensions of the package
    DeliveryConfirmation confirmation = DeliveryConfirmation.fromValue("none");
    AddressResidentialIndicator addressResidentialIndicator = AddressResidentialIndicator.fromValue("unknown");
    OffsetDateTime shipDate = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    try {
      List<RateEstimate> result = client
              .rates
              .rates_0()
              .fromCountryCode(fromCountryCode)
              .fromPostalCode(fromPostalCode)
              .fromCityLocality(fromCityLocality)
              .fromStateProvince(fromStateProvince)
              .toCountryCode(toCountryCode)
              .toPostalCode(toPostalCode)
              .toCityLocality(toCityLocality)
              .toStateProvince(toStateProvince)
              .weight(weight)
              .dimensions(dimensions)
              .confirmation(confirmation)
              .addressResidentialIndicator(addressResidentialIndicator)
              .shipDate(shipDate)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#rates_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<RateEstimate>> response = client
              .rates
              .rates_0()
              .fromCountryCode(fromCountryCode)
              .fromPostalCode(fromPostalCode)
              .fromCityLocality(fromCityLocality)
              .fromStateProvince(fromStateProvince)
              .toCountryCode(toCountryCode)
              .toPostalCode(toPostalCode)
              .toCityLocality(toCityLocality)
              .toStateProvince(toStateProvince)
              .weight(weight)
              .dimensions(dimensions)
              .confirmation(confirmation)
              .addressResidentialIndicator(addressResidentialIndicator)
              .shipDate(shipDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RatesApi#rates_0");
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
| **rateEstimateOptions** | [**RateEstimateOptions**](RateEstimateOptions.md)|  | |

### Return type

[**List&lt;RateEstimate&gt;**](RateEstimate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

