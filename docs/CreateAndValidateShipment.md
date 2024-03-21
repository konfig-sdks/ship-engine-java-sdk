

# CreateAndValidateShipment

A create and validate shipment resource

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | Arbitrary tags associated with this shipment.  Tags can be used to categorize shipments, and shipments can be queried by their tags.  |  [optional] [readonly] |
|**shipmentId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**serviceCode** | **String** | A [carrier service](https://www.shipengine.com/docs/shipping/use-a-carrier-service/), such as &#x60;fedex_ground&#x60;, &#x60;usps_first_class_mail&#x60;, &#x60;flat_rate_envelope&#x60;, etc.  |  [optional] |
|**externalOrderId** | **String** | ID that the Order Source assigned |  [optional] |
|**items** | [**List&lt;ShipmentItem&gt;**](ShipmentItem.md) | Describe the packages included in this shipment as related to potential metadata that was imported from external order sources  |  [optional] |
|**taxIdentifiers** | [**List&lt;TaxIdentifier&gt;**](TaxIdentifier.md) |  |  [optional] |
|**externalShipmentId** | **String** | A unique user-defined key to identify a shipment.  This can be used to retrieve the shipment.  &gt; **Warning:** The &#x60;external_shipment_id&#x60; is limited to 50 characters. Any additional characters will be truncated.  |  [optional] |
|**shipmentNumber** | **String** | A non-unique user-defined number used to identify a shipment.  If undefined, this will match the external_shipment_id of the shipment.  &gt; **Warning:** The &#x60;shipment_number&#x60; is limited to 50 characters. Any additional characters will be truncated.  |  [optional] |
|**shipDate** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date, but not a specific time.  The value _may_ contain a time component, but it will be set to &#x60;00:00:00&#x60; UTC by ShipEngine.  |  [optional] |
|**createdAt** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |
|**modifiedAt** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |
|**shipmentStatus** | **ShipmentStatus** | The current status of the shipment |  [optional] |
|**shipTo** | [**ShippingAddressTo**](ShippingAddressTo.md) | The recipient&#39;s mailing address |  [optional] |
|**shipFrom** | [**ShippingAddress**](ShippingAddress.md) | The shipment&#39;s origin address. If you frequently ship from the same location, consider [creating a warehouse](https://www.shipengine.com/docs/reference/create-warehouse/).  Then you can simply specify the &#x60;warehouse_id&#x60; rather than the complete address each time.  |  [optional] |
|**warehouseId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**returnTo** | [**ShippingAddress**](ShippingAddress.md) | The return address for this shipment.  Defaults to the &#x60;ship_from&#x60; address.  |  [optional] |
|**isReturn** | **Boolean** | An optional indicator if the shipment is intended to be a return. Defaults to false if not provided.  |  [optional] |
|**confirmation** | **DeliveryConfirmation** | The type of delivery confirmation that is required for this shipment. |  [optional] |
|**customs** | [**InternationalShipmentOptionsNullable**](InternationalShipmentOptionsNullable.md) | Customs information.  This is usually only needed for international shipments.  |  [optional] |
|**advancedOptions** | [**AdvancedShipmentOptions**](AdvancedShipmentOptions.md) | Advanced shipment options.  These are entirely optional. |  [optional] |
|**insuranceProvider** | **InsuranceProvider** | The insurance provider to use for any insured packages in the shipment.  |  [optional] |
|**orderSourceCode** | **OrderSourceName** |  |  [optional] |
|**packages** | [**List&lt;ModelPackage&gt;**](ModelPackage.md) | The packages in the shipment.  &gt; **Note:** Some carriers only allow one package per shipment.  If you attempt to create a multi-package shipment for a carrier that doesn&#39;t allow it, an error will be returned.  |  [optional] |
|**totalWeight** | [**Weight**](Weight.md) | The combined weight of all packages in the shipment |  [optional] |
|**comparisonRateType** | **String** | Calculate a rate for this shipment with the requested carrier using a ratecard that differs from the default.  Only supported for UPS and USPS. |  [optional] |
|**errors** | **List&lt;String&gt;** | An array of errors that occurred while creating shipment. |  [optional] [readonly] |
|**addressValidation** | [**AddressValidationResult**](AddressValidationResult.md) | The address validation |  [optional] |



