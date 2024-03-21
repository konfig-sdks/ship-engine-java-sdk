# AccountApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createImage**](AccountApi.md#createImage) | **POST** /v1/account/settings/images | Create an Account Image |
| [**deleteImageById**](AccountApi.md#deleteImageById) | **DELETE** /v1/account/settings/images/{label_image_id} | Delete Account Image By Id |
| [**getImageById**](AccountApi.md#getImageById) | **GET** /v1/account/settings/images/{label_image_id} | Get Account Image By ID |
| [**listImages**](AccountApi.md#listImages) | **GET** /v1/account/settings/images | List Account Images |
| [**listSettings**](AccountApi.md#listSettings) | **GET** /v1/account/settings | List Account Settings |
| [**updateImageById**](AccountApi.md#updateImageById) | **PUT** /v1/account/settings/images/{label_image_id} | Update Account Image By ID |


<a name="createImage"></a>
# **createImage**
> AccountSettingsImages createImage(accountSettingsImages).execute();

Create an Account Image

Create an Account Image

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String labelImageId = "labelImageId_example"; // Used to identify an image resource.
    String name = "name_example"; // A human readable name for the image. 
    Boolean isDefault = true; // Indicates whether this image is set as default. 
    String imageContentType = "image/png"; // The image type
    String imageData = "imageData_example"; // A base64 encoded string representation of the image. 
    OffsetDateTime createdAt = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    OffsetDateTime modifiedAt = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    try {
      AccountSettingsImages result = client
              .account
              .createImage()
              .labelImageId(labelImageId)
              .name(name)
              .isDefault(isDefault)
              .imageContentType(imageContentType)
              .imageData(imageData)
              .createdAt(createdAt)
              .modifiedAt(modifiedAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelImageId());
      System.out.println(result.getName());
      System.out.println(result.getIsDefault());
      System.out.println(result.getImageContentType());
      System.out.println(result.getImageData());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountSettingsImages> response = client
              .account
              .createImage()
              .labelImageId(labelImageId)
              .name(name)
              .isDefault(isDefault)
              .imageContentType(imageContentType)
              .imageData(imageData)
              .createdAt(createdAt)
              .modifiedAt(modifiedAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createImage");
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
| **accountSettingsImages** | [**AccountSettingsImages**](AccountSettingsImages.md)|  | |

### Return type

[**AccountSettingsImages**](AccountSettingsImages.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested object creation was a success. |  -  |

<a name="deleteImageById"></a>
# **deleteImageById**
> String deleteImageById(labelImageId).execute();

Delete Account Image By Id

Delete Account Image By Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String labelImageId = "labelImageId_example"; // Label Image Id
    try {
      String result = client
              .account
              .deleteImageById(labelImageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deleteImageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .account
              .deleteImageById(labelImageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deleteImageById");
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
| **labelImageId** | **String**| Label Image Id | |

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

<a name="getImageById"></a>
# **getImageById**
> AccountSettingsImages getImageById(labelImageId).execute();

Get Account Image By ID

Retrieve information for an account image.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String labelImageId = "labelImageId_example"; // Label Image Id
    try {
      AccountSettingsImages result = client
              .account
              .getImageById(labelImageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelImageId());
      System.out.println(result.getName());
      System.out.println(result.getIsDefault());
      System.out.println(result.getImageContentType());
      System.out.println(result.getImageData());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getImageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountSettingsImages> response = client
              .account
              .getImageById(labelImageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getImageById");
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
| **labelImageId** | **String**| Label Image Id | |

### Return type

[**AccountSettingsImages**](AccountSettingsImages.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="listImages"></a>
# **listImages**
> PagedListResponseBody listImages().execute();

List Account Images

List all account images for the ShipEngine account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      PagedListResponseBody result = client
              .account
              .listImages()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedListResponseBody> response = client
              .account
              .listImages()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listImages");
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

[**PagedListResponseBody**](PagedListResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="listSettings"></a>
# **listSettings**
> AccountSettings listSettings().execute();

List Account Settings

List all account settings for the ShipEngine account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      AccountSettings result = client
              .account
              .listSettings()
              .execute();
      System.out.println(result);
      System.out.println(result.getDefaultLabelLayout());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountSettings> response = client
              .account
              .listSettings()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listSettings");
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

[**AccountSettings**](AccountSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="updateImageById"></a>
# **updateImageById**
> String updateImageById(labelImageId, accountSettingsImages).execute();

Update Account Image By ID

Update information for an account image.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String labelImageId = "labelImageId_example"; // Label Image Id
    String labelImageId = "labelImageId_example"; // Used to identify an image resource.
    String name = "name_example"; // A human readable name for the image. 
    Boolean isDefault = true; // Indicates whether this image is set as default. 
    String imageContentType = "image/png"; // The image type
    String imageData = "imageData_example"; // A base64 encoded string representation of the image. 
    OffsetDateTime createdAt = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    OffsetDateTime modifiedAt = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    try {
      String result = client
              .account
              .updateImageById(labelImageId)
              .labelImageId(labelImageId)
              .name(name)
              .isDefault(isDefault)
              .imageContentType(imageContentType)
              .imageData(imageData)
              .createdAt(createdAt)
              .modifiedAt(modifiedAt)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateImageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .account
              .updateImageById(labelImageId)
              .labelImageId(labelImageId)
              .name(name)
              .isDefault(isDefault)
              .imageContentType(imageContentType)
              .imageData(imageData)
              .createdAt(createdAt)
              .modifiedAt(modifiedAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateImageById");
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
| **labelImageId** | **String**| Label Image Id | |
| **accountSettingsImages** | [**AccountSettingsImages**](AccountSettingsImages.md)|  | |

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

