

# Label

A label represents the physical sticker that you affix to a package to ship it.  ShipEngine makes it easy for you to [create labels](https://www.shipengine.com/docs/labels/create-a-label/) and then download them in PDF, PNG, or ZPL format so you can print them. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labelId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**status** | **LabelStatus** |  |  [optional] |
|**shipmentId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**shipment** | [**PartialShipment**](PartialShipment.md) | The shipment information used to generate the label |  [optional] |
|**shipDate** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date, but not a specific time.  The value _may_ contain a time component, but it will be set to &#x60;00:00:00&#x60; UTC by ShipEngine.  |  [optional] |
|**createdAt** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |
|**shipmentCost** | [**MonetaryValue**](MonetaryValue.md) | The cost of shipping, delivery confirmation, and other carrier charges.  This amount **does not** include insurance costs.  |  [optional] |
|**insuranceCost** | [**MonetaryValue**](MonetaryValue.md) | The insurance cost for this package.  Add this to the &#x60;shipment_cost&#x60; field to get the total cost.  |  [optional] |
|**requestedComparisonAmount** | [**MonetaryValue**](MonetaryValue.md) | The total shipping cost for the specified comparison_rate_type.  |  [optional] |
|**trackingNumber** | **String** | The tracking number for the package. Tracking number formats vary across carriers. |  [optional] [readonly] |
|**isReturnLabel** | **Boolean** | Indicates whether this is a return label.  You may also want to set the &#x60;rma_number&#x60; so you know what is being returned.  |  [optional] |
|**rmaNumber** | **String** | An optional Return Merchandise Authorization number.  This field is useful for return labels.  You can set it to any string value.  |  [optional] |
|**isInternational** | **Boolean** | Indicates whether this is an international shipment.  That is, the originating country and destination country are different.  |  [optional] [readonly] |
|**batchId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**chargeEvent** | **LabelChargeEvent** | The label charge event.  |  [optional] |
|**outboundLabelId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**serviceCode** | **String** | A [carrier service](https://www.shipengine.com/docs/shipping/use-a-carrier-service/), such as &#x60;fedex_ground&#x60;, &#x60;usps_first_class_mail&#x60;, &#x60;flat_rate_envelope&#x60;, etc.  |  [optional] |
|**testLabel** | **Boolean** | Indicate if this label is being used only for testing purposes. If true, then no charge will be added to your account. |  [optional] |
|**packageCode** | **String** | A [package type](https://www.shipengine.com/docs/reference/list-carrier-packages/), such as &#x60;thick_envelope&#x60;, &#x60;small_flat_rate_box&#x60;, &#x60;large_package&#x60;, etc.  Use the code &#x60;package&#x60; for custom or unknown package types.  |  [optional] |
|**validateAddress** | **ValidateAddress** |  |  [optional] |
|**voided** | **Boolean** | Indicates whether the label has been [voided](https://www.shipengine.com/docs/labels/voiding/)  |  [optional] [readonly] |
|**voidedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the label was [voided](https://www.shipengine.com/docs/labels/voiding/), or &#x60;null&#x60; if the label has not been voided  |  [optional] [readonly] |
|**labelDownloadType** | **LabelDownloadType** |  |  [optional] |
|**labelFormat** | **LabelFormat** | The file format that you want the label to be in.  We recommend &#x60;pdf&#x60; format because it is supported by all carriers, whereas some carriers do not support the &#x60;png&#x60; or &#x60;zpl&#x60; formats.  |  [optional] |
|**displayScheme** | **DisplayScheme** | The display format that the label should be shown in. |  [optional] |
|**labelLayout** | **LabelLayout** | The layout (size) that you want the label to be in.  The &#x60;label_format&#x60; determines which sizes are allowed.  &#x60;4x6&#x60; is supported for all label formats, whereas &#x60;letter&#x60; (8.5\&quot; x 11\&quot;) is only supported for &#x60;pdf&#x60; format.  |  [optional] |
|**trackable** | **Boolean** | Indicates whether the shipment is trackable, in which case the &#x60;tracking_status&#x60; field will reflect the current status and each package will have a &#x60;tracking_number&#x60;.  |  [optional] [readonly] |
|**labelImageId** | **String** | Used to identify an image resource. |  [optional] |
|**carrierCode** | **String** | A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as &#x60;fedex&#x60;, &#x60;dhl_express&#x60;, &#x60;stamps_com&#x60;, etc.  |  [optional] |
|**trackingStatus** | **TrackingStatus** | The current status of the package, such as &#x60;in_transit&#x60; or &#x60;delivered&#x60; |  [optional] |
|**labelDownload** | [**LabelDownload**](LabelDownload.md) |  |  [optional] |
|**formDownload** | [**OptionalLinkNullable**](OptionalLinkNullable.md) | The link to download the customs form (a.k.a. commercial invoice) for this shipment, if any.  Forms are in PDF format. This field is null if the shipment does not require a customs form, or if the carrier does not support it.  |  [optional] |
|**insuranceClaim** | [**LabelInsuranceClaim**](LabelInsuranceClaim.md) | The link to submit an insurance claim for the shipment.  This field is null if the shipment is not insured or if the insurance provider does not support online claim submission.  |  [optional] |
|**packages** | [**List&lt;LabelPackagesInner&gt;**](LabelPackagesInner.md) | The label&#39;s package(s).  &gt; **Note:** Some carriers only allow one package per label.  If you attempt to create a multi-package label for a carrier that doesn&#39;t allow it, an error will be returned.  |  [optional] [readonly] |
|**alternativeIdentifiers** | [**List&lt;AlternativeIdentifier&gt;**](AlternativeIdentifier.md) | Additional information some carriers may provide by which to identify a given label in their system.   |  [optional] [readonly] |



