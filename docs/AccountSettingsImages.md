

# AccountSettingsImages

A ShipEngine account images body

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labelImageId** | **String** | Used to identify an image resource. |  [optional] |
|**name** | **String** | A human readable name for the image.  |  [optional] |
|**isDefault** | **Boolean** | Indicates whether this image is set as default.  |  [optional] |
|**imageContentType** | [**ImageContentTypeEnum**](#ImageContentTypeEnum) | The image type |  [optional] |
|**imageData** | **String** | A base64 encoded string representation of the image.  |  [optional] |
|**createdAt** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |
|**modifiedAt** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |



## Enum: ImageContentTypeEnum

| Name | Value |
|---- | -----|
| PNG | &quot;image/png&quot; |
| JPEG | &quot;image/jpeg&quot; |



