# PackageTypesApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomPackageType**](PackageTypesApi.md#createCustomPackageType) | **POST** /v1/packages | Create Custom Package Type |
| [**deleteCustomPackageById**](PackageTypesApi.md#deleteCustomPackageById) | **DELETE** /v1/packages/{package_id} | Delete A Custom Package By ID |
| [**getById**](PackageTypesApi.md#getById) | **GET** /v1/packages/{package_id} | Get Custom Package Type By ID |
| [**listCustomPackageTypes**](PackageTypesApi.md#listCustomPackageTypes) | **GET** /v1/packages | List Custom Package Types |
| [**updateCustomPackageTypeById**](PackageTypesApi.md#updateCustomPackageTypeById) | **PUT** /v1/packages/{package_id} | Update Custom Package Type By ID |


<a name="createCustomPackageType"></a>
# **createCustomPackageType**
> PackageType createCustomPackageType(packageType).execute();

Create Custom Package Type

Create a custom package type to better assist in getting accurate rate estimates

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PackageTypesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String packageCode = "packageCode_example"; // A [package type](https://www.shipengine.com/docs/reference/list-carrier-packages/), such as `thick_envelope`, `small_flat_rate_box`, `large_package`, etc.  Use the code `package` for custom or unknown package types. 
    String name = "name_example";
    String description = "description_example"; // Provides a helpful description for the custom package.
    String packageId = "packageId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    Dimensions dimensions = new Dimensions(); // The custom dimensions for the package.
    try {
      PackageType result = client
              .packageTypes
              .createCustomPackageType(packageCode, name)
              .description(description)
              .packageId(packageId)
              .dimensions(dimensions)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getPackageId());
      System.out.println(result.getPackageCode());
      System.out.println(result.getName());
      System.out.println(result.getDimensions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#createCustomPackageType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PackageType> response = client
              .packageTypes
              .createCustomPackageType(packageCode, name)
              .description(description)
              .packageId(packageId)
              .dimensions(dimensions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#createCustomPackageType");
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
| **packageType** | [**PackageType**](PackageType.md)|  | |

### Return type

[**PackageType**](PackageType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="deleteCustomPackageById"></a>
# **deleteCustomPackageById**
> String deleteCustomPackageById(packageId).execute();

Delete A Custom Package By ID

Delete a custom package using the ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PackageTypesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String packageId = "packageId_example"; // Package ID
    try {
      String result = client
              .packageTypes
              .deleteCustomPackageById(packageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#deleteCustomPackageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .packageTypes
              .deleteCustomPackageById(packageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#deleteCustomPackageById");
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
| **packageId** | **String**| Package ID | |

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
> PackageType getById(packageId).execute();

Get Custom Package Type By ID

Get Custom Package Type by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PackageTypesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String packageId = "packageId_example"; // Package ID
    try {
      PackageType result = client
              .packageTypes
              .getById(packageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getPackageId());
      System.out.println(result.getPackageCode());
      System.out.println(result.getName());
      System.out.println(result.getDimensions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PackageType> response = client
              .packageTypes
              .getById(packageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#getById");
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
| **packageId** | **String**| Package ID | |

### Return type

[**PackageType**](PackageType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="listCustomPackageTypes"></a>
# **listCustomPackageTypes**
> ListPackageTypesResponseBody listCustomPackageTypes().execute();

List Custom Package Types

List the custom package types associated with the account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PackageTypesApi;
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
      ListPackageTypesResponseBody result = client
              .packageTypes
              .listCustomPackageTypes()
              .execute();
      System.out.println(result);
      System.out.println(result.getPackages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#listCustomPackageTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListPackageTypesResponseBody> response = client
              .packageTypes
              .listCustomPackageTypes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#listCustomPackageTypes");
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

[**ListPackageTypesResponseBody**](ListPackageTypesResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="updateCustomPackageTypeById"></a>
# **updateCustomPackageTypeById**
> String updateCustomPackageTypeById(packageId, packageType).execute();

Update Custom Package Type By ID

Update the custom package type object by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PackageTypesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String packageCode = "packageCode_example"; // A [package type](https://www.shipengine.com/docs/reference/list-carrier-packages/), such as `thick_envelope`, `small_flat_rate_box`, `large_package`, etc.  Use the code `package` for custom or unknown package types. 
    String name = "name_example";
    String packageId = "packageId_example"; // Package ID
    String description = "description_example"; // Provides a helpful description for the custom package.
    String packageId = "packageId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    Dimensions dimensions = new Dimensions(); // The custom dimensions for the package.
    try {
      String result = client
              .packageTypes
              .updateCustomPackageTypeById(packageCode, name, packageId)
              .description(description)
              .packageId(packageId)
              .dimensions(dimensions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#updateCustomPackageTypeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .packageTypes
              .updateCustomPackageTypeById(packageCode, name, packageId)
              .description(description)
              .packageId(packageId)
              .dimensions(dimensions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageTypesApi#updateCustomPackageTypeById");
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
| **packageId** | **String**| Package ID | |
| **packageType** | [**PackageType**](PackageType.md)|  | |

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

