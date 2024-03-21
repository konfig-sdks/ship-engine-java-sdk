package com.konfigthis.client;

import com.konfigthis.client.api.AccountApi;
import com.konfigthis.client.api.AddressesApi;
import com.konfigthis.client.api.BatchesApi;
import com.konfigthis.client.api.CarrierAccountsApi;
import com.konfigthis.client.api.CarriersApi;
import com.konfigthis.client.api.DownloadsApi;
import com.konfigthis.client.api.InsuranceApi;
import com.konfigthis.client.api.LabelsApi;
import com.konfigthis.client.api.ManifestsApi;
import com.konfigthis.client.api.PackagePickupsApi;
import com.konfigthis.client.api.PackageTypesApi;
import com.konfigthis.client.api.RatesApi;
import com.konfigthis.client.api.ServicePointsApi;
import com.konfigthis.client.api.ShipmentsApi;
import com.konfigthis.client.api.TagsApi;
import com.konfigthis.client.api.TokensApi;
import com.konfigthis.client.api.TrackingApi;
import com.konfigthis.client.api.WarehousesApi;
import com.konfigthis.client.api.WebhooksApi;

public class ShipEngine {
    private ApiClient apiClient;
    public final AccountApi account;
    public final AddressesApi addresses;
    public final BatchesApi batches;
    public final CarrierAccountsApi carrierAccounts;
    public final CarriersApi carriers;
    public final DownloadsApi downloads;
    public final InsuranceApi insurance;
    public final LabelsApi labels;
    public final ManifestsApi manifests;
    public final PackagePickupsApi packagePickups;
    public final PackageTypesApi packageTypes;
    public final RatesApi rates;
    public final ServicePointsApi servicePoints;
    public final ShipmentsApi shipments;
    public final TagsApi tags;
    public final TokensApi tokens;
    public final TrackingApi tracking;
    public final WarehousesApi warehouses;
    public final WebhooksApi webhooks;

    public ShipEngine() {
        this(null);
    }

    public ShipEngine(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.account = new AccountApi(this.apiClient);
        this.addresses = new AddressesApi(this.apiClient);
        this.batches = new BatchesApi(this.apiClient);
        this.carrierAccounts = new CarrierAccountsApi(this.apiClient);
        this.carriers = new CarriersApi(this.apiClient);
        this.downloads = new DownloadsApi(this.apiClient);
        this.insurance = new InsuranceApi(this.apiClient);
        this.labels = new LabelsApi(this.apiClient);
        this.manifests = new ManifestsApi(this.apiClient);
        this.packagePickups = new PackagePickupsApi(this.apiClient);
        this.packageTypes = new PackageTypesApi(this.apiClient);
        this.rates = new RatesApi(this.apiClient);
        this.servicePoints = new ServicePointsApi(this.apiClient);
        this.shipments = new ShipmentsApi(this.apiClient);
        this.tags = new TagsApi(this.apiClient);
        this.tokens = new TokensApi(this.apiClient);
        this.tracking = new TrackingApi(this.apiClient);
        this.warehouses = new WarehousesApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}
