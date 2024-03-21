/*
 * ShipEngine API
 * ShipEngine's easy-to-use REST API lets you manage all of your shipping needs without worrying about the complexities of different carrier APIs and protocols. We handle all the heavy lifting so you can focus on providing a first-class shipping experience for your customers at the best possible prices.  Each of ShipEngine's features can be used by itself or in conjunction with each other to build powerful shipping functionality into your application or service.  ## Getting Started If you're new to REST APIs then be sure to read our [introduction to REST](https://www.shipengine.com/docs/rest/) to understand the basics.  Learn how to [authenticate yourself to ShipEngine](https://www.shipengine.com/docs/auth/), and then use our [sandbox environment](https://www.shipengine.com/docs/sandbox/) to kick the tires and get familiar with our API. If you run into any problems, then be sure to check the [error handling guide](https://www.shipengine.com/docs/errors/) for tips.  Here are some step-by-step **tutorials** to get you started:    - [Learn how to create your first shipping label](https://www.shipengine.com/docs/labels/create-a-label/)   - [Calculate shipping costs and compare rates across carriers](https://www.shipengine.com/docs/rates/)   - [Track packages on-demand or in real time](https://www.shipengine.com/docs/tracking/)   - [Validate mailing addresses anywhere on Earth](https://www.shipengine.com/docs/addresses/validation/)   ## Shipping Labels for Every Major Carrier ShipEngine makes it easy to [create shipping labels for any carrier](https://www.shipengine.com/docs/labels/create-a-label/) and [download them](https://www.shipengine.com/docs/labels/downloading/) in a [variety of file formats](https://www.shipengine.com/docs/labels/formats/). You can even customize labels with your own [messages](https://www.shipengine.com/docs/labels/messages/) and [images](https://www.shipengine.com/docs/labels/branding/).   ## Real-Time Package Tracking With ShipEngine you can [get the current status of a package](https://www.shipengine.com/docs/tracking/) or [subscribe to real-time tracking updates](https://www.shipengine.com/docs/tracking/webhooks/) via webhooks. You can also create [custimized tracking pages](https://www.shipengine.com/docs/tracking/branded-tracking-page/) with your own branding so your customers will always know where their package is.   ## Compare Shipping Costs Across Carriers Make sure you ship as cost-effectively as possible by [comparing rates across carriers](https://www.shipengine.com/docs/rates/get-shipment-rates/) using the ShipEngine Rates API. Or if you don't know the full shipment details yet, then you can [get rate estimates](https://www.shipengine.com/docs/rates/estimate/) with limited address info.   ## Worldwide Address Validation ShipEngine supports [address validation](https://www.shipengine.com/docs/addresses/validation/) for virtually [every country on Earth](https://www.shipengine.com/docs/addresses/validation/countries/), including the United States, Canada, Great Britain, Australia, Germany, France, Norway, Spain, Sweden, Israel, Italy, and over 160 others. 
 *
 * The version of the OpenAPI document: 1.1.202403202303
 * Contact: sales@shipengine.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ContactDetails;
import com.konfigthis.client.model.DeletePickupByIdResponseBody;
import com.konfigthis.client.model.GetPickupByIdResponseBody;
import com.konfigthis.client.model.GetPickupsResponseBody;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.PartialAddress;
import com.konfigthis.client.model.Pickup;
import com.konfigthis.client.model.PickupWindow;
import com.konfigthis.client.model.PickupWindows;
import com.konfigthis.client.model.SchedulePickupResponseBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PackagePickupsApi
 */
@Disabled
public class PackagePickupsApiTest {

    private static PackagePickupsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PackagePickupsApi(apiClient);
    }

    /**
     * Get Pickup By ID
     *
     * Get Pickup By ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String pickupId = null;
        GetPickupByIdResponseBody response = api.getById(pickupId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Scheduled Pickups
     *
     * List all pickups that have been scheduled for this carrier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listScheduledPickupsTest() throws ApiException {
        String carrierId = null;
        String warehouseId = null;
        OffsetDateTime createdAtStart = null;
        OffsetDateTime createdAtEnd = null;
        Integer page = null;
        Integer pageSize = null;
        GetPickupsResponseBody response = api.listScheduledPickups()
                .carrierId(carrierId)
                .warehouseId(warehouseId)
                .createdAtStart(createdAtStart)
                .createdAtEnd(createdAtEnd)
                .page(page)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Schedule a Pickup
     *
     * Schedule a package pickup with a carrier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pickupTest() throws ApiException {
        String pickupId = null;
        List<String> labelIds = null;
        OffsetDateTime createdAt = null;
        OffsetDateTime cancelledAt = null;
        String carrierId = null;
        String confirmationNumber = null;
        String warehouseId = null;
        PartialAddress pickupAddress = null;
        ContactDetails contactDetails = null;
        String pickupNotes = null;
        PickupWindow pickupWindow = null;
        List<PickupWindows> pickupWindows = null;
        SchedulePickupResponseBody response = api.pickup()
                .pickupId(pickupId)
                .labelIds(labelIds)
                .createdAt(createdAt)
                .cancelledAt(cancelledAt)
                .carrierId(carrierId)
                .confirmationNumber(confirmationNumber)
                .warehouseId(warehouseId)
                .pickupAddress(pickupAddress)
                .contactDetails(contactDetails)
                .pickupNotes(pickupNotes)
                .pickupWindow(pickupWindow)
                .pickupWindows(pickupWindows)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Scheduled Pickup
     *
     * Delete a previously-scheduled pickup by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeScheduledPickupTest() throws ApiException {
        String pickupId = null;
        DeletePickupByIdResponseBody response = api.removeScheduledPickup(pickupId)
                .execute();
        // TODO: test validations
    }

}