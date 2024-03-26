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
import com.konfigthis.client.model.InlineHook;
import com.konfigthis.client.model.InlineHookChannel;
import com.konfigthis.client.model.InlineHookResponse;
import com.konfigthis.client.model.InlineHookStatus;
import com.konfigthis.client.model.InlineHookType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InlineHookApi
 */
@Disabled
public class InlineHookApiTest {

    private static InlineHookApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new InlineHookApi(apiClient);
    }

    /**
     * Activates the Inline Hook matching the provided id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateLifecycleTest() throws ApiException {
        String inlineHookId = null;
        InlineHook response = api.activateLifecycle(inlineHookId)
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSuccessTest() throws ApiException {
        String version = null;
        Map<String, Object> links = null;
        InlineHookChannel channel = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        InlineHookStatus status = null;
        InlineHookType type = null;
        InlineHook response = api.createSuccess()
                .version(version)
                .links(links)
                .channel(channel)
                .created(created)
                .id(id)
                .lastUpdated(lastUpdated)
                .name(name)
                .status(status)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Deactivates the Inline Hook matching the provided id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deactivateLifecycleTest() throws ApiException {
        String inlineHookId = null;
        InlineHook response = api.deactivateLifecycle(inlineHookId)
                .execute();
        // TODO: test validations
    }

    /**
     * Deletes the Inline Hook matching the provided id. Once deleted, the Inline Hook is unrecoverable. As a safety precaution, only Inline Hooks with a status of INACTIVE are eligible for deletion.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMatchingByIdTest() throws ApiException {
        String inlineHookId = null;
        api.deleteMatchingById(inlineHookId)
                .execute();
        // TODO: test validations
    }

    /**
     * Executes the Inline Hook matching the provided inlineHookId using the request body as the input. This will send the provided data through the Channel and return a response if it matches the correct data contract. This execution endpoint should only be used for testing purposes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executeWithInputTest() throws ApiException {
        String inlineHookId = null;
        InlineHookResponse response = api.executeWithInput(inlineHookId)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets an inline hook by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String inlineHookId = null;
        InlineHook response = api.getById(inlineHookId)
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
        String type = null;
        List<InlineHook> response = api.getSuccess()
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates an inline hook by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        String inlineHookId = null;
        String version = null;
        Map<String, Object> links = null;
        InlineHookChannel channel = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        InlineHookStatus status = null;
        InlineHookType type = null;
        InlineHook response = api.updateById(inlineHookId)
                .version(version)
                .links(links)
                .channel(channel)
                .created(created)
                .id(id)
                .lastUpdated(lastUpdated)
                .name(name)
                .status(status)
                .type(type)
                .execute();
        // TODO: test validations
    }

}
