

# Warehouse

A warehouse

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**warehouseId** | **String** | A string that uniquely identifies a ShipEngine resource, such as a carrier, label, shipment, etc. |  [optional] |
|**isDefault** | **Boolean** | Designates which single warehouse is the default on the account |  [optional] |
|**name** | **String** | Name of the warehouse |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp that indicates when the warehouse was created |  [optional] [readonly] |
|**originAddress** | [**PartialAddress**](PartialAddress.md) | The origin address of the warehouse |  [optional] |
|**returnAddress** | [**PartialAddress**](PartialAddress.md) | The return address associated with the warehouse |  [optional] |



