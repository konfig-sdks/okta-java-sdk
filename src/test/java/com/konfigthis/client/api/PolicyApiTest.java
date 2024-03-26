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
import com.konfigthis.client.model.Policy;
import com.konfigthis.client.model.PolicyRule;
import com.konfigthis.client.model.PolicyRuleActions;
import com.konfigthis.client.model.PolicyRuleConditions;
import com.konfigthis.client.model.PolicyType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PolicyApi
 */
@Disabled
public class PolicyApiTest {

    private static PolicyApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PolicyApi(apiClient);
    }

    /**
     * Activates a policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateLifecycleTest() throws ApiException {
        String policyId = null;
        api.activateLifecycle(policyId)
                .execute();
        // TODO: test validations
    }

    /**
     * Activates a policy rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateRuleLifecycleTest() throws ApiException {
        String policyId = null;
        String ruleId = null;
        api.activateRuleLifecycle(policyId, ruleId)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewPolicyTest() throws ApiException {
        String description = null;
        Map<String, Object> embedded = null;
        Map<String, Object> links = null;
        PolicyRuleConditions conditions = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        Integer priority = null;
        String status = null;
        Boolean system = null;
        PolicyType type = null;
        Boolean activate = null;
        Policy response = api.createNewPolicy()
                .description(description)
                .embedded(embedded)
                .links(links)
                .conditions(conditions)
                .created(created)
                .id(id)
                .lastUpdated(lastUpdated)
                .name(name)
                .priority(priority)
                .status(status)
                .system(system)
                .type(type)
                .activate(activate)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a policy rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRuleTest() throws ApiException {
        String policyId = null;
        PolicyRuleActions actions = null;
        PolicyRuleConditions conditions = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        Integer priority = null;
        String status = null;
        Boolean system = null;
        String type = null;
        PolicyRule response = api.createRule(policyId)
                .actions(actions)
                .conditions(conditions)
                .created(created)
                .id(id)
                .lastUpdated(lastUpdated)
                .name(name)
                .priority(priority)
                .status(status)
                .system(system)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Deactivates a policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deactivateLifecycleTest() throws ApiException {
        String policyId = null;
        api.deactivateLifecycle(policyId)
                .execute();
        // TODO: test validations
    }

    /**
     * Deactivates a policy rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deactivateRuleLifecycleTest() throws ApiException {
        String policyId = null;
        String ruleId = null;
        api.deactivateRuleLifecycle(policyId, ruleId)
                .execute();
        // TODO: test validations
    }

    /**
     * Enumerates all policy rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enumerateRulesTest() throws ApiException {
        String policyId = null;
        List<PolicyRule> response = api.enumerateRules(policyId)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets all policies with the specified type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllWithTypeTest() throws ApiException {
        String type = null;
        String status = null;
        String expand = null;
        List<Policy> response = api.getAllWithType(type)
                .status(status)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets a policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPolicyTest() throws ApiException {
        String policyId = null;
        String expand = null;
        Policy response = api.getPolicy(policyId)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets a policy rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPolicyRuleTest() throws ApiException {
        String policyId = null;
        String ruleId = null;
        PolicyRule response = api.getPolicyRule(policyId, ruleId)
                .execute();
        // TODO: test validations
    }

    /**
     * Removes a policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removePolicyOperationTest() throws ApiException {
        String policyId = null;
        api.removePolicyOperation(policyId)
                .execute();
        // TODO: test validations
    }

    /**
     * Removes a policy rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeRuleTest() throws ApiException {
        String policyId = null;
        String ruleId = null;
        api.removeRule(policyId, ruleId)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOperationTest() throws ApiException {
        String policyId = null;
        String description = null;
        Map<String, Object> embedded = null;
        Map<String, Object> links = null;
        PolicyRuleConditions conditions = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        Integer priority = null;
        String status = null;
        Boolean system = null;
        PolicyType type = null;
        Policy response = api.updateOperation(policyId)
                .description(description)
                .embedded(embedded)
                .links(links)
                .conditions(conditions)
                .created(created)
                .id(id)
                .lastUpdated(lastUpdated)
                .name(name)
                .priority(priority)
                .status(status)
                .system(system)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a policy rule.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRuleTest() throws ApiException {
        String policyId = null;
        String ruleId = null;
        PolicyRuleActions actions = null;
        PolicyRuleConditions conditions = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        Integer priority = null;
        String status = null;
        Boolean system = null;
        String type = null;
        PolicyRule response = api.updateRule(policyId, ruleId)
                .actions(actions)
                .conditions(conditions)
                .created(created)
                .id(id)
                .lastUpdated(lastUpdated)
                .name(name)
                .priority(priority)
                .status(status)
                .system(system)
                .type(type)
                .execute();
        // TODO: test validations
    }

}
