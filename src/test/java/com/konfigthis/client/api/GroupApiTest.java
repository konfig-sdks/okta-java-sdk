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
import com.konfigthis.client.model.Application;
import com.konfigthis.client.model.AssignRoleRequest;
import com.konfigthis.client.model.CatalogApplication;
import com.konfigthis.client.model.Group;
import com.konfigthis.client.model.GroupProfile;
import com.konfigthis.client.model.GroupRule;
import com.konfigthis.client.model.GroupRuleAction;
import com.konfigthis.client.model.GroupRuleConditions;
import com.konfigthis.client.model.GroupRuleStatus;
import com.konfigthis.client.model.GroupType;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.Role;
import com.konfigthis.client.model.RoleType;
import com.konfigthis.client.model.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupApi
 */
@Disabled
public class GroupApiTest {

    private static GroupApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GroupApi(apiClient);
    }

    /**
     * Activate a group Rule
     *
     * Activates a specific group rule by id from your organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateRuleLifecycleTest() throws ApiException {
        String ruleId = null;
        api.activateRuleLifecycle(ruleId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add App Instance Target to App Administrator Role given to a Group
     *
     * Add App Instance Target to App Administrator Role given to a Group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAppInstanceTargetToAppAdminRoleGivenToGroupTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        String appName = null;
        String applicationId = null;
        api.addAppInstanceTargetToAppAdminRoleGivenToGroup(groupId, roleId, appName, applicationId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create Group Rule
     *
     * Creates a group rule to dynamically add users to the specified group if they match the condition
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addRuleTest() throws ApiException {
        GroupRuleAction actions = null;
        GroupRuleConditions conditions = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        GroupRuleStatus status = null;
        String type = null;
        GroupRule response = api.addRule()
                .actions(actions)
                .conditions(conditions)
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
     * Add User to Group
     *
     * Adds a user to a group with &#39;OKTA_GROUP&#39; type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserToGroupTest() throws ApiException {
        String groupId = null;
        String userId = null;
        api.addUserToGroup(groupId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Assigns a Role to a Group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignRoleToGroupTest() throws ApiException {
        String groupId = null;
        RoleType type = null;
        Boolean disableNotifications = null;
        Role response = api.assignRoleToGroup(groupId)
                .type(type)
                .disableNotifications(disableNotifications)
                .execute();
        // TODO: test validations
    }

    /**
     * Add Group
     *
     * Adds a new group with &#x60;OKTA_GROUP&#x60; type to your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewGroupTest() throws ApiException {
        Map<String, Object> embedded = null;
        Map<String, Object> links = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastMembershipUpdated = null;
        OffsetDateTime lastUpdated = null;
        List<String> objectClass = null;
        GroupProfile profile = null;
        GroupType type = null;
        Group response = api.createNewGroup()
                .embedded(embedded)
                .links(links)
                .created(created)
                .id(id)
                .lastMembershipUpdated(lastMembershipUpdated)
                .lastUpdated(lastUpdated)
                .objectClass(objectClass)
                .profile(profile)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Deactivate a group Rule
     *
     * Deactivates a specific group rule by id from your organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deactivateRuleLifecycleTest() throws ApiException {
        String ruleId = null;
        api.deactivateRuleLifecycle(ruleId)
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTargetGroupRolesCatalogAppsTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        String appName = null;
        api.deleteTargetGroupRolesCatalogApps(groupId, roleId, appName)
                .execute();
        // TODO: test validations
    }

    /**
     * List Group Members
     *
     * Enumerates all users that are a member of a group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enumerateGroupMembersTest() throws ApiException {
        String groupId = null;
        String after = null;
        Integer limit = null;
        List<User> response = api.enumerateGroupMembers(groupId)
                .after(after)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * List Group Rules
     *
     * Lists all group rules for your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllRulesTest() throws ApiException {
        Integer limit = null;
        String after = null;
        String search = null;
        String expand = null;
        List<GroupRule> response = api.getAllRules()
                .limit(limit)
                .after(after)
                .search(search)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Group Rule
     *
     * Fetches a specific group rule by id from your organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupRuleByIdTest() throws ApiException {
        String ruleId = null;
        String expand = null;
        GroupRule response = api.getGroupRuleById(ruleId)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleListTest() throws ApiException {
        String groupId = null;
        String expand = null;
        List<Role> response = api.getRoleList(groupId)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleSuccessTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        Role response = api.getRoleSuccess(groupId, roleId)
                .execute();
        // TODO: test validations
    }

    /**
     * Lists all App targets for an &#x60;APP_ADMIN&#x60; Role assigned to a Group. This methods return list may include full Applications or Instances. The response for an instance will have an &#x60;ID&#x60; value, while Application will not have an ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleTargetsCatalogAppsTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        String after = null;
        Integer limit = null;
        List<CatalogApplication> response = api.getRoleTargetsCatalogApps(groupId, roleId)
                .after(after)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * List Group Rules
     *
     * Fetches a group from your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRulesTest() throws ApiException {
        String groupId = null;
        Group response = api.getRules(groupId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Groups
     *
     * Enumerates groups in your organization with pagination. A subset of groups can be returned that match a supported filter expression or query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String q = null;
        String filter = null;
        String after = null;
        Integer limit = null;
        String expand = null;
        String search = null;
        List<Group> response = api.list()
                .q(q)
                .filter(filter)
                .after(after)
                .limit(limit)
                .expand(expand)
                .search(search)
                .execute();
        // TODO: test validations
    }

    /**
     * List Assigned Applications
     *
     * Enumerates all applications that are assigned to a group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAssignedAppsTest() throws ApiException {
        String groupId = null;
        String after = null;
        Integer limit = null;
        List<Application> response = api.listAssignedApps(groupId)
                .after(after)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRoleTargetsGroupsTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        String after = null;
        Integer limit = null;
        List<Group> response = api.listRoleTargetsGroups(groupId, roleId)
                .after(after)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove App Instance Target to App Administrator Role given to a Group
     *
     * Remove App Instance Target to App Administrator Role given to a Group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAppInstanceTargetToAppAdminRoleGivenToGroupTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        String appName = null;
        String applicationId = null;
        api.removeAppInstanceTargetToAppAdminRoleGivenToGroup(groupId, roleId, appName, applicationId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove Group
     *
     * Removes a group with &#x60;OKTA_GROUP&#x60; type from your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeOperationTest() throws ApiException {
        String groupId = null;
        api.removeOperation(groupId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a group Rule
     *
     * Removes a specific group rule by id from your organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeRuleByIdTest() throws ApiException {
        String ruleId = null;
        Boolean removeUsers = null;
        api.removeRuleById(ruleId)
                .removeUsers(removeUsers)
                .execute();
        // TODO: test validations
    }

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTargetGroupTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        String targetGroupId = null;
        api.removeTargetGroup(groupId, roleId, targetGroupId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove User from Group
     *
     * Removes a user from a group with &#39;OKTA_GROUP&#39; type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUserFromTest() throws ApiException {
        String groupId = null;
        String userId = null;
        api.removeUserFrom(groupId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unassigns a Role from a Group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unassignRoleTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        api.unassignRole(groupId, roleId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Group
     *
     * Updates the profile for a group with &#x60;OKTA_GROUP&#x60; type from your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProfileTest() throws ApiException {
        String groupId = null;
        Map<String, Object> embedded = null;
        Map<String, Object> links = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastMembershipUpdated = null;
        OffsetDateTime lastUpdated = null;
        List<String> objectClass = null;
        GroupProfile profile = null;
        GroupType type = null;
        Group response = api.updateProfile(groupId)
                .embedded(embedded)
                .links(links)
                .created(created)
                .id(id)
                .lastMembershipUpdated(lastMembershipUpdated)
                .lastUpdated(lastUpdated)
                .objectClass(objectClass)
                .profile(profile)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Success
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRolesCatalogAppsTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        String appName = null;
        api.updateRolesCatalogApps(groupId, roleId, appName)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a group rule. Only &#x60;INACTIVE&#x60; rules can be updated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRuleTest() throws ApiException {
        String ruleId = null;
        GroupRuleAction actions = null;
        GroupRuleConditions conditions = null;
        OffsetDateTime created = null;
        String id = null;
        OffsetDateTime lastUpdated = null;
        String name = null;
        GroupRuleStatus status = null;
        String type = null;
        GroupRule response = api.updateRule(ruleId)
                .actions(actions)
                .conditions(conditions)
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
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTargetGroupsRoleTest() throws ApiException {
        String groupId = null;
        String roleId = null;
        String targetGroupId = null;
        api.updateTargetGroupsRole(groupId, roleId, targetGroupId)
                .execute();
        // TODO: test validations
    }

}
