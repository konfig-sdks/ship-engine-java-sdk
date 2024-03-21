# CarrierAccountsApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**carrier**](CarrierAccountsApi.md#carrier) | **POST** /v1/connections/carriers/{carrier_name} | Connect a carrier account |
| [**carrier_0**](CarrierAccountsApi.md#carrier_0) | **DELETE** /v1/connections/carriers/{carrier_name}/{carrier_id} | Disconnect a carrier |
| [**getSettings**](CarrierAccountsApi.md#getSettings) | **GET** /v1/connections/carriers/{carrier_name}/{carrier_id}/settings | Get carrier settings |
| [**updateSettings**](CarrierAccountsApi.md#updateSettings) | **PUT** /v1/connections/carriers/{carrier_name}/{carrier_id}/settings | Update carrier settings |


<a name="carrier"></a>
# **carrier**
> ConnectCarrierResponseBody carrier(carrierName, body).execute();

Connect a carrier account

Connect a carrier account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarrierAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    CarrierName carrierName = CarrierName.fromValue("access_worldwide"); // The carrier name, such as `stamps_com`, `ups`, `fedex`, or `dhl_express`.
    try {
      ConnectCarrierResponseBody result = client
              .carrierAccounts
              .carrier(carrierName)
              .execute();
      System.out.println(result);
      System.out.println(result.getCarrierId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierAccountsApi#carrier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectCarrierResponseBody> response = client
              .carrierAccounts
              .carrier(carrierName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierAccountsApi#carrier");
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
| **carrierName** | [**CarrierName**](.md)| The carrier name, such as &#x60;stamps_com&#x60;, &#x60;ups&#x60;, &#x60;fedex&#x60;, or &#x60;dhl_express&#x60;. | [enum: access_worldwide, amazon_buy_shipping, amazon_shipping_uk, apc, asendia, australia_post, canada_post, dhl_ecommerce, dhl_express, dhl_express_au, dhl_express_ca, dhl_express_uk, dpd, endicia, fedex, fedex_uk, firstmile, imex, newgistics, ontrac, purolator_canada, royal_mail, rr_donnelley, seko, sendle, stamps_com, ups] |
| **body** | **Object**|  | |

### Return type

[**ConnectCarrierResponseBody**](ConnectCarrierResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="carrier_0"></a>
# **carrier_0**
> String carrier_0(carrierName, carrierId).execute();

Disconnect a carrier

Disconnect a carrier

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarrierAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    CarrierName carrierName = CarrierName.fromValue("access_worldwide"); // The carrier name, such as `stamps_com`, `ups`, `fedex`, or `dhl_express`.
    String carrierId = "se-28529731"; // Carrier ID
    try {
      String result = client
              .carrierAccounts
              .carrier_0(carrierName, carrierId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierAccountsApi#carrier_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .carrierAccounts
              .carrier_0(carrierName, carrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierAccountsApi#carrier_0");
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
| **carrierName** | [**CarrierName**](.md)| The carrier name, such as &#x60;stamps_com&#x60;, &#x60;ups&#x60;, &#x60;fedex&#x60;, or &#x60;dhl_express&#x60;. | [enum: access_worldwide, amazon_buy_shipping, amazon_shipping_uk, apc, asendia, australia_post, canada_post, dhl_ecommerce, dhl_express, dhl_express_au, dhl_express_ca, dhl_express_uk, dpd, endicia, fedex, fedex_uk, firstmile, imex, newgistics, ontrac, purolator_canada, royal_mail, rr_donnelley, seko, sendle, stamps_com, ups] |
| **carrierId** | **String**| Carrier ID | |

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

<a name="getSettings"></a>
# **getSettings**
> Object getSettings(carrierName, carrierId).execute();

Get carrier settings

Get carrier settings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarrierAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    CarrierNameWithSettings carrierName = CarrierNameWithSettings.fromValue("dhl_express"); // The carrier name, such as `ups`, `fedex`, or `dhl_express`.
    String carrierId = "se-28529731"; // Carrier ID
    try {
      Object result = client
              .carrierAccounts
              .getSettings(carrierName, carrierId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierAccountsApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .carrierAccounts
              .getSettings(carrierName, carrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierAccountsApi#getSettings");
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
| **carrierName** | [**CarrierNameWithSettings**](.md)| The carrier name, such as &#x60;ups&#x60;, &#x60;fedex&#x60;, or &#x60;dhl_express&#x60;. | [enum: dhl_express, fedex, newgistics, ups] |
| **carrierId** | **String**| Carrier ID | |

### Return type

**Object**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="updateSettings"></a>
# **updateSettings**
> String updateSettings(carrierName, carrierId, body).execute();

Update carrier settings

Update carrier settings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarrierAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    CarrierNameWithSettings carrierName = CarrierNameWithSettings.fromValue("dhl_express"); // The carrier name, such as `ups`, `fedex`, or `dhl_express`.
    String carrierId = "se-28529731"; // Carrier ID
    try {
      String result = client
              .carrierAccounts
              .updateSettings(carrierName, carrierId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierAccountsApi#updateSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .carrierAccounts
              .updateSettings(carrierName, carrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierAccountsApi#updateSettings");
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
| **carrierName** | [**CarrierNameWithSettings**](.md)| The carrier name, such as &#x60;ups&#x60;, &#x60;fedex&#x60;, or &#x60;dhl_express&#x60;. | [enum: dhl_express, fedex, newgistics, ups] |
| **carrierId** | **String**| Carrier ID | |
| **body** | **Object**|  | |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The request was successful. |  -  |

