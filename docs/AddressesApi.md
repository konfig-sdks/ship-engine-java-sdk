# AddressesApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**address**](AddressesApi.md#address) | **PUT** /v1/addresses/recognize | Parse an address |
| [**address_0**](AddressesApi.md#address_0) | **POST** /v1/addresses/validate | Validate An Address |


<a name="address"></a>
# **address**
> ParseAddressResponseBody address(parseAddressRequestBody).execute();

Parse an address

The address-recognition API makes it easy for you to extract address data from unstructured text, including the recipient name, line 1, line 2, city, postal code, and more.  Data often enters your system as unstructured text (for example: emails, SMS messages, support tickets, or other documents). ShipEngine&#39;s address-recognition API helps you extract meaningful, structured data from this unstructured text. The parsed address data is returned in the same structure that&#39;s used for other ShipEngine APIs, such as address validation, rate quotes, and shipping labels.  &gt; **Note:** Address recognition is currently supported for the United States, Canada, Australia, New Zealand, the United Kingdom, and Ireland. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AddressesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String text = "text_example"; // The unstructured text that contains address-related entities
    PartialAddress address = new PartialAddress(); // You can optionally provide any already-known address values. For example, you may already know the recipient's name, city, and country, and only want to parse the street address into separate lines. 
    try {
      ParseAddressResponseBody result = client
              .addresses
              .address(text)
              .address(address)
              .execute();
      System.out.println(result);
      System.out.println(result.getScore());
      System.out.println(result.getAddress());
      System.out.println(result.getEntities());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#address");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ParseAddressResponseBody> response = client
              .addresses
              .address(text)
              .address(address)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#address");
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
| **parseAddressRequestBody** | [**ParseAddressRequestBody**](ParseAddressRequestBody.md)| The only required field is &#x60;text&#x60;, which is the text to be parsed. You can optionally also provide an &#x60;address&#x60; containing already-known values. For example, you may already know the recipient&#39;s name, city, and country, and only want to parse the street address into separate lines.  | |

### Return type

[**ParseAddressResponseBody**](ParseAddressResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the parsed address, as well as a confidence score and a list of all the entities that were recognized in the text.  |  -  |

<a name="address_0"></a>
# **address_0**
> List&lt;AddressValidationResult&gt; address_0(partialAddress).execute();

Validate An Address

Address validation ensures accurate addresses and can lead to reduced shipping costs by preventing address correction surcharges. ShipEngine cross references multiple databases to validate addresses and identify potential deliverability issues. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AddressesApi;
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
      List<AddressValidationResult> result = client
              .addresses
              .address_0()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#address_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AddressValidationResult>> response = client
              .addresses
              .address_0()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#address_0");
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
| **partialAddress** | [**List&lt;PartialAddress&gt;**](PartialAddress.md)|  | |

### Return type

[**List&lt;AddressValidationResult&gt;**](AddressValidationResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

