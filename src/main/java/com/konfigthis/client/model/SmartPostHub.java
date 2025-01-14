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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The possible smart post hub values
 */
@JsonAdapter(SmartPostHub.Adapter.class)public enum SmartPostHub {
  
  NONE("none"),
  
  ALLENTOWN_PA("allentown_pa"),
  
  ATLANTA_GA("atlanta_ga"),
  
  BALTIMORE_MD("baltimore_md"),
  
  CHARLOTTE_NC("charlotte_nc"),
  
  CHINO_CA("chino_ca"),
  
  DALLAS_TX("dallas_tx"),
  
  DENVER_CO("denver_co"),
  
  DETROIT_MI("detroit_mi"),
  
  EDISON_NJ("edison_nj"),
  
  GROVE_CITY_OH("grove_city_oh"),
  
  GROVEPORT_OH("groveport_oh"),
  
  HOUSTON_TX("houston_tx"),
  
  INDIANAPOLIS_IN("indianapolis_in"),
  
  KANSAS_CITY_KS("kansas_city_ks"),
  
  LOS_ANGELES_CA("los_angeles_ca"),
  
  MARTINSBURG_WV("martinsburg_wv"),
  
  MEMPHIS_TN("memphis_tn"),
  
  MINNEAPOLIS_MN("minneapolis_mn"),
  
  NEW_BERLIN_WI("new_berlin_wi"),
  
  NORTHBOROUGH_MA("northborough_ma"),
  
  ORLANDO_FL("orlando_fl"),
  
  PHONEIX_AZ("phoneix_az"),
  
  PITTSBURGH_PA("pittsburgh_pa"),
  
  RENO_NV("reno_nv"),
  
  SACRAMENTO_CA("sacramento_ca"),
  
  SALT_LAKE_CITY_UT("salt_lake_city_ut"),
  
  SEATTLE_WA("seattle_wa"),
  
  ST_LOUIS_MO("st_louis_mo"),
  
  WINDSOR_CT("windsor_ct"),
  
  NEWARK_NY("newark_ny"),
  
  SOUTH_BRUNSWICK_NJ("south_brunswick_nj"),
  
  SCRANTON_PA("scranton_pa"),
  
  WHEELING_IL("wheeling_il");

  private String value;

  SmartPostHub(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SmartPostHub fromValue(String value) {
    for (SmartPostHub b : SmartPostHub.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SmartPostHub> {
    @Override
    public void write(final JsonWriter jsonWriter, final SmartPostHub enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SmartPostHub read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SmartPostHub.fromValue(value);
    }
  }
}

