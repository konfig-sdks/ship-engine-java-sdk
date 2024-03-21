

# ListServicePointsResponseBodyServicePointsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrierCode** | **String** | A [shipping carrier](https://www.shipengine.com/docs/carriers/setup/), such as &#x60;fedex&#x60;, &#x60;dhl_express&#x60;, &#x60;stamps_com&#x60;, etc.  |  [optional] |
|**serviceCodes** | **List&lt;String&gt;** |  |  [optional] |
|**servicePointId** | **String** | A unique identifier for a carrier drop off point. |  [optional] |
|**companyName** | **String** | If this is a business address, then the company name should be specified here. |  [optional] |
|**addressLine1** | **String** | The first line of the street address.  For some addresses, this may be the only line.  Other addresses may require 2 or 3 lines. |  [optional] |
|**cityLocality** | **String** | The name of the city or locality |  [optional] |
|**stateProvince** | **String** | The state or province. For some countries (including the U.S.) only abbreviations are allowed. Other countries allow the full name or abbreviation. |  [optional] |
|**postalCode** | **String** | postal code |  [optional] |
|**countryCode** | **String** | A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1)  |  [optional] |
|**phoneNumber** | **String** | Phone number associated |  [optional] |
|**lat** | **Double** | The latitude of the point. Represented as signed degrees. Required if long is provided. http://www.geomidpoint.com/latlon.html |  [optional] |
|**_long** | **Double** | The longitude of the point. Represented as signed degrees. Required if lat is provided. http://www.geomidpoint.com/latlon.html |  [optional] |
|**distanceInMeters** | **Double** | Distance in meters |  [optional] |
|**hoursOfOperation** | [**ListServicePointsResponseBodyServicePointsInnerHoursOfOperation**](ListServicePointsResponseBodyServicePointsInnerHoursOfOperation.md) |  |  [optional] |
|**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | Service features |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Service point type |  [optional] |



## Enum: List&lt;FeaturesEnum&gt;

| Name | Value |
|---- | -----|
| DROP_OFF_POINT | &quot;drop_off_point&quot; |
| PICKUP_POINT | &quot;pickup_point&quot; |
| PRINT_SERVICES | &quot;print_services&quot; |
| AFTER_HOURS_LOCKER | &quot;after_hours_locker&quot; |
| AFTER_HOURS_DROPBOX | &quot;after_hours_dropbox&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PUDO | &quot;pudo&quot; |
| LOCKER | &quot;locker&quot; |



