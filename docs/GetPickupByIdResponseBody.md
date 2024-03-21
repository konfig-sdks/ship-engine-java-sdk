

# GetPickupByIdResponseBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pickupId** | **String** | Pickup Resource ID |  [optional] |
|**labelIds** | **List&lt;String&gt;** | Label IDs that will be included in the pickup request |  [optional] |
|**createdAt** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |
|**cancelledAt** | **OffsetDateTime** | An [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) string that represents a date and time.  |  [optional] |
|**carrierId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**confirmationNumber** | **String** | The carrier confirmation number for the scheduled pickup. |  [optional] [readonly] |
|**warehouseId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**pickupAddress** | [**PartialAddress**](PartialAddress.md) |  |  [optional] |
|**contactDetails** | [**ContactDetails**](ContactDetails.md) |  |  [optional] |
|**pickupNotes** | **String** | Used by some carriers to give special instructions for a package pickup |  [optional] |
|**pickupWindow** | [**PickupWindow**](PickupWindow.md) |  |  [optional] |
|**pickupWindows** | [**List&lt;PickupWindows&gt;**](PickupWindows.md) | An array of available pickup windows. Carriers can return multiple times that they will pickup packages.  |  [optional] [readonly] |
|**requestId** | **UUID** | A UUID (a.k.a. GUID) that uniquely identifies a resource |  |
|**errors** | [**List&lt;Error&gt;**](Error.md) | The errors associated with the failed API call |  [readonly] |



