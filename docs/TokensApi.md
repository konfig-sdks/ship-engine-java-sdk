# TokensApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateEphemeralToken**](TokensApi.md#generateEphemeralToken) | **POST** /v1/tokens/ephemeral | Get Ephemeral Token |


<a name="generateEphemeralToken"></a>
# **generateEphemeralToken**
> TokensGetEphemeralTokenResponseBodyYaml generateEphemeralToken().redirect(redirect).execute();

Get Ephemeral Token

This endpoint returns a token that can be passed to an application for authorized access.  The lifetime of this token is 10 seconds.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokensApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    Redirect redirect = Redirect.fromValue("shipengine-dashboard"); // Include a redirect url to the application formatted with the ephemeral token.
    try {
      TokensGetEphemeralTokenResponseBodyYaml result = client
              .tokens
              .generateEphemeralToken()
              .redirect(redirect)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
      System.out.println(result.getRedirectUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#generateEphemeralToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokensGetEphemeralTokenResponseBodyYaml> response = client
              .tokens
              .generateEphemeralToken()
              .redirect(redirect)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#generateEphemeralToken");
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
| **redirect** | [**Redirect**](.md)| Include a redirect url to the application formatted with the ephemeral token. | [optional] [enum: shipengine-dashboard] |

### Return type

[**TokensGetEphemeralTokenResponseBodyYaml**](TokensGetEphemeralTokenResponseBodyYaml.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

