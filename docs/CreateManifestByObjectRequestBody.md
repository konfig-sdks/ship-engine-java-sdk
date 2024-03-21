

# CreateManifestByObjectRequestBody

A create manifest request body

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**excludedLabelIds** | **List&lt;String&gt;** | The list of label ids to exclude from the manifest |  [optional] |
|**labelIds** | **List&lt;String&gt;** | The list of label ids to include for the manifest |  [optional] |
|**warehouseId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**shipDate** | **OffsetDateTime** | The ship date that the shipment will be sent out on |  |


