/*
 * Okta API
 * Allows customers to easily access the Okta API
 *
 * The version of the OpenAPI document: 2.16.0
 * Contact: devex-public@okta.com
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


import com.konfigthis.client.model.LogEvent;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LogApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LogApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public LogApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApiToken() == null) {
            throw new IllegalArgumentException("\"Authorization\" is required but no API key was provided. Please set \"Authorization\" with ApiClient#setApiToken(String).");
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

    private okhttp3.Call getListEventsCall(OffsetDateTime since, OffsetDateTime until, String filter, String q, Integer limit, String sortOrder, String after, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/logs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (since != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("since", since));
        }

        if (until != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("until", until));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (after != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("after", after));
        }

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

        String[] localVarAuthNames = new String[] { "api_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getListEventsValidateBeforeCall(OffsetDateTime since, OffsetDateTime until, String filter, String q, Integer limit, String sortOrder, String after, final ApiCallback _callback) throws ApiException {
        return getListEventsCall(since, until, filter, q, limit, sortOrder, after, _callback);

    }


    private ApiResponse<List<LogEvent>> getListEventsWithHttpInfo(OffsetDateTime since, OffsetDateTime until, String filter, String q, Integer limit, String sortOrder, String after) throws ApiException {
        okhttp3.Call localVarCall = getListEventsValidateBeforeCall(since, until, filter, q, limit, sortOrder, after, null);
        Type localVarReturnType = new TypeToken<List<LogEvent>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getListEventsAsync(OffsetDateTime since, OffsetDateTime until, String filter, String q, Integer limit, String sortOrder, String after, final ApiCallback<List<LogEvent>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getListEventsValidateBeforeCall(since, until, filter, q, limit, sortOrder, after, _callback);
        Type localVarReturnType = new TypeToken<List<LogEvent>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetListEventsRequestBuilder {
        private OffsetDateTime since;
        private OffsetDateTime until;
        private String filter;
        private String q;
        private Integer limit;
        private String sortOrder;
        private String after;

        private GetListEventsRequestBuilder() {
        }

        /**
         * Set since
         * @param since  (optional)
         * @return GetListEventsRequestBuilder
         */
        public GetListEventsRequestBuilder since(OffsetDateTime since) {
            this.since = since;
            return this;
        }
        
        /**
         * Set until
         * @param until  (optional)
         * @return GetListEventsRequestBuilder
         */
        public GetListEventsRequestBuilder until(OffsetDateTime until) {
            this.until = until;
            return this;
        }
        
        /**
         * Set filter
         * @param filter  (optional)
         * @return GetListEventsRequestBuilder
         */
        public GetListEventsRequestBuilder filter(String filter) {
            this.filter = filter;
            return this;
        }
        
        /**
         * Set q
         * @param q  (optional)
         * @return GetListEventsRequestBuilder
         */
        public GetListEventsRequestBuilder q(String q) {
            this.q = q;
            return this;
        }
        
        /**
         * Set limit
         * @param limit  (optional, default to 100)
         * @return GetListEventsRequestBuilder
         */
        public GetListEventsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set sortOrder
         * @param sortOrder  (optional, default to ASCENDING)
         * @return GetListEventsRequestBuilder
         */
        public GetListEventsRequestBuilder sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        
        /**
         * Set after
         * @param after  (optional)
         * @return GetListEventsRequestBuilder
         */
        public GetListEventsRequestBuilder after(String after) {
            this.after = after;
            return this;
        }
        
        /**
         * Build call for getListEvents
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getListEventsCall(since, until, filter, q, limit, sortOrder, after, _callback);
        }


        /**
         * Execute getListEvents request
         * @return List&lt;LogEvent&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public List<LogEvent> execute() throws ApiException {
            ApiResponse<List<LogEvent>> localVarResp = getListEventsWithHttpInfo(since, until, filter, q, limit, sortOrder, after);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getListEvents request with HTTP info returned
         * @return ApiResponse&lt;List&lt;LogEvent&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<LogEvent>> executeWithHttpInfo() throws ApiException {
            return getListEventsWithHttpInfo(since, until, filter, q, limit, sortOrder, after);
        }

        /**
         * Execute getListEvents request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<LogEvent>> _callback) throws ApiException {
            return getListEventsAsync(since, until, filter, q, limit, sortOrder, after, _callback);
        }
    }

    /**
     * Fetch a list of events from your Okta organization system log.
     * The Okta System Log API provides read access to your organization’s system log. This API provides more functionality than the Events API
     * @return GetListEventsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetListEventsRequestBuilder getListEvents() throws IllegalArgumentException {
        return new GetListEventsRequestBuilder();
    }
}
