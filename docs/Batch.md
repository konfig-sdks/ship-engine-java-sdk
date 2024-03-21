

# Batch

Batches are an advanced feature of ShipEngine designed for users who need to generate hundreds or thousands of labels at a time. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labelLayout** | **LabelLayout** | label layout |  |
|**labelFormat** | **LabelFormat** |  |  |
|**batchId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**batchNumber** | **String** | The batch number. |  [readonly] |
|**externalBatchId** | **String** | A string that uniquely identifies the external batch |  [readonly] |
|**batchNotes** | **String** | Custom notes you can add for each created batch |  [readonly] |
|**createdAt** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  |
|**processedAt** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  |
|**errors** | **Integer** | The number of errors that occurred while generating the batch |  [readonly] |
|**processErrors** | [**List&lt;Error&gt;**](Error.md) | The errors associated with the failed API call |  [readonly] |
|**warnings** | **Integer** | The number of warnings that occurred while generating the batch |  [readonly] |
|**completed** | **Integer** | The number of labels generated in the batch |  [readonly] |
|**forms** | **Integer** | The number of forms for customs that are available for download |  [readonly] |
|**count** | **Integer** | The total of errors, warnings, and completed properties |  [readonly] |
|**batchShipmentsUrl** | [**OptionalLink**](OptionalLink.md) | The batch shipments endpoint |  |
|**batchLabelsUrl** | [**OptionalLink**](OptionalLink.md) | Link to batch labels query |  |
|**batchErrorsUrl** | [**OptionalLink**](OptionalLink.md) | Link to batch errors endpoint |  |
|**labelDownload** | [**LabelDownload**](LabelDownload.md) | The label download for the batch |  |
|**formDownload** | [**OptionalLink**](OptionalLink.md) | The form download for any customs that are needed |  |
|**status** | **BatchStatus** |  |  |



