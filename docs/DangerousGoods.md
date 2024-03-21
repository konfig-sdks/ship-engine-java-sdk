

# DangerousGoods

Dangerous goods attribute associated with the product 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idNumber** | **String** | UN number to identify the dangerous goods. |  [optional] |
|**shippingName** | **String** | Trade description of the dangerous goods. |  [optional] |
|**technicalName** | **String** | Recognized Technical or chemical name of dangerous goods. |  [optional] |
|**productClass** | **String** | Dangerous goods product class based on regulation. |  [optional] |
|**productClassSubsidiary** | **String** | A secondary of product class for substances presenting more than one particular hazard |  [optional] |
|**packagingGroup** | **PackagingGroup** |  |  [optional] |
|**dangerousAmount** | [**DangerousAmount**](DangerousAmount.md) | This model represents the amount of the dangerous goods. |  [optional] |
|**quantity** | **Integer** | Quantity of dangerous goods. |  [optional] |
|**packagingInstruction** | **String** | The specific standardized packaging instructions from the relevant regulatory agency that have been applied to the parcel/container. |  [optional] |
|**packagingInstructionSection** | **PackagingInstructionSection** |  |  [optional] |
|**packagingType** | **String** | The type of exterior packaging used to contain the dangerous good. |  [optional] |
|**transportMean** | **TransportMean** |  |  [optional] |
|**transportCategory** | **String** | Transport category assign to dangerous goods for the transport purpose. |  [optional] |
|**regulationAuthority** | **String** | Name of the regulatory authority. |  [optional] |
|**regulationLevel** | **RegulationLevel** |  |  [optional] |
|**radioactive** | **Boolean** | Indication if the substance is radioactive. |  [optional] |
|**reportableQuantity** | **Boolean** | Indication if the substance needs to be reported to regulatory authority based on the quantity. |  [optional] |
|**tunnelCode** | **String** | Defines which types of tunnels the shipment is allowed to go through |  [optional] |
|**additionalDescription** | **String** | Provider additonal description regarding the dangerous goods. This is used as a placed holder to provider additional context and varies by carrier |  [optional] |



