# DownloadsApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callFile**](DownloadsApi.md#callFile) | **GET** /v1/downloads/{dir}/{subdir}/{filename} | Download File |


<a name="callFile"></a>
# **callFile**
> File callFile(subdir, filename, dir).download(download).rotation(rotation).execute();

Download File

Get File

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DownloadsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String subdir = "subdir_example";
    String filename = "filename_example";
    String dir = "dir_example";
    String download = "download_example";
    Integer rotation = 56;
    try {
      File result = client
              .downloads
              .callFile(subdir, filename, dir)
              .download(download)
              .rotation(rotation)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadsApi#callFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .downloads
              .callFile(subdir, filename, dir)
              .download(download)
              .rotation(rotation)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DownloadsApi#callFile");
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
| **subdir** | **String**|  | |
| **filename** | **String**|  | |
| **dir** | **String**|  | |
| **download** | **String**|  | [optional] |
| **rotation** | **Integer**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, image/png, application/zpl, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success |  -  |

