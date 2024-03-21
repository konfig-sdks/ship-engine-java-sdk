# ServicePointsApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](ServicePointsApi.md#getById) | **GET** /v1/service_points/{carrier_code}/{country_code}/{service_point_id} | Get Service Point By ID |
| [**getByLocation**](ServicePointsApi.md#getByLocation) | **POST** /v1/service_points/list | List Service Points |


<a name="getById"></a>
# **getById**
> GetServicePointByIdResponseBody getById(carrierCode, countryCode, servicePointId).execute();

Get Service Point By ID

Returns a carrier service point by using the service_point_id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServicePointsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierCode = "stamps_com"; // Carrier code
    String countryCode = "CA"; // A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1) 
    String servicePointId = "614940";
    try {
      GetServicePointByIdResponseBody result = client
              .servicePoints
              .getById(carrierCode, countryCode, servicePointId)
              .execute();
      System.out.println(result);
      System.out.println(result.getServicePoint());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicePointsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetServicePointByIdResponseBody> response = client
              .servicePoints
              .getById(carrierCode, countryCode, servicePointId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicePointsApi#getById");
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
| **carrierCode** | **String**| Carrier code | |
| **countryCode** | **String**| A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1)  | |
| **servicePointId** | **String**|  | |

### Return type

[**GetServicePointByIdResponseBody**](GetServicePointByIdResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getByLocation"></a>
# **getByLocation**
> ListServicePointsResponseBody getByLocation(body).execute();

List Service Points

List carrier service points by location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServicePointsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    try {
      ListServicePointsResponseBody result = client
              .servicePoints
              .getByLocation()
              .execute();
      System.out.println(result);
      System.out.println(result.getLat());
      System.out.println(result.getLong());
      System.out.println(result.getServicePoints());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicePointsApi#getByLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListServicePointsResponseBody> response = client
              .servicePoints
              .getByLocation()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicePointsApi#getByLocation");
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
| **body** | **Object**|  | |

### Return type

[**ListServicePointsResponseBody**](ListServicePointsResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

