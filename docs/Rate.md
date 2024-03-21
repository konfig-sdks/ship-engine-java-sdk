

# Rate

A rate

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rateId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**rateType** | **RateType** |  |  |
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**shippingAmount** | [**MonetaryValue**](MonetaryValue.md) | The shipping amount. Should be added with confirmation_amount, insurance_amount and other_amount to calculate the total purchase price. |  |
|**insuranceAmount** | [**MonetaryValue**](MonetaryValue.md) | The insurance amount.  Should be added with shipping_amount, confirmation_amount and other_amount to calculate the total purchase price. |  |
|**confirmationAmount** | [**MonetaryValue**](MonetaryValue.md) | The confirmation amount.  Should be added with shipping_amount, insurance_amount and other_amount to calculate the total purchase price. |  |
|**otherAmount** | [**MonetaryValue**](MonetaryValue.md) | Any other charges associated with this rate.  Should be added with shipping_amount, insurance_amount and confirmation_amount to calculate the total purchase price. |  |
|**requestedComparisonAmount** | [**MonetaryValue**](MonetaryValue.md) | The total shipping cost for the specified comparison_rate_type. |  [optional] |
|**taxAmount** | [**MonetaryValue**](MonetaryValue.md) | Tariff and additional taxes associated with an international shipment. |  [optional] |
|**zone** | **Integer** | Certain carriers base [their rates](https://blog.stamps.com/2017/09/08/usps-postal-zones/) off of custom zones that vary depending upon the ship_to and ship_from location  |  [readonly] |
|**packageType** | **String** | package type that this rate was estimated for |  [readonly] |
|**deliveryDays** | **Integer** | The number of days estimated for delivery, this will show the _actual_ delivery time if for example, the package gets shipped on a Friday  |  [optional] [readonly] |
|**guaranteedService** | **Boolean** | Indicates if the rate is guaranteed. |  [readonly] |
|**estimatedDeliveryDate** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date, but not a specific time.  The value _may_ contain a time component, but it will be set to &#x60;00:00:00&#x60; UTC by ShipEngine.  |  [optional] |
|**carrierDeliveryDays** | **String** | The carrier delivery days |  [optional] [readonly] |
|**shipDate** | **OffsetDateTime** | ship date |  [optional] [readonly] |
|**negotiatedRate** | **Boolean** | Indicates if the rates been negotiated |  [readonly] |
|**serviceType** | **String** | service type |  [readonly] |
|**serviceCode** | **String** | service code for the rate |  [readonly] |
|**trackable** | **Boolean** | Indicates if rate is trackable |  [readonly] |
|**carrierCode** | **String** | carrier code |  [readonly] |
|**carrierNickname** | **String** | carrier nickname |  [readonly] |
|**carrierFriendlyName** | **String** | carrier friendly name |  [readonly] |
|**validationStatus** | **ValidationStatus** |  |  |
|**warningMessages** | **List&lt;String&gt;** | The warning messages |  [readonly] |
|**errorMessages** | **List&lt;String&gt;** | The error messages |  [readonly] |



