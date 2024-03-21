

# Manifest

Used for combining packages into one scannable form that a carrier can use when picking up a large  number of shipments 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**manifestId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**formId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date-time that the manifest was created |  [optional] [readonly] |
|**shipDate** | **OffsetDateTime** | The date-time that the manifests shipments will be picked up |  [optional] [readonly] |
|**shipments** | **Integer** | The number of shipments that are included in this manifest |  [optional] [readonly] |
|**labelIds** | **List&lt;String&gt;** | An array of the label ids used in this manifest. |  [optional] [readonly] |
|**warehouseId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**submissionId** | **String** | A string that uniquely identifies the submission |  [optional] [readonly] |
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**manifestDownload** | [**ManifestDownload**](ManifestDownload.md) |  |  [optional] |



