# TrackingApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**infoRetrieval**](TrackingApi.md#infoRetrieval) | **GET** /v1/tracking | Get Tracking Information |
| [**tracking**](TrackingApi.md#tracking) | **POST** /v1/tracking/start | Start Tracking a Package |
| [**tracking_0**](TrackingApi.md#tracking_0) | **POST** /v1/tracking/stop | Stop Tracking a Package |


<a name="infoRetrieval"></a>
# **infoRetrieval**
> TrackingInformation infoRetrieval().carrierCode(carrierCode).trackingNumber(trackingNumber).execute();

Get Tracking Information

Retrieve package tracking information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrackingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierCode = "stamps_com"; // A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as `fedex`, `dhl_express`, `stamps_com`, etc. 
    String trackingNumber = "9405511899223197428490"; // The tracking number associated with a shipment
    try {
      TrackingInformation result = client
              .tracking
              .infoRetrieval()
              .carrierCode(carrierCode)
              .trackingNumber(trackingNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getTrackingUrl());
      System.out.println(result.getStatusCode());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getCarrierId());
      System.out.println(result.getStatusDescription());
      System.out.println(result.getCarrierStatusCode());
      System.out.println(result.getCarrierDetailCode());
      System.out.println(result.getCarrierStatusDescription());
      System.out.println(result.getShipDate());
      System.out.println(result.getEstimatedDeliveryDate());
      System.out.println(result.getActualDeliveryDate());
      System.out.println(result.getExceptionDescription());
      System.out.println(result.getEvents());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#infoRetrieval");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrackingInformation> response = client
              .tracking
              .infoRetrieval()
              .carrierCode(carrierCode)
              .trackingNumber(trackingNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#infoRetrieval");
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
| **carrierCode** | **String**| A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as &#x60;fedex&#x60;, &#x60;dhl_express&#x60;, &#x60;stamps_com&#x60;, etc.  | [optional] |
| **trackingNumber** | **String**| The tracking number associated with a shipment | [optional] |

### Return type

[**TrackingInformation**](TrackingInformation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="tracking"></a>
# **tracking**
> String tracking().carrierCode(carrierCode).trackingNumber(trackingNumber).execute();

Start Tracking a Package

Allows you to subscribe to tracking updates for a package. You specify the carrier_code and tracking_number of the package, and receive notifications via webhooks whenever the shipping status changes. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrackingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierCode = "stamps_com"; // A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as `fedex`, `dhl_express`, `stamps_com`, etc. 
    String trackingNumber = "9405511899223197428490"; // The tracking number associated with a shipment
    try {
      String result = client
              .tracking
              .tracking()
              .carrierCode(carrierCode)
              .trackingNumber(trackingNumber)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#tracking");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .tracking
              .tracking()
              .carrierCode(carrierCode)
              .trackingNumber(trackingNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#tracking");
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
| **carrierCode** | **String**| A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as &#x60;fedex&#x60;, &#x60;dhl_express&#x60;, &#x60;stamps_com&#x60;, etc.  | [optional] |
| **trackingNumber** | **String**| The tracking number associated with a shipment | [optional] |

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

<a name="tracking_0"></a>
# **tracking_0**
> String tracking_0().carrierCode(carrierCode).trackingNumber(trackingNumber).execute();

Stop Tracking a Package

Unsubscribe from tracking updates for a package.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrackingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierCode = "stamps_com"; // A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as `fedex`, `dhl_express`, `stamps_com`, etc. 
    String trackingNumber = "9405511899223197428490"; // The tracking number associated with a shipment
    try {
      String result = client
              .tracking
              .tracking_0()
              .carrierCode(carrierCode)
              .trackingNumber(trackingNumber)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#tracking_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .tracking
              .tracking_0()
              .carrierCode(carrierCode)
              .trackingNumber(trackingNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingApi#tracking_0");
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
| **carrierCode** | **String**| A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as &#x60;fedex&#x60;, &#x60;dhl_express&#x60;, &#x60;stamps_com&#x60;, etc.  | [optional] |
| **trackingNumber** | **String**| The tracking number associated with a shipment | [optional] |

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

