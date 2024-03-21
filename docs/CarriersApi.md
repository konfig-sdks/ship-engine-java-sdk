# CarriersApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFundsToCarrier**](CarriersApi.md#addFundsToCarrier) | **PUT** /v1/carriers/{carrier_id}/add_funds | Add Funds To Carrier |
| [**carriers**](CarriersApi.md#carriers) | **GET** /v1/carriers | List Carriers |
| [**disconnectById**](CarriersApi.md#disconnectById) | **DELETE** /v1/carriers/{carrier_id} | Disconnect Carrier by ID |
| [**getById**](CarriersApi.md#getById) | **GET** /v1/carriers/{carrier_id} | Get Carrier By ID |
| [**getOptions**](CarriersApi.md#getOptions) | **GET** /v1/carriers/{carrier_id}/options | Get Carrier Options |
| [**listPackageTypes**](CarriersApi.md#listPackageTypes) | **GET** /v1/carriers/{carrier_id}/packages | List Carrier Package Types |
| [**listServices**](CarriersApi.md#listServices) | **GET** /v1/carriers/{carrier_id}/services | List Carrier Services |


<a name="addFundsToCarrier"></a>
# **addFundsToCarrier**
> AddFundsToCarrierResponseBody addFundsToCarrier(carrierId, monetaryValue).execute();

Add Funds To Carrier

Add Funds To A Carrier

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarriersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String currency = "currency_example"; // The currencies that are supported by ShipEngine are the ones that specified by ISO 4217: https://www.iso.org/iso-4217-currency-codes.html 
    Double amount = 3.4D; // The monetary amount, in the specified currency.
    String carrierId = "se-28529731"; // Carrier ID
    try {
      AddFundsToCarrierResponseBody result = client
              .carriers
              .addFundsToCarrier(currency, amount, carrierId)
              .execute();
      System.out.println(result);
      System.out.println(result.getBalance());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#addFundsToCarrier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddFundsToCarrierResponseBody> response = client
              .carriers
              .addFundsToCarrier(currency, amount, carrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#addFundsToCarrier");
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
| **carrierId** | **String**| Carrier ID | |
| **monetaryValue** | [**MonetaryValue**](MonetaryValue.md)|  | |

### Return type

[**AddFundsToCarrierResponseBody**](AddFundsToCarrierResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="carriers"></a>
# **carriers**
> GetCarriersResponseBody carriers().execute();

List Carriers

List all carriers that have been added to this account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarriersApi;
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
      GetCarriersResponseBody result = client
              .carriers
              .carriers()
              .execute();
      System.out.println(result);
      System.out.println(result.getCarriers());
      System.out.println(result.getRequestId());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#carriers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetCarriersResponseBody> response = client
              .carriers
              .carriers()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#carriers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCarriersResponseBody**](GetCarriersResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |
| **207** | The request was a partial success. It contains results, as well as errors. |  -  |

<a name="disconnectById"></a>
# **disconnectById**
> String disconnectById(carrierId).execute();

Disconnect Carrier by ID

Disconnect a Carrier of the given ID from the account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarriersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierId = "se-28529731"; // Carrier ID
    try {
      String result = client
              .carriers
              .disconnectById(carrierId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#disconnectById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .carriers
              .disconnectById(carrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#disconnectById");
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

<a name="getById"></a>
# **getById**
> Carrier getById(carrierId).execute();

Get Carrier By ID

Retrive carrier info by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarriersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierId = "se-28529731"; // Carrier ID
    try {
      Carrier result = client
              .carriers
              .getById(carrierId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCarrierId());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getRequiresFundedAmount());
      System.out.println(result.getBalance());
      System.out.println(result.getNickname());
      System.out.println(result.getFriendlyName());
      System.out.println(result.getPrimary());
      System.out.println(result.getHasMultiPackageSupportingServices());
      System.out.println(result.getSupportsLabelMessages());
      System.out.println(result.getDisabledByBillingPlan());
      System.out.println(result.getServices());
      System.out.println(result.getPackages());
      System.out.println(result.getOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Carrier> response = client
              .carriers
              .getById(carrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#getById");
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
| **carrierId** | **String**| Carrier ID | |

### Return type

[**Carrier**](Carrier.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getOptions"></a>
# **getOptions**
> GetCarrierOptionsResponseBody getOptions(carrierId).execute();

Get Carrier Options

Get a list of the options available for the carrier

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarriersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierId = "se-28529731"; // Carrier ID
    try {
      GetCarrierOptionsResponseBody result = client
              .carriers
              .getOptions(carrierId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#getOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetCarrierOptionsResponseBody> response = client
              .carriers
              .getOptions(carrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#getOptions");
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
| **carrierId** | **String**| Carrier ID | |

### Return type

[**GetCarrierOptionsResponseBody**](GetCarrierOptionsResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="listPackageTypes"></a>
# **listPackageTypes**
> ListCarrierPackageTypesResponseBody listPackageTypes(carrierId).execute();

List Carrier Package Types

List the package types associated with the carrier

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarriersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierId = "se-28529731"; // Carrier ID
    try {
      ListCarrierPackageTypesResponseBody result = client
              .carriers
              .listPackageTypes(carrierId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPackages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#listPackageTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListCarrierPackageTypesResponseBody> response = client
              .carriers
              .listPackageTypes(carrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#listPackageTypes");
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
| **carrierId** | **String**| Carrier ID | |

### Return type

[**ListCarrierPackageTypesResponseBody**](ListCarrierPackageTypesResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="listServices"></a>
# **listServices**
> ListCarrierServicesResponseBody listServices(carrierId).execute();

List Carrier Services

List the services associated with the carrier ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CarriersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierId = "se-28529731"; // Carrier ID
    try {
      ListCarrierServicesResponseBody result = client
              .carriers
              .listServices(carrierId)
              .execute();
      System.out.println(result);
      System.out.println(result.getServices());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#listServices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListCarrierServicesResponseBody> response = client
              .carriers
              .listServices(carrierId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CarriersApi#listServices");
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
| **carrierId** | **String**| Carrier ID | |

### Return type

[**ListCarrierServicesResponseBody**](ListCarrierServicesResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

