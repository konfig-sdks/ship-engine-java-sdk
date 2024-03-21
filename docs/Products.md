

# Products

The customs declaration for a single item in the shipment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description of the item |  [optional] |
|**quantity** | **Integer** | The quantity of this item in the shipment. |  [optional] |
|**value** | [**MonetaryValue**](MonetaryValue.md) | The declared value of each item |  [optional] |
|**weight** | [**Weight**](Weight.md) | The item weight |  [optional] |
|**harmonizedTariffCode** | **String** | The [Harmonized Tariff Code](https://en.wikipedia.org/wiki/Harmonized_System) of this item. |  [optional] |
|**countryOfOrigin** | **String** | A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1)  |  [optional] |
|**unitOfMeasure** | **String** |  |  [optional] |
|**sku** | **String** | The SKU (Stock Keeping Unit) of the item |  [optional] |
|**skuDescription** | **String** | Description of the Custom Item&#39;s SKU |  [optional] |
|**midCode** | **String** | Manufacturers Identification code |  [optional] |
|**productUrl** | **String** | link to the item on the seller website |  [optional] |
|**vatRate** | **Double** | VAT rate applicable to the item |  [optional] |
|**dangerousGoods** | [**List&lt;DangerousGoods&gt;**](DangerousGoods.md) | Details about dangerous goods inside products |  [optional] |



