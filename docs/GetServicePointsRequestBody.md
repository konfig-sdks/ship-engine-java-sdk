

# GetServicePointsRequestBody

A get service points request body. Caller must provide exactly one of address_query, address, or lat / long pair.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressQuery** | **String** | Unstructured text to search for service points by. |  [optional] |
|**address** | [**GetServicePointsRequestBodyAddress**](GetServicePointsRequestBodyAddress.md) |  |  [optional] |
|**providers** | [**List&lt;GetServicePointsRequestBodyProvidersInner&gt;**](GetServicePointsRequestBodyProvidersInner.md) | An array of shipping service providers and service codes |  |
|**lat** | **Double** | The latitude of the point. Represented as signed degrees. Required if long is provided. http://www.geomidpoint.com/latlon.html |  [optional] |
|**_long** | **Double** | The longitude of the point. Represented as signed degrees. Required if lat is provided. http://www.geomidpoint.com/latlon.html |  [optional] |
|**radius** | **Integer** | Search radius in kilometers |  [optional] |
|**maxResults** | **Integer** | The maximum number of service points to return |  [optional] |



