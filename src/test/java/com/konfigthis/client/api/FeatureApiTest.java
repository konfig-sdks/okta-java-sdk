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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Feature;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeatureApi
 */
@Disabled
public class FeatureApiTest {

    private static FeatureApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FeatureApi(apiClient);
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createLifecycleSuccessTest() throws ApiException {
        String featureId = null;
        String lifecycle = null;
        String mode = null;
        Feature response = api.createLifecycleSuccess(featureId, lifecycle)
                .mode(mode)
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSuccessTest() throws ApiException {
        List<Feature> response = api.getSuccess()
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSuccessByIdTest() throws ApiException {
        String featureId = null;
        Feature response = api.getSuccessById(featureId)
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDependenciesTest() throws ApiException {
        String featureId = null;
        List<Feature> response = api.listDependencies(featureId)
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDependentsTest() throws ApiException {
        String featureId = null;
        List<Feature> response = api.listDependents(featureId)
                .execute();
        // TODO: test validations
    }

}
