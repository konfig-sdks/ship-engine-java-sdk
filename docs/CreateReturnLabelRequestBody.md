

# CreateReturnLabelRequestBody

A create return label request body

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chargeEvent** | **LabelChargeEvent** | The label charge event.  |  [optional] |
|**labelLayout** | **LabelLayout** | The layout (size) that you want the label to be in.  The &#x60;label_format&#x60; determines which sizes are allowed.  &#x60;4x6&#x60; is supported for all label formats, whereas &#x60;letter&#x60; (8.5\&quot; x 11\&quot;) is only supported for &#x60;pdf&#x60; format.  |  [optional] |
|**labelFormat** | **LabelFormat** | The file format that you want the label to be in.  We recommend &#x60;pdf&#x60; format because it is supported by all carriers, whereas some carriers do not support the &#x60;png&#x60; or &#x60;zpl&#x60; formats.  |  [optional] |
|**labelDownloadType** | **LabelDownloadType** |  |  [optional] |
|**displayScheme** | **DisplayScheme** | The display format that the label should be shown in. |  [optional] |
|**labelImageId** | **String** | Used to identify an image resource. |  [optional] |



