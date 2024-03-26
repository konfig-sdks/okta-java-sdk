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
import java.time.OffsetDateTime;
import com.konfigthis.client.model.ThreatInsightConfiguration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ThreatInsightApi
 */
@Disabled
public class ThreatInsightApiTest {

    private static ThreatInsightApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ThreatInsightApi(apiClient);
    }

    /**
     * Gets current ThreatInsight configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentConfigurationTest() throws ApiException {
        ThreatInsightConfiguration response = api.getCurrentConfiguration()
                .execute();
        // TODO: test validations
    }

    /**
     * Updates ThreatInsight configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConfigurationTest() throws ApiException {
        Map<String, Object> links = null;
        String action = null;
        OffsetDateTime created = null;
        List<String> excludeZones = null;
        OffsetDateTime lastUpdated = null;
        ThreatInsightConfiguration response = api.updateConfiguration()
                .links(links)
                .action(action)
                .created(created)
                .excludeZones(excludeZones)
                .lastUpdated(lastUpdated)
                .execute();
        // TODO: test validations
    }

}
