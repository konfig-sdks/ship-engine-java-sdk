# WarehousesApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](WarehousesApi.md#getById) | **GET** /v1/warehouses/{warehouse_id} | Get Warehouse By Id |
| [**updateSettings**](WarehousesApi.md#updateSettings) | **PUT** /v1/warehouses/{warehouse_id}/settings | Update Warehouse Settings |
| [**warehouse**](WarehousesApi.md#warehouse) | **POST** /v1/warehouses | Create Warehouse |
| [**warehouse_0**](WarehousesApi.md#warehouse_0) | **PUT** /v1/warehouses/{warehouse_id} | Update Warehouse By Id |
| [**warehouse_1**](WarehousesApi.md#warehouse_1) | **DELETE** /v1/warehouses/{warehouse_id} | Delete Warehouse By ID |
| [**warehouses**](WarehousesApi.md#warehouses) | **GET** /v1/warehouses | List Warehouses |


<a name="getById"></a>
# **getById**
> Warehouse getById(warehouseId).execute();

Get Warehouse By Id

Retrieve warehouse data based on the warehouse ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WarehousesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String warehouseId = "warehouseId_example"; // Warehouse ID
    try {
      Warehouse result = client
              .warehouses
              .getById(warehouseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWarehouseId());
      System.out.println(result.getIsDefault());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getOriginAddress());
      System.out.println(result.getReturnAddress());
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Warehouse> response = client
              .warehouses
              .getById(warehouseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#getById");
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
| **warehouseId** | **String**| Warehouse ID | |

### Return type

[**Warehouse**](Warehouse.md)

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
> String updateSettings(warehouseId, updateWarehouseSettingsRequestBody).execute();

Update Warehouse Settings

Update Warehouse settings object information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WarehousesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String warehouseId = "warehouseId_example"; // Warehouse ID
    Boolean isDefault = true; // The default property on the warehouse.
    try {
      String result = client
              .warehouses
              .updateSettings(warehouseId)
              .isDefault(isDefault)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#updateSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .warehouses
              .updateSettings(warehouseId)
              .isDefault(isDefault)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#updateSettings");
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
| **warehouseId** | **String**| Warehouse ID | |
| **updateWarehouseSettingsRequestBody** | [**UpdateWarehouseSettingsRequestBody**](UpdateWarehouseSettingsRequestBody.md)|  | |

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

<a name="warehouse"></a>
# **warehouse**
> Warehouse warehouse(warehouse).execute();

Create Warehouse

Create a warehouse location that you can use to create shipping items by simply passing in the generated warehouse id. If the return address is not supplied in the request body then it is assumed that the origin address is the return address as well 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WarehousesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String warehouseId = "warehouseId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    Boolean isDefault = false; // Designates which single warehouse is the default on the account
    String name = "name_example"; // Name of the warehouse
    OffsetDateTime createdAt = OffsetDateTime.now(); // Timestamp that indicates when the warehouse was created
    PartialAddress originAddress = new PartialAddress(); // The origin address of the warehouse
    PartialAddress returnAddress = new PartialAddress(); // The return address associated with the warehouse
    try {
      Warehouse result = client
              .warehouses
              .warehouse()
              .warehouseId(warehouseId)
              .isDefault(isDefault)
              .name(name)
              .createdAt(createdAt)
              .originAddress(originAddress)
              .returnAddress(returnAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getWarehouseId());
      System.out.println(result.getIsDefault());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getOriginAddress());
      System.out.println(result.getReturnAddress());
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#warehouse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Warehouse> response = client
              .warehouses
              .warehouse()
              .warehouseId(warehouseId)
              .isDefault(isDefault)
              .name(name)
              .createdAt(createdAt)
              .originAddress(originAddress)
              .returnAddress(returnAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#warehouse");
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
| **warehouse** | [**Warehouse**](Warehouse.md)|  | |

### Return type

[**Warehouse**](Warehouse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="warehouse_0"></a>
# **warehouse_0**
> String warehouse_0(warehouseId, warehouse).execute();

Update Warehouse By Id

Update Warehouse object information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WarehousesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String warehouseId = "warehouseId_example"; // Warehouse ID
    String warehouseId = "warehouseId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    Boolean isDefault = false; // Designates which single warehouse is the default on the account
    String name = "name_example"; // Name of the warehouse
    OffsetDateTime createdAt = OffsetDateTime.now(); // Timestamp that indicates when the warehouse was created
    PartialAddress originAddress = new PartialAddress(); // The origin address of the warehouse
    PartialAddress returnAddress = new PartialAddress(); // The return address associated with the warehouse
    try {
      String result = client
              .warehouses
              .warehouse_0(warehouseId)
              .warehouseId(warehouseId)
              .isDefault(isDefault)
              .name(name)
              .createdAt(createdAt)
              .originAddress(originAddress)
              .returnAddress(returnAddress)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#warehouse_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .warehouses
              .warehouse_0(warehouseId)
              .warehouseId(warehouseId)
              .isDefault(isDefault)
              .name(name)
              .createdAt(createdAt)
              .originAddress(originAddress)
              .returnAddress(returnAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#warehouse_0");
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
| **warehouseId** | **String**| Warehouse ID | |
| **warehouse** | [**Warehouse**](Warehouse.md)|  | |

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

<a name="warehouse_1"></a>
# **warehouse_1**
> String warehouse_1(warehouseId).execute();

Delete Warehouse By ID

Delete a warehouse by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WarehousesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String warehouseId = "warehouseId_example"; // Warehouse ID
    try {
      String result = client
              .warehouses
              .warehouse_1(warehouseId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#warehouse_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .warehouses
              .warehouse_1(warehouseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#warehouse_1");
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
| **warehouseId** | **String**| Warehouse ID | |

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

<a name="warehouses"></a>
# **warehouses**
> ListWarehousesResponseBody warehouses().execute();

List Warehouses

Retrieve a list of warehouses associated with this account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WarehousesApi;
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
      ListWarehousesResponseBody result = client
              .warehouses
              .warehouses()
              .execute();
      System.out.println(result);
      System.out.println(result.getWarehouses());
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#warehouses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListWarehousesResponseBody> response = client
              .warehouses
              .warehouses()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WarehousesApi#warehouses");
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

[**ListWarehousesResponseBody**](ListWarehousesResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

