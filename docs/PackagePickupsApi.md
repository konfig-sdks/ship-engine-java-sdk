# PackagePickupsApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](PackagePickupsApi.md#getById) | **GET** /v1/pickups/{pickup_id} | Get Pickup By ID |
| [**listScheduledPickups**](PackagePickupsApi.md#listScheduledPickups) | **GET** /v1/pickups | List Scheduled Pickups |
| [**pickup**](PackagePickupsApi.md#pickup) | **POST** /v1/pickups | Schedule a Pickup |
| [**removeScheduledPickup**](PackagePickupsApi.md#removeScheduledPickup) | **DELETE** /v1/pickups/{pickup_id} | Delete a Scheduled Pickup |


<a name="getById"></a>
# **getById**
> GetPickupByIdResponseBody getById(pickupId).execute();

Get Pickup By ID

Get Pickup By ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PackagePickupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String pickupId = "pickupId_example";
    try {
      GetPickupByIdResponseBody result = client
              .packagePickups
              .getById(pickupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPickupId());
      System.out.println(result.getLabelIds());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCancelledAt());
      System.out.println(result.getCarrierId());
      System.out.println(result.getConfirmationNumber());
      System.out.println(result.getWarehouseId());
      System.out.println(result.getPickupAddress());
      System.out.println(result.getContactDetails());
      System.out.println(result.getPickupNotes());
      System.out.println(result.getPickupWindow());
      System.out.println(result.getPickupWindows());
      System.out.println(result.getRequestId());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagePickupsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetPickupByIdResponseBody> response = client
              .packagePickups
              .getById(pickupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagePickupsApi#getById");
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
| **pickupId** | **String**|  | |

### Return type

[**GetPickupByIdResponseBody**](GetPickupByIdResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="listScheduledPickups"></a>
# **listScheduledPickups**
> GetPickupsResponseBody listScheduledPickups().carrierId(carrierId).warehouseId(warehouseId).createdAtStart(createdAtStart).createdAtEnd(createdAtEnd).page(page).pageSize(pageSize).execute();

List Scheduled Pickups

List all pickups that have been scheduled for this carrier

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PackagePickupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String carrierId = "carrierId_example"; // Carrier ID
    String warehouseId = "warehouseId_example"; // Warehouse ID
    OffsetDateTime createdAtStart = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Only return scheduled pickups that were created on or after a specific date/time
    OffsetDateTime createdAtEnd = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Only return scheduled pickups that were created on or before a specific date/time
    Integer page = 1; // Return a specific page of results. Defaults to the first page. If set to a number that's greater than the number of pages of results, an empty page is returned. 
    Integer pageSize = 25; // The number of results to return per response.
    try {
      GetPickupsResponseBody result = client
              .packagePickups
              .listScheduledPickups()
              .carrierId(carrierId)
              .warehouseId(warehouseId)
              .createdAtStart(createdAtStart)
              .createdAtEnd(createdAtEnd)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getPickups());
      System.out.println(result.getTotal());
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getLinks());
      System.out.println(result.getRequestId());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagePickupsApi#listScheduledPickups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetPickupsResponseBody> response = client
              .packagePickups
              .listScheduledPickups()
              .carrierId(carrierId)
              .warehouseId(warehouseId)
              .createdAtStart(createdAtStart)
              .createdAtEnd(createdAtEnd)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagePickupsApi#listScheduledPickups");
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
| **carrierId** | **String**| Carrier ID | [optional] |
| **warehouseId** | **String**| Warehouse ID | [optional] |
| **createdAtStart** | **OffsetDateTime**| Only return scheduled pickups that were created on or after a specific date/time | [optional] |
| **createdAtEnd** | **OffsetDateTime**| Only return scheduled pickups that were created on or before a specific date/time | [optional] |
| **page** | **Integer**| Return a specific page of results. Defaults to the first page. If set to a number that&#39;s greater than the number of pages of results, an empty page is returned.  | [optional] [default to 1] |
| **pageSize** | **Integer**| The number of results to return per response. | [optional] [default to 25] |

### Return type

[**GetPickupsResponseBody**](GetPickupsResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="pickup"></a>
# **pickup**
> SchedulePickupResponseBody pickup(pickup).execute();

Schedule a Pickup

Schedule a package pickup with a carrier

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PackagePickupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String pickupId = "pickupId_example"; // Pickup Resource ID
    List<String> labelIds = Arrays.asList(); // Label IDs that will be included in the pickup request
    OffsetDateTime createdAt = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    OffsetDateTime cancelledAt = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    String carrierId = "carrierId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    String confirmationNumber = "confirmationNumber_example"; // The carrier confirmation number for the scheduled pickup.
    String warehouseId = "warehouseId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    PartialAddress pickupAddress = new PartialAddress();
    ContactDetails contactDetails = new ContactDetails();
    String pickupNotes = "pickupNotes_example"; // Used by some carriers to give special instructions for a package pickup
    PickupWindow pickupWindow = new PickupWindow();
    List<PickupWindows> pickupWindows = Arrays.asList(); // An array of available pickup windows. Carriers can return multiple times that they will pickup packages. 
    try {
      SchedulePickupResponseBody result = client
              .packagePickups
              .pickup()
              .pickupId(pickupId)
              .labelIds(labelIds)
              .createdAt(createdAt)
              .cancelledAt(cancelledAt)
              .carrierId(carrierId)
              .confirmationNumber(confirmationNumber)
              .warehouseId(warehouseId)
              .pickupAddress(pickupAddress)
              .contactDetails(contactDetails)
              .pickupNotes(pickupNotes)
              .pickupWindow(pickupWindow)
              .pickupWindows(pickupWindows)
              .execute();
      System.out.println(result);
      System.out.println(result.getPickupId());
      System.out.println(result.getLabelIds());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCancelledAt());
      System.out.println(result.getCarrierId());
      System.out.println(result.getConfirmationNumber());
      System.out.println(result.getWarehouseId());
      System.out.println(result.getPickupAddress());
      System.out.println(result.getContactDetails());
      System.out.println(result.getPickupNotes());
      System.out.println(result.getPickupWindow());
      System.out.println(result.getPickupWindows());
      System.out.println(result.getRequestId());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagePickupsApi#pickup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SchedulePickupResponseBody> response = client
              .packagePickups
              .pickup()
              .pickupId(pickupId)
              .labelIds(labelIds)
              .createdAt(createdAt)
              .cancelledAt(cancelledAt)
              .carrierId(carrierId)
              .confirmationNumber(confirmationNumber)
              .warehouseId(warehouseId)
              .pickupAddress(pickupAddress)
              .contactDetails(contactDetails)
              .pickupNotes(pickupNotes)
              .pickupWindow(pickupWindow)
              .pickupWindows(pickupWindows)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagePickupsApi#pickup");
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
| **pickup** | [**Pickup**](Pickup.md)|  | |

### Return type

[**SchedulePickupResponseBody**](SchedulePickupResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="removeScheduledPickup"></a>
# **removeScheduledPickup**
> DeletePickupByIdResponseBody removeScheduledPickup(pickupId).execute();

Delete a Scheduled Pickup

Delete a previously-scheduled pickup by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PackagePickupsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String pickupId = "pickupId_example";
    try {
      DeletePickupByIdResponseBody result = client
              .packagePickups
              .removeScheduledPickup(pickupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRequestId());
      System.out.println(result.getErrors());
      System.out.println(result.getPickupId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagePickupsApi#removeScheduledPickup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeletePickupByIdResponseBody> response = client
              .packagePickups
              .removeScheduledPickup(pickupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PackagePickupsApi#removeScheduledPickup");
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
| **pickupId** | **String**|  | |

### Return type

[**DeletePickupByIdResponseBody**](DeletePickupByIdResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return the &#x60;pickup_id&#x60; of the scheduled pickup that was successfully deleted  |  -  |

