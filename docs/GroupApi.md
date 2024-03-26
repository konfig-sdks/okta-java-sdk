# GroupApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateRuleLifecycle**](GroupApi.md#activateRuleLifecycle) | **POST** /api/v1/groups/rules/{ruleId}/lifecycle/activate | Activate a group Rule |
| [**addAppInstanceTargetToAppAdminRoleGivenToGroup**](GroupApi.md#addAppInstanceTargetToAppAdminRoleGivenToGroup) | **PUT** /api/v1/groups/{groupId}/roles/{roleId}/targets/catalog/apps/{appName}/{applicationId} | Add App Instance Target to App Administrator Role given to a Group |
| [**addRule**](GroupApi.md#addRule) | **POST** /api/v1/groups/rules | Create Group Rule |
| [**addUserToGroup**](GroupApi.md#addUserToGroup) | **PUT** /api/v1/groups/{groupId}/users/{userId} | Add User to Group |
| [**assignRoleToGroup**](GroupApi.md#assignRoleToGroup) | **POST** /api/v1/groups/{groupId}/roles |  |
| [**createNewGroup**](GroupApi.md#createNewGroup) | **POST** /api/v1/groups | Add Group |
| [**deactivateRuleLifecycle**](GroupApi.md#deactivateRuleLifecycle) | **POST** /api/v1/groups/rules/{ruleId}/lifecycle/deactivate | Deactivate a group Rule |
| [**deleteTargetGroupRolesCatalogApps**](GroupApi.md#deleteTargetGroupRolesCatalogApps) | **DELETE** /api/v1/groups/{groupId}/roles/{roleId}/targets/catalog/apps/{appName} |  |
| [**enumerateGroupMembers**](GroupApi.md#enumerateGroupMembers) | **GET** /api/v1/groups/{groupId}/users | List Group Members |
| [**getAllRules**](GroupApi.md#getAllRules) | **GET** /api/v1/groups/rules | List Group Rules |
| [**getGroupRuleById**](GroupApi.md#getGroupRuleById) | **GET** /api/v1/groups/rules/{ruleId} | Get Group Rule |
| [**getRoleList**](GroupApi.md#getRoleList) | **GET** /api/v1/groups/{groupId}/roles |  |
| [**getRoleSuccess**](GroupApi.md#getRoleSuccess) | **GET** /api/v1/groups/{groupId}/roles/{roleId} |  |
| [**getRoleTargetsCatalogApps**](GroupApi.md#getRoleTargetsCatalogApps) | **GET** /api/v1/groups/{groupId}/roles/{roleId}/targets/catalog/apps |  |
| [**getRules**](GroupApi.md#getRules) | **GET** /api/v1/groups/{groupId} | List Group Rules |
| [**list**](GroupApi.md#list) | **GET** /api/v1/groups | List Groups |
| [**listAssignedApps**](GroupApi.md#listAssignedApps) | **GET** /api/v1/groups/{groupId}/apps | List Assigned Applications |
| [**listRoleTargetsGroups**](GroupApi.md#listRoleTargetsGroups) | **GET** /api/v1/groups/{groupId}/roles/{roleId}/targets/groups |  |
| [**removeAppInstanceTargetToAppAdminRoleGivenToGroup**](GroupApi.md#removeAppInstanceTargetToAppAdminRoleGivenToGroup) | **DELETE** /api/v1/groups/{groupId}/roles/{roleId}/targets/catalog/apps/{appName}/{applicationId} | Remove App Instance Target to App Administrator Role given to a Group |
| [**removeOperation**](GroupApi.md#removeOperation) | **DELETE** /api/v1/groups/{groupId} | Remove Group |
| [**removeRuleById**](GroupApi.md#removeRuleById) | **DELETE** /api/v1/groups/rules/{ruleId} | Delete a group Rule |
| [**removeTargetGroup**](GroupApi.md#removeTargetGroup) | **DELETE** /api/v1/groups/{groupId}/roles/{roleId}/targets/groups/{targetGroupId} |  |
| [**removeUserFrom**](GroupApi.md#removeUserFrom) | **DELETE** /api/v1/groups/{groupId}/users/{userId} | Remove User from Group |
| [**unassignRole**](GroupApi.md#unassignRole) | **DELETE** /api/v1/groups/{groupId}/roles/{roleId} |  |
| [**updateProfile**](GroupApi.md#updateProfile) | **PUT** /api/v1/groups/{groupId} | Update Group |
| [**updateRolesCatalogApps**](GroupApi.md#updateRolesCatalogApps) | **PUT** /api/v1/groups/{groupId}/roles/{roleId}/targets/catalog/apps/{appName} |  |
| [**updateRule**](GroupApi.md#updateRule) | **PUT** /api/v1/groups/rules/{ruleId} |  |
| [**updateTargetGroupsRole**](GroupApi.md#updateTargetGroupsRole) | **PUT** /api/v1/groups/{groupId}/roles/{roleId}/targets/groups/{targetGroupId} |  |


<a name="activateRuleLifecycle"></a>
# **activateRuleLifecycle**
> activateRuleLifecycle(ruleId).execute();

Activate a group Rule

Activates a specific group rule by id from your organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String ruleId = "ruleId_example";
    try {
      client
              .group
              .activateRuleLifecycle(ruleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#activateRuleLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .activateRuleLifecycle(ruleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#activateRuleLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="addAppInstanceTargetToAppAdminRoleGivenToGroup"></a>
# **addAppInstanceTargetToAppAdminRoleGivenToGroup**
> addAppInstanceTargetToAppAdminRoleGivenToGroup(groupId, roleId, appName, applicationId).execute();

Add App Instance Target to App Administrator Role given to a Group

Add App Instance Target to App Administrator Role given to a Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    String appName = "appName_example";
    String applicationId = "applicationId_example";
    try {
      client
              .group
              .addAppInstanceTargetToAppAdminRoleGivenToGroup(groupId, roleId, appName, applicationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#addAppInstanceTargetToAppAdminRoleGivenToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .addAppInstanceTargetToAppAdminRoleGivenToGroup(groupId, roleId, appName, applicationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#addAppInstanceTargetToAppAdminRoleGivenToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |
| **appName** | **String**|  | |
| **applicationId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="addRule"></a>
# **addRule**
> GroupRule addRule(groupRule).execute();

Create Group Rule

Creates a group rule to dynamically add users to the specified group if they match the condition

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    GroupRuleAction actions = new GroupRuleAction();
    GroupRuleConditions conditions = new GroupRuleConditions();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    GroupRuleStatus status = GroupRuleStatus.fromValue("ACTIVE");
    String type = "type_example";
    try {
      GroupRule result = client
              .group
              .addRule()
              .actions(actions)
              .conditions(conditions)
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getActions());
      System.out.println(result.getConditions());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#addRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupRule> response = client
              .group
              .addRule()
              .actions(actions)
              .conditions(conditions)
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#addRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupRule** | [**GroupRule**](GroupRule.md)|  | |

### Return type

[**GroupRule**](GroupRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addUserToGroup"></a>
# **addUserToGroup**
> addUserToGroup(groupId, userId).execute();

Add User to Group

Adds a user to a group with &#39;OKTA_GROUP&#39; type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String userId = "userId_example";
    try {
      client
              .group
              .addUserToGroup(groupId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#addUserToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .addUserToGroup(groupId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#addUserToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **userId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="assignRoleToGroup"></a>
# **assignRoleToGroup**
> Role assignRoleToGroup(groupId, assignRoleRequest).disableNotifications(disableNotifications).execute();



Assigns a Role to a Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    RoleType type = RoleType.fromValue("SUPER_ADMIN");
    Boolean disableNotifications = true;
    try {
      Role result = client
              .group
              .assignRoleToGroup(groupId)
              .type(type)
              .disableNotifications(disableNotifications)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getAssignmentType());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLabel());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#assignRoleToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Role> response = client
              .group
              .assignRoleToGroup(groupId)
              .type(type)
              .disableNotifications(disableNotifications)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#assignRoleToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **assignRoleRequest** | [**AssignRoleRequest**](AssignRoleRequest.md)|  | |
| **disableNotifications** | **Boolean**|  | [optional] |

### Return type

[**Role**](Role.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **201** | Success |  -  |

<a name="createNewGroup"></a>
# **createNewGroup**
> Group createNewGroup(group).execute();

Add Group

Adds a new group with &#x60;OKTA_GROUP&#x60; type to your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastMembershipUpdated = OffsetDateTime.now();
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    List<String> objectClass = Arrays.asList();
    GroupProfile profile = new GroupProfile();
    GroupType type = GroupType.fromValue("OKTA_GROUP");
    try {
      Group result = client
              .group
              .createNewGroup()
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
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastMembershipUpdated());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getObjectClass());
      System.out.println(result.getProfile());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#createNewGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Group> response = client
              .group
              .createNewGroup()
              .embedded(embedded)
              .links(links)
              .created(created)
              .id(id)
              .lastMembershipUpdated(lastMembershipUpdated)
              .lastUpdated(lastUpdated)
              .objectClass(objectClass)
              .profile(profile)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#createNewGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **group** | [**Group**](Group.md)|  | |

### Return type

[**Group**](Group.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deactivateRuleLifecycle"></a>
# **deactivateRuleLifecycle**
> deactivateRuleLifecycle(ruleId).execute();

Deactivate a group Rule

Deactivates a specific group rule by id from your organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String ruleId = "ruleId_example";
    try {
      client
              .group
              .deactivateRuleLifecycle(ruleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#deactivateRuleLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .deactivateRuleLifecycle(ruleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#deactivateRuleLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="deleteTargetGroupRolesCatalogApps"></a>
# **deleteTargetGroupRolesCatalogApps**
> deleteTargetGroupRolesCatalogApps(groupId, roleId, appName).execute();



Success

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    String appName = "appName_example";
    try {
      client
              .group
              .deleteTargetGroupRolesCatalogApps(groupId, roleId, appName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#deleteTargetGroupRolesCatalogApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .deleteTargetGroupRolesCatalogApps(groupId, roleId, appName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#deleteTargetGroupRolesCatalogApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |
| **appName** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="enumerateGroupMembers"></a>
# **enumerateGroupMembers**
> List&lt;User&gt; enumerateGroupMembers(groupId).after(after).limit(limit).execute();

List Group Members

Enumerates all users that are a member of a group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String after = "after_example"; // Specifies the pagination cursor for the next page of users
    Integer limit = 1000; // Specifies the number of user results in a page
    try {
      List<User> result = client
              .group
              .enumerateGroupMembers(groupId)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#enumerateGroupMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<User>> response = client
              .group
              .enumerateGroupMembers(groupId)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#enumerateGroupMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **after** | **String**| Specifies the pagination cursor for the next page of users | [optional] |
| **limit** | **Integer**| Specifies the number of user results in a page | [optional] [default to 1000] |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAllRules"></a>
# **getAllRules**
> List&lt;GroupRule&gt; getAllRules().limit(limit).after(after).search(search).expand(expand).execute();

List Group Rules

Lists all group rules for your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    Integer limit = 50; // Specifies the number of rule results in a page
    String after = "after_example"; // Specifies the pagination cursor for the next page of rules
    String search = "search_example"; // Specifies the keyword to search fules for
    String expand = "expand_example"; // If specified as `groupIdToGroupNameMap`, then show group names
    try {
      List<GroupRule> result = client
              .group
              .getAllRules()
              .limit(limit)
              .after(after)
              .search(search)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getAllRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<GroupRule>> response = client
              .group
              .getAllRules()
              .limit(limit)
              .after(after)
              .search(search)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getAllRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Specifies the number of rule results in a page | [optional] [default to 50] |
| **after** | **String**| Specifies the pagination cursor for the next page of rules | [optional] |
| **search** | **String**| Specifies the keyword to search fules for | [optional] |
| **expand** | **String**| If specified as &#x60;groupIdToGroupNameMap&#x60;, then show group names | [optional] |

### Return type

[**List&lt;GroupRule&gt;**](GroupRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getGroupRuleById"></a>
# **getGroupRuleById**
> GroupRule getGroupRuleById(ruleId).expand(expand).execute();

Get Group Rule

Fetches a specific group rule by id from your organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String ruleId = "ruleId_example";
    String expand = "expand_example";
    try {
      GroupRule result = client
              .group
              .getGroupRuleById(ruleId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getActions());
      System.out.println(result.getConditions());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getGroupRuleById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupRule> response = client
              .group
              .getGroupRuleById(ruleId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getGroupRuleById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **String**|  | |
| **expand** | **String**|  | [optional] |

### Return type

[**GroupRule**](GroupRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getRoleList"></a>
# **getRoleList**
> List&lt;Role&gt; getRoleList(groupId).expand(expand).execute();



Success

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String expand = "expand_example";
    try {
      List<Role> result = client
              .group
              .getRoleList(groupId)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRoleList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Role>> response = client
              .group
              .getRoleList(groupId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRoleList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **expand** | **String**|  | [optional] |

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getRoleSuccess"></a>
# **getRoleSuccess**
> Role getRoleSuccess(groupId, roleId).execute();



Success

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    try {
      Role result = client
              .group
              .getRoleSuccess(groupId, roleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getAssignmentType());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLabel());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRoleSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Role> response = client
              .group
              .getRoleSuccess(groupId, roleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRoleSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |

### Return type

[**Role**](Role.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getRoleTargetsCatalogApps"></a>
# **getRoleTargetsCatalogApps**
> List&lt;CatalogApplication&gt; getRoleTargetsCatalogApps(groupId, roleId).after(after).limit(limit).execute();



Lists all App targets for an &#x60;APP_ADMIN&#x60; Role assigned to a Group. This methods return list may include full Applications or Instances. The response for an instance will have an &#x60;ID&#x60; value, while Application will not have an ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    String after = "after_example";
    Integer limit = 20;
    try {
      List<CatalogApplication> result = client
              .group
              .getRoleTargetsCatalogApps(groupId, roleId)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRoleTargetsCatalogApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CatalogApplication>> response = client
              .group
              .getRoleTargetsCatalogApps(groupId, roleId)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRoleTargetsCatalogApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**List&lt;CatalogApplication&gt;**](CatalogApplication.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getRules"></a>
# **getRules**
> Group getRules(groupId).execute();

List Group Rules

Fetches a group from your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    try {
      Group result = client
              .group
              .getRules(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastMembershipUpdated());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getObjectClass());
      System.out.println(result.getProfile());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Group> response = client
              .group
              .getRules(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#getRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |

### Return type

[**Group**](Group.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="list"></a>
# **list**
> List&lt;Group&gt; list().q(q).filter(filter).after(after).limit(limit).expand(expand).search(search).execute();

List Groups

Enumerates groups in your organization with pagination. A subset of groups can be returned that match a supported filter expression or query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String q = "q_example"; // Searches the name property of groups for matching value
    String filter = "filter_example"; // Filter expression for groups
    String after = "after_example"; // Specifies the pagination cursor for the next page of groups
    Integer limit = 10000; // Specifies the number of group results in a page
    String expand = "expand_example"; // If specified, it causes additional metadata to be included in the response.
    String search = "search_example"; // Searches for groups with a supported filtering expression for all attributes except for _embedded, _links, and objectClass
    try {
      List<Group> result = client
              .group
              .list()
              .q(q)
              .filter(filter)
              .after(after)
              .limit(limit)
              .expand(expand)
              .search(search)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Group>> response = client
              .group
              .list()
              .q(q)
              .filter(filter)
              .after(after)
              .limit(limit)
              .expand(expand)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **q** | **String**| Searches the name property of groups for matching value | [optional] |
| **filter** | **String**| Filter expression for groups | [optional] |
| **after** | **String**| Specifies the pagination cursor for the next page of groups | [optional] |
| **limit** | **Integer**| Specifies the number of group results in a page | [optional] [default to 10000] |
| **expand** | **String**| If specified, it causes additional metadata to be included in the response. | [optional] |
| **search** | **String**| Searches for groups with a supported filtering expression for all attributes except for _embedded, _links, and objectClass | [optional] |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAssignedApps"></a>
# **listAssignedApps**
> List&lt;Application&gt; listAssignedApps(groupId).after(after).limit(limit).execute();

List Assigned Applications

Enumerates all applications that are assigned to a group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String after = "after_example"; // Specifies the pagination cursor for the next page of apps
    Integer limit = 20; // Specifies the number of app results for a page
    try {
      List<Application> result = client
              .group
              .listAssignedApps(groupId)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#listAssignedApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Application>> response = client
              .group
              .listAssignedApps(groupId)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#listAssignedApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **after** | **String**| Specifies the pagination cursor for the next page of apps | [optional] |
| **limit** | **Integer**| Specifies the number of app results for a page | [optional] [default to 20] |

### Return type

[**List&lt;Application&gt;**](Application.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listRoleTargetsGroups"></a>
# **listRoleTargetsGroups**
> List&lt;Group&gt; listRoleTargetsGroups(groupId, roleId).after(after).limit(limit).execute();



Success

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    String after = "after_example";
    Integer limit = 20;
    try {
      List<Group> result = client
              .group
              .listRoleTargetsGroups(groupId, roleId)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#listRoleTargetsGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Group>> response = client
              .group
              .listRoleTargetsGroups(groupId, roleId)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#listRoleTargetsGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeAppInstanceTargetToAppAdminRoleGivenToGroup"></a>
# **removeAppInstanceTargetToAppAdminRoleGivenToGroup**
> removeAppInstanceTargetToAppAdminRoleGivenToGroup(groupId, roleId, appName, applicationId).execute();

Remove App Instance Target to App Administrator Role given to a Group

Remove App Instance Target to App Administrator Role given to a Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    String appName = "appName_example";
    String applicationId = "applicationId_example";
    try {
      client
              .group
              .removeAppInstanceTargetToAppAdminRoleGivenToGroup(groupId, roleId, appName, applicationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeAppInstanceTargetToAppAdminRoleGivenToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .removeAppInstanceTargetToAppAdminRoleGivenToGroup(groupId, roleId, appName, applicationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeAppInstanceTargetToAppAdminRoleGivenToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |
| **appName** | **String**|  | |
| **applicationId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="removeOperation"></a>
# **removeOperation**
> removeOperation(groupId).execute();

Remove Group

Removes a group with &#x60;OKTA_GROUP&#x60; type from your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    try {
      client
              .group
              .removeOperation(groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .removeOperation(groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="removeRuleById"></a>
# **removeRuleById**
> removeRuleById(ruleId).removeUsers(removeUsers).execute();

Delete a group Rule

Removes a specific group rule by id from your organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String ruleId = "ruleId_example";
    Boolean removeUsers = true; // Indicates whether to keep or remove users from groups assigned by this rule.
    try {
      client
              .group
              .removeRuleById(ruleId)
              .removeUsers(removeUsers)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeRuleById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .removeRuleById(ruleId)
              .removeUsers(removeUsers)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeRuleById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **String**|  | |
| **removeUsers** | **Boolean**| Indicates whether to keep or remove users from groups assigned by this rule. | [optional] |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a name="removeTargetGroup"></a>
# **removeTargetGroup**
> removeTargetGroup(groupId, roleId, targetGroupId).execute();





### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    String targetGroupId = "targetGroupId_example";
    try {
      client
              .group
              .removeTargetGroup(groupId, roleId, targetGroupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeTargetGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .removeTargetGroup(groupId, roleId, targetGroupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeTargetGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |
| **targetGroupId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="removeUserFrom"></a>
# **removeUserFrom**
> removeUserFrom(groupId, userId).execute();

Remove User from Group

Removes a user from a group with &#39;OKTA_GROUP&#39; type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String userId = "userId_example";
    try {
      client
              .group
              .removeUserFrom(groupId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeUserFrom");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .removeUserFrom(groupId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#removeUserFrom");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **userId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="unassignRole"></a>
# **unassignRole**
> unassignRole(groupId, roleId).execute();



Unassigns a Role from a Group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    try {
      client
              .group
              .unassignRole(groupId, roleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#unassignRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .unassignRole(groupId, roleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#unassignRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="updateProfile"></a>
# **updateProfile**
> Group updateProfile(groupId, group).execute();

Update Group

Updates the profile for a group with &#x60;OKTA_GROUP&#x60; type from your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastMembershipUpdated = OffsetDateTime.now();
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    List<String> objectClass = Arrays.asList();
    GroupProfile profile = new GroupProfile();
    GroupType type = GroupType.fromValue("OKTA_GROUP");
    try {
      Group result = client
              .group
              .updateProfile(groupId)
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
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastMembershipUpdated());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getObjectClass());
      System.out.println(result.getProfile());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Group> response = client
              .group
              .updateProfile(groupId)
              .embedded(embedded)
              .links(links)
              .created(created)
              .id(id)
              .lastMembershipUpdated(lastMembershipUpdated)
              .lastUpdated(lastUpdated)
              .objectClass(objectClass)
              .profile(profile)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **group** | [**Group**](Group.md)|  | |

### Return type

[**Group**](Group.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateRolesCatalogApps"></a>
# **updateRolesCatalogApps**
> updateRolesCatalogApps(groupId, roleId, appName).execute();



Success

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    String appName = "appName_example";
    try {
      client
              .group
              .updateRolesCatalogApps(groupId, roleId, appName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateRolesCatalogApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .updateRolesCatalogApps(groupId, roleId, appName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateRolesCatalogApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |
| **appName** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateRule"></a>
# **updateRule**
> GroupRule updateRule(ruleId, groupRule).execute();



Updates a group rule. Only &#x60;INACTIVE&#x60; rules can be updated.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String ruleId = "ruleId_example";
    GroupRuleAction actions = new GroupRuleAction();
    GroupRuleConditions conditions = new GroupRuleConditions();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    GroupRuleStatus status = GroupRuleStatus.fromValue("ACTIVE");
    String type = "type_example";
    try {
      GroupRule result = client
              .group
              .updateRule(ruleId)
              .actions(actions)
              .conditions(conditions)
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getActions());
      System.out.println(result.getConditions());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupRule> response = client
              .group
              .updateRule(ruleId)
              .actions(actions)
              .conditions(conditions)
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleId** | **String**|  | |
| **groupRule** | [**GroupRule**](GroupRule.md)|  | |

### Return type

[**GroupRule**](GroupRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateTargetGroupsRole"></a>
# **updateTargetGroupsRole**
> updateTargetGroupsRole(groupId, roleId, targetGroupId).execute();





### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String groupId = "groupId_example";
    String roleId = "roleId_example";
    String targetGroupId = "targetGroupId_example";
    try {
      client
              .group
              .updateTargetGroupsRole(groupId, roleId, targetGroupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateTargetGroupsRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .group
              .updateTargetGroupsRole(groupId, roleId, targetGroupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupApi#updateTargetGroupsRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **roleId** | **String**|  | |
| **targetGroupId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

