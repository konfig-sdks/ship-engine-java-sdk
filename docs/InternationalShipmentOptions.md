

# InternationalShipmentOptions

Options for international shipments, such as customs declarations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contents** | **PackageContents** | The type of contents in this shipment.  This may impact import duties or customs treatment. |  |
|**contentsExplanation** | **String** | Explanation for contents (required if the &#x60;contents&#x60; is provided as &#x60;other&#x60;) |  [optional] |
|**nonDelivery** | **NonDelivery** | Indicates what to do if a package is unable to be delivered. |  |
|**termsOfTradeCode** | **AllowedIncoterms** | Specifies the supported terms of trade code (incoterms) |  [optional] |
|**declaration** | **String** | Declaration statement to be placed on the commercial invoice |  [optional] |
|**invoiceAdditionalDetails** | [**InvoiceAdditionalDetails**](InvoiceAdditionalDetails.md) |  |  [optional] |
|**importerOfRecord** | [**ImporterOfRecords**](ImporterOfRecords.md) |  |  [optional] |
|**customsItems** | [**List&lt;CustomsItem&gt;**](CustomsItem.md) | Customs declarations for each item in the shipment. (Please provide this information under &#x60;products&#x60; inside &#x60;packages&#x60;) |  [optional] |



