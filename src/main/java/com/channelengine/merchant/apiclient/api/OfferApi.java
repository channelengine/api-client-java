/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * OpenAPI spec version: 2.6.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.api;

import com.channelengine.merchant.apiclient.ApiCallback;
import com.channelengine.merchant.apiclient.ApiClient;
import com.channelengine.merchant.apiclient.ApiException;
import com.channelengine.merchant.apiclient.ApiResponse;
import com.channelengine.merchant.apiclient.Configuration;
import com.channelengine.merchant.apiclient.Pair;
import com.channelengine.merchant.apiclient.ProgressRequestBody;
import com.channelengine.merchant.apiclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.channelengine.merchant.apiclient.model.MerchantStockPriceUpdateRequest;
import com.channelengine.merchant.apiclient.model.SingleOfCollectionsDictionary2Generic;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfferApi {
    private ApiClient apiClient;

    public OfferApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OfferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for offerStockPriceUpdate
     * @param updates References to the products that should be updated, and the new values  for the stock or price fields. It is possible to supply only one of the two fields  or both. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call offerStockPriceUpdateCall(List<MerchantStockPriceUpdateRequest> updates, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updates;

        // create path and map variables
        String localVarPath = "/v2/offer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call offerStockPriceUpdateValidateBeforeCall(List<MerchantStockPriceUpdateRequest> updates, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'updates' is set
        if (updates == null) {
            throw new ApiException("Missing the required parameter 'updates' when calling offerStockPriceUpdate(Async)");
        }
        

        com.squareup.okhttp.Call call = offerStockPriceUpdateCall(updates, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update stock or price.
     * 
     * @param updates References to the products that should be updated, and the new values  for the stock or price fields. It is possible to supply only one of the two fields  or both. (required)
     * @return SingleOfCollectionsDictionary2Generic
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SingleOfCollectionsDictionary2Generic offerStockPriceUpdate(List<MerchantStockPriceUpdateRequest> updates) throws ApiException {
        ApiResponse<SingleOfCollectionsDictionary2Generic> resp = offerStockPriceUpdateWithHttpInfo(updates);
        return resp.getData();
    }

    /**
     * Update stock or price.
     * 
     * @param updates References to the products that should be updated, and the new values  for the stock or price fields. It is possible to supply only one of the two fields  or both. (required)
     * @return ApiResponse&lt;SingleOfCollectionsDictionary2Generic&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SingleOfCollectionsDictionary2Generic> offerStockPriceUpdateWithHttpInfo(List<MerchantStockPriceUpdateRequest> updates) throws ApiException {
        com.squareup.okhttp.Call call = offerStockPriceUpdateValidateBeforeCall(updates, null, null);
        Type localVarReturnType = new TypeToken<SingleOfCollectionsDictionary2Generic>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update stock or price. (asynchronously)
     * 
     * @param updates References to the products that should be updated, and the new values  for the stock or price fields. It is possible to supply only one of the two fields  or both. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call offerStockPriceUpdateAsync(List<MerchantStockPriceUpdateRequest> updates, final ApiCallback<SingleOfCollectionsDictionary2Generic> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = offerStockPriceUpdateValidateBeforeCall(updates, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SingleOfCollectionsDictionary2Generic>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
