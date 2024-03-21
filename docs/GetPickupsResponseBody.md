

# GetPickupsResponseBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pickups** | [**List&lt;Pickup&gt;**](Pickup.md) | An array of pickups associated with the user&#39;s account. |  |
|**total** | **Long** | The total number of pickups returned |  [readonly] |
|**page** | **Integer** | Current page of the list pickups results |  [readonly] |
|**pages** | **Integer** | Total number of pages for list pickups results |  [readonly] |
|**links** | [**PaginationLink**](PaginationLink.md) | Helpful links to other pages of results |  |
|**requestId** | **UUID** | A UUID (a.k.a. GUID) that uniquely identifies a resource |  |
|**errors** | [**List&lt;Error&gt;**](Error.md) | The errors associated with the failed API call |  [readonly] |



