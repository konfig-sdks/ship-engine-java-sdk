

# PackageType

A package type that a carrier supports for shipment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Provides a helpful description for the custom package. |  [optional] |
|**packageId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**packageCode** | **String** | A [package type](https://www.shipengine.com/docs/reference/list-carrier-packages/), such as &#x60;thick_envelope&#x60;, &#x60;small_flat_rate_box&#x60;, &#x60;large_package&#x60;, etc.  Use the code &#x60;package&#x60; for custom or unknown package types.  |  |
|**name** | **String** |  |  |
|**dimensions** | [**Dimensions**](Dimensions.md) | The custom dimensions for the package. |  [optional] |



