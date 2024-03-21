# BatchesApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToBatch**](BatchesApi.md#addToBatch) | **POST** /v1/batches/{batch_id}/add | Add to a Batch |
| [**batch**](BatchesApi.md#batch) | **POST** /v1/batches | Create A Batch |
| [**batch_0**](BatchesApi.md#batch_0) | **PUT** /v1/batches/{batch_id} | Update Batch By Id |
| [**batch_1**](BatchesApi.md#batch_1) | **DELETE** /v1/batches/{batch_id} | Delete Batch By Id |
| [**batch_2**](BatchesApi.md#batch_2) | **POST** /v1/batches/{batch_id}/process/labels | Process Batch ID Labels |
| [**batches**](BatchesApi.md#batches) | **GET** /v1/batches | List Batches |
| [**getByExternalId**](BatchesApi.md#getByExternalId) | **GET** /v1/batches/external_batch_id/{external_batch_id} | Get Batch By External ID |
| [**getById**](BatchesApi.md#getById) | **GET** /v1/batches/{batch_id} | Get Batch By ID |
| [**getErrors**](BatchesApi.md#getErrors) | **GET** /v1/batches/{batch_id}/errors | Get Batch Errors |
| [**removeFromBatch**](BatchesApi.md#removeFromBatch) | **POST** /v1/batches/{batch_id}/remove | Remove From Batch |


<a name="addToBatch"></a>
# **addToBatch**
> String addToBatch(batchId, modifyBatch).execute();

Add to a Batch

Add a Shipment or Rate to a Batch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String batchId = "batchId_example"; // Batch ID
    List<String> shipmentIds = Arrays.asList(); // The Shipment Ids to be modified on the batch
    List<String> rateIds = Arrays.asList(); // Array of Rate IDs to be modifed on the batch
    try {
      String result = client
              .batches
              .addToBatch(batchId)
              .shipmentIds(shipmentIds)
              .rateIds(rateIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#addToBatch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .batches
              .addToBatch(batchId)
              .shipmentIds(shipmentIds)
              .rateIds(rateIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#addToBatch");
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
| **batchId** | **String**| Batch ID | |
| **modifyBatch** | [**ModifyBatch**](ModifyBatch.md)|  | |

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

<a name="batch"></a>
# **batch**
> Batch batch(body).execute();

Create A Batch

Create a Batch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
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
      Batch result = client
              .batches
              .batch()
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelLayout());
      System.out.println(result.getLabelFormat());
      System.out.println(result.getBatchId());
      System.out.println(result.getBatchNumber());
      System.out.println(result.getExternalBatchId());
      System.out.println(result.getBatchNotes());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getProcessedAt());
      System.out.println(result.getErrors());
      System.out.println(result.getProcessErrors());
      System.out.println(result.getWarnings());
      System.out.println(result.getCompleted());
      System.out.println(result.getForms());
      System.out.println(result.getCount());
      System.out.println(result.getBatchShipmentsUrl());
      System.out.println(result.getBatchLabelsUrl());
      System.out.println(result.getBatchErrorsUrl());
      System.out.println(result.getLabelDownload());
      System.out.println(result.getFormDownload());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Batch> response = client
              .batches
              .batch()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batch");
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

[**Batch**](Batch.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested object creation was a success. |  -  |
| **207** | The request was a partial success. It contains results, as well as processing errors. |  -  |

<a name="batch_0"></a>
# **batch_0**
> String batch_0(batchId).execute();

Update Batch By Id

Update Batch By Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String batchId = "batchId_example"; // Batch ID
    try {
      String result = client
              .batches
              .batch_0(batchId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batch_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .batches
              .batch_0(batchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batch_0");
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
| **batchId** | **String**| Batch ID | |

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

<a name="batch_1"></a>
# **batch_1**
> String batch_1(batchId).execute();

Delete Batch By Id

Delete Batch By Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String batchId = "batchId_example"; // Batch ID
    try {
      String result = client
              .batches
              .batch_1(batchId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batch_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .batches
              .batch_1(batchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batch_1");
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
| **batchId** | **String**| Batch ID | |

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

<a name="batch_2"></a>
# **batch_2**
> String batch_2(batchId, processBatchRequestBody).execute();

Process Batch ID Labels

Process Batch ID Labels

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String batchId = "batchId_example"; // Batch ID
    OffsetDateTime shipDate = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    LabelLayout labelLayout = LabelLayout.fromValue("4x6");
    LabelFormat labelFormat = LabelFormat.fromValue("pdf");
    DisplayScheme displayScheme = DisplayScheme.fromValue("label"); // The display format that the label should be shown in.
    try {
      String result = client
              .batches
              .batch_2(batchId)
              .shipDate(shipDate)
              .labelLayout(labelLayout)
              .labelFormat(labelFormat)
              .displayScheme(displayScheme)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batch_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .batches
              .batch_2(batchId)
              .shipDate(shipDate)
              .labelLayout(labelLayout)
              .labelFormat(labelFormat)
              .displayScheme(displayScheme)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batch_2");
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
| **batchId** | **String**| Batch ID | |
| **processBatchRequestBody** | [**ProcessBatchRequestBody**](ProcessBatchRequestBody.md)|  | |

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

<a name="batches"></a>
# **batches**
> ListBatchesResponseBody batches().status(status).page(page).pageSize(pageSize).sortDir(sortDir).batchNumber(batchNumber).sortBy(sortBy).execute();

List Batches

List Batches associated with your Shipengine account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    BatchStatus status = BatchStatus.fromValue("open");
    Integer page = 1; // Return a specific page of results. Defaults to the first page. If set to a number that's greater than the number of pages of results, an empty page is returned. 
    Integer pageSize = 25; // The number of results to return per response.
    SortDir sortDir = SortDir.fromValue("asc"); // Controls the sort order of the query.
    String batchNumber = "batchNumber_example"; // Batch Number
    BatchesSortBy sortBy = BatchesSortBy.fromValue("ship_date");
    try {
      ListBatchesResponseBody result = client
              .batches
              .batches()
              .status(status)
              .page(page)
              .pageSize(pageSize)
              .sortDir(sortDir)
              .batchNumber(batchNumber)
              .sortBy(sortBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getBatches());
      System.out.println(result.getTotal());
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batches");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListBatchesResponseBody> response = client
              .batches
              .batches()
              .status(status)
              .page(page)
              .pageSize(pageSize)
              .sortDir(sortDir)
              .batchNumber(batchNumber)
              .sortBy(sortBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#batches");
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
| **status** | [**BatchStatus**](.md)|  | [optional] [enum: open, queued, processing, completed, completed_with_errors, archived, notifying, invalid] |
| **page** | **Integer**| Return a specific page of results. Defaults to the first page. If set to a number that&#39;s greater than the number of pages of results, an empty page is returned.  | [optional] [default to 1] |
| **pageSize** | **Integer**| The number of results to return per response. | [optional] [default to 25] |
| **sortDir** | [**SortDir**](.md)| Controls the sort order of the query. | [optional] [enum: asc, desc] |
| **batchNumber** | **String**| Batch Number | [optional] |
| **sortBy** | [**BatchesSortBy**](.md)|  | [optional] [enum: ship_date, processed_at, created_at] |

### Return type

[**ListBatchesResponseBody**](ListBatchesResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getByExternalId"></a>
# **getByExternalId**
> Batch getByExternalId(externalBatchId).execute();

Get Batch By External ID

Get Batch By External ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String externalBatchId = "13553d7f-3c87-4771-bae1-c49bacef11cb";
    try {
      Batch result = client
              .batches
              .getByExternalId(externalBatchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelLayout());
      System.out.println(result.getLabelFormat());
      System.out.println(result.getBatchId());
      System.out.println(result.getBatchNumber());
      System.out.println(result.getExternalBatchId());
      System.out.println(result.getBatchNotes());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getProcessedAt());
      System.out.println(result.getErrors());
      System.out.println(result.getProcessErrors());
      System.out.println(result.getWarnings());
      System.out.println(result.getCompleted());
      System.out.println(result.getForms());
      System.out.println(result.getCount());
      System.out.println(result.getBatchShipmentsUrl());
      System.out.println(result.getBatchLabelsUrl());
      System.out.println(result.getBatchErrorsUrl());
      System.out.println(result.getLabelDownload());
      System.out.println(result.getFormDownload());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#getByExternalId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Batch> response = client
              .batches
              .getByExternalId(externalBatchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#getByExternalId");
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
| **externalBatchId** | **String**|  | |

### Return type

[**Batch**](Batch.md)

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
> Batch getById(batchId).execute();

Get Batch By ID

Get Batch By ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String batchId = "batchId_example"; // Batch ID
    try {
      Batch result = client
              .batches
              .getById(batchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelLayout());
      System.out.println(result.getLabelFormat());
      System.out.println(result.getBatchId());
      System.out.println(result.getBatchNumber());
      System.out.println(result.getExternalBatchId());
      System.out.println(result.getBatchNotes());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getProcessedAt());
      System.out.println(result.getErrors());
      System.out.println(result.getProcessErrors());
      System.out.println(result.getWarnings());
      System.out.println(result.getCompleted());
      System.out.println(result.getForms());
      System.out.println(result.getCount());
      System.out.println(result.getBatchShipmentsUrl());
      System.out.println(result.getBatchLabelsUrl());
      System.out.println(result.getBatchErrorsUrl());
      System.out.println(result.getLabelDownload());
      System.out.println(result.getFormDownload());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Batch> response = client
              .batches
              .getById(batchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#getById");
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
| **batchId** | **String**| Batch ID | |

### Return type

[**Batch**](Batch.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getErrors"></a>
# **getErrors**
> ListBatchErrorsResponseBody getErrors(batchId).page(page).pagesize(pagesize).execute();

Get Batch Errors

Error handling in batches are handled differently than in a single synchronous request. You must retrieve the status of your batch by [getting a batch](https://www.shipengine.com/docs/reference/get-batch-by-id/) and getting an overview of the statuses or you can list errors directly here below to get detailed information about the errors. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String batchId = "batchId_example"; // Batch ID
    Integer page = 1; // Return a specific page of results. Defaults to the first page. If set to a number that's greater than the number of pages of results, an empty page is returned. 
    Integer pagesize = 56;
    try {
      ListBatchErrorsResponseBody result = client
              .batches
              .getErrors(batchId)
              .page(page)
              .pagesize(pagesize)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#getErrors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListBatchErrorsResponseBody> response = client
              .batches
              .getErrors(batchId)
              .page(page)
              .pagesize(pagesize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#getErrors");
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
| **batchId** | **String**| Batch ID | |
| **page** | **Integer**| Return a specific page of results. Defaults to the first page. If set to a number that&#39;s greater than the number of pages of results, an empty page is returned.  | [optional] [default to 1] |
| **pagesize** | **Integer**|  | [optional] |

### Return type

[**ListBatchErrorsResponseBody**](ListBatchErrorsResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="removeFromBatch"></a>
# **removeFromBatch**
> String removeFromBatch(batchId, modifyBatch).execute();

Remove From Batch

Remove a shipment or rate from a batch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String batchId = "batchId_example"; // Batch ID
    List<String> shipmentIds = Arrays.asList(); // The Shipment Ids to be modified on the batch
    List<String> rateIds = Arrays.asList(); // Array of Rate IDs to be modifed on the batch
    try {
      String result = client
              .batches
              .removeFromBatch(batchId)
              .shipmentIds(shipmentIds)
              .rateIds(rateIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#removeFromBatch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .batches
              .removeFromBatch(batchId)
              .shipmentIds(shipmentIds)
              .rateIds(rateIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchesApi#removeFromBatch");
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
| **batchId** | **String**| Batch ID | |
| **modifyBatch** | [**ModifyBatch**](ModifyBatch.md)|  | |

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

