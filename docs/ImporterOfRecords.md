

# ImporterOfRecords

importer of records address, anywhere in the world. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of a contact person at this address. Either &#x60;name&#x60; or the &#x60;company_name&#x60; field should always be set.  |  |
|**phone** | **String** | The phone number of a contact person at this address.  The format of this phone number varies depending on the country.  |  [optional] |
|**email** | **String** | Email for the address owner.  |  [optional] |
|**companyName** | **String** | If this is a business address, then the company name should be specified here. Either &#x60;name&#x60; or the &#x60;company_name&#x60; field should always be set.  |  [optional] |
|**addressLine1** | **String** | The first line of the street address.  For some addresses, this may be the only line.  Other addresses may require 2 or 3 lines.  |  |
|**addressLine2** | **String** | The second line of the street address.  For some addresses, this line may not be needed.  |  [optional] |
|**addressLine3** | **String** | The third line of the street address.  For some addresses, this line may not be needed.  |  [optional] |
|**cityLocality** | **String** | The name of the city or locality |  |
|**stateProvince** | **String** | The state or province.  For some countries (including the U.S.) only abbreviations are allowed.  Other countries allow the full name or abbreviation.  |  [optional] |
|**postalCode** | **String** | postal code |  |
|**countryCode** | **String** | A two-letter [ISO 3166-1 country code](https://en.wikipedia.org/wiki/ISO_3166-1)  |  |



