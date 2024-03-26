# UserApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateLifecycle**](UserApi.md#activateLifecycle) | **POST** /api/v1/users/{userId}/lifecycle/activate | Activate User |
| [**addAppInstanceTargetToAppAdministratorRoleGivenToUser**](UserApi.md#addAppInstanceTargetToAppAdministratorRoleGivenToUser) | **PUT** /api/v1/users/{userId}/roles/{roleId}/targets/catalog/apps/{appName}/{applicationId} | Add App Instance Target to App Administrator Role given to a User |
| [**assignRole**](UserApi.md#assignRole) | **POST** /api/v1/users/{userId}/roles |  |
| [**changePasswordValidation**](UserApi.md#changePasswordValidation) | **POST** /api/v1/users/{userId}/credentials/change_password | Change Password |
| [**createNewUser**](UserApi.md#createNewUser) | **POST** /api/v1/users | Create User |
| [**deactivateLifecycle**](UserApi.md#deactivateLifecycle) | **POST** /api/v1/users/{userId}/lifecycle/deactivate | Deactivate User |
| [**deleteLinkedObjects**](UserApi.md#deleteLinkedObjects) | **DELETE** /api/v1/users/{userId}/linkedObjects/{relationshipName} |  |
| [**deletePermanently**](UserApi.md#deletePermanently) | **DELETE** /api/v1/users/{userId} | Delete User |
| [**deleteTargetApp**](UserApi.md#deleteTargetApp) | **DELETE** /api/v1/users/{userId}/roles/{roleId}/targets/catalog/apps/{appName} |  |
| [**expirePasswordAndGetTemporaryPassword**](UserApi.md#expirePasswordAndGetTemporaryPassword) | **POST** /api/v1/users/{userId}/lifecycle/expire_password?tempPassword&#x3D;false | Expire Password |
| [**expirePasswordAndTemporaryPassword**](UserApi.md#expirePasswordAndTemporaryPassword) | **POST** /api/v1/users/{userId}/lifecycle/expire_password?tempPassword&#x3D;true | Expire Password |
| [**forgotPassword**](UserApi.md#forgotPassword) | **POST** /api/v1/users/{userId}/credentials/forgot_password | Forgot Password |
| [**generatePasswordResetToken**](UserApi.md#generatePasswordResetToken) | **POST** /api/v1/users/{userId}/lifecycle/reset_password | Reset Password |
| [**getAssignedRole**](UserApi.md#getAssignedRole) | **GET** /api/v1/users/{userId}/roles/{roleId} |  |
| [**getClientRefreshToken**](UserApi.md#getClientRefreshToken) | **GET** /api/v1/users/{userId}/clients/{clientId}/tokens/{tokenId} |  |
| [**getGrantById**](UserApi.md#getGrantById) | **GET** /api/v1/users/{userId}/grants/{grantId} |  |
| [**getLinkedObjects**](UserApi.md#getLinkedObjects) | **GET** /api/v1/users/{userId}/linkedObjects/{relationshipName} |  |
| [**getMemberGroups**](UserApi.md#getMemberGroups) | **GET** /api/v1/users/{userId}/groups | Get Member Groups |
| [**getOktaUser**](UserApi.md#getOktaUser) | **GET** /api/v1/users/{userId} | Get User |
| [**getSubscriptionByNotification**](UserApi.md#getSubscriptionByNotification) | **GET** /api/v1/users/{userId}/subscriptions/{notificationType} | Get the subscription of a User with a specific notification type |
| [**listActiveUsers**](UserApi.md#listActiveUsers) | **GET** /api/v1/users | List Users |
| [**listAppTargetsForRole**](UserApi.md#listAppTargetsForRole) | **GET** /api/v1/users/{userId}/roles/{roleId}/targets/catalog/apps |  |
| [**listAssignedAppLinks**](UserApi.md#listAssignedAppLinks) | **GET** /api/v1/users/{userId}/appLinks | Get Assigned App Links |
| [**listAssignedRoles**](UserApi.md#listAssignedRoles) | **GET** /api/v1/users/{userId}/roles |  |
| [**listClients**](UserApi.md#listClients) | **GET** /api/v1/users/{userId}/clients |  |
| [**listGrants**](UserApi.md#listGrants) | **GET** /api/v1/users/{userId}/grants |  |
| [**listGrantsForClient**](UserApi.md#listGrantsForClient) | **GET** /api/v1/users/{userId}/clients/{clientId}/grants |  |
| [**listIdpsForUser**](UserApi.md#listIdpsForUser) | **GET** /api/v1/users/{userId}/idps | Listing IdPs associated with a user |
| [**listRefreshTokensForUserAndClient**](UserApi.md#listRefreshTokensForUserAndClient) | **GET** /api/v1/users/{userId}/clients/{clientId}/tokens |  |
| [**listRoleTargetsGroups**](UserApi.md#listRoleTargetsGroups) | **GET** /api/v1/users/{userId}/roles/{roleId}/targets/groups |  |
| [**listSubscriptions**](UserApi.md#listSubscriptions) | **GET** /api/v1/users/{userId}/subscriptions | List subscriptions of a User |
| [**reactivateUser**](UserApi.md#reactivateUser) | **POST** /api/v1/users/{userId}/lifecycle/reactivate | Reactivate User |
| [**removeAppInstanceTargetToAppAdministratorRoleGivenTo**](UserApi.md#removeAppInstanceTargetToAppAdministratorRoleGivenTo) | **DELETE** /api/v1/users/{userId}/roles/{roleId}/targets/catalog/apps/{appName}/{applicationId} | Remove App Instance Target to App Administrator Role given to a User |
| [**removeTargetGroup**](UserApi.md#removeTargetGroup) | **DELETE** /api/v1/users/{userId}/roles/{roleId}/targets/groups/{groupId} |  |
| [**resetFactorsOperation**](UserApi.md#resetFactorsOperation) | **POST** /api/v1/users/{userId}/lifecycle/reset_factors | Reset Factors |
| [**revokeAllSessions**](UserApi.md#revokeAllSessions) | **DELETE** /api/v1/users/{userId}/sessions |  |
| [**revokeAllTokens**](UserApi.md#revokeAllTokens) | **DELETE** /api/v1/users/{userId}/clients/{clientId}/tokens |  |
| [**revokeGrant**](UserApi.md#revokeGrant) | **DELETE** /api/v1/users/{userId}/grants/{grantId} |  |
| [**revokeGrants**](UserApi.md#revokeGrants) | **DELETE** /api/v1/users/{userId}/grants |  |
| [**revokeGrantsForUserAndClient**](UserApi.md#revokeGrantsForUserAndClient) | **DELETE** /api/v1/users/{userId}/clients/{clientId}/grants |  |
| [**revokeTokenForClient**](UserApi.md#revokeTokenForClient) | **DELETE** /api/v1/users/{userId}/clients/{clientId}/tokens/{tokenId} |  |
| [**suspendLifecycle**](UserApi.md#suspendLifecycle) | **POST** /api/v1/users/{userId}/lifecycle/suspend | Suspend User |
| [**unassignRole**](UserApi.md#unassignRole) | **DELETE** /api/v1/users/{userId}/roles/{roleId} |  |
| [**unlockUserStatus**](UserApi.md#unlockUserStatus) | **POST** /api/v1/users/{userId}/lifecycle/unlock | Unlock User |
| [**unsuspendLifecycle**](UserApi.md#unsuspendLifecycle) | **POST** /api/v1/users/{userId}/lifecycle/unsuspend | Unsuspend User |
| [**updateLinkedObject**](UserApi.md#updateLinkedObject) | **PUT** /api/v1/users/{associatedUserId}/linkedObjects/{primaryRelationshipName}/{primaryUserId} |  |
| [**updateProfile**](UserApi.md#updateProfile) | **PUT** /api/v1/users/{userId} | Update User |
| [**updateProfile_0**](UserApi.md#updateProfile_0) | **POST** /api/v1/users/{userId} |  |
| [**updateRecoveryQuestion**](UserApi.md#updateRecoveryQuestion) | **POST** /api/v1/users/{userId}/credentials/change_recovery_question | Change Recovery Question |
| [**updateRolesCatalogApps**](UserApi.md#updateRolesCatalogApps) | **PUT** /api/v1/users/{userId}/roles/{roleId}/targets/catalog/apps |  |
| [**updateRolesCatalogApps_0**](UserApi.md#updateRolesCatalogApps_0) | **PUT** /api/v1/users/{userId}/roles/{roleId}/targets/catalog/apps/{appName} |  |
| [**updateRolesCatalogApps_1**](UserApi.md#updateRolesCatalogApps_1) | **PUT** /api/v1/users/{userId}/roles/{roleId}/targets/groups/{groupId} |  |


<a name="activateLifecycle"></a>
# **activateLifecycle**
> UserActivationToken activateLifecycle(userId, sendEmail).execute();

Activate User

Activates a user.  This operation can only be performed on users with a &#x60;STAGED&#x60; status.  Activation of a user is an asynchronous operation. The user will have the &#x60;transitioningToStatus&#x60; property with a value of &#x60;ACTIVE&#x60; during activation to indicate that the user hasn&#39;t completed the asynchronous operation.  The user will have a status of &#x60;ACTIVE&#x60; when the activation process is complete.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    Boolean sendEmail = true; // Sends an activation email to the user if true
    try {
      UserActivationToken result = client
              .user
              .activateLifecycle(userId, sendEmail)
              .execute();
      System.out.println(result);
      System.out.println(result.getActivationToken());
      System.out.println(result.getActivationUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#activateLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserActivationToken> response = client
              .user
              .activateLifecycle(userId, sendEmail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#activateLifecycle");
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
| **userId** | **String**|  | |
| **sendEmail** | **Boolean**| Sends an activation email to the user if true | [default to true] |

### Return type

[**UserActivationToken**](UserActivationToken.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addAppInstanceTargetToAppAdministratorRoleGivenToUser"></a>
# **addAppInstanceTargetToAppAdministratorRoleGivenToUser**
> addAppInstanceTargetToAppAdministratorRoleGivenToUser(userId, roleId, appName, applicationId).execute();

Add App Instance Target to App Administrator Role given to a User

Add App Instance Target to App Administrator Role given to a User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    String appName = "appName_example";
    String applicationId = "applicationId_example";
    try {
      client
              .user
              .addAppInstanceTargetToAppAdministratorRoleGivenToUser(userId, roleId, appName, applicationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#addAppInstanceTargetToAppAdministratorRoleGivenToUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .addAppInstanceTargetToAppAdministratorRoleGivenToUser(userId, roleId, appName, applicationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#addAppInstanceTargetToAppAdministratorRoleGivenToUser");
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
| **userId** | **String**|  | |
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

<a name="assignRole"></a>
# **assignRole**
> Role assignRole(userId, assignRoleRequest).disableNotifications(disableNotifications).execute();



Assigns a role to a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    RoleType type = RoleType.fromValue("SUPER_ADMIN");
    Boolean disableNotifications = true;
    try {
      Role result = client
              .user
              .assignRole(userId)
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
      System.err.println("Exception when calling UserApi#assignRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Role> response = client
              .user
              .assignRole(userId)
              .type(type)
              .disableNotifications(disableNotifications)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#assignRole");
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
| **userId** | **String**|  | |
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
| **201** | Created |  -  |

<a name="changePasswordValidation"></a>
# **changePasswordValidation**
> UserCredentials changePasswordValidation(userId, changePasswordRequest).strict(strict).execute();

Change Password

Changes a user&#39;s password by validating the user&#39;s current password. This operation can only be performed on users in &#x60;STAGED&#x60;, &#x60;ACTIVE&#x60;, &#x60;PASSWORD_EXPIRED&#x60;, or &#x60;RECOVERY&#x60; status that have a valid password credential

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    PasswordCredential newPassword = new PasswordCredential();
    PasswordCredential oldPassword = new PasswordCredential();
    Boolean strict = true;
    try {
      UserCredentials result = client
              .user
              .changePasswordValidation(userId)
              .newPassword(newPassword)
              .oldPassword(oldPassword)
              .strict(strict)
              .execute();
      System.out.println(result);
      System.out.println(result.getPassword());
      System.out.println(result.getProvider());
      System.out.println(result.getRecoveryQuestion());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#changePasswordValidation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserCredentials> response = client
              .user
              .changePasswordValidation(userId)
              .newPassword(newPassword)
              .oldPassword(oldPassword)
              .strict(strict)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#changePasswordValidation");
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
| **userId** | **String**|  | |
| **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)|  | |
| **strict** | **Boolean**|  | [optional] |

### Return type

[**UserCredentials**](UserCredentials.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createNewUser"></a>
# **createNewUser**
> User createNewUser(createUserRequest).activate(activate).provider(provider).nextLogin(nextLogin).execute();

Create User

Creates a new user in your Okta organization with or without credentials.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    UserCredentials credentials = new UserCredentials();
    List<String> groupIds = Arrays.asList();
    UserProfile profile = new UserProfile();
    UserType type = new UserType();
    Boolean activate = true; // Executes activation lifecycle operation when creating the user
    Boolean provider = false; // Indicates whether to create a user with a specified authentication provider
    String nextLogin = ""; // With activate=true, set nextLogin to \"changePassword\" to have the password be EXPIRED, so user must change it the next time they log in.
    try {
      User result = client
              .user
              .createNewUser()
              .credentials(credentials)
              .groupIds(groupIds)
              .profile(profile)
              .type(type)
              .activate(activate)
              .provider(provider)
              .nextLogin(nextLogin)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getActivated());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getId());
      System.out.println(result.getLastLogin());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPasswordChanged());
      System.out.println(result.getProfile());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusChanged());
      System.out.println(result.getTransitioningToStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createNewUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .createNewUser()
              .credentials(credentials)
              .groupIds(groupIds)
              .profile(profile)
              .type(type)
              .activate(activate)
              .provider(provider)
              .nextLogin(nextLogin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createNewUser");
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
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | |
| **activate** | **Boolean**| Executes activation lifecycle operation when creating the user | [optional] [default to true] |
| **provider** | **Boolean**| Indicates whether to create a user with a specified authentication provider | [optional] [default to false] |
| **nextLogin** | **String**| With activate&#x3D;true, set nextLogin to \&quot;changePassword\&quot; to have the password be EXPIRED, so user must change it the next time they log in. | [optional] [default to ] |

### Return type

[**User**](User.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deactivateLifecycle"></a>
# **deactivateLifecycle**
> deactivateLifecycle(userId).sendEmail(sendEmail).execute();

Deactivate User

Deactivates a user. This operation can only be performed on users that do not have a &#x60;DEPROVISIONED&#x60; status. While the asynchronous operation (triggered by HTTP header &#x60;Prefer: respond-async&#x60;) is proceeding the user&#39;s &#x60;transitioningToStatus&#x60; property is &#x60;DEPROVISIONED&#x60;. The user&#39;s status is &#x60;DEPROVISIONED&#x60; when the deactivation process is complete.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    Boolean sendEmail = false;
    try {
      client
              .user
              .deactivateLifecycle(userId)
              .sendEmail(sendEmail)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deactivateLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .deactivateLifecycle(userId)
              .sendEmail(sendEmail)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deactivateLifecycle");
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
| **userId** | **String**|  | |
| **sendEmail** | **Boolean**|  | [optional] [default to false] |

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
| **200** | OK |  -  |

<a name="deleteLinkedObjects"></a>
# **deleteLinkedObjects**
> deleteLinkedObjects(userId, relationshipName).execute();



Delete linked objects for a user, relationshipName can be ONLY a primary relationship name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String relationshipName = "relationshipName_example";
    try {
      client
              .user
              .deleteLinkedObjects(userId, relationshipName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteLinkedObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .deleteLinkedObjects(userId, relationshipName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteLinkedObjects");
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
| **userId** | **String**|  | |
| **relationshipName** | **String**|  | |

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

<a name="deletePermanently"></a>
# **deletePermanently**
> deletePermanently(userId).sendEmail(sendEmail).execute();

Delete User

Deletes a user permanently.  This operation can only be performed on users that have a &#x60;DEPROVISIONED&#x60; status.  **This action cannot be recovered!**

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    Boolean sendEmail = false;
    try {
      client
              .user
              .deletePermanently(userId)
              .sendEmail(sendEmail)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deletePermanently");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .deletePermanently(userId)
              .sendEmail(sendEmail)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deletePermanently");
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
| **userId** | **String**|  | |
| **sendEmail** | **Boolean**|  | [optional] [default to false] |

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
| **202** | ACCEPTED |  -  |

<a name="deleteTargetApp"></a>
# **deleteTargetApp**
> deleteTargetApp(userId, roleId, appName).execute();



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
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    String appName = "appName_example";
    try {
      client
              .user
              .deleteTargetApp(userId, roleId, appName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteTargetApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .deleteTargetApp(userId, roleId, appName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteTargetApp");
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
| **userId** | **String**|  | |
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

<a name="expirePasswordAndGetTemporaryPassword"></a>
# **expirePasswordAndGetTemporaryPassword**
> User expirePasswordAndGetTemporaryPassword(userId).execute();

Expire Password

This operation transitions the user to the status of &#x60;PASSWORD_EXPIRED&#x60; so that the user is required to change their password at their next login.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      User result = client
              .user
              .expirePasswordAndGetTemporaryPassword(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getActivated());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getId());
      System.out.println(result.getLastLogin());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPasswordChanged());
      System.out.println(result.getProfile());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusChanged());
      System.out.println(result.getTransitioningToStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#expirePasswordAndGetTemporaryPassword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .expirePasswordAndGetTemporaryPassword(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#expirePasswordAndGetTemporaryPassword");
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
| **userId** | **String**|  | |

### Return type

[**User**](User.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="expirePasswordAndTemporaryPassword"></a>
# **expirePasswordAndTemporaryPassword**
> TempPassword expirePasswordAndTemporaryPassword(userId).execute();

Expire Password

This operation transitions the user to the status of &#x60;PASSWORD_EXPIRED&#x60; and the user&#39;s password is reset to a temporary password that is returned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      TempPassword result = client
              .user
              .expirePasswordAndTemporaryPassword(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTempPassword());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#expirePasswordAndTemporaryPassword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TempPassword> response = client
              .user
              .expirePasswordAndTemporaryPassword(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#expirePasswordAndTemporaryPassword");
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
| **userId** | **String**|  | |

### Return type

[**TempPassword**](TempPassword.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="forgotPassword"></a>
# **forgotPassword**
> ForgotPasswordResponse forgotPassword(userId).execute();

Forgot Password

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      ForgotPasswordResponse result = client
              .user
              .forgotPassword(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResetPasswordUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#forgotPassword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ForgotPasswordResponse> response = client
              .user
              .forgotPassword(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#forgotPassword");
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
| **userId** | **String**|  | |

### Return type

[**ForgotPasswordResponse**](ForgotPasswordResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="generatePasswordResetToken"></a>
# **generatePasswordResetToken**
> ResetPasswordToken generatePasswordResetToken(userId, sendEmail).execute();

Reset Password

Generates a one-time token (OTT) that can be used to reset a user&#39;s password.  The OTT link can be automatically emailed to the user or returned to the API caller and distributed using a custom flow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    Boolean sendEmail = true;
    try {
      ResetPasswordToken result = client
              .user
              .generatePasswordResetToken(userId, sendEmail)
              .execute();
      System.out.println(result);
      System.out.println(result.getResetPasswordUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#generatePasswordResetToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResetPasswordToken> response = client
              .user
              .generatePasswordResetToken(userId, sendEmail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#generatePasswordResetToken");
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
| **userId** | **String**|  | |
| **sendEmail** | **Boolean**|  | |

### Return type

[**ResetPasswordToken**](ResetPasswordToken.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAssignedRole"></a>
# **getAssignedRole**
> Role getAssignedRole(userId, roleId).execute();



Gets role that is assigne to user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    try {
      Role result = client
              .user
              .getAssignedRole(userId, roleId)
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
      System.err.println("Exception when calling UserApi#getAssignedRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Role> response = client
              .user
              .getAssignedRole(userId, roleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getAssignedRole");
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
| **userId** | **String**|  | |
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

<a name="getClientRefreshToken"></a>
# **getClientRefreshToken**
> OAuth2RefreshToken getClientRefreshToken(userId, clientId, tokenId).expand(expand).limit(limit).after(after).execute();



Gets a refresh token issued for the specified User and Client.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String clientId = "clientId_example";
    String tokenId = "tokenId_example";
    String expand = "expand_example";
    Integer limit = 20;
    String after = "after_example";
    try {
      OAuth2RefreshToken result = client
              .user
              .getClientRefreshToken(userId, clientId, tokenId)
              .expand(expand)
              .limit(limit)
              .after(after)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getClientId());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getId());
      System.out.println(result.getIssuer());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getScopes());
      System.out.println(result.getStatus());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getClientRefreshToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2RefreshToken> response = client
              .user
              .getClientRefreshToken(userId, clientId, tokenId)
              .expand(expand)
              .limit(limit)
              .after(after)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getClientRefreshToken");
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
| **userId** | **String**|  | |
| **clientId** | **String**|  | |
| **tokenId** | **String**|  | |
| **expand** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **after** | **String**|  | [optional] |

### Return type

[**OAuth2RefreshToken**](OAuth2RefreshToken.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getGrantById"></a>
# **getGrantById**
> OAuth2ScopeConsentGrant getGrantById(userId, grantId).expand(expand).execute();



Gets a grant for the specified user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String grantId = "grantId_example";
    String expand = "expand_example";
    try {
      OAuth2ScopeConsentGrant result = client
              .user
              .getGrantById(userId, grantId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getClientId());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getId());
      System.out.println(result.getIssuer());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getScopeId());
      System.out.println(result.getSource());
      System.out.println(result.getStatus());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getGrantById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2ScopeConsentGrant> response = client
              .user
              .getGrantById(userId, grantId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getGrantById");
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
| **userId** | **String**|  | |
| **grantId** | **String**|  | |
| **expand** | **String**|  | [optional] |

### Return type

[**OAuth2ScopeConsentGrant**](OAuth2ScopeConsentGrant.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLinkedObjects"></a>
# **getLinkedObjects**
> List&lt;ResponseLinks&gt; getLinkedObjects(userId, relationshipName).after(after).limit(limit).execute();



Get linked objects for a user, relationshipName can be a primary or associated relationship name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String relationshipName = "relationshipName_example";
    String after = "after_example";
    Integer limit = -1;
    try {
      List<ResponseLinks> result = client
              .user
              .getLinkedObjects(userId, relationshipName)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getLinkedObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ResponseLinks>> response = client
              .user
              .getLinkedObjects(userId, relationshipName)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getLinkedObjects");
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
| **userId** | **String**|  | |
| **relationshipName** | **String**|  | |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to -1] |

### Return type

[**List&lt;ResponseLinks&gt;**](ResponseLinks.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getMemberGroups"></a>
# **getMemberGroups**
> List&lt;Group&gt; getMemberGroups(userId).execute();

Get Member Groups

Fetches the groups of which the user is a member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      List<Group> result = client
              .user
              .getMemberGroups(userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getMemberGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Group>> response = client
              .user
              .getMemberGroups(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getMemberGroups");
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
| **userId** | **String**|  | |

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

<a name="getOktaUser"></a>
# **getOktaUser**
> User getOktaUser(userId).execute();

Get User

Fetches a user from your Okta organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      User result = client
              .user
              .getOktaUser(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getActivated());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getId());
      System.out.println(result.getLastLogin());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPasswordChanged());
      System.out.println(result.getProfile());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusChanged());
      System.out.println(result.getTransitioningToStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getOktaUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .getOktaUser(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getOktaUser");
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
| **userId** | **String**|  | |

### Return type

[**User**](User.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSubscriptionByNotification"></a>
# **getSubscriptionByNotification**
> Subscription getSubscriptionByNotification(userId, notificationType).execute();

Get the subscription of a User with a specific notification type

Get the subscriptions of a User with a specific notification type. Only gets subscriptions for current user. An AccessDeniedException message is sent if requests are made from other users.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String notificationType = "notificationType_example";
    try {
      Subscription result = client
              .user
              .getSubscriptionByNotification(userId, notificationType)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getChannels());
      System.out.println(result.getNotificationType());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getSubscriptionByNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Subscription> response = client
              .user
              .getSubscriptionByNotification(userId, notificationType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getSubscriptionByNotification");
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
| **userId** | **String**|  | |
| **notificationType** | **String**|  | |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

<a name="listActiveUsers"></a>
# **listActiveUsers**
> List&lt;User&gt; listActiveUsers().q(q).after(after).limit(limit).filter(filter).search(search).sortBy(sortBy).sortOrder(sortOrder).execute();

List Users

Lists users that do not have a status of &#39;DEPROVISIONED&#39; (by default), up to the maximum (200 for most orgs), with pagination in most cases. A subset of users can be returned that match a supported filter expression or search criteria.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String q = "q_example"; // Finds a user that matches firstName, lastName, and email properties
    String after = "after_example"; // Specifies the pagination cursor for the next page of users
    Integer limit = 10; // Specifies the number of results returned
    String filter = "filter_example"; // Filters users with a supported expression for a subset of properties
    String search = "search_example"; // Searches for users with a supported filtering  expression for most properties
    String sortBy = "sortBy_example";
    String sortOrder = "sortOrder_example";
    try {
      List<User> result = client
              .user
              .listActiveUsers()
              .q(q)
              .after(after)
              .limit(limit)
              .filter(filter)
              .search(search)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listActiveUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<User>> response = client
              .user
              .listActiveUsers()
              .q(q)
              .after(after)
              .limit(limit)
              .filter(filter)
              .search(search)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listActiveUsers");
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
| **q** | **String**| Finds a user that matches firstName, lastName, and email properties | [optional] |
| **after** | **String**| Specifies the pagination cursor for the next page of users | [optional] |
| **limit** | **Integer**| Specifies the number of results returned | [optional] [default to 10] |
| **filter** | **String**| Filters users with a supported expression for a subset of properties | [optional] |
| **search** | **String**| Searches for users with a supported filtering  expression for most properties | [optional] |
| **sortBy** | **String**|  | [optional] |
| **sortOrder** | **String**|  | [optional] |

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

<a name="listAppTargetsForRole"></a>
# **listAppTargetsForRole**
> List&lt;CatalogApplication&gt; listAppTargetsForRole(userId, roleId).after(after).limit(limit).execute();



Lists all App targets for an &#x60;APP_ADMIN&#x60; Role assigned to a User. This methods return list may include full Applications or Instances. The response for an instance will have an &#x60;ID&#x60; value, while Application will not have an ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    String after = "after_example";
    Integer limit = 20;
    try {
      List<CatalogApplication> result = client
              .user
              .listAppTargetsForRole(userId, roleId)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listAppTargetsForRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CatalogApplication>> response = client
              .user
              .listAppTargetsForRole(userId, roleId)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listAppTargetsForRole");
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
| **userId** | **String**|  | |
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

<a name="listAssignedAppLinks"></a>
# **listAssignedAppLinks**
> List&lt;AppLink&gt; listAssignedAppLinks(userId).execute();

Get Assigned App Links

Fetches appLinks for all direct or indirect (via group membership) assigned applications.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      List<AppLink> result = client
              .user
              .listAssignedAppLinks(userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listAssignedAppLinks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AppLink>> response = client
              .user
              .listAssignedAppLinks(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listAssignedAppLinks");
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
| **userId** | **String**|  | |

### Return type

[**List&lt;AppLink&gt;**](AppLink.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAssignedRoles"></a>
# **listAssignedRoles**
> List&lt;Role&gt; listAssignedRoles(userId).expand(expand).execute();



Lists all roles assigned to a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String expand = "expand_example";
    try {
      List<Role> result = client
              .user
              .listAssignedRoles(userId)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listAssignedRoles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Role>> response = client
              .user
              .listAssignedRoles(userId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listAssignedRoles");
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
| **userId** | **String**|  | |
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

<a name="listClients"></a>
# **listClients**
> List&lt;OAuth2Client&gt; listClients(userId).execute();



Lists all client resources for which the specified user has grants or tokens.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      List<OAuth2Client> result = client
              .user
              .listClients(userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listClients");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2Client>> response = client
              .user
              .listClients(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listClients");
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
| **userId** | **String**|  | |

### Return type

[**List&lt;OAuth2Client&gt;**](OAuth2Client.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listGrants"></a>
# **listGrants**
> List&lt;OAuth2ScopeConsentGrant&gt; listGrants(userId).scopeId(scopeId).expand(expand).after(after).limit(limit).execute();



Lists all grants for the specified user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String scopeId = "scopeId_example";
    String expand = "expand_example";
    String after = "after_example";
    Integer limit = 20;
    try {
      List<OAuth2ScopeConsentGrant> result = client
              .user
              .listGrants(userId)
              .scopeId(scopeId)
              .expand(expand)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listGrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2ScopeConsentGrant>> response = client
              .user
              .listGrants(userId)
              .scopeId(scopeId)
              .expand(expand)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listGrants");
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
| **userId** | **String**|  | |
| **scopeId** | **String**|  | [optional] |
| **expand** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**List&lt;OAuth2ScopeConsentGrant&gt;**](OAuth2ScopeConsentGrant.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listGrantsForClient"></a>
# **listGrantsForClient**
> List&lt;OAuth2ScopeConsentGrant&gt; listGrantsForClient(userId, clientId).expand(expand).after(after).limit(limit).execute();



Lists all grants for a specified user and client

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String clientId = "clientId_example";
    String expand = "expand_example";
    String after = "after_example";
    Integer limit = 20;
    try {
      List<OAuth2ScopeConsentGrant> result = client
              .user
              .listGrantsForClient(userId, clientId)
              .expand(expand)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listGrantsForClient");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2ScopeConsentGrant>> response = client
              .user
              .listGrantsForClient(userId, clientId)
              .expand(expand)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listGrantsForClient");
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
| **userId** | **String**|  | |
| **clientId** | **String**|  | |
| **expand** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**List&lt;OAuth2ScopeConsentGrant&gt;**](OAuth2ScopeConsentGrant.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listIdpsForUser"></a>
# **listIdpsForUser**
> List&lt;IdentityProvider&gt; listIdpsForUser(userId).execute();

Listing IdPs associated with a user

Lists the IdPs associated with the user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      List<IdentityProvider> result = client
              .user
              .listIdpsForUser(userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listIdpsForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<IdentityProvider>> response = client
              .user
              .listIdpsForUser(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listIdpsForUser");
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
| **userId** | **String**|  | |

### Return type

[**List&lt;IdentityProvider&gt;**](IdentityProvider.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listRefreshTokensForUserAndClient"></a>
# **listRefreshTokensForUserAndClient**
> List&lt;OAuth2RefreshToken&gt; listRefreshTokensForUserAndClient(userId, clientId).expand(expand).after(after).limit(limit).execute();



Lists all refresh tokens issued for the specified User and Client.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String clientId = "clientId_example";
    String expand = "expand_example";
    String after = "after_example";
    Integer limit = 20;
    try {
      List<OAuth2RefreshToken> result = client
              .user
              .listRefreshTokensForUserAndClient(userId, clientId)
              .expand(expand)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listRefreshTokensForUserAndClient");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2RefreshToken>> response = client
              .user
              .listRefreshTokensForUserAndClient(userId, clientId)
              .expand(expand)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listRefreshTokensForUserAndClient");
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
| **userId** | **String**|  | |
| **clientId** | **String**|  | |
| **expand** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**List&lt;OAuth2RefreshToken&gt;**](OAuth2RefreshToken.md)

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
> List&lt;Group&gt; listRoleTargetsGroups(userId, roleId).after(after).limit(limit).execute();



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
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    String after = "after_example";
    Integer limit = 20;
    try {
      List<Group> result = client
              .user
              .listRoleTargetsGroups(userId, roleId)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listRoleTargetsGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Group>> response = client
              .user
              .listRoleTargetsGroups(userId, roleId)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listRoleTargetsGroups");
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
| **userId** | **String**|  | |
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

<a name="listSubscriptions"></a>
# **listSubscriptions**
> List&lt;Subscription&gt; listSubscriptions(userId).execute();

List subscriptions of a User

List subscriptions of a User. Only lists subscriptions for current user. An AccessDeniedException message is sent if requests are made from other users.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      List<Subscription> result = client
              .user
              .listSubscriptions(userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listSubscriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Subscription>> response = client
              .user
              .listSubscriptions(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listSubscriptions");
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
| **userId** | **String**|  | |

### Return type

[**List&lt;Subscription&gt;**](Subscription.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

<a name="reactivateUser"></a>
# **reactivateUser**
> UserActivationToken reactivateUser(userId).sendEmail(sendEmail).execute();

Reactivate User

Reactivates a user.  This operation can only be performed on users with a &#x60;PROVISIONED&#x60; status.  This operation restarts the activation workflow if for some reason the user activation was not completed when using the activationToken from [Activate User](https://raw.githubusercontent.com).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    Boolean sendEmail = false; // Sends an activation email to the user if true
    try {
      UserActivationToken result = client
              .user
              .reactivateUser(userId)
              .sendEmail(sendEmail)
              .execute();
      System.out.println(result);
      System.out.println(result.getActivationToken());
      System.out.println(result.getActivationUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#reactivateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserActivationToken> response = client
              .user
              .reactivateUser(userId)
              .sendEmail(sendEmail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#reactivateUser");
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
| **userId** | **String**|  | |
| **sendEmail** | **Boolean**| Sends an activation email to the user if true | [optional] [default to false] |

### Return type

[**UserActivationToken**](UserActivationToken.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeAppInstanceTargetToAppAdministratorRoleGivenTo"></a>
# **removeAppInstanceTargetToAppAdministratorRoleGivenTo**
> removeAppInstanceTargetToAppAdministratorRoleGivenTo(userId, roleId, appName, applicationId).execute();

Remove App Instance Target to App Administrator Role given to a User

Remove App Instance Target to App Administrator Role given to a User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    String appName = "appName_example";
    String applicationId = "applicationId_example";
    try {
      client
              .user
              .removeAppInstanceTargetToAppAdministratorRoleGivenTo(userId, roleId, appName, applicationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeAppInstanceTargetToAppAdministratorRoleGivenTo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .removeAppInstanceTargetToAppAdministratorRoleGivenTo(userId, roleId, appName, applicationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeAppInstanceTargetToAppAdministratorRoleGivenTo");
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
| **userId** | **String**|  | |
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

<a name="removeTargetGroup"></a>
# **removeTargetGroup**
> removeTargetGroup(userId, roleId, groupId).execute();



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
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    String groupId = "groupId_example";
    try {
      client
              .user
              .removeTargetGroup(userId, roleId, groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeTargetGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .removeTargetGroup(userId, roleId, groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeTargetGroup");
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
| **userId** | **String**|  | |
| **roleId** | **String**|  | |
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

<a name="resetFactorsOperation"></a>
# **resetFactorsOperation**
> resetFactorsOperation(userId).execute();

Reset Factors

This operation resets all factors for the specified user. All MFA factor enrollments returned to the unenrolled state. The user&#39;s status remains ACTIVE. This link is present only if the user is currently enrolled in one or more MFA factors.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      client
              .user
              .resetFactorsOperation(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#resetFactorsOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .resetFactorsOperation(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#resetFactorsOperation");
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
| **200** | OK |  -  |

<a name="revokeAllSessions"></a>
# **revokeAllSessions**
> revokeAllSessions(userId).oauthTokens(oauthTokens).execute();



Removes all active identity provider sessions. This forces the user to authenticate on the next operation. Optionally revokes OpenID Connect and OAuth refresh and access tokens issued to the user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    Boolean oauthTokens = false; // Revoke issued OpenID Connect and OAuth refresh and access tokens
    try {
      client
              .user
              .revokeAllSessions(userId)
              .oauthTokens(oauthTokens)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeAllSessions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .revokeAllSessions(userId)
              .oauthTokens(oauthTokens)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeAllSessions");
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
| **userId** | **String**|  | |
| **oauthTokens** | **Boolean**| Revoke issued OpenID Connect and OAuth refresh and access tokens | [optional] [default to false] |

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

<a name="revokeAllTokens"></a>
# **revokeAllTokens**
> revokeAllTokens(userId, clientId).execute();



Revokes all refresh tokens issued for the specified User and Client.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String clientId = "clientId_example";
    try {
      client
              .user
              .revokeAllTokens(userId, clientId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeAllTokens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .revokeAllTokens(userId, clientId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeAllTokens");
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
| **userId** | **String**|  | |
| **clientId** | **String**|  | |

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

<a name="revokeGrant"></a>
# **revokeGrant**
> revokeGrant(userId, grantId).execute();



Revokes one grant for a specified user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String grantId = "grantId_example";
    try {
      client
              .user
              .revokeGrant(userId, grantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .revokeGrant(userId, grantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeGrant");
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
| **userId** | **String**|  | |
| **grantId** | **String**|  | |

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

<a name="revokeGrants"></a>
# **revokeGrants**
> revokeGrants(userId).execute();



Revokes all grants for a specified user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      client
              .user
              .revokeGrants(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeGrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .revokeGrants(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeGrants");
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

<a name="revokeGrantsForUserAndClient"></a>
# **revokeGrantsForUserAndClient**
> revokeGrantsForUserAndClient(userId, clientId).execute();



Revokes all grants for the specified user and client

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String clientId = "clientId_example";
    try {
      client
              .user
              .revokeGrantsForUserAndClient(userId, clientId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeGrantsForUserAndClient");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .revokeGrantsForUserAndClient(userId, clientId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeGrantsForUserAndClient");
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
| **userId** | **String**|  | |
| **clientId** | **String**|  | |

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

<a name="revokeTokenForClient"></a>
# **revokeTokenForClient**
> revokeTokenForClient(userId, clientId, tokenId).execute();



Revokes the specified refresh token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String clientId = "clientId_example";
    String tokenId = "tokenId_example";
    try {
      client
              .user
              .revokeTokenForClient(userId, clientId, tokenId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeTokenForClient");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .revokeTokenForClient(userId, clientId, tokenId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#revokeTokenForClient");
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
| **userId** | **String**|  | |
| **clientId** | **String**|  | |
| **tokenId** | **String**|  | |

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

<a name="suspendLifecycle"></a>
# **suspendLifecycle**
> suspendLifecycle(userId).execute();

Suspend User

Suspends a user.  This operation can only be performed on users with an &#x60;ACTIVE&#x60; status.  The user will have a status of &#x60;SUSPENDED&#x60; when the process is complete.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      client
              .user
              .suspendLifecycle(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#suspendLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .suspendLifecycle(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#suspendLifecycle");
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
| **200** | OK |  -  |

<a name="unassignRole"></a>
# **unassignRole**
> unassignRole(userId, roleId).execute();



Unassigns a role from a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    try {
      client
              .user
              .unassignRole(userId, roleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#unassignRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .unassignRole(userId, roleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#unassignRole");
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
| **userId** | **String**|  | |
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

<a name="unlockUserStatus"></a>
# **unlockUserStatus**
> unlockUserStatus(userId).execute();

Unlock User

Unlocks a user with a &#x60;LOCKED_OUT&#x60; status and returns them to &#x60;ACTIVE&#x60; status.  Users will be able to login with their current password.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      client
              .user
              .unlockUserStatus(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#unlockUserStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .unlockUserStatus(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#unlockUserStatus");
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
| **200** | Success |  -  |

<a name="unsuspendLifecycle"></a>
# **unsuspendLifecycle**
> unsuspendLifecycle(userId).execute();

Unsuspend User

Unsuspends a user and returns them to the &#x60;ACTIVE&#x60; state.  This operation can only be performed on users that have a &#x60;SUSPENDED&#x60; status.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    try {
      client
              .user
              .unsuspendLifecycle(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#unsuspendLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .unsuspendLifecycle(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#unsuspendLifecycle");
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
| **200** | Success |  -  |

<a name="updateLinkedObject"></a>
# **updateLinkedObject**
> updateLinkedObject(associatedUserId, primaryRelationshipName, primaryUserId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String associatedUserId = "associatedUserId_example";
    String primaryRelationshipName = "primaryRelationshipName_example";
    String primaryUserId = "primaryUserId_example";
    try {
      client
              .user
              .updateLinkedObject(associatedUserId, primaryRelationshipName, primaryUserId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateLinkedObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .updateLinkedObject(associatedUserId, primaryRelationshipName, primaryUserId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateLinkedObject");
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
| **associatedUserId** | **String**|  | |
| **primaryRelationshipName** | **String**|  | |
| **primaryUserId** | **String**|  | |

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
| **204** | Success |  -  |

<a name="updateProfile"></a>
# **updateProfile**
> User updateProfile(userId, user).strict(strict).execute();

Update User

Update a user&#39;s profile and/or credentials using strict-update semantics.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    OffsetDateTime activated = OffsetDateTime.now();
    OffsetDateTime created = OffsetDateTime.now();
    UserCredentials credentials = new UserCredentials();
    String id = "id_example";
    OffsetDateTime lastLogin = OffsetDateTime.now();
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    OffsetDateTime passwordChanged = OffsetDateTime.now();
    UserProfile profile = new UserProfile();
    UserStatus status = UserStatus.fromValue("ACTIVE");
    OffsetDateTime statusChanged = OffsetDateTime.now();
    UserStatus transitioningToStatus = UserStatus.fromValue("ACTIVE");
    UserType type = new UserType();
    Boolean strict = true;
    try {
      User result = client
              .user
              .updateProfile(userId)
              .embedded(embedded)
              .links(links)
              .activated(activated)
              .created(created)
              .credentials(credentials)
              .id(id)
              .lastLogin(lastLogin)
              .lastUpdated(lastUpdated)
              .passwordChanged(passwordChanged)
              .profile(profile)
              .status(status)
              .statusChanged(statusChanged)
              .transitioningToStatus(transitioningToStatus)
              .type(type)
              .strict(strict)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getActivated());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getId());
      System.out.println(result.getLastLogin());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPasswordChanged());
      System.out.println(result.getProfile());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusChanged());
      System.out.println(result.getTransitioningToStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .updateProfile(userId)
              .embedded(embedded)
              .links(links)
              .activated(activated)
              .created(created)
              .credentials(credentials)
              .id(id)
              .lastLogin(lastLogin)
              .lastUpdated(lastUpdated)
              .passwordChanged(passwordChanged)
              .profile(profile)
              .status(status)
              .statusChanged(statusChanged)
              .transitioningToStatus(transitioningToStatus)
              .type(type)
              .strict(strict)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateProfile");
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
| **userId** | **String**|  | |
| **user** | [**User**](User.md)|  | |
| **strict** | **Boolean**|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProfile_0"></a>
# **updateProfile_0**
> User updateProfile_0(userId, user).strict(strict).execute();



Update a user&#39;s profile or credentials with partial update semantics.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    OffsetDateTime activated = OffsetDateTime.now();
    OffsetDateTime created = OffsetDateTime.now();
    UserCredentials credentials = new UserCredentials();
    String id = "id_example";
    OffsetDateTime lastLogin = OffsetDateTime.now();
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    OffsetDateTime passwordChanged = OffsetDateTime.now();
    UserProfile profile = new UserProfile();
    UserStatus status = UserStatus.fromValue("ACTIVE");
    OffsetDateTime statusChanged = OffsetDateTime.now();
    UserStatus transitioningToStatus = UserStatus.fromValue("ACTIVE");
    UserType type = new UserType();
    Boolean strict = true;
    try {
      User result = client
              .user
              .updateProfile_0(userId)
              .embedded(embedded)
              .links(links)
              .activated(activated)
              .created(created)
              .credentials(credentials)
              .id(id)
              .lastLogin(lastLogin)
              .lastUpdated(lastUpdated)
              .passwordChanged(passwordChanged)
              .profile(profile)
              .status(status)
              .statusChanged(statusChanged)
              .transitioningToStatus(transitioningToStatus)
              .type(type)
              .strict(strict)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getActivated());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getId());
      System.out.println(result.getLastLogin());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPasswordChanged());
      System.out.println(result.getProfile());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusChanged());
      System.out.println(result.getTransitioningToStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateProfile_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .user
              .updateProfile_0(userId)
              .embedded(embedded)
              .links(links)
              .activated(activated)
              .created(created)
              .credentials(credentials)
              .id(id)
              .lastLogin(lastLogin)
              .lastUpdated(lastUpdated)
              .passwordChanged(passwordChanged)
              .profile(profile)
              .status(status)
              .statusChanged(statusChanged)
              .transitioningToStatus(transitioningToStatus)
              .type(type)
              .strict(strict)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateProfile_0");
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
| **userId** | **String**|  | |
| **user** | [**User**](User.md)|  | |
| **strict** | **Boolean**|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateRecoveryQuestion"></a>
# **updateRecoveryQuestion**
> UserCredentials updateRecoveryQuestion(userId, userCredentials).execute();

Change Recovery Question

Changes a user&#39;s recovery question &amp; answer credential by validating the user&#39;s current password.  This operation can only be performed on users in **STAGED**, **ACTIVE** or **RECOVERY** &#x60;status&#x60; that have a valid password credential

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    PasswordCredential password = new PasswordCredential();
    AuthenticationProvider provider = new AuthenticationProvider();
    RecoveryQuestionCredential recoveryQuestion = new RecoveryQuestionCredential();
    try {
      UserCredentials result = client
              .user
              .updateRecoveryQuestion(userId)
              .password(password)
              .provider(provider)
              .recoveryQuestion(recoveryQuestion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPassword());
      System.out.println(result.getProvider());
      System.out.println(result.getRecoveryQuestion());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateRecoveryQuestion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserCredentials> response = client
              .user
              .updateRecoveryQuestion(userId)
              .password(password)
              .provider(provider)
              .recoveryQuestion(recoveryQuestion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateRecoveryQuestion");
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
| **userId** | **String**|  | |
| **userCredentials** | [**UserCredentials**](UserCredentials.md)|  | |

### Return type

[**UserCredentials**](UserCredentials.md)

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
> updateRolesCatalogApps(userId, roleId).execute();



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
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    try {
      client
              .user
              .updateRolesCatalogApps(userId, roleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateRolesCatalogApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .updateRolesCatalogApps(userId, roleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateRolesCatalogApps");
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
| **userId** | **String**|  | |
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
| **200** | Success |  -  |

<a name="updateRolesCatalogApps_0"></a>
# **updateRolesCatalogApps_0**
> updateRolesCatalogApps_0(userId, roleId, appName).execute();



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
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    String appName = "appName_example";
    try {
      client
              .user
              .updateRolesCatalogApps_0(userId, roleId, appName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateRolesCatalogApps_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .updateRolesCatalogApps_0(userId, roleId, appName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateRolesCatalogApps_0");
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
| **userId** | **String**|  | |
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

<a name="updateRolesCatalogApps_1"></a>
# **updateRolesCatalogApps_1**
> updateRolesCatalogApps_1(userId, roleId, groupId).execute();



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
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String userId = "userId_example";
    String roleId = "roleId_example";
    String groupId = "groupId_example";
    try {
      client
              .user
              .updateRolesCatalogApps_1(userId, roleId, groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateRolesCatalogApps_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .user
              .updateRolesCatalogApps_1(userId, roleId, groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateRolesCatalogApps_1");
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
| **userId** | **String**|  | |
| **roleId** | **String**|  | |
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
| **200** | Success |  -  |

