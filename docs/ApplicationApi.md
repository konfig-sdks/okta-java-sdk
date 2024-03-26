# ApplicationApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateClientSecret**](ApplicationApi.md#activateClientSecret) | **POST** /api/v1/apps/{appId}/credentials/secrets/{secretId}/lifecycle/activate | Activate a client secret |
| [**activateDefaultProvisioningConnection**](ApplicationApi.md#activateDefaultProvisioningConnection) | **POST** /api/v1/apps/{appId}/connections/default/lifecycle/activate | Activate default Provisioning Connection for application |
| [**activateInactive**](ApplicationApi.md#activateInactive) | **POST** /api/v1/apps/{appId}/lifecycle/activate | Activate Application |
| [**addClientSecret**](ApplicationApi.md#addClientSecret) | **POST** /api/v1/apps/{appId}/credentials/secrets | Add new client secret |
| [**assignGroupTo**](ApplicationApi.md#assignGroupTo) | **PUT** /api/v1/apps/{appId}/groups/{groupId} | Assign Group to Application |
| [**assignPolicyToApplication**](ApplicationApi.md#assignPolicyToApplication) | **PUT** /api/v1/apps/{appId}/policies/{policyId} | Update application policy |
| [**assignUserToApplication**](ApplicationApi.md#assignUserToApplication) | **POST** /api/v1/apps/{appId}/users | Assign User to Application for SSO &amp; Provisioning |
| [**cloneApplicationKeyCredential**](ApplicationApi.md#cloneApplicationKeyCredential) | **POST** /api/v1/apps/{appId}/credentials/keys/{keyId}/clone | Clone Application Key Credential |
| [**createNew**](ApplicationApi.md#createNew) | **POST** /api/v1/apps | Add Application |
| [**deactivateClientSecretById**](ApplicationApi.md#deactivateClientSecretById) | **POST** /api/v1/apps/{appId}/credentials/secrets/{secretId}/lifecycle/deactivate | Deactivate a client secret |
| [**deactivateDefaultProvisioningConnection**](ApplicationApi.md#deactivateDefaultProvisioningConnection) | **POST** /api/v1/apps/{appId}/connections/default/lifecycle/deactivate | Deactivate default Provisioning Connection for application |
| [**deactivateLifecycle**](ApplicationApi.md#deactivateLifecycle) | **POST** /api/v1/apps/{appId}/lifecycle/deactivate | Deactivate Application |
| [**deleteCsrById**](ApplicationApi.md#deleteCsrById) | **DELETE** /api/v1/apps/{appId}/credentials/csrs/{csrId} |  |
| [**generateCsrForApplication**](ApplicationApi.md#generateCsrForApplication) | **POST** /api/v1/apps/{appId}/credentials/csrs | Generate Certificate Signing Request for Application |
| [**generateX509Certificate**](ApplicationApi.md#generateX509Certificate) | **POST** /api/v1/apps/{appId}/credentials/keys/generate |  |
| [**getById**](ApplicationApi.md#getById) | **GET** /api/v1/apps/{appId} | Get Application |
| [**getClientSecret**](ApplicationApi.md#getClientSecret) | **GET** /api/v1/apps/{appId}/credentials/secrets/{secretId} | Get client secret |
| [**getCredentialsCsrs**](ApplicationApi.md#getCredentialsCsrs) | **GET** /api/v1/apps/{appId}/credentials/csrs/{csrId} |  |
| [**getDefaultProvisioningConnection**](ApplicationApi.md#getDefaultProvisioningConnection) | **GET** /api/v1/apps/{appId}/connections/default | Fetches the default Provisioning Connection for an application. |
| [**getFeature**](ApplicationApi.md#getFeature) | **GET** /api/v1/apps/{appId}/features/{name} | Fetches a Feature object for an application. |
| [**getGroupAssignment**](ApplicationApi.md#getGroupAssignment) | **GET** /api/v1/apps/{appId}/groups/{groupId} | Get Assigned Group for Application |
| [**getKeyCredential**](ApplicationApi.md#getKeyCredential) | **GET** /api/v1/apps/{appId}/credentials/keys/{keyId} | Get Key Credential for Application |
| [**getSingleScopeConsentGrant**](ApplicationApi.md#getSingleScopeConsentGrant) | **GET** /api/v1/apps/{appId}/grants/{grantId} |  |
| [**getSpecificUserAssignment**](ApplicationApi.md#getSpecificUserAssignment) | **GET** /api/v1/apps/{appId}/users/{userId} | Get Assigned User for Application |
| [**getToken**](ApplicationApi.md#getToken) | **GET** /api/v1/apps/{appId}/tokens/{tokenId} |  |
| [**grantConsentToScope**](ApplicationApi.md#grantConsentToScope) | **POST** /api/v1/apps/{appId}/grants |  |
| [**listApps**](ApplicationApi.md#listApps) | **GET** /api/v1/apps | List Applications |
| [**listAssignedUsers**](ApplicationApi.md#listAssignedUsers) | **GET** /api/v1/apps/{appId}/users | List Users Assigned to Application |
| [**listClientSecrets**](ApplicationApi.md#listClientSecrets) | **GET** /api/v1/apps/{appId}/credentials/secrets | List client secrets |
| [**listCsrsForApplication**](ApplicationApi.md#listCsrsForApplication) | **GET** /api/v1/apps/{appId}/credentials/csrs | List Certificate Signing Requests for Application |
| [**listFeatures**](ApplicationApi.md#listFeatures) | **GET** /api/v1/apps/{appId}/features | Fetches the Feature objects for an application. |
| [**listGroupsAssigned**](ApplicationApi.md#listGroupsAssigned) | **GET** /api/v1/apps/{appId}/groups | List Groups Assigned to Application |
| [**listKeyCredentials**](ApplicationApi.md#listKeyCredentials) | **GET** /api/v1/apps/{appId}/credentials/keys | List Key Credentials for Application |
| [**listScopeConsentGrants**](ApplicationApi.md#listScopeConsentGrants) | **GET** /api/v1/apps/{appId}/grants |  |
| [**listTokens**](ApplicationApi.md#listTokens) | **GET** /api/v1/apps/{appId}/tokens |  |
| [**previewSamlAppMetadata**](ApplicationApi.md#previewSamlAppMetadata) | **GET** /api/v1/apps/{appId}/sso/saml/metadata |  |
| [**publishCsrLifecycle**](ApplicationApi.md#publishCsrLifecycle) | **POST** /api/v1/apps/{appId}/credentials/csrs/{csrId}/lifecycle/publish |  |
| [**removeGroupAssignment**](ApplicationApi.md#removeGroupAssignment) | **DELETE** /api/v1/apps/{appId}/groups/{groupId} | Remove Group from Application |
| [**removeInactive**](ApplicationApi.md#removeInactive) | **DELETE** /api/v1/apps/{appId} | Delete Application |
| [**removeSecret**](ApplicationApi.md#removeSecret) | **DELETE** /api/v1/apps/{appId}/credentials/secrets/{secretId} |  |
| [**removeUserFrom**](ApplicationApi.md#removeUserFrom) | **DELETE** /api/v1/apps/{appId}/users/{userId} | Remove User from Application |
| [**revokeAllTokens**](ApplicationApi.md#revokeAllTokens) | **DELETE** /api/v1/apps/{appId}/tokens |  |
| [**revokePermission**](ApplicationApi.md#revokePermission) | **DELETE** /api/v1/apps/{appId}/grants/{grantId} |  |
| [**revokeToken**](ApplicationApi.md#revokeToken) | **DELETE** /api/v1/apps/{appId}/tokens/{tokenId} |  |
| [**setDefaultProvisioningConnection**](ApplicationApi.md#setDefaultProvisioningConnection) | **POST** /api/v1/apps/{appId}/connections/default | Sets the default Provisioning Connection for an application. |
| [**updateApplicationInOrg**](ApplicationApi.md#updateApplicationInOrg) | **PUT** /api/v1/apps/{appId} | Update Application |
| [**updateFeature**](ApplicationApi.md#updateFeature) | **PUT** /api/v1/apps/{appId}/features/{name} | Updates a Feature object for an application. |
| [**updateLogo**](ApplicationApi.md#updateLogo) | **POST** /api/v1/apps/{appId}/logo | The file must be in PNG, JPG, or GIF format, and less than 1 MB in size. For best results use landscape orientation, a transparent background, and a minimum size of 420px by 120px to prevent upscaling. |
| [**updateProfileForUser**](ApplicationApi.md#updateProfileForUser) | **POST** /api/v1/apps/{appId}/users/{userId} | Update Application Profile for Assigned User |


<a name="activateClientSecret"></a>
# **activateClientSecret**
> ClientSecret activateClientSecret(appId, secretId).execute();

Activate a client secret

Activates a specific client secret by secretId

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String secretId = "secretId_example";
    try {
      ClientSecret result = client
              .application
              .activateClientSecret(appId, secretId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getClientSecret());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getSecretHash());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#activateClientSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClientSecret> response = client
              .application
              .activateClientSecret(appId, secretId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#activateClientSecret");
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
| **appId** | **String**|  | |
| **secretId** | **String**|  | |

### Return type

[**ClientSecret**](ClientSecret.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="activateDefaultProvisioningConnection"></a>
# **activateDefaultProvisioningConnection**
> activateDefaultProvisioningConnection(appId).execute();

Activate default Provisioning Connection for application

Activates the default Provisioning Connection for an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      client
              .application
              .activateDefaultProvisioningConnection(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#activateDefaultProvisioningConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .activateDefaultProvisioningConnection(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#activateDefaultProvisioningConnection");
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
| **appId** | **String**|  | |

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
| **404** | Not Found |  -  |

<a name="activateInactive"></a>
# **activateInactive**
> activateInactive(appId).execute();

Activate Application

Activates an inactive application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      client
              .application
              .activateInactive(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#activateInactive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .activateInactive(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#activateInactive");
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
| **appId** | **String**|  | |

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

<a name="addClientSecret"></a>
# **addClientSecret**
> ClientSecret addClientSecret(appId, clientSecretMetadata).execute();

Add new client secret

Adds a new secret to the client&#39;s collection of secrets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String clientSecret = "clientSecret_example";
    try {
      ClientSecret result = client
              .application
              .addClientSecret(appId)
              .clientSecret(clientSecret)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getClientSecret());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getSecretHash());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#addClientSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClientSecret> response = client
              .application
              .addClientSecret(appId)
              .clientSecret(clientSecret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#addClientSecret");
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
| **appId** | **String**|  | |
| **clientSecretMetadata** | [**ClientSecretMetadata**](ClientSecretMetadata.md)|  | |

### Return type

[**ClientSecret**](ClientSecret.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="assignGroupTo"></a>
# **assignGroupTo**
> ApplicationGroupAssignment assignGroupTo(appId, groupId).applicationGroupAssignment(applicationGroupAssignment).execute();

Assign Group to Application

Assigns a group to an application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String groupId = "groupId_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    Integer priority = 56;
    Map<String, Object> profile = new HashMap();
    try {
      ApplicationGroupAssignment result = client
              .application
              .assignGroupTo(appId, groupId)
              .embedded(embedded)
              .links(links)
              .id(id)
              .lastUpdated(lastUpdated)
              .priority(priority)
              .profile(profile)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPriority());
      System.out.println(result.getProfile());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#assignGroupTo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationGroupAssignment> response = client
              .application
              .assignGroupTo(appId, groupId)
              .embedded(embedded)
              .links(links)
              .id(id)
              .lastUpdated(lastUpdated)
              .priority(priority)
              .profile(profile)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#assignGroupTo");
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
| **appId** | **String**|  | |
| **groupId** | **String**|  | |
| **applicationGroupAssignment** | [**ApplicationGroupAssignment**](ApplicationGroupAssignment.md)|  | [optional] |

### Return type

[**ApplicationGroupAssignment**](ApplicationGroupAssignment.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="assignPolicyToApplication"></a>
# **assignPolicyToApplication**
> assignPolicyToApplication(appId, policyId).execute();

Update application policy

Assign an application to a specific policy. This unassigns the application from its currently assigned policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String policyId = "policyId_example";
    try {
      client
              .application
              .assignPolicyToApplication(appId, policyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#assignPolicyToApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .assignPolicyToApplication(appId, policyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#assignPolicyToApplication");
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
| **appId** | **String**|  | |
| **policyId** | **String**|  | |

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

<a name="assignUserToApplication"></a>
# **assignUserToApplication**
> AppUser assignUserToApplication(appId, appUser).execute();

Assign User to Application for SSO &amp; Provisioning

Assigns an user to an application with [credentials](https://raw.githubusercontent.com) and an app-specific [profile](https://raw.githubusercontent.com). Profile mappings defined for the application are first applied before applying any profile properties specified in the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    AppUserCredentials credentials = new AppUserCredentials();
    String externalId = "externalId_example";
    String id = "id_example";
    OffsetDateTime lastSync = OffsetDateTime.now();
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    OffsetDateTime passwordChanged = OffsetDateTime.now();
    Map<String, Object> profile = new HashMap();
    String scope = "scope_example";
    String status = "status_example";
    OffsetDateTime statusChanged = OffsetDateTime.now();
    String syncState = "syncState_example";
    try {
      AppUser result = client
              .application
              .assignUserToApplication(appId)
              .embedded(embedded)
              .links(links)
              .created(created)
              .credentials(credentials)
              .externalId(externalId)
              .id(id)
              .lastSync(lastSync)
              .lastUpdated(lastUpdated)
              .passwordChanged(passwordChanged)
              .profile(profile)
              .scope(scope)
              .status(status)
              .statusChanged(statusChanged)
              .syncState(syncState)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getExternalId());
      System.out.println(result.getId());
      System.out.println(result.getLastSync());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPasswordChanged());
      System.out.println(result.getProfile());
      System.out.println(result.getScope());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusChanged());
      System.out.println(result.getSyncState());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#assignUserToApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppUser> response = client
              .application
              .assignUserToApplication(appId)
              .embedded(embedded)
              .links(links)
              .created(created)
              .credentials(credentials)
              .externalId(externalId)
              .id(id)
              .lastSync(lastSync)
              .lastUpdated(lastUpdated)
              .passwordChanged(passwordChanged)
              .profile(profile)
              .scope(scope)
              .status(status)
              .statusChanged(statusChanged)
              .syncState(syncState)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#assignUserToApplication");
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
| **appId** | **String**|  | |
| **appUser** | [**AppUser**](AppUser.md)|  | |

### Return type

[**AppUser**](AppUser.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="cloneApplicationKeyCredential"></a>
# **cloneApplicationKeyCredential**
> JsonWebKey cloneApplicationKeyCredential(appId, keyId, targetAid).execute();

Clone Application Key Credential

Clones a X.509 certificate for an application key credential from a source application to target application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String keyId = "keyId_example";
    String targetAid = "targetAid_example"; // Unique key of the target Application
    try {
      JsonWebKey result = client
              .application
              .cloneApplicationKeyCredential(appId, keyId, targetAid)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#cloneApplicationKeyCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .application
              .cloneApplicationKeyCredential(appId, keyId, targetAid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#cloneApplicationKeyCredential");
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
| **appId** | **String**|  | |
| **keyId** | **String**|  | |
| **targetAid** | **String**| Unique key of the target Application | |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="createNew"></a>
# **createNew**
> Application createNew(application).activate(activate).oktaAccessGatewayAgent(oktaAccessGatewayAgent).execute();

Add Application

Adds a new application to your Okta organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    ApplicationAccessibility accessibility = new ApplicationAccessibility();
    OffsetDateTime created = OffsetDateTime.now();
    ApplicationCredentials credentials = new ApplicationCredentials();
    List<String> features = Arrays.asList();
    String id = "id_example";
    String label = "label_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    ApplicationLicensing licensing = new ApplicationLicensing();
    String name = "name_example";
    Map<String, Object> profile = new HashMap();
    ApplicationSettings settings = new ApplicationSettings();
    ApplicationSignOnMode signOnMode = ApplicationSignOnMode.fromValue("BOOKMARK");
    String status = "ACTIVE";
    ApplicationVisibility visibility = new ApplicationVisibility();
    Boolean activate = true; // Executes activation lifecycle operation when creating the app
    String oktaAccessGatewayAgent = "oktaAccessGatewayAgent_example";
    try {
      Application result = client
              .application
              .createNew()
              .embedded(embedded)
              .links(links)
              .accessibility(accessibility)
              .created(created)
              .credentials(credentials)
              .features(features)
              .id(id)
              .label(label)
              .lastUpdated(lastUpdated)
              .licensing(licensing)
              .name(name)
              .profile(profile)
              .settings(settings)
              .signOnMode(signOnMode)
              .status(status)
              .visibility(visibility)
              .activate(activate)
              .oktaAccessGatewayAgent(oktaAccessGatewayAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getAccessibility());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getFeatures());
      System.out.println(result.getId());
      System.out.println(result.getLabel());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLicensing());
      System.out.println(result.getName());
      System.out.println(result.getProfile());
      System.out.println(result.getSettings());
      System.out.println(result.getSignOnMode());
      System.out.println(result.getStatus());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Application> response = client
              .application
              .createNew()
              .embedded(embedded)
              .links(links)
              .accessibility(accessibility)
              .created(created)
              .credentials(credentials)
              .features(features)
              .id(id)
              .label(label)
              .lastUpdated(lastUpdated)
              .licensing(licensing)
              .name(name)
              .profile(profile)
              .settings(settings)
              .signOnMode(signOnMode)
              .status(status)
              .visibility(visibility)
              .activate(activate)
              .oktaAccessGatewayAgent(oktaAccessGatewayAgent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#createNew");
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
| **application** | [**Application**](Application.md)|  | |
| **activate** | **Boolean**| Executes activation lifecycle operation when creating the app | [optional] [default to true] |
| **oktaAccessGatewayAgent** | **String**|  | [optional] |

### Return type

[**Application**](Application.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deactivateClientSecretById"></a>
# **deactivateClientSecretById**
> ClientSecret deactivateClientSecretById(appId, secretId).execute();

Deactivate a client secret

Deactivates a specific client secret by secretId

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String secretId = "secretId_example";
    try {
      ClientSecret result = client
              .application
              .deactivateClientSecretById(appId, secretId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getClientSecret());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getSecretHash());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#deactivateClientSecretById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClientSecret> response = client
              .application
              .deactivateClientSecretById(appId, secretId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#deactivateClientSecretById");
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
| **appId** | **String**|  | |
| **secretId** | **String**|  | |

### Return type

[**ClientSecret**](ClientSecret.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deactivateDefaultProvisioningConnection"></a>
# **deactivateDefaultProvisioningConnection**
> deactivateDefaultProvisioningConnection(appId).execute();

Deactivate default Provisioning Connection for application

Deactivates the default Provisioning Connection for an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      client
              .application
              .deactivateDefaultProvisioningConnection(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#deactivateDefaultProvisioningConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .deactivateDefaultProvisioningConnection(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#deactivateDefaultProvisioningConnection");
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
| **appId** | **String**|  | |

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
| **404** | Not Found |  -  |

<a name="deactivateLifecycle"></a>
# **deactivateLifecycle**
> deactivateLifecycle(appId).execute();

Deactivate Application

Deactivates an active application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      client
              .application
              .deactivateLifecycle(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#deactivateLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .deactivateLifecycle(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#deactivateLifecycle");
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
| **appId** | **String**|  | |

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

<a name="deleteCsrById"></a>
# **deleteCsrById**
> deleteCsrById(appId, csrId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String csrId = "csrId_example";
    try {
      client
              .application
              .deleteCsrById(appId, csrId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#deleteCsrById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .deleteCsrById(appId, csrId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#deleteCsrById");
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
| **appId** | **String**|  | |
| **csrId** | **String**|  | |

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

<a name="generateCsrForApplication"></a>
# **generateCsrForApplication**
> Csr generateCsrForApplication(appId, csrMetadata).execute();

Generate Certificate Signing Request for Application

Generates a new key pair and returns the Certificate Signing Request for it.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    CsrMetadataSubject subject = new CsrMetadataSubject();
    CsrMetadataSubjectAltNames subjectAltNames = new CsrMetadataSubjectAltNames();
    try {
      Csr result = client
              .application
              .generateCsrForApplication(appId)
              .subject(subject)
              .subjectAltNames(subjectAltNames)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreated());
      System.out.println(result.getCsr());
      System.out.println(result.getId());
      System.out.println(result.getKty());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#generateCsrForApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Csr> response = client
              .application
              .generateCsrForApplication(appId)
              .subject(subject)
              .subjectAltNames(subjectAltNames)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#generateCsrForApplication");
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
| **appId** | **String**|  | |
| **csrMetadata** | [**CsrMetadata**](CsrMetadata.md)|  | |

### Return type

[**Csr**](Csr.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="generateX509Certificate"></a>
# **generateX509Certificate**
> JsonWebKey generateX509Certificate(appId).validityYears(validityYears).execute();



Generates a new X.509 certificate for an application key credential

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    Integer validityYears = 56;
    try {
      JsonWebKey result = client
              .application
              .generateX509Certificate(appId)
              .validityYears(validityYears)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#generateX509Certificate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .application
              .generateX509Certificate(appId)
              .validityYears(validityYears)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#generateX509Certificate");
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
| **appId** | **String**|  | |
| **validityYears** | **Integer**|  | [optional] |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="getById"></a>
# **getById**
> Application getById(appId).expand(expand).execute();

Get Application

Fetches an application from your Okta organization by &#x60;id&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String expand = "expand_example";
    try {
      Application result = client
              .application
              .getById(appId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getAccessibility());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getFeatures());
      System.out.println(result.getId());
      System.out.println(result.getLabel());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLicensing());
      System.out.println(result.getName());
      System.out.println(result.getProfile());
      System.out.println(result.getSettings());
      System.out.println(result.getSignOnMode());
      System.out.println(result.getStatus());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Application> response = client
              .application
              .getById(appId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getById");
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
| **appId** | **String**|  | |
| **expand** | **String**|  | [optional] |

### Return type

[**Application**](Application.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getClientSecret"></a>
# **getClientSecret**
> ClientSecret getClientSecret(appId, secretId).execute();

Get client secret

Gets a specific client secret by secretId

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String secretId = "secretId_example";
    try {
      ClientSecret result = client
              .application
              .getClientSecret(appId, secretId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getClientSecret());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getSecretHash());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getClientSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClientSecret> response = client
              .application
              .getClientSecret(appId, secretId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getClientSecret");
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
| **appId** | **String**|  | |
| **secretId** | **String**|  | |

### Return type

[**ClientSecret**](ClientSecret.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCredentialsCsrs"></a>
# **getCredentialsCsrs**
> Csr getCredentialsCsrs(appId, csrId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String csrId = "csrId_example";
    try {
      Csr result = client
              .application
              .getCredentialsCsrs(appId, csrId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreated());
      System.out.println(result.getCsr());
      System.out.println(result.getId());
      System.out.println(result.getKty());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getCredentialsCsrs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Csr> response = client
              .application
              .getCredentialsCsrs(appId, csrId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getCredentialsCsrs");
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
| **appId** | **String**|  | |
| **csrId** | **String**|  | |

### Return type

[**Csr**](Csr.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDefaultProvisioningConnection"></a>
# **getDefaultProvisioningConnection**
> ProvisioningConnection getDefaultProvisioningConnection(appId).execute();

Fetches the default Provisioning Connection for an application.

Get default Provisioning Connection for application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      ProvisioningConnection result = client
              .application
              .getDefaultProvisioningConnection(appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAuthScheme());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getDefaultProvisioningConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProvisioningConnection> response = client
              .application
              .getDefaultProvisioningConnection(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getDefaultProvisioningConnection");
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
| **appId** | **String**|  | |

### Return type

[**ProvisioningConnection**](ProvisioningConnection.md)

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

<a name="getFeature"></a>
# **getFeature**
> ApplicationFeature getFeature(appId, name).execute();

Fetches a Feature object for an application.

Fetches a Feature object for an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String name = "name_example";
    try {
      ApplicationFeature result = client
              .application
              .getFeature(appId, name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getCapabilities());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getFeature");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationFeature> response = client
              .application
              .getFeature(appId, name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getFeature");
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
| **appId** | **String**|  | |
| **name** | **String**|  | |

### Return type

[**ApplicationFeature**](ApplicationFeature.md)

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

<a name="getGroupAssignment"></a>
# **getGroupAssignment**
> ApplicationGroupAssignment getGroupAssignment(appId, groupId).expand(expand).execute();

Get Assigned Group for Application

Fetches an application group assignment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String groupId = "groupId_example";
    String expand = "expand_example";
    try {
      ApplicationGroupAssignment result = client
              .application
              .getGroupAssignment(appId, groupId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPriority());
      System.out.println(result.getProfile());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getGroupAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationGroupAssignment> response = client
              .application
              .getGroupAssignment(appId, groupId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getGroupAssignment");
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
| **appId** | **String**|  | |
| **groupId** | **String**|  | |
| **expand** | **String**|  | [optional] |

### Return type

[**ApplicationGroupAssignment**](ApplicationGroupAssignment.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getKeyCredential"></a>
# **getKeyCredential**
> JsonWebKey getKeyCredential(appId, keyId).execute();

Get Key Credential for Application

Gets a specific application key credential by kid

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String keyId = "keyId_example";
    try {
      JsonWebKey result = client
              .application
              .getKeyCredential(appId, keyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getKeyCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .application
              .getKeyCredential(appId, keyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getKeyCredential");
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
| **appId** | **String**|  | |
| **keyId** | **String**|  | |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSingleScopeConsentGrant"></a>
# **getSingleScopeConsentGrant**
> OAuth2ScopeConsentGrant getSingleScopeConsentGrant(appId, grantId).expand(expand).execute();



Fetches a single scope consent grant for the application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String grantId = "grantId_example";
    String expand = "expand_example";
    try {
      OAuth2ScopeConsentGrant result = client
              .application
              .getSingleScopeConsentGrant(appId, grantId)
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
      System.err.println("Exception when calling ApplicationApi#getSingleScopeConsentGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2ScopeConsentGrant> response = client
              .application
              .getSingleScopeConsentGrant(appId, grantId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getSingleScopeConsentGrant");
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
| **appId** | **String**|  | |
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

<a name="getSpecificUserAssignment"></a>
# **getSpecificUserAssignment**
> AppUser getSpecificUserAssignment(appId, userId).expand(expand).execute();

Get Assigned User for Application

Fetches a specific user assignment for application by &#x60;id&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String userId = "userId_example";
    String expand = "expand_example";
    try {
      AppUser result = client
              .application
              .getSpecificUserAssignment(appId, userId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getExternalId());
      System.out.println(result.getId());
      System.out.println(result.getLastSync());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPasswordChanged());
      System.out.println(result.getProfile());
      System.out.println(result.getScope());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusChanged());
      System.out.println(result.getSyncState());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getSpecificUserAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppUser> response = client
              .application
              .getSpecificUserAssignment(appId, userId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getSpecificUserAssignment");
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
| **appId** | **String**|  | |
| **userId** | **String**|  | |
| **expand** | **String**|  | [optional] |

### Return type

[**AppUser**](AppUser.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getToken"></a>
# **getToken**
> OAuth2Token getToken(appId, tokenId).expand(expand).execute();



Gets a token for the specified application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String tokenId = "tokenId_example";
    String expand = "expand_example";
    try {
      OAuth2Token result = client
              .application
              .getToken(appId, tokenId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getClientId());
      System.out.println(result.getCreated());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getId());
      System.out.println(result.getIssuer());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getScopes());
      System.out.println(result.getStatus());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2Token> response = client
              .application
              .getToken(appId, tokenId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getToken");
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
| **appId** | **String**|  | |
| **tokenId** | **String**|  | |
| **expand** | **String**|  | [optional] |

### Return type

[**OAuth2Token**](OAuth2Token.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="grantConsentToScope"></a>
# **grantConsentToScope**
> OAuth2ScopeConsentGrant grantConsentToScope(appId, oauth2ScopeConsentGrant).execute();



Grants consent for the application to request an OAuth 2.0 Okta scope

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    String clientId = "clientId_example";
    OffsetDateTime created = OffsetDateTime.now();
    OAuth2Actor createdBy = new OAuth2Actor();
    String id = "id_example";
    String issuer = "issuer_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String scopeId = "scopeId_example";
    OAuth2ScopeConsentGrantSource source = OAuth2ScopeConsentGrantSource.fromValue("END_USER");
    OAuth2ScopeConsentGrantStatus status = OAuth2ScopeConsentGrantStatus.fromValue("ACTIVE");
    String userId = "userId_example";
    try {
      OAuth2ScopeConsentGrant result = client
              .application
              .grantConsentToScope(appId)
              .embedded(embedded)
              .links(links)
              .clientId(clientId)
              .created(created)
              .createdBy(createdBy)
              .id(id)
              .issuer(issuer)
              .lastUpdated(lastUpdated)
              .scopeId(scopeId)
              .source(source)
              .status(status)
              .userId(userId)
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
      System.err.println("Exception when calling ApplicationApi#grantConsentToScope");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2ScopeConsentGrant> response = client
              .application
              .grantConsentToScope(appId)
              .embedded(embedded)
              .links(links)
              .clientId(clientId)
              .created(created)
              .createdBy(createdBy)
              .id(id)
              .issuer(issuer)
              .lastUpdated(lastUpdated)
              .scopeId(scopeId)
              .source(source)
              .status(status)
              .userId(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#grantConsentToScope");
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
| **appId** | **String**|  | |
| **oauth2ScopeConsentGrant** | [**OAuth2ScopeConsentGrant**](OAuth2ScopeConsentGrant.md)|  | |

### Return type

[**OAuth2ScopeConsentGrant**](OAuth2ScopeConsentGrant.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="listApps"></a>
# **listApps**
> List&lt;Application&gt; listApps().q(q).after(after).limit(limit).filter(filter).expand(expand).includeNonDeleted(includeNonDeleted).execute();

List Applications

Enumerates apps added to your organization with pagination. A subset of apps can be returned that match a supported filter expression or query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String q = "q_example";
    String after = "after_example"; // Specifies the pagination cursor for the next page of apps
    Integer limit = -1; // Specifies the number of results for a page
    String filter = "filter_example"; // Filters apps by status, user.id, group.id or credentials.signing.kid expression
    String expand = "expand_example"; // Traverses users link relationship and optionally embeds Application User resource
    Boolean includeNonDeleted = false;
    try {
      List<Application> result = client
              .application
              .listApps()
              .q(q)
              .after(after)
              .limit(limit)
              .filter(filter)
              .expand(expand)
              .includeNonDeleted(includeNonDeleted)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Application>> response = client
              .application
              .listApps()
              .q(q)
              .after(after)
              .limit(limit)
              .filter(filter)
              .expand(expand)
              .includeNonDeleted(includeNonDeleted)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listApps");
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
| **q** | **String**|  | [optional] |
| **after** | **String**| Specifies the pagination cursor for the next page of apps | [optional] |
| **limit** | **Integer**| Specifies the number of results for a page | [optional] [default to -1] |
| **filter** | **String**| Filters apps by status, user.id, group.id or credentials.signing.kid expression | [optional] |
| **expand** | **String**| Traverses users link relationship and optionally embeds Application User resource | [optional] |
| **includeNonDeleted** | **Boolean**|  | [optional] [default to false] |

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

<a name="listAssignedUsers"></a>
# **listAssignedUsers**
> List&lt;AppUser&gt; listAssignedUsers(appId).q(q).queryScope(queryScope).after(after).limit(limit).filter(filter).expand(expand).execute();

List Users Assigned to Application

Enumerates all assigned [application users](https://raw.githubusercontent.com) for an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String q = "q_example";
    String queryScope = "queryScope_example";
    String after = "after_example"; // specifies the pagination cursor for the next page of assignments
    Integer limit = -1; // specifies the number of results for a page
    String filter = "filter_example";
    String expand = "expand_example";
    try {
      List<AppUser> result = client
              .application
              .listAssignedUsers(appId)
              .q(q)
              .queryScope(queryScope)
              .after(after)
              .limit(limit)
              .filter(filter)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listAssignedUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AppUser>> response = client
              .application
              .listAssignedUsers(appId)
              .q(q)
              .queryScope(queryScope)
              .after(after)
              .limit(limit)
              .filter(filter)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listAssignedUsers");
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
| **appId** | **String**|  | |
| **q** | **String**|  | [optional] |
| **queryScope** | **String**|  | [optional] |
| **after** | **String**| specifies the pagination cursor for the next page of assignments | [optional] |
| **limit** | **Integer**| specifies the number of results for a page | [optional] [default to -1] |
| **filter** | **String**|  | [optional] |
| **expand** | **String**|  | [optional] |

### Return type

[**List&lt;AppUser&gt;**](AppUser.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listClientSecrets"></a>
# **listClientSecrets**
> List&lt;ClientSecret&gt; listClientSecrets(appId).execute();

List client secrets

Enumerates the client&#39;s collection of secrets

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      List<ClientSecret> result = client
              .application
              .listClientSecrets(appId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listClientSecrets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ClientSecret>> response = client
              .application
              .listClientSecrets(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listClientSecrets");
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
| **appId** | **String**|  | |

### Return type

[**List&lt;ClientSecret&gt;**](ClientSecret.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listCsrsForApplication"></a>
# **listCsrsForApplication**
> List&lt;Csr&gt; listCsrsForApplication(appId).execute();

List Certificate Signing Requests for Application

Enumerates Certificate Signing Requests for an application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      List<Csr> result = client
              .application
              .listCsrsForApplication(appId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listCsrsForApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Csr>> response = client
              .application
              .listCsrsForApplication(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listCsrsForApplication");
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
| **appId** | **String**|  | |

### Return type

[**List&lt;Csr&gt;**](Csr.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listFeatures"></a>
# **listFeatures**
> List&lt;ApplicationFeature&gt; listFeatures(appId).execute();

Fetches the Feature objects for an application.

List Features for application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      List<ApplicationFeature> result = client
              .application
              .listFeatures(appId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listFeatures");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicationFeature>> response = client
              .application
              .listFeatures(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listFeatures");
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
| **appId** | **String**|  | |

### Return type

[**List&lt;ApplicationFeature&gt;**](ApplicationFeature.md)

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

<a name="listGroupsAssigned"></a>
# **listGroupsAssigned**
> List&lt;ApplicationGroupAssignment&gt; listGroupsAssigned(appId).q(q).after(after).limit(limit).expand(expand).execute();

List Groups Assigned to Application

Enumerates group assignments for an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String q = "q_example";
    String after = "after_example"; // Specifies the pagination cursor for the next page of assignments
    Integer limit = -1; // Specifies the number of results for a page
    String expand = "expand_example";
    try {
      List<ApplicationGroupAssignment> result = client
              .application
              .listGroupsAssigned(appId)
              .q(q)
              .after(after)
              .limit(limit)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listGroupsAssigned");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicationGroupAssignment>> response = client
              .application
              .listGroupsAssigned(appId)
              .q(q)
              .after(after)
              .limit(limit)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listGroupsAssigned");
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
| **appId** | **String**|  | |
| **q** | **String**|  | [optional] |
| **after** | **String**| Specifies the pagination cursor for the next page of assignments | [optional] |
| **limit** | **Integer**| Specifies the number of results for a page | [optional] [default to -1] |
| **expand** | **String**|  | [optional] |

### Return type

[**List&lt;ApplicationGroupAssignment&gt;**](ApplicationGroupAssignment.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listKeyCredentials"></a>
# **listKeyCredentials**
> List&lt;JsonWebKey&gt; listKeyCredentials(appId).execute();

List Key Credentials for Application

Enumerates key credentials for an application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      List<JsonWebKey> result = client
              .application
              .listKeyCredentials(appId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listKeyCredentials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<JsonWebKey>> response = client
              .application
              .listKeyCredentials(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listKeyCredentials");
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
| **appId** | **String**|  | |

### Return type

[**List&lt;JsonWebKey&gt;**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listScopeConsentGrants"></a>
# **listScopeConsentGrants**
> List&lt;OAuth2ScopeConsentGrant&gt; listScopeConsentGrants(appId).expand(expand).execute();



Lists all scope consent grants for the application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String expand = "expand_example";
    try {
      List<OAuth2ScopeConsentGrant> result = client
              .application
              .listScopeConsentGrants(appId)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listScopeConsentGrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2ScopeConsentGrant>> response = client
              .application
              .listScopeConsentGrants(appId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listScopeConsentGrants");
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
| **appId** | **String**|  | |
| **expand** | **String**|  | [optional] |

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

<a name="listTokens"></a>
# **listTokens**
> List&lt;OAuth2Token&gt; listTokens(appId).expand(expand).after(after).limit(limit).execute();



Lists all tokens for the application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String expand = "expand_example";
    String after = "after_example";
    Integer limit = 20;
    try {
      List<OAuth2Token> result = client
              .application
              .listTokens(appId)
              .expand(expand)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#listTokens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2Token>> response = client
              .application
              .listTokens(appId)
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
      System.err.println("Exception when calling ApplicationApi#listTokens");
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
| **appId** | **String**|  | |
| **expand** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**List&lt;OAuth2Token&gt;**](OAuth2Token.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="previewSamlAppMetadata"></a>
# **previewSamlAppMetadata**
> ApplicationPreviewSamlAppMetadataResponse previewSamlAppMetadata(appId, kid).execute();



Previews SAML metadata based on a specific key credential for an application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String kid = "kid_example"; // unique key identifier of an Application Key Credential
    try {
      ApplicationPreviewSamlAppMetadataResponse result = client
              .application
              .previewSamlAppMetadata(appId, kid)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntityDescriptor());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#previewSamlAppMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationPreviewSamlAppMetadataResponse> response = client
              .application
              .previewSamlAppMetadata(appId, kid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#previewSamlAppMetadata");
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
| **appId** | **String**|  | |
| **kid** | **String**| unique key identifier of an Application Key Credential | |

### Return type

[**ApplicationPreviewSamlAppMetadataResponse**](ApplicationPreviewSamlAppMetadataResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="publishCsrLifecycle"></a>
# **publishCsrLifecycle**
> JsonWebKey publishCsrLifecycle(appId, csrId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String csrId = "csrId_example";
    try {
      JsonWebKey result = client
              .application
              .publishCsrLifecycle(appId, csrId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#publishCsrLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .application
              .publishCsrLifecycle(appId, csrId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#publishCsrLifecycle");
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
| **appId** | **String**|  | |
| **csrId** | **String**|  | |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="removeGroupAssignment"></a>
# **removeGroupAssignment**
> removeGroupAssignment(appId, groupId).execute();

Remove Group from Application

Removes a group assignment from an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String groupId = "groupId_example";
    try {
      client
              .application
              .removeGroupAssignment(appId, groupId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeGroupAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .removeGroupAssignment(appId, groupId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeGroupAssignment");
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
| **appId** | **String**|  | |
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

<a name="removeInactive"></a>
# **removeInactive**
> removeInactive(appId).execute();

Delete Application

Removes an inactive application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      client
              .application
              .removeInactive(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeInactive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .removeInactive(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeInactive");
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
| **appId** | **String**|  | |

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

<a name="removeSecret"></a>
# **removeSecret**
> removeSecret(appId, secretId).execute();



Removes a secret from the client&#39;s collection of secrets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String secretId = "secretId_example";
    try {
      client
              .application
              .removeSecret(appId, secretId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .removeSecret(appId, secretId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeSecret");
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
| **appId** | **String**|  | |
| **secretId** | **String**|  | |

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
> removeUserFrom(appId, userId).sendEmail(sendEmail).execute();

Remove User from Application

Removes an assignment for a user from an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String userId = "userId_example";
    Boolean sendEmail = false;
    try {
      client
              .application
              .removeUserFrom(appId, userId)
              .sendEmail(sendEmail)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeUserFrom");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .removeUserFrom(appId, userId)
              .sendEmail(sendEmail)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeUserFrom");
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
| **appId** | **String**|  | |
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
| **204** | No Content |  -  |

<a name="revokeAllTokens"></a>
# **revokeAllTokens**
> revokeAllTokens(appId).execute();



Revokes all tokens for the specified application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    try {
      client
              .application
              .revokeAllTokens(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#revokeAllTokens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .revokeAllTokens(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#revokeAllTokens");
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
| **appId** | **String**|  | |

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

<a name="revokePermission"></a>
# **revokePermission**
> revokePermission(appId, grantId).execute();



Revokes permission for the application to request the given scope

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String grantId = "grantId_example";
    try {
      client
              .application
              .revokePermission(appId, grantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#revokePermission");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .revokePermission(appId, grantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#revokePermission");
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
| **appId** | **String**|  | |
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

<a name="revokeToken"></a>
# **revokeToken**
> revokeToken(appId, tokenId).execute();



Revokes the specified token for the specified application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String tokenId = "tokenId_example";
    try {
      client
              .application
              .revokeToken(appId, tokenId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#revokeToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .revokeToken(appId, tokenId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#revokeToken");
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
| **appId** | **String**|  | |
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

<a name="setDefaultProvisioningConnection"></a>
# **setDefaultProvisioningConnection**
> ProvisioningConnection setDefaultProvisioningConnection(appId, provisioningConnectionRequest).activate(activate).execute();

Sets the default Provisioning Connection for an application.

Set default Provisioning Connection for application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    ProvisioningConnectionProfile profile = new ProvisioningConnectionProfile();
    Boolean activate = true;
    try {
      ProvisioningConnection result = client
              .application
              .setDefaultProvisioningConnection(appId)
              .profile(profile)
              .activate(activate)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAuthScheme());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#setDefaultProvisioningConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProvisioningConnection> response = client
              .application
              .setDefaultProvisioningConnection(appId)
              .profile(profile)
              .activate(activate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#setDefaultProvisioningConnection");
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
| **appId** | **String**|  | |
| **provisioningConnectionRequest** | [**ProvisioningConnectionRequest**](ProvisioningConnectionRequest.md)|  | |
| **activate** | **Boolean**|  | [optional] |

### Return type

[**ProvisioningConnection**](ProvisioningConnection.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="updateApplicationInOrg"></a>
# **updateApplicationInOrg**
> Application updateApplicationInOrg(appId, application).execute();

Update Application

Updates an application in your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    ApplicationAccessibility accessibility = new ApplicationAccessibility();
    OffsetDateTime created = OffsetDateTime.now();
    ApplicationCredentials credentials = new ApplicationCredentials();
    List<String> features = Arrays.asList();
    String id = "id_example";
    String label = "label_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    ApplicationLicensing licensing = new ApplicationLicensing();
    String name = "name_example";
    Map<String, Object> profile = new HashMap();
    ApplicationSettings settings = new ApplicationSettings();
    ApplicationSignOnMode signOnMode = ApplicationSignOnMode.fromValue("BOOKMARK");
    String status = "ACTIVE";
    ApplicationVisibility visibility = new ApplicationVisibility();
    try {
      Application result = client
              .application
              .updateApplicationInOrg(appId)
              .embedded(embedded)
              .links(links)
              .accessibility(accessibility)
              .created(created)
              .credentials(credentials)
              .features(features)
              .id(id)
              .label(label)
              .lastUpdated(lastUpdated)
              .licensing(licensing)
              .name(name)
              .profile(profile)
              .settings(settings)
              .signOnMode(signOnMode)
              .status(status)
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getAccessibility());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getFeatures());
      System.out.println(result.getId());
      System.out.println(result.getLabel());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLicensing());
      System.out.println(result.getName());
      System.out.println(result.getProfile());
      System.out.println(result.getSettings());
      System.out.println(result.getSignOnMode());
      System.out.println(result.getStatus());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateApplicationInOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Application> response = client
              .application
              .updateApplicationInOrg(appId)
              .embedded(embedded)
              .links(links)
              .accessibility(accessibility)
              .created(created)
              .credentials(credentials)
              .features(features)
              .id(id)
              .label(label)
              .lastUpdated(lastUpdated)
              .licensing(licensing)
              .name(name)
              .profile(profile)
              .settings(settings)
              .signOnMode(signOnMode)
              .status(status)
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateApplicationInOrg");
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
| **appId** | **String**|  | |
| **application** | [**Application**](Application.md)|  | |

### Return type

[**Application**](Application.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateFeature"></a>
# **updateFeature**
> ApplicationFeature updateFeature(appId, name, capabilitiesObject).execute();

Updates a Feature object for an application.

Updates a Feature object for an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String name = "name_example";
    CapabilitiesCreateObject create = new CapabilitiesCreateObject();
    CapabilitiesUpdateObject update = new CapabilitiesUpdateObject();
    try {
      ApplicationFeature result = client
              .application
              .updateFeature(appId, name)
              .create(create)
              .update(update)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getCapabilities());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateFeature");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationFeature> response = client
              .application
              .updateFeature(appId, name)
              .create(create)
              .update(update)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateFeature");
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
| **appId** | **String**|  | |
| **name** | **String**|  | |
| **capabilitiesObject** | [**CapabilitiesObject**](CapabilitiesObject.md)|  | |

### Return type

[**ApplicationFeature**](ApplicationFeature.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

<a name="updateLogo"></a>
# **updateLogo**
> updateLogo(appId, applicationUpdateLogoRequest).execute();

The file must be in PNG, JPG, or GIF format, and less than 1 MB in size. For best results use landscape orientation, a transparent background, and a minimum size of 420px by 120px to prevent upscaling.

Update the logo for an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    File _file = new File("/path/to/file");
    String appId = "appId_example";
    try {
      client
              .application
              .updateLogo(_file, appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .updateLogo(_file, appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateLogo");
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
| **appId** | **String**|  | |
| **applicationUpdateLogoRequest** | [**ApplicationUpdateLogoRequest**](ApplicationUpdateLogoRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="updateProfileForUser"></a>
# **updateProfileForUser**
> AppUser updateProfileForUser(appId, userId, appUser).execute();

Update Application Profile for Assigned User

Updates a user&#39;s profile for an application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appId = "appId_example";
    String userId = "userId_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    AppUserCredentials credentials = new AppUserCredentials();
    String externalId = "externalId_example";
    String id = "id_example";
    OffsetDateTime lastSync = OffsetDateTime.now();
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    OffsetDateTime passwordChanged = OffsetDateTime.now();
    Map<String, Object> profile = new HashMap();
    String scope = "scope_example";
    String status = "status_example";
    OffsetDateTime statusChanged = OffsetDateTime.now();
    String syncState = "syncState_example";
    try {
      AppUser result = client
              .application
              .updateProfileForUser(appId, userId)
              .embedded(embedded)
              .links(links)
              .created(created)
              .credentials(credentials)
              .externalId(externalId)
              .id(id)
              .lastSync(lastSync)
              .lastUpdated(lastUpdated)
              .passwordChanged(passwordChanged)
              .profile(profile)
              .scope(scope)
              .status(status)
              .statusChanged(statusChanged)
              .syncState(syncState)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getExternalId());
      System.out.println(result.getId());
      System.out.println(result.getLastSync());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPasswordChanged());
      System.out.println(result.getProfile());
      System.out.println(result.getScope());
      System.out.println(result.getStatus());
      System.out.println(result.getStatusChanged());
      System.out.println(result.getSyncState());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateProfileForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppUser> response = client
              .application
              .updateProfileForUser(appId, userId)
              .embedded(embedded)
              .links(links)
              .created(created)
              .credentials(credentials)
              .externalId(externalId)
              .id(id)
              .lastSync(lastSync)
              .lastUpdated(lastUpdated)
              .passwordChanged(passwordChanged)
              .profile(profile)
              .scope(scope)
              .status(status)
              .statusChanged(statusChanged)
              .syncState(syncState)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateProfileForUser");
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
| **appId** | **String**|  | |
| **userId** | **String**|  | |
| **appUser** | [**AppUser**](AppUser.md)|  | |

### Return type

[**AppUser**](AppUser.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

