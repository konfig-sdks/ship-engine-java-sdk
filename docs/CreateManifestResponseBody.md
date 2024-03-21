

# CreateManifestResponseBody

A create manifest response body

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**manifests** | [**List&lt;Manifest&gt;**](Manifest.md) | Resulting Manifests |  [optional] |
|**manifestRequests** | [**List&lt;ManifestRequest&gt;**](ManifestRequest.md) | Resulting manifest requests with statuses |  [optional] |
|**manifestId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**formId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**createdAt** | **OffsetDateTime** | The date-time that the manifest was created |  |
|**shipDate** | **OffsetDateTime** | The date-time that the manifests shipments will be picked up |  |
|**shipments** | **Integer** | The number of shipments that are included in this manifest |  [readonly] |
|**warehouseId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**submissionId** | **String** | A string that uniquely identifies the submission |  |
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**manifestDownload** | [**ManifestDownload**](ManifestDownload.md) |  |  |
|**labelIds** | **List&lt;String&gt;** | An array of the label ids used in this manifest. |  [optional] [readonly] |
|**requestId** | **UUID** | A UUID (a.k.a. GUID) that uniquely identifies a resource |  |
|**errors** | [**List&lt;Error&gt;**](Error.md) | The errors associated with the failed API call |  [readonly] |



