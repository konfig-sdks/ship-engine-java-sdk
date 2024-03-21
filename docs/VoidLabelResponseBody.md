

# VoidLabelResponseBody

A void label response body

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approved** | **Boolean** | Indicates whether the attempt to void the label was successful |  [readonly] |
|**message** | **String** |  |  [readonly] |
|**reasonCode** | **ReasonCode** | Indicates a normalized reason for the conditions if the void attempt was not approved. Will not populate if approved is true. “unknown” codes may be specified later. |  [optional] |



