

# DeprecatedManifest

Deprecated manifest resource

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**manifestId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**formId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date-time that the manifest was created |  [optional] |
|**shipDate** | **OffsetDateTime** | The date-time that the manifests shipments will be picked up |  [optional] |
|**shipments** | **Integer** | The number of shipments that are included in this manifest |  [optional] [readonly] |
|**warehouseId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**submissionId** | **String** | A string that uniquely identifies the submission |  [optional] |
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**manifestDownload** | [**ManifestDownload**](ManifestDownload.md) |  |  [optional] |
|**labelIds** | **List&lt;String&gt;** | An array of the label ids used in this manifest. |  [optional] [readonly] |



