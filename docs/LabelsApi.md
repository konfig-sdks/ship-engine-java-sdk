# LabelsApi

All URIs are relative to *https://api.shipengine.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReturnLabel**](LabelsApi.md#createReturnLabel) | **POST** /v1/labels/{label_id}/return | Create a return label |
| [**getByExternalShipmentId**](LabelsApi.md#getByExternalShipmentId) | **GET** /v1/labels/external_shipment_id/{external_shipment_id} | Get Label By External Shipment ID |
| [**getById**](LabelsApi.md#getById) | **GET** /v1/labels/{label_id} | Get Label By ID |
| [**getTrackingInfo**](LabelsApi.md#getTrackingInfo) | **GET** /v1/labels/{label_id}/track | Get Label Tracking Information |
| [**label**](LabelsApi.md#label) | **POST** /v1/labels | Purchase Label |
| [**label_0**](LabelsApi.md#label_0) | **PUT** /v1/labels/{label_id}/void | Void a Label By ID |
| [**labels**](LabelsApi.md#labels) | **GET** /v1/labels | List labels |
| [**purchaseLabelWithRateId**](LabelsApi.md#purchaseLabelWithRateId) | **POST** /v1/labels/rates/{rate_id} | Purchase Label with Rate ID |
| [**purchaseLabelWithShipmentId**](LabelsApi.md#purchaseLabelWithShipmentId) | **POST** /v1/labels/shipment/{shipment_id} | Purchase Label with Shipment ID |


<a name="createReturnLabel"></a>
# **createReturnLabel**
> Label createReturnLabel(labelId, createReturnLabelRequestBody).execute();

Create a return label

Create a return label

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String labelId = "labelId_example"; // Label ID
    LabelChargeEvent chargeEvent = LabelChargeEvent.fromValue("carrier_default"); // The label charge event. 
    LabelLayout labelLayout = LabelLayout.fromValue("4x6"); // The layout (size) that you want the label to be in.  The `label_format` determines which sizes are allowed.  `4x6` is supported for all label formats, whereas `letter` (8.5\\\" x 11\\\") is only supported for `pdf` format. 
    LabelFormat labelFormat = LabelFormat.fromValue("pdf"); // The file format that you want the label to be in.  We recommend `pdf` format because it is supported by all carriers, whereas some carriers do not support the `png` or `zpl` formats. 
    LabelDownloadType labelDownloadType = LabelDownloadType.fromValue("url");
    DisplayScheme displayScheme = DisplayScheme.fromValue("label"); // The display format that the label should be shown in.
    String labelImageId = "labelImageId_example"; // Used to identify an image resource.
    try {
      Label result = client
              .labels
              .createReturnLabel(labelId)
              .chargeEvent(chargeEvent)
              .labelLayout(labelLayout)
              .labelFormat(labelFormat)
              .labelDownloadType(labelDownloadType)
              .displayScheme(displayScheme)
              .labelImageId(labelImageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelId());
      System.out.println(result.getStatus());
      System.out.println(result.getShipmentId());
      System.out.println(result.getShipment());
      System.out.println(result.getShipDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getShipmentCost());
      System.out.println(result.getInsuranceCost());
      System.out.println(result.getRequestedComparisonAmount());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getIsReturnLabel());
      System.out.println(result.getRmaNumber());
      System.out.println(result.getIsInternational());
      System.out.println(result.getBatchId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getChargeEvent());
      System.out.println(result.getOutboundLabelId());
      System.out.println(result.getServiceCode());
      System.out.println(result.getTestLabel());
      System.out.println(result.getPackageCode());
      System.out.println(result.getValidateAddress());
      System.out.println(result.getVoided());
      System.out.println(result.getVoidedAt());
      System.out.println(result.getLabelDownloadType());
      System.out.println(result.getLabelFormat());
      System.out.println(result.getDisplayScheme());
      System.out.println(result.getLabelLayout());
      System.out.println(result.getTrackable());
      System.out.println(result.getLabelImageId());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getTrackingStatus());
      System.out.println(result.getLabelDownload());
      System.out.println(result.getFormDownload());
      System.out.println(result.getInsuranceClaim());
      System.out.println(result.getPackages());
      System.out.println(result.getAlternativeIdentifiers());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#createReturnLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Label> response = client
              .labels
              .createReturnLabel(labelId)
              .chargeEvent(chargeEvent)
              .labelLayout(labelLayout)
              .labelFormat(labelFormat)
              .labelDownloadType(labelDownloadType)
              .displayScheme(displayScheme)
              .labelImageId(labelImageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#createReturnLabel");
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
| **labelId** | **String**| Label ID | |
| **createReturnLabelRequestBody** | [**CreateReturnLabelRequestBody**](CreateReturnLabelRequestBody.md)|  | |

### Return type

[**Label**](Label.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getByExternalShipmentId"></a>
# **getByExternalShipmentId**
> Label getByExternalShipmentId(externalShipmentId).labelDownloadType(labelDownloadType).execute();

Get Label By External Shipment ID

Find a label by using the external shipment id that was used during label creation 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String externalShipmentId = "0bcb569d-1727-4ff9-ab49-b2fec0cee5ae";
    LabelDownloadType labelDownloadType = LabelDownloadType.fromValue("url");
    try {
      Label result = client
              .labels
              .getByExternalShipmentId(externalShipmentId)
              .labelDownloadType(labelDownloadType)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelId());
      System.out.println(result.getStatus());
      System.out.println(result.getShipmentId());
      System.out.println(result.getShipment());
      System.out.println(result.getShipDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getShipmentCost());
      System.out.println(result.getInsuranceCost());
      System.out.println(result.getRequestedComparisonAmount());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getIsReturnLabel());
      System.out.println(result.getRmaNumber());
      System.out.println(result.getIsInternational());
      System.out.println(result.getBatchId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getChargeEvent());
      System.out.println(result.getOutboundLabelId());
      System.out.println(result.getServiceCode());
      System.out.println(result.getTestLabel());
      System.out.println(result.getPackageCode());
      System.out.println(result.getValidateAddress());
      System.out.println(result.getVoided());
      System.out.println(result.getVoidedAt());
      System.out.println(result.getLabelDownloadType());
      System.out.println(result.getLabelFormat());
      System.out.println(result.getDisplayScheme());
      System.out.println(result.getLabelLayout());
      System.out.println(result.getTrackable());
      System.out.println(result.getLabelImageId());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getTrackingStatus());
      System.out.println(result.getLabelDownload());
      System.out.println(result.getFormDownload());
      System.out.println(result.getInsuranceClaim());
      System.out.println(result.getPackages());
      System.out.println(result.getAlternativeIdentifiers());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#getByExternalShipmentId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Label> response = client
              .labels
              .getByExternalShipmentId(externalShipmentId)
              .labelDownloadType(labelDownloadType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#getByExternalShipmentId");
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
| **externalShipmentId** | **String**|  | |
| **labelDownloadType** | [**LabelDownloadType**](.md)|  | [optional] [enum: url, inline] |

### Return type

[**Label**](Label.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested object creation was a success. |  -  |

<a name="getById"></a>
# **getById**
> Label getById(labelId).labelDownloadType(labelDownloadType).execute();

Get Label By ID

Retrieve information for individual labels.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String labelId = "labelId_example"; // Label ID
    LabelDownloadType labelDownloadType = LabelDownloadType.fromValue("url");
    try {
      Label result = client
              .labels
              .getById(labelId)
              .labelDownloadType(labelDownloadType)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelId());
      System.out.println(result.getStatus());
      System.out.println(result.getShipmentId());
      System.out.println(result.getShipment());
      System.out.println(result.getShipDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getShipmentCost());
      System.out.println(result.getInsuranceCost());
      System.out.println(result.getRequestedComparisonAmount());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getIsReturnLabel());
      System.out.println(result.getRmaNumber());
      System.out.println(result.getIsInternational());
      System.out.println(result.getBatchId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getChargeEvent());
      System.out.println(result.getOutboundLabelId());
      System.out.println(result.getServiceCode());
      System.out.println(result.getTestLabel());
      System.out.println(result.getPackageCode());
      System.out.println(result.getValidateAddress());
      System.out.println(result.getVoided());
      System.out.println(result.getVoidedAt());
      System.out.println(result.getLabelDownloadType());
      System.out.println(result.getLabelFormat());
      System.out.println(result.getDisplayScheme());
      System.out.println(result.getLabelLayout());
      System.out.println(result.getTrackable());
      System.out.println(result.getLabelImageId());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getTrackingStatus());
      System.out.println(result.getLabelDownload());
      System.out.println(result.getFormDownload());
      System.out.println(result.getInsuranceClaim());
      System.out.println(result.getPackages());
      System.out.println(result.getAlternativeIdentifiers());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Label> response = client
              .labels
              .getById(labelId)
              .labelDownloadType(labelDownloadType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#getById");
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
| **labelId** | **String**| Label ID | |
| **labelDownloadType** | [**LabelDownloadType**](.md)|  | [optional] [enum: url, inline] |

### Return type

[**Label**](Label.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="getTrackingInfo"></a>
# **getTrackingInfo**
> TrackingInformation getTrackingInfo(labelId).execute();

Get Label Tracking Information

Retrieve the label&#39;s tracking information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String labelId = "labelId_example"; // Label ID
    try {
      TrackingInformation result = client
              .labels
              .getTrackingInfo(labelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getTrackingUrl());
      System.out.println(result.getStatusCode());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getCarrierId());
      System.out.println(result.getStatusDescription());
      System.out.println(result.getCarrierStatusCode());
      System.out.println(result.getCarrierDetailCode());
      System.out.println(result.getCarrierStatusDescription());
      System.out.println(result.getShipDate());
      System.out.println(result.getEstimatedDeliveryDate());
      System.out.println(result.getActualDeliveryDate());
      System.out.println(result.getExceptionDescription());
      System.out.println(result.getEvents());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#getTrackingInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrackingInformation> response = client
              .labels
              .getTrackingInfo(labelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#getTrackingInfo");
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
| **labelId** | **String**| Label ID | |

### Return type

[**TrackingInformation**](TrackingInformation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="label"></a>
# **label**
> Label label(label).execute();

Purchase Label

Purchase and print a label for shipment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String labelId = "labelId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    LabelStatus status = LabelStatus.fromValue("processing");
    String shipmentId = "shipmentId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    PartialShipment shipment = new PartialShipment(); // The shipment information used to generate the label
    OffsetDateTime shipDate = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date, but not a specific time.  The value _may_ contain a time component, but it will be set to `00:00:00` UTC by ShipEngine. 
    OffsetDateTime createdAt = OffsetDateTime.now(); // An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time. 
    MonetaryValue shipmentCost = new MonetaryValue(); // The cost of shipping, delivery confirmation, and other carrier charges.  This amount **does not** include insurance costs. 
    MonetaryValue insuranceCost = new MonetaryValue(); // The insurance cost for this package.  Add this to the `shipment_cost` field to get the total cost. 
    MonetaryValue requestedComparisonAmount = new MonetaryValue(); // The total shipping cost for the specified comparison_rate_type. 
    String trackingNumber = "trackingNumber_example"; // The tracking number for the package. Tracking number formats vary across carriers.
    Boolean isReturnLabel = true; // Indicates whether this is a return label.  You may also want to set the `rma_number` so you know what is being returned. 
    String rmaNumber = "rmaNumber_example"; // An optional Return Merchandise Authorization number.  This field is useful for return labels.  You can set it to any string value. 
    Boolean isInternational = true; // Indicates whether this is an international shipment.  That is, the originating country and destination country are different. 
    String batchId = "batchId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    String carrierId = "carrierId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    LabelChargeEvent chargeEvent = LabelChargeEvent.fromValue("carrier_default"); // The label charge event. 
    String outboundLabelId = "outboundLabelId_example"; // A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc.
    String serviceCode = "serviceCode_example"; // A [carrier service](https://www.shipengine.com/docs/shipping/use-a-carrier-service/), such as `fedex_ground`, `usps_first_class_mail`, `flat_rate_envelope`, etc. 
    Boolean testLabel = false; // Indicate if this label is being used only for testing purposes. If true, then no charge will be added to your account.
    String packageCode = "packageCode_example"; // A [package type](https://www.shipengine.com/docs/reference/list-carrier-packages/), such as `thick_envelope`, `small_flat_rate_box`, `large_package`, etc.  Use the code `package` for custom or unknown package types. 
    ValidateAddress validateAddress = ValidateAddress.fromValue("no_validation");
    Boolean voided = true; // Indicates whether the label has been [voided](https://www.shipengine.com/docs/labels/voiding/) 
    OffsetDateTime voidedAt = OffsetDateTime.now(); // The date and time that the label was [voided](https://www.shipengine.com/docs/labels/voiding/), or `null` if the label has not been voided 
    LabelDownloadType labelDownloadType = LabelDownloadType.fromValue("url");
    LabelFormat labelFormat = LabelFormat.fromValue("pdf"); // The file format that you want the label to be in.  We recommend `pdf` format because it is supported by all carriers, whereas some carriers do not support the `png` or `zpl` formats. 
    DisplayScheme displayScheme = DisplayScheme.fromValue("label"); // The display format that the label should be shown in.
    LabelLayout labelLayout = LabelLayout.fromValue("4x6"); // The layout (size) that you want the label to be in.  The `label_format` determines which sizes are allowed.  `4x6` is supported for all label formats, whereas `letter` (8.5\\\" x 11\\\") is only supported for `pdf` format. 
    Boolean trackable = true; // Indicates whether the shipment is trackable, in which case the `tracking_status` field will reflect the current status and each package will have a `tracking_number`. 
    String labelImageId = "labelImageId_example"; // Used to identify an image resource.
    String carrierCode = "carrierCode_example"; // A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as `fedex`, `dhl_express`, `stamps_com`, etc. 
    TrackingStatus trackingStatus = TrackingStatus.fromValue("unknown"); // The current status of the package, such as `in_transit` or `delivered`
    LabelDownload labelDownload = new LabelDownload();
    OptionalLinkNullable formDownload = new OptionalLinkNullable(); // The link to download the customs form (a.k.a. commercial invoice) for this shipment, if any.  Forms are in PDF format. This field is null if the shipment does not require a customs form, or if the carrier does not support it. 
    LabelInsuranceClaim insuranceClaim = new LabelInsuranceClaim(); // The link to submit an insurance claim for the shipment.  This field is null if the shipment is not insured or if the insurance provider does not support online claim submission. 
    List<LabelPackagesInner> packages = Arrays.asList(); // The label's package(s).  > **Note:** Some carriers only allow one package per label.  If you attempt to create a multi-package label for a carrier that doesn't allow it, an error will be returned. 
    List<AlternativeIdentifier> alternativeIdentifiers = Arrays.asList(); // Additional information some carriers may provide by which to identify a given label in their system.  
    try {
      Label result = client
              .labels
              .label()
              .labelId(labelId)
              .status(status)
              .shipmentId(shipmentId)
              .shipment(shipment)
              .shipDate(shipDate)
              .createdAt(createdAt)
              .shipmentCost(shipmentCost)
              .insuranceCost(insuranceCost)
              .requestedComparisonAmount(requestedComparisonAmount)
              .trackingNumber(trackingNumber)
              .isReturnLabel(isReturnLabel)
              .rmaNumber(rmaNumber)
              .isInternational(isInternational)
              .batchId(batchId)
              .carrierId(carrierId)
              .chargeEvent(chargeEvent)
              .outboundLabelId(outboundLabelId)
              .serviceCode(serviceCode)
              .testLabel(testLabel)
              .packageCode(packageCode)
              .validateAddress(validateAddress)
              .voided(voided)
              .voidedAt(voidedAt)
              .labelDownloadType(labelDownloadType)
              .labelFormat(labelFormat)
              .displayScheme(displayScheme)
              .labelLayout(labelLayout)
              .trackable(trackable)
              .labelImageId(labelImageId)
              .carrierCode(carrierCode)
              .trackingStatus(trackingStatus)
              .labelDownload(labelDownload)
              .formDownload(formDownload)
              .insuranceClaim(insuranceClaim)
              .packages(packages)
              .alternativeIdentifiers(alternativeIdentifiers)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelId());
      System.out.println(result.getStatus());
      System.out.println(result.getShipmentId());
      System.out.println(result.getShipment());
      System.out.println(result.getShipDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getShipmentCost());
      System.out.println(result.getInsuranceCost());
      System.out.println(result.getRequestedComparisonAmount());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getIsReturnLabel());
      System.out.println(result.getRmaNumber());
      System.out.println(result.getIsInternational());
      System.out.println(result.getBatchId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getChargeEvent());
      System.out.println(result.getOutboundLabelId());
      System.out.println(result.getServiceCode());
      System.out.println(result.getTestLabel());
      System.out.println(result.getPackageCode());
      System.out.println(result.getValidateAddress());
      System.out.println(result.getVoided());
      System.out.println(result.getVoidedAt());
      System.out.println(result.getLabelDownloadType());
      System.out.println(result.getLabelFormat());
      System.out.println(result.getDisplayScheme());
      System.out.println(result.getLabelLayout());
      System.out.println(result.getTrackable());
      System.out.println(result.getLabelImageId());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getTrackingStatus());
      System.out.println(result.getLabelDownload());
      System.out.println(result.getFormDownload());
      System.out.println(result.getInsuranceClaim());
      System.out.println(result.getPackages());
      System.out.println(result.getAlternativeIdentifiers());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#label");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Label> response = client
              .labels
              .label()
              .labelId(labelId)
              .status(status)
              .shipmentId(shipmentId)
              .shipment(shipment)
              .shipDate(shipDate)
              .createdAt(createdAt)
              .shipmentCost(shipmentCost)
              .insuranceCost(insuranceCost)
              .requestedComparisonAmount(requestedComparisonAmount)
              .trackingNumber(trackingNumber)
              .isReturnLabel(isReturnLabel)
              .rmaNumber(rmaNumber)
              .isInternational(isInternational)
              .batchId(batchId)
              .carrierId(carrierId)
              .chargeEvent(chargeEvent)
              .outboundLabelId(outboundLabelId)
              .serviceCode(serviceCode)
              .testLabel(testLabel)
              .packageCode(packageCode)
              .validateAddress(validateAddress)
              .voided(voided)
              .voidedAt(voidedAt)
              .labelDownloadType(labelDownloadType)
              .labelFormat(labelFormat)
              .displayScheme(displayScheme)
              .labelLayout(labelLayout)
              .trackable(trackable)
              .labelImageId(labelImageId)
              .carrierCode(carrierCode)
              .trackingStatus(trackingStatus)
              .labelDownload(labelDownload)
              .formDownload(formDownload)
              .insuranceClaim(insuranceClaim)
              .packages(packages)
              .alternativeIdentifiers(alternativeIdentifiers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#label");
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
| **label** | [**Label**](Label.md)|  | |

### Return type

[**Label**](Label.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested object creation was a success. |  -  |

<a name="label_0"></a>
# **label_0**
> VoidLabelResponseBody label_0(labelId).execute();

Void a Label By ID

Void a label by ID to get a refund.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String labelId = "labelId_example"; // Label ID
    try {
      VoidLabelResponseBody result = client
              .labels
              .label_0(labelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getApproved());
      System.out.println(result.getMessage());
      System.out.println(result.getReasonCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#label_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoidLabelResponseBody> response = client
              .labels
              .label_0(labelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#label_0");
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
| **labelId** | **String**| Label ID | |

### Return type

[**VoidLabelResponseBody**](VoidLabelResponseBody.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was a success. |  -  |

<a name="labels"></a>
# **labels**
> PagedListResponseBody labels().labelStatus(labelStatus).serviceCode(serviceCode).carrierId(carrierId).trackingNumber(trackingNumber).batchId(batchId).rateId(rateId).shipmentId(shipmentId).warehouseId(warehouseId).createdAtStart(createdAtStart).createdAtEnd(createdAtEnd).page(page).pageSize(pageSize).sortDir(sortDir).sortBy(sortBy).execute();

List labels

This endpoint returns a list of labels that you&#39;ve [created](https://www.shipengine.com/docs/labels/create-a-label/). You can optionally filter the results as well as control their sort order and the number of results returned at a time.  By default, all labels are returned, 25 at a time, starting with the most recently created ones.  You can combine multiple filter options to narrow-down the results.  For example, if you only want to get your UPS labels for your east coast warehouse you could query by both &#x60;warehouse_id&#x60; and &#x60;carrier_id&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    LabelStatus labelStatus = LabelStatus.fromValue("processing"); // Only return labels that are currently in the specified status
    String serviceCode = "usps_first_class_mail"; // Only return labels for a specific [carrier service](https://www.shipengine.com/docs/shipping/use-a-carrier-service/)
    String carrierId = "carrierId_example"; // Only return labels for a specific [carrier account](https://www.shipengine.com/docs/carriers/setup/)
    String trackingNumber = "9405511899223197428490"; // Only return labels with a specific tracking number
    String batchId = "batchId_example"; // Only return labels that were created in a specific [batch](https://www.shipengine.com/docs/labels/bulk/)
    String rateId = "rateId_example"; // Rate ID
    String shipmentId = "shipmentId_example"; // Shipment ID
    String warehouseId = "warehouseId_example"; // Only return labels that originate from a specific [warehouse](https://www.shipengine.com/docs/shipping/ship-from-a-warehouse/)
    OffsetDateTime createdAtStart = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Only return labels that were created on or after a specific date/time
    OffsetDateTime createdAtEnd = OffsetDateTime.parse("2019-03-12T19:24:13.657Z"); // Only return labels that were created on or before a specific date/time
    Integer page = 1; // Return a specific page of results. Defaults to the first page. If set to a number that's greater than the number of pages of results, an empty page is returned. 
    Integer pageSize = 25; // The number of results to return per response.
    SortDir sortDir = SortDir.fromValue("asc"); // Controls the sort order of the query.
    String sortBy = "modified_at"; // Controls which field the query is sorted by.
    try {
      PagedListResponseBody result = client
              .labels
              .labels()
              .labelStatus(labelStatus)
              .serviceCode(serviceCode)
              .carrierId(carrierId)
              .trackingNumber(trackingNumber)
              .batchId(batchId)
              .rateId(rateId)
              .shipmentId(shipmentId)
              .warehouseId(warehouseId)
              .createdAtStart(createdAtStart)
              .createdAtEnd(createdAtEnd)
              .page(page)
              .pageSize(pageSize)
              .sortDir(sortDir)
              .sortBy(sortBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getPage());
      System.out.println(result.getPages());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#labels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagedListResponseBody> response = client
              .labels
              .labels()
              .labelStatus(labelStatus)
              .serviceCode(serviceCode)
              .carrierId(carrierId)
              .trackingNumber(trackingNumber)
              .batchId(batchId)
              .rateId(rateId)
              .shipmentId(shipmentId)
              .warehouseId(warehouseId)
              .createdAtStart(createdAtStart)
              .createdAtEnd(createdAtEnd)
              .page(page)
              .pageSize(pageSize)
              .sortDir(sortDir)
              .sortBy(sortBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#labels");
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
| **labelStatus** | [**LabelStatus**](.md)| Only return labels that are currently in the specified status | [optional] [enum: processing, completed, error, voided] |
| **serviceCode** | **String**| Only return labels for a specific [carrier service](https://www.shipengine.com/docs/shipping/use-a-carrier-service/) | [optional] |
| **carrierId** | **String**| Only return labels for a specific [carrier account](https://www.shipengine.com/docs/carriers/setup/) | [optional] |
| **trackingNumber** | **String**| Only return labels with a specific tracking number | [optional] |
| **batchId** | **String**| Only return labels that were created in a specific [batch](https://www.shipengine.com/docs/labels/bulk/) | [optional] |
| **rateId** | **String**| Rate ID | [optional] |
| **shipmentId** | **String**| Shipment ID | [optional] |
| **warehouseId** | **String**| Only return labels that originate from a specific [warehouse](https://www.shipengine.com/docs/shipping/ship-from-a-warehouse/) | [optional] |
| **createdAtStart** | **OffsetDateTime**| Only return labels that were created on or after a specific date/time | [optional] |
| **createdAtEnd** | **OffsetDateTime**| Only return labels that were created on or before a specific date/time | [optional] |
| **page** | **Integer**| Return a specific page of results. Defaults to the first page. If set to a number that&#39;s greater than the number of pages of results, an empty page is returned.  | [optional] [default to 1] |
| **pageSize** | **Integer**| The number of results to return per response. | [optional] [default to 25] |
| **sortDir** | [**SortDir**](.md)| Controls the sort order of the query. | [optional] [enum: asc, desc] |
| **sortBy** | **String**| Controls which field the query is sorted by. | [optional] [default to created_at] [enum: modified_at, created_at] |

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
| **200** | The response includes a &#x60;labels&#x60; array containing a page of results (as determined by the &#x60;page_size&#x60; query parameter).  It also includes other useful information, such as the total number of labels that match the query criteria, the number of pages of results, and the URLs of the first, last, next, and previous pages of results.  |  -  |

<a name="purchaseLabelWithRateId"></a>
# **purchaseLabelWithRateId**
> Label purchaseLabelWithRateId(rateId, purchaseLabelWithoutShipment).execute();

Purchase Label with Rate ID

When retrieving rates for shipments using the &#x60;/rates&#x60; endpoint, the returned information contains a &#x60;rate_id&#x60; property that can be used to generate a label without having to refill in the shipment information repeatedly. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String rateId = "rateId_example"; // Rate ID
    ValidateAddress validateAddress = ValidateAddress.fromValue("no_validation");
    LabelLayout labelLayout = LabelLayout.fromValue("4x6");
    LabelFormat labelFormat = LabelFormat.fromValue("pdf");
    LabelDownloadType labelDownloadType = LabelDownloadType.fromValue("url");
    DisplayScheme displayScheme = DisplayScheme.fromValue("label"); // The display format that the label should be shown in.
    try {
      Label result = client
              .labels
              .purchaseLabelWithRateId(rateId)
              .validateAddress(validateAddress)
              .labelLayout(labelLayout)
              .labelFormat(labelFormat)
              .labelDownloadType(labelDownloadType)
              .displayScheme(displayScheme)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelId());
      System.out.println(result.getStatus());
      System.out.println(result.getShipmentId());
      System.out.println(result.getShipment());
      System.out.println(result.getShipDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getShipmentCost());
      System.out.println(result.getInsuranceCost());
      System.out.println(result.getRequestedComparisonAmount());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getIsReturnLabel());
      System.out.println(result.getRmaNumber());
      System.out.println(result.getIsInternational());
      System.out.println(result.getBatchId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getChargeEvent());
      System.out.println(result.getOutboundLabelId());
      System.out.println(result.getServiceCode());
      System.out.println(result.getTestLabel());
      System.out.println(result.getPackageCode());
      System.out.println(result.getValidateAddress());
      System.out.println(result.getVoided());
      System.out.println(result.getVoidedAt());
      System.out.println(result.getLabelDownloadType());
      System.out.println(result.getLabelFormat());
      System.out.println(result.getDisplayScheme());
      System.out.println(result.getLabelLayout());
      System.out.println(result.getTrackable());
      System.out.println(result.getLabelImageId());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getTrackingStatus());
      System.out.println(result.getLabelDownload());
      System.out.println(result.getFormDownload());
      System.out.println(result.getInsuranceClaim());
      System.out.println(result.getPackages());
      System.out.println(result.getAlternativeIdentifiers());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#purchaseLabelWithRateId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Label> response = client
              .labels
              .purchaseLabelWithRateId(rateId)
              .validateAddress(validateAddress)
              .labelLayout(labelLayout)
              .labelFormat(labelFormat)
              .labelDownloadType(labelDownloadType)
              .displayScheme(displayScheme)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#purchaseLabelWithRateId");
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
| **rateId** | **String**| Rate ID | |
| **purchaseLabelWithoutShipment** | [**PurchaseLabelWithoutShipment**](PurchaseLabelWithoutShipment.md)|  | |

### Return type

[**Label**](Label.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested object creation was a success. |  -  |

<a name="purchaseLabelWithShipmentId"></a>
# **purchaseLabelWithShipmentId**
> Label purchaseLabelWithShipmentId(shipmentId, createLabelFromShipmentRequestBody).execute();

Purchase Label with Shipment ID

Purchase a label using a shipment ID that has already been created with the desired address and package info. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ShipEngine;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shipengine.com";
    
    configuration.apiKey  = "YOUR API KEY";
    ShipEngine client = new ShipEngine(configuration);
    String shipmentId = "shipmentId_example"; // Shipment ID
    ValidateAddress validateAddress = ValidateAddress.fromValue("no_validation");
    LabelLayout labelLayout = LabelLayout.fromValue("4x6");
    LabelFormat labelFormat = LabelFormat.fromValue("pdf");
    LabelDownloadType labelDownloadType = LabelDownloadType.fromValue("url");
    DisplayScheme displayScheme = DisplayScheme.fromValue("label"); // The display format that the label should be shown in.
    try {
      Label result = client
              .labels
              .purchaseLabelWithShipmentId(shipmentId)
              .validateAddress(validateAddress)
              .labelLayout(labelLayout)
              .labelFormat(labelFormat)
              .labelDownloadType(labelDownloadType)
              .displayScheme(displayScheme)
              .execute();
      System.out.println(result);
      System.out.println(result.getLabelId());
      System.out.println(result.getStatus());
      System.out.println(result.getShipmentId());
      System.out.println(result.getShipment());
      System.out.println(result.getShipDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getShipmentCost());
      System.out.println(result.getInsuranceCost());
      System.out.println(result.getRequestedComparisonAmount());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getIsReturnLabel());
      System.out.println(result.getRmaNumber());
      System.out.println(result.getIsInternational());
      System.out.println(result.getBatchId());
      System.out.println(result.getCarrierId());
      System.out.println(result.getChargeEvent());
      System.out.println(result.getOutboundLabelId());
      System.out.println(result.getServiceCode());
      System.out.println(result.getTestLabel());
      System.out.println(result.getPackageCode());
      System.out.println(result.getValidateAddress());
      System.out.println(result.getVoided());
      System.out.println(result.getVoidedAt());
      System.out.println(result.getLabelDownloadType());
      System.out.println(result.getLabelFormat());
      System.out.println(result.getDisplayScheme());
      System.out.println(result.getLabelLayout());
      System.out.println(result.getTrackable());
      System.out.println(result.getLabelImageId());
      System.out.println(result.getCarrierCode());
      System.out.println(result.getTrackingStatus());
      System.out.println(result.getLabelDownload());
      System.out.println(result.getFormDownload());
      System.out.println(result.getInsuranceClaim());
      System.out.println(result.getPackages());
      System.out.println(result.getAlternativeIdentifiers());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#purchaseLabelWithShipmentId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Label> response = client
              .labels
              .purchaseLabelWithShipmentId(shipmentId)
              .validateAddress(validateAddress)
              .labelLayout(labelLayout)
              .labelFormat(labelFormat)
              .labelDownloadType(labelDownloadType)
              .displayScheme(displayScheme)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelsApi#purchaseLabelWithShipmentId");
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
| **shipmentId** | **String**| Shipment ID | |
| **createLabelFromShipmentRequestBody** | [**CreateLabelFromShipmentRequestBody**](CreateLabelFromShipmentRequestBody.md)|  | |

### Return type

[**Label**](Label.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested object creation was a success. |  -  |

