# ManifestsApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](ManifestsApi.md#getById) | **GET** /v1/manifests/{manifest_id} | Get Manifest By Id |
| [**getRequestById**](ManifestsApi.md#getRequestById) | **GET** /v1/manifests/requests/{manifest_request_id} | Get Manifest Request By Id |
| [**manifest**](ManifestsApi.md#manifest) | **POST** /v1/manifests | Create Manifest |
| [**manifests**](ManifestsApi.md#manifests) | **GET** /v1/manifests | List Manifests |


<a name="getById"></a>
# **getById**
> Manifest getById(manifestId).execute();

Get Manifest By Id

Get Manifest By Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManifestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String manifestId = "manifestId_example"; // The Manifest Id
    try {
      Manifest result = client
              .manifests
              .getById(manifestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getManifestId());
      System.out.println(result.getFormId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getShipDate());
      System.out.println(result.getShipments());
      System.out.println(result.getLabelIds());
      System.out.println(result.getWarehouseId());
      System.out.println(result.getSubmissionId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getManifestDownload());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Manifest> response = client
              .manifests
              .getById(manifestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#getById");
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
| **manifestId** | **String**| The Manifest Id | |

### Return type

[**Manifest**](Manifest.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getRequestById"></a>
# **getRequestById**
> CreateManifestResponseBody getRequestById(manifestRequestId).execute();

Get Manifest Request By Id

Get Manifest Request By Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManifestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String manifestRequestId = "manifestRequestId_example"; // The Manifest Request Id
    try {
      CreateManifestResponseBody result = client
              .manifests
              .getRequestById(manifestRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getManifests());
      System.out.println(result.getManifestRequests());
      System.out.println(result.getManifestId());
      System.out.println(result.getFormId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getShipDate());
      System.out.println(result.getShipments());
      System.out.println(result.getWarehouseId());
      System.out.println(result.getSubmissionId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getManifestDownload());
      System.out.println(result.getLabelIds());
      System.out.println(result.getRequestId());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#getRequestById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateManifestResponseBody> response = client
              .manifests
              .getRequestById(manifestRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#getRequestById");
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
| **manifestRequestId** | **String**| The Manifest Request Id | |

### Return type

[**CreateManifestResponseBody**](CreateManifestResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="manifest"></a>
# **manifest**
> CreateManifestResponseBody manifest(body).execute();

Create Manifest

Each ShipEngine manifest is created for a specific warehouse, so you&#39;ll need to provide the warehouse_id rather than the ship_from address. You can create a warehouse for each location that you want to create manifests for. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManifestsApi;
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
      CreateManifestResponseBody result = client
              .manifests
              .manifest()
              .execute();
      System.out.println(result);
      System.out.println(result.getManifests());
      System.out.println(result.getManifestRequests());
      System.out.println(result.getManifestId());
      System.out.println(result.getFormId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getShipDate());
      System.out.println(result.getShipments());
      System.out.println(result.getWarehouseId());
      System.out.println(result.getSubmissionId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getManifestDownload());
      System.out.println(result.getLabelIds());
      System.out.println(result.getRequestId());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#manifest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateManifestResponseBody> response = client
              .manifests
              .manifest()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#manifest");
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

[**CreateManifestResponseBody**](CreateManifestResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="manifests"></a>
# **manifests**
> ListManifestsResponseBody manifests().warehouseId(warehouseId).shipDateStart(shipDateStart).shipDateEnd(shipDateEnd).createdAtStart(createdAtStart).createdAtEnd(createdAtEnd).carrierId(carrierId).page(page).pageSize(pageSize).labelIds(labelIds).execute();

List Manifests

Similar to querying shipments, we allow you to query manifests since there will likely be a large number over a long period of time.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManifestsApi;
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
    OffsetDateTime shipDateStart = OffsetDateTime.parse("2018-09-23T15:00:00.000Z"); // ship date start range
    OffsetDateTime shipDateEnd = OffsetDateTime.parse("2018-09-23T15:00:00.000Z"); // ship date end range
    OffsetDateTime createdAtStart = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Used to create a filter for when a resource was created (ex. A shipment that was created after a certain time)
    OffsetDateTime createdAtEnd = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Used to create a filter for when a resource was created, (ex. A shipment that was created before a certain time)
    String carrierId = "carrierId_example"; // Carrier ID
    Integer page = 1; // Return a specific page of results. Defaults to the first page. If set to a number that's greater than the number of pages of results, an empty page is returned. 
    Integer pageSize = 25; // The number of results to return per response.
    List<String> labelIds = Arrays.asList();
    try {
      ListManifestsResponseBody result = client
              .manifests
              .manifests()
              .warehouseId(warehouseId)
              .shipDateStart(shipDateStart)
              .shipDateEnd(shipDateEnd)
              .createdAtStart(createdAtStart)
              .createdAtEnd(createdAtEnd)
              .carrierId(carrierId)
              .page(page)
              .pageSize(pageSize)
              .labelIds(labelIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getManifests());
      System.out.println(result.getTotal());
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#manifests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListManifestsResponseBody> response = client
              .manifests
              .manifests()
              .warehouseId(warehouseId)
              .shipDateStart(shipDateStart)
              .shipDateEnd(shipDateEnd)
              .createdAtStart(createdAtStart)
              .createdAtEnd(createdAtEnd)
              .carrierId(carrierId)
              .page(page)
              .pageSize(pageSize)
              .labelIds(labelIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestsApi#manifests");
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
| **warehouseId** | **String**| Warehouse ID | [optional] |
| **shipDateStart** | **OffsetDateTime**| ship date start range | [optional] |
| **shipDateEnd** | **OffsetDateTime**| ship date end range | [optional] |
| **createdAtStart** | **OffsetDateTime**| Used to create a filter for when a resource was created (ex. A shipment that was created after a certain time) | [optional] |
| **createdAtEnd** | **OffsetDateTime**| Used to create a filter for when a resource was created, (ex. A shipment that was created before a certain time) | [optional] |
| **carrierId** | **String**| Carrier ID | [optional] |
| **page** | **Integer**| Return a specific page of results. Defaults to the first page. If set to a number that&#39;s greater than the number of pages of results, an empty page is returned.  | [optional] [default to 1] |
| **pageSize** | **Integer**| The number of results to return per response. | [optional] [default to 25] |
| **labelIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**ListManifestsResponseBody**](ListManifestsResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

