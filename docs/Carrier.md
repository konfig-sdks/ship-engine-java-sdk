

# Carrier

A carrier object that represents a provider such as UPS, USPS, DHL, etc that has been tied to the current account. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**carrierCode** | **String** | A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as &#x60;fedex&#x60;, &#x60;dhl_express&#x60;, &#x60;stamps_com&#x60;, etc.  |  [optional] |
|**accountNumber** | **String** | The account number that the carrier is connected to. |  [optional] [readonly] |
|**requiresFundedAmount** | **Boolean** | Indicates whether the carrier requires funding to use its services |  [optional] [readonly] |
|**balance** | **Double** | Current available balance |  [optional] [readonly] |
|**nickname** | **String** | Nickname given to the account when initially setting up the carrier. |  [optional] [readonly] |
|**friendlyName** | **String** | Screen readable name |  [optional] [readonly] |
|**primary** | **Boolean** | Is this the primary carrier that is used by default when no carrier is specified in label/shipment creation |  [optional] [readonly] |
|**hasMultiPackageSupportingServices** | **Boolean** | Carrier supports multiple packages per shipment |  [optional] [readonly] |
|**supportsLabelMessages** | **Boolean** | The carrier supports adding custom label messages to an order. |  [optional] [readonly] |
|**disabledByBillingPlan** | **Boolean** | The carrier is disabled by the current ShipEngine account&#39;s billing plan. |  [optional] [readonly] |
|**services** | [**List&lt;Service&gt;**](Service.md) | A list of services that are offered by the carrier |  [optional] [readonly] |
|**packages** | [**List&lt;PackageType&gt;**](PackageType.md) | A list of package types that are supported by the carrier |  [optional] [readonly] |
|**options** | [**List&lt;CarrierAdvancedOption&gt;**](CarrierAdvancedOption.md) | A list of options that are available to that carrier |  [optional] [readonly] |



