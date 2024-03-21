

# LabelPackagesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**packageId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**packageCode** | **String** | A [package type](https://www.shipengine.com/docs/reference/list-carrier-packages/), such as &#x60;thick_envelope&#x60;, &#x60;small_flat_rate_box&#x60;, &#x60;large_package&#x60;, etc.  Use the code &#x60;package&#x60; for custom or unknown package types.  |  [optional] |
|**contentDescription** | **String** | A short description of the package content. Required for shipments moving to, from, and through Mexico.  |  [optional] |
|**weight** | [**Weight**](Weight.md) | The package weight |  |
|**dimensions** | [**Dimensions**](Dimensions.md) | The package dimensions |  [optional] |
|**insuredValue** | [**MonetaryValue**](MonetaryValue.md) | The insured value of the package.  Requires the &#x60;insurance_provider&#x60; field of the shipment to be set.  |  [optional] |
|**trackingNumber** | **String** | A tracking number for a package. The format depends on the carrier. |  [optional] |
|**labelMessages** | [**LabelMessages**](LabelMessages.md) |  |  [optional] |
|**externalPackageId** | **String** | An external package id. |  [optional] |
|**labelDownload** | [**LabelDownload**](LabelDownload.md) | The label download for the package |  [optional] |
|**formDownload** | [**OptionalLink**](OptionalLink.md) | The form download for any customs that are needed |  [optional] |
|**sequence** | **Integer** | Package sequence |  [optional] [readonly] |
|**products** | [**List&lt;Products&gt;**](Products.md) | Details about products inside packages (Information provided would be used on custom documentation) |  [optional] |
|**alternativeIdentifiers** | [**List&lt;AlternativeIdentifier&gt;**](AlternativeIdentifier.md) | Alternative identifiers associated with this package.  |  [optional] [readonly] |



