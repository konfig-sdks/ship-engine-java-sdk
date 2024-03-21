

# TrackingInformation

A tracking information resource

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trackingNumber** | **String** | A tracking number for a package. The format depends on the carrier. |  [optional] |
|**trackingUrl** | **String** | Carrier Tracking Url, if available |  [optional] [readonly] |
|**statusCode** | **StatusCode** |  |  [optional] |
|**carrierCode** | **String** | A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as &#x60;fedex&#x60;, &#x60;dhl_express&#x60;, &#x60;stamps_com&#x60;, etc.  |  [optional] |
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**statusDescription** | **String** | Status description |  [optional] [readonly] |
|**carrierStatusCode** | **String** | Carrier status code |  [optional] [readonly] |
|**carrierDetailCode** | **String** | Carrier detail code |  [optional] [readonly] |
|**carrierStatusDescription** | **String** | carrier status description |  [optional] [readonly] |
|**shipDate** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |
|**estimatedDeliveryDate** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |
|**actualDeliveryDate** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |
|**exceptionDescription** | **String** | Exception description |  [optional] [readonly] |
|**events** | [**List&lt;TrackEvent&gt;**](TrackEvent.md) | The events that have occured during the lifetime of this tracking number. |  [optional] [readonly] |



