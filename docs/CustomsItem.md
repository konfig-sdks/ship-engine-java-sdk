

# CustomsItem

The customs declaration for a single item in the shipment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description of the item |  [optional] |
|**customsItemId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  |
|**quantity** | **Integer** | The quantity of this item in the shipment. |  [optional] |
|**value** | **Double** | The monetary amount, in the specified currency. |  [optional] |
|**valueCurrency** | **String** | The currencies that are supported by ShipEngine are the ones that specified by ISO 4217: https://www.iso.org/iso-4217-currency-codes.html  |  [optional] |
|**weight** | [**Weight**](Weight.md) | The item weight |  [optional] |
|**harmonizedTariffCode** | **String** | The [Harmonized Tariff Code](https://en.wikipedia.org/wiki/Harmonized_System) of this item. |  [optional] |
|**countryOfOrigin** | **String** | A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1)  |  [optional] |
|**unitOfMeasure** | **String** |  |  [optional] |
|**sku** | **String** | The SKU (Stock Keeping Unit) of the customs item |  [optional] |
|**skuDescription** | **String** | Description of the Custom Item&#39;s SKU |  [optional] |



