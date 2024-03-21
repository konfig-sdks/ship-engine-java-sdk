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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ConnectInsurerRequestBody;
import com.konfigthis.client.model.MonetaryValue;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InsuranceApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InsuranceApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public InsuranceApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApiKey() == null) {
            throw new IllegalArgumentException("\"API-Key\" is required but no API key was provided. Please set \"API-Key\" with ApiClient#setApiKey(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call autoFundAccountCall(MonetaryValue monetaryValue, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = monetaryValue;

        // create path and map variables
        String localVarPath = "/v1/insurance/shipsurance/add_funds";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call autoFundAccountValidateBeforeCall(MonetaryValue monetaryValue, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'monetaryValue' is set
        if (monetaryValue == null) {
            throw new ApiException("Missing the required parameter 'monetaryValue' when calling autoFundAccount(Async)");
        }

        return autoFundAccountCall(monetaryValue, _callback);

    }


    private ApiResponse<MonetaryValue> autoFundAccountWithHttpInfo(MonetaryValue monetaryValue) throws ApiException {
        okhttp3.Call localVarCall = autoFundAccountValidateBeforeCall(monetaryValue, null);
        Type localVarReturnType = new TypeToken<MonetaryValue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call autoFundAccountAsync(MonetaryValue monetaryValue, final ApiCallback<MonetaryValue> _callback) throws ApiException {

        okhttp3.Call localVarCall = autoFundAccountValidateBeforeCall(monetaryValue, _callback);
        Type localVarReturnType = new TypeToken<MonetaryValue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AutoFundAccountRequestBuilder {
        private final String currency;
        private final Double amount;

        private AutoFundAccountRequestBuilder(String currency, Double amount) {
            this.currency = currency;
            this.amount = amount;
        }

        /**
         * Build call for autoFundAccount
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            MonetaryValue monetaryValue = buildBodyParams();
            return autoFundAccountCall(monetaryValue, _callback);
        }

        private MonetaryValue buildBodyParams() {
            MonetaryValue monetaryValue = new MonetaryValue();
            monetaryValue.currency(this.currency);
            monetaryValue.amount(this.amount);
            return monetaryValue;
        }

        /**
         * Execute autoFundAccount request
         * @return MonetaryValue
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
         </table>
         */
        public MonetaryValue execute() throws ApiException {
            MonetaryValue monetaryValue = buildBodyParams();
            ApiResponse<MonetaryValue> localVarResp = autoFundAccountWithHttpInfo(monetaryValue);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute autoFundAccount request with HTTP info returned
         * @return ApiResponse&lt;MonetaryValue&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<MonetaryValue> executeWithHttpInfo() throws ApiException {
            MonetaryValue monetaryValue = buildBodyParams();
            return autoFundAccountWithHttpInfo(monetaryValue);
        }

        /**
         * Execute autoFundAccount request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<MonetaryValue> _callback) throws ApiException {
            MonetaryValue monetaryValue = buildBodyParams();
            return autoFundAccountAsync(monetaryValue, _callback);
        }
    }

    /**
     * Add Funds To Insurance
     * You may need to auto fund your account from time to time. For example, if you don&#39;t normally ship items over $100, and may want to add funds to insurance rather than keeping the account funded. 
     * @param monetaryValue  (required)
     * @return AutoFundAccountRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
     </table>
     */
    public AutoFundAccountRequestBuilder autoFundAccount(String currency, Double amount) throws IllegalArgumentException {
        if (currency == null) throw new IllegalArgumentException("\"currency\" is required but got null");
            

        if (amount == null) throw new IllegalArgumentException("\"amount\" is required but got null");
        return new AutoFundAccountRequestBuilder(currency, amount);
    }
    private okhttp3.Call getFundsBalanceCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/insurance/shipsurance/balance";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getFundsBalanceValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getFundsBalanceCall(_callback);

    }


    private ApiResponse<MonetaryValue> getFundsBalanceWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getFundsBalanceValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<MonetaryValue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getFundsBalanceAsync(final ApiCallback<MonetaryValue> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFundsBalanceValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<MonetaryValue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetFundsBalanceRequestBuilder {

        private GetFundsBalanceRequestBuilder() {
        }

        /**
         * Build call for getFundsBalance
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getFundsBalanceCall(_callback);
        }


        /**
         * Execute getFundsBalance request
         * @return MonetaryValue
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
         </table>
         */
        public MonetaryValue execute() throws ApiException {
            ApiResponse<MonetaryValue> localVarResp = getFundsBalanceWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getFundsBalance request with HTTP info returned
         * @return ApiResponse&lt;MonetaryValue&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<MonetaryValue> executeWithHttpInfo() throws ApiException {
            return getFundsBalanceWithHttpInfo();
        }

        /**
         * Execute getFundsBalance request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<MonetaryValue> _callback) throws ApiException {
            return getFundsBalanceAsync(_callback);
        }
    }

    /**
     * Get Insurance Funds Balance
     * Retrieve the balance of your Shipsurance account.
     * @return GetFundsBalanceRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was a success. </td><td>  -  </td></tr>
     </table>
     */
    public GetFundsBalanceRequestBuilder getFundsBalance() throws IllegalArgumentException {
        return new GetFundsBalanceRequestBuilder();
    }
    private okhttp3.Call insurerCall(ConnectInsurerRequestBody connectInsurerRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = connectInsurerRequestBody;

        // create path and map variables
        String localVarPath = "/v1/connections/insurance/shipsurance";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call insurerValidateBeforeCall(ConnectInsurerRequestBody connectInsurerRequestBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'connectInsurerRequestBody' is set
        if (connectInsurerRequestBody == null) {
            throw new ApiException("Missing the required parameter 'connectInsurerRequestBody' when calling insurer(Async)");
        }

        return insurerCall(connectInsurerRequestBody, _callback);

    }


    private ApiResponse<Object> insurerWithHttpInfo(ConnectInsurerRequestBody connectInsurerRequestBody) throws ApiException {
        okhttp3.Call localVarCall = insurerValidateBeforeCall(connectInsurerRequestBody, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call insurerAsync(ConnectInsurerRequestBody connectInsurerRequestBody, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = insurerValidateBeforeCall(connectInsurerRequestBody, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class InsurerRequestBuilder {
        private final String email;
        private final String policyId;

        private InsurerRequestBuilder(String email, String policyId) {
            this.email = email;
            this.policyId = policyId;
        }

        /**
         * Build call for insurer
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ConnectInsurerRequestBody connectInsurerRequestBody = buildBodyParams();
            return insurerCall(connectInsurerRequestBody, _callback);
        }

        private ConnectInsurerRequestBody buildBodyParams() {
            ConnectInsurerRequestBody connectInsurerRequestBody = new ConnectInsurerRequestBody();
            connectInsurerRequestBody.email(this.email);
            connectInsurerRequestBody.policyId(this.policyId);
            return connectInsurerRequestBody;
        }

        /**
         * Execute insurer request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ConnectInsurerRequestBody connectInsurerRequestBody = buildBodyParams();
            ApiResponse<Object> localVarResp = insurerWithHttpInfo(connectInsurerRequestBody);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute insurer request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            ConnectInsurerRequestBody connectInsurerRequestBody = buildBodyParams();
            return insurerWithHttpInfo(connectInsurerRequestBody);
        }

        /**
         * Execute insurer request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            ConnectInsurerRequestBody connectInsurerRequestBody = buildBodyParams();
            return insurerAsync(connectInsurerRequestBody, _callback);
        }
    }

    /**
     * Connect a Shipsurance Account
     * Connect a Shipsurance Account
     * @param connectInsurerRequestBody  (required)
     * @return InsurerRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
     </table>
     */
    public InsurerRequestBuilder insurer(String email, String policyId) throws IllegalArgumentException {
        if (email == null) throw new IllegalArgumentException("\"email\" is required but got null");
            if (email != null && email.length() < 1) {
              throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 1.");
            }

        if (policyId == null) throw new IllegalArgumentException("\"policyId\" is required but got null");
            if (policyId != null && policyId.length() < 1) {
              throw new IllegalArgumentException("Invalid value for policyId. Length must be greater than or equal to 1.");
            }

        return new InsurerRequestBuilder(email, policyId);
    }
    private okhttp3.Call insurer_0Call(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/connections/insurance/shipsurance";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call insurer_0ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return insurer_0Call(_callback);

    }


    private ApiResponse<Object> insurer_0WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = insurer_0ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call insurer_0Async(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = insurer_0ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class Insurer0RequestBuilder {

        private Insurer0RequestBuilder() {
        }

        /**
         * Build call for insurer_0
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return insurer_0Call(_callback);
        }


        /**
         * Execute insurer_0 request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = insurer_0WithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute insurer_0 request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return insurer_0WithHttpInfo();
        }

        /**
         * Execute insurer_0 request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return insurer_0Async(_callback);
        }
    }

    /**
     * Disconnect a Shipsurance Account
     * Disconnect a Shipsurance Account
     * @return Insurer0RequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was a success </td><td>  -  </td></tr>
     </table>
     */
    public Insurer0RequestBuilder insurer_0() throws IllegalArgumentException {
        return new Insurer0RequestBuilder();
    }
}
