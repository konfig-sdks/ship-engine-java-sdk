

# AddressValidationResult

An address validation result

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **AddressValidationStatus** |  |  |
|**originalAddress** | [**PartialAddress**](PartialAddress.md) | The original address that was sent for validation |  |
|**matchedAddress** | [**PartialAddressNullable**](PartialAddressNullable.md) | The matched address found by the Shipengine API |  |
|**messages** | [**List&lt;ResponseMessage&gt;**](ResponseMessage.md) | The list of messages that were generated during the address validation request. |  [readonly] |



