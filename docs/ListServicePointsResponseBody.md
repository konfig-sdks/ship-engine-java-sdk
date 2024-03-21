

# ListServicePointsResponseBody

A list service points response body

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lat** | **Double** | The latitude of the point. Represented as signed degrees. Required if long is provided. http://www.geomidpoint.com/latlon.html |  [optional] |
|**_long** | **Double** | The longitude of the point. Represented as signed degrees. Required if lat is provided. http://www.geomidpoint.com/latlon.html |  [optional] |
|**servicePoints** | [**List&lt;ListServicePointsResponseBodyServicePointsInner&gt;**](ListServicePointsResponseBodyServicePointsInner.md) |  |  [optional] |
|**errors** | [**List&lt;Error&gt;**](Error.md) | The errors associated with the failed API call |  [optional] [readonly] |



