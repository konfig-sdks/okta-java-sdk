# AuthorizationServerApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateLifecycleSuccess**](AuthorizationServerApi.md#activateLifecycleSuccess) | **POST** /api/v1/authorizationServers/{authServerId}/lifecycle/activate |  |
| [**activatePolicyLifecycle**](AuthorizationServerApi.md#activatePolicyLifecycle) | **POST** /api/v1/authorizationServers/{authServerId}/policies/{policyId}/lifecycle/activate |  |
| [**activatePolicyRule**](AuthorizationServerApi.md#activatePolicyRule) | **POST** /api/v1/authorizationServers/{authServerId}/policies/{policyId}/rules/{ruleId}/lifecycle/activate |  |
| [**createClaims**](AuthorizationServerApi.md#createClaims) | **POST** /api/v1/authorizationServers/{authServerId}/claims |  |
| [**createNewServer**](AuthorizationServerApi.md#createNewServer) | **POST** /api/v1/authorizationServers |  |
| [**createPolicy**](AuthorizationServerApi.md#createPolicy) | **POST** /api/v1/authorizationServers/{authServerId}/policies |  |
| [**createPolicyRule**](AuthorizationServerApi.md#createPolicyRule) | **POST** /api/v1/authorizationServers/{authServerId}/policies/{policyId}/rules |  |
| [**createScope**](AuthorizationServerApi.md#createScope) | **POST** /api/v1/authorizationServers/{authServerId}/scopes |  |
| [**deactivateLifecycle**](AuthorizationServerApi.md#deactivateLifecycle) | **POST** /api/v1/authorizationServers/{authServerId}/lifecycle/deactivate |  |
| [**deactivatePolicyLifecycle**](AuthorizationServerApi.md#deactivatePolicyLifecycle) | **POST** /api/v1/authorizationServers/{authServerId}/policies/{policyId}/lifecycle/deactivate |  |
| [**deactivatePolicyRule**](AuthorizationServerApi.md#deactivatePolicyRule) | **POST** /api/v1/authorizationServers/{authServerId}/policies/{policyId}/rules/{ruleId}/lifecycle/deactivate |  |
| [**deleteAuthToken**](AuthorizationServerApi.md#deleteAuthToken) | **DELETE** /api/v1/authorizationServers/{authServerId}/clients/{clientId}/tokens/{tokenId} |  |
| [**deleteClaim**](AuthorizationServerApi.md#deleteClaim) | **DELETE** /api/v1/authorizationServers/{authServerId}/claims/{claimId} |  |
| [**deleteClientToken**](AuthorizationServerApi.md#deleteClientToken) | **DELETE** /api/v1/authorizationServers/{authServerId}/clients/{clientId}/tokens |  |
| [**deletePolicyById**](AuthorizationServerApi.md#deletePolicyById) | **DELETE** /api/v1/authorizationServers/{authServerId}/policies/{policyId} |  |
| [**deletePolicyRule**](AuthorizationServerApi.md#deletePolicyRule) | **DELETE** /api/v1/authorizationServers/{authServerId}/policies/{policyId}/rules/{ruleId} |  |
| [**deleteScope**](AuthorizationServerApi.md#deleteScope) | **DELETE** /api/v1/authorizationServers/{authServerId}/scopes/{scopeId} |  |
| [**deleteSuccess**](AuthorizationServerApi.md#deleteSuccess) | **DELETE** /api/v1/authorizationServers/{authServerId} |  |
| [**enumeratePolicyRules**](AuthorizationServerApi.md#enumeratePolicyRules) | **GET** /api/v1/authorizationServers/{authServerId}/policies/{policyId}/rules |  |
| [**getById**](AuthorizationServerApi.md#getById) | **GET** /api/v1/authorizationServers/{authServerId} |  |
| [**getClaims**](AuthorizationServerApi.md#getClaims) | **GET** /api/v1/authorizationServers/{authServerId}/claims |  |
| [**getClaims_0**](AuthorizationServerApi.md#getClaims_0) | **GET** /api/v1/authorizationServers/{authServerId}/claims/{claimId} |  |
| [**getClientAuthToken**](AuthorizationServerApi.md#getClientAuthToken) | **GET** /api/v1/authorizationServers/{authServerId}/clients/{clientId}/tokens/{tokenId} |  |
| [**getClientTokens**](AuthorizationServerApi.md#getClientTokens) | **GET** /api/v1/authorizationServers/{authServerId}/clients/{clientId}/tokens |  |
| [**getPolicies**](AuthorizationServerApi.md#getPolicies) | **GET** /api/v1/authorizationServers/{authServerId}/policies/{policyId} |  |
| [**getPoliciesSuccess**](AuthorizationServerApi.md#getPoliciesSuccess) | **GET** /api/v1/authorizationServers/{authServerId}/policies |  |
| [**getPolicyRuleById**](AuthorizationServerApi.md#getPolicyRuleById) | **GET** /api/v1/authorizationServers/{authServerId}/policies/{policyId}/rules/{ruleId} |  |
| [**getScopes**](AuthorizationServerApi.md#getScopes) | **GET** /api/v1/authorizationServers/{authServerId}/scopes |  |
| [**getScopes_0**](AuthorizationServerApi.md#getScopes_0) | **GET** /api/v1/authorizationServers/{authServerId}/scopes/{scopeId} |  |
| [**listClients**](AuthorizationServerApi.md#listClients) | **GET** /api/v1/authorizationServers/{authServerId}/clients |  |
| [**listCredentialsKeys**](AuthorizationServerApi.md#listCredentialsKeys) | **GET** /api/v1/authorizationServers/{authServerId}/credentials/keys |  |
| [**listServers**](AuthorizationServerApi.md#listServers) | **GET** /api/v1/authorizationServers |  |
| [**rotateKeyLifecycle**](AuthorizationServerApi.md#rotateKeyLifecycle) | **POST** /api/v1/authorizationServers/{authServerId}/credentials/lifecycle/keyRotate |  |
| [**updateById**](AuthorizationServerApi.md#updateById) | **PUT** /api/v1/authorizationServers/{authServerId} |  |
| [**updateClaimSuccess**](AuthorizationServerApi.md#updateClaimSuccess) | **PUT** /api/v1/authorizationServers/{authServerId}/claims/{claimId} |  |
| [**updatePolicyRuleConfiguration**](AuthorizationServerApi.md#updatePolicyRuleConfiguration) | **PUT** /api/v1/authorizationServers/{authServerId}/policies/{policyId}/rules/{ruleId} |  |
| [**updatePolicySuccess**](AuthorizationServerApi.md#updatePolicySuccess) | **PUT** /api/v1/authorizationServers/{authServerId}/policies/{policyId} |  |
| [**updateScopeSuccess**](AuthorizationServerApi.md#updateScopeSuccess) | **PUT** /api/v1/authorizationServers/{authServerId}/scopes/{scopeId} |  |


<a name="activateLifecycleSuccess"></a>
# **activateLifecycleSuccess**
> activateLifecycleSuccess(authServerId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    try {
      client
              .authorizationServer
              .activateLifecycleSuccess(authServerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#activateLifecycleSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .activateLifecycleSuccess(authServerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#activateLifecycleSuccess");
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
| **authServerId** | **String**|  | |

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

<a name="activatePolicyLifecycle"></a>
# **activatePolicyLifecycle**
> activatePolicyLifecycle(authServerId, policyId).execute();



Activate Authorization Server Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    try {
      client
              .authorizationServer
              .activatePolicyLifecycle(authServerId, policyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#activatePolicyLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .activatePolicyLifecycle(authServerId, policyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#activatePolicyLifecycle");
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
| **authServerId** | **String**|  | |
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
| **200** | Success |  -  |

<a name="activatePolicyRule"></a>
# **activatePolicyRule**
> activatePolicyRule(authServerId, policyId, ruleId).execute();



Activate Authorization Server Policy Rule

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    try {
      client
              .authorizationServer
              .activatePolicyRule(authServerId, policyId, ruleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#activatePolicyRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .activatePolicyRule(authServerId, policyId, ruleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#activatePolicyRule");
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
| **authServerId** | **String**|  | |
| **policyId** | **String**|  | |
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
| **200** | Success |  -  |

<a name="createClaims"></a>
# **createClaims**
> OAuth2Claim createClaims(authServerId, oauth2Claim).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    Map<String, Object> links = new HashMap();
    Boolean alwaysIncludeInToken = true;
    String claimType = "IDENTITY";
    OAuth2ClaimConditions conditions = new OAuth2ClaimConditions();
    String groupFilterType = "STARTS_WITH";
    String id = "id_example";
    String name = "name_example";
    String status = "ACTIVE";
    Boolean system = true;
    String value = "value_example";
    String valueType = "EXPRESSION";
    try {
      OAuth2Claim result = client
              .authorizationServer
              .createClaims(authServerId)
              .links(links)
              .alwaysIncludeInToken(alwaysIncludeInToken)
              .claimType(claimType)
              .conditions(conditions)
              .groupFilterType(groupFilterType)
              .id(id)
              .name(name)
              .status(status)
              .system(system)
              .value(value)
              .valueType(valueType)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlwaysIncludeInToken());
      System.out.println(result.getClaimType());
      System.out.println(result.getConditions());
      System.out.println(result.getGroupFilterType());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getValue());
      System.out.println(result.getValueType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createClaims");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2Claim> response = client
              .authorizationServer
              .createClaims(authServerId)
              .links(links)
              .alwaysIncludeInToken(alwaysIncludeInToken)
              .claimType(claimType)
              .conditions(conditions)
              .groupFilterType(groupFilterType)
              .id(id)
              .name(name)
              .status(status)
              .system(system)
              .value(value)
              .valueType(valueType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createClaims");
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
| **authServerId** | **String**|  | |
| **oauth2Claim** | [**OAuth2Claim**](OAuth2Claim.md)|  | |

### Return type

[**OAuth2Claim**](OAuth2Claim.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created |  -  |
| **201** | Success |  -  |

<a name="createNewServer"></a>
# **createNewServer**
> AuthorizationServer createNewServer(authorizationServer).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String description = "description_example";
    Map<String, Object> links = new HashMap();
    List<String> audiences = Arrays.asList();
    OffsetDateTime created = OffsetDateTime.now();
    AuthorizationServerCredentials credentials = new AuthorizationServerCredentials();
    Boolean _default = true;
    String id = "id_example";
    String issuer = "issuer_example";
    String issuerMode = "ORG_URL";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    String status = "ACTIVE";
    try {
      AuthorizationServer result = client
              .authorizationServer
              .createNewServer()
              .description(description)
              .links(links)
              .audiences(audiences)
              .created(created)
              .credentials(credentials)
              ._default(_default)
              .id(id)
              .issuer(issuer)
              .issuerMode(issuerMode)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getAudiences());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getDefault());
      System.out.println(result.getId());
      System.out.println(result.getIssuer());
      System.out.println(result.getIssuerMode());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createNewServer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizationServer> response = client
              .authorizationServer
              .createNewServer()
              .description(description)
              .links(links)
              .audiences(audiences)
              .created(created)
              .credentials(credentials)
              ._default(_default)
              .id(id)
              .issuer(issuer)
              .issuerMode(issuerMode)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createNewServer");
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
| **authorizationServer** | [**AuthorizationServer**](AuthorizationServer.md)|  | |

### Return type

[**AuthorizationServer**](AuthorizationServer.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **201** | Created |  -  |

<a name="createPolicy"></a>
# **createPolicy**
> AuthorizationServerPolicy createPolicy(authServerId, authorizationServerPolicy).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String description = "description_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    PolicyRuleConditions conditions = new PolicyRuleConditions();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    Integer priority = 56;
    String status = "ACTIVE";
    Boolean system = true;
    PolicyType type = PolicyType.fromValue("OAUTH_AUTHORIZATION_POLICY");
    try {
      AuthorizationServerPolicy result = client
              .authorizationServer
              .createPolicy(authServerId)
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
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getConditions());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPriority());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizationServerPolicy> response = client
              .authorizationServer
              .createPolicy(authServerId)
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
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createPolicy");
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
| **authServerId** | **String**|  | |
| **authorizationServerPolicy** | [**AuthorizationServerPolicy**](AuthorizationServerPolicy.md)|  | |

### Return type

[**AuthorizationServerPolicy**](AuthorizationServerPolicy.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **201** | Created |  -  |

<a name="createPolicyRule"></a>
# **createPolicyRule**
> AuthorizationServerPolicyRule createPolicyRule(authServerId, policyId, authorizationServerPolicyRule).execute();



Creates a policy rule for the specified Custom Authorization Server and Policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    AuthorizationServerPolicyRuleActions actions = new AuthorizationServerPolicyRuleActions();
    AuthorizationServerPolicyRuleConditions conditions = new AuthorizationServerPolicyRuleConditions();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    Integer priority = 56;
    String status = "ACTIVE";
    Boolean system = false;
    String type = "RESOURCE_ACCESS";
    try {
      AuthorizationServerPolicyRule result = client
              .authorizationServer
              .createPolicyRule(authServerId, policyId)
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
      System.out.println(result);
      System.out.println(result.getActions());
      System.out.println(result.getConditions());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPriority());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createPolicyRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizationServerPolicyRule> response = client
              .authorizationServer
              .createPolicyRule(authServerId, policyId)
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
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createPolicyRule");
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
| **authServerId** | **String**|  | |
| **policyId** | **String**|  | |
| **authorizationServerPolicyRule** | [**AuthorizationServerPolicyRule**](AuthorizationServerPolicyRule.md)|  | |

### Return type

[**AuthorizationServerPolicyRule**](AuthorizationServerPolicyRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createScope"></a>
# **createScope**
> OAuth2Scope createScope(authServerId, oauth2Scope).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String description = "description_example";
    String consent = "REQUIRED";
    Boolean _default = true;
    String displayName = "displayName_example";
    String id = "id_example";
    String metadataPublish = "ALL_CLIENTS";
    String name = "name_example";
    Boolean system = true;
    try {
      OAuth2Scope result = client
              .authorizationServer
              .createScope(authServerId)
              .description(description)
              .consent(consent)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .metadataPublish(metadataPublish)
              .name(name)
              .system(system)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getConsent());
      System.out.println(result.getDefault());
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getMetadataPublish());
      System.out.println(result.getName());
      System.out.println(result.getSystem());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createScope");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2Scope> response = client
              .authorizationServer
              .createScope(authServerId)
              .description(description)
              .consent(consent)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .metadataPublish(metadataPublish)
              .name(name)
              .system(system)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#createScope");
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
| **authServerId** | **String**|  | |
| **oauth2Scope** | [**OAuth2Scope**](OAuth2Scope.md)|  | |

### Return type

[**OAuth2Scope**](OAuth2Scope.md)

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

<a name="deactivateLifecycle"></a>
# **deactivateLifecycle**
> deactivateLifecycle(authServerId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    try {
      client
              .authorizationServer
              .deactivateLifecycle(authServerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deactivateLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deactivateLifecycle(authServerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deactivateLifecycle");
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
| **authServerId** | **String**|  | |

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

<a name="deactivatePolicyLifecycle"></a>
# **deactivatePolicyLifecycle**
> deactivatePolicyLifecycle(authServerId, policyId).execute();



Deactivate Authorization Server Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    try {
      client
              .authorizationServer
              .deactivatePolicyLifecycle(authServerId, policyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deactivatePolicyLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deactivatePolicyLifecycle(authServerId, policyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deactivatePolicyLifecycle");
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
| **authServerId** | **String**|  | |
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
| **200** | Success |  -  |

<a name="deactivatePolicyRule"></a>
# **deactivatePolicyRule**
> deactivatePolicyRule(authServerId, policyId, ruleId).execute();



Deactivate Authorization Server Policy Rule

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    try {
      client
              .authorizationServer
              .deactivatePolicyRule(authServerId, policyId, ruleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deactivatePolicyRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deactivatePolicyRule(authServerId, policyId, ruleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deactivatePolicyRule");
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
| **authServerId** | **String**|  | |
| **policyId** | **String**|  | |
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
| **200** | Success |  -  |

<a name="deleteAuthToken"></a>
# **deleteAuthToken**
> deleteAuthToken(authServerId, clientId, tokenId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String clientId = "clientId_example";
    String tokenId = "tokenId_example";
    try {
      client
              .authorizationServer
              .deleteAuthToken(authServerId, clientId, tokenId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteAuthToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deleteAuthToken(authServerId, clientId, tokenId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteAuthToken");
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
| **authServerId** | **String**|  | |
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

<a name="deleteClaim"></a>
# **deleteClaim**
> deleteClaim(authServerId, claimId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String claimId = "claimId_example";
    try {
      client
              .authorizationServer
              .deleteClaim(authServerId, claimId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteClaim");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deleteClaim(authServerId, claimId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteClaim");
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
| **authServerId** | **String**|  | |
| **claimId** | **String**|  | |

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

<a name="deleteClientToken"></a>
# **deleteClientToken**
> deleteClientToken(authServerId, clientId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String clientId = "clientId_example";
    try {
      client
              .authorizationServer
              .deleteClientToken(authServerId, clientId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteClientToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deleteClientToken(authServerId, clientId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteClientToken");
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
| **authServerId** | **String**|  | |
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

<a name="deletePolicyById"></a>
# **deletePolicyById**
> deletePolicyById(authServerId, policyId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    try {
      client
              .authorizationServer
              .deletePolicyById(authServerId, policyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deletePolicyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deletePolicyById(authServerId, policyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deletePolicyById");
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
| **authServerId** | **String**|  | |
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

<a name="deletePolicyRule"></a>
# **deletePolicyRule**
> deletePolicyRule(authServerId, policyId, ruleId).execute();



Deletes a Policy Rule defined in the specified Custom Authorization Server and Policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    try {
      client
              .authorizationServer
              .deletePolicyRule(authServerId, policyId, ruleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deletePolicyRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deletePolicyRule(authServerId, policyId, ruleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deletePolicyRule");
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
| **authServerId** | **String**|  | |
| **policyId** | **String**|  | |
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

<a name="deleteScope"></a>
# **deleteScope**
> deleteScope(authServerId, scopeId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String scopeId = "scopeId_example";
    try {
      client
              .authorizationServer
              .deleteScope(authServerId, scopeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteScope");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deleteScope(authServerId, scopeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteScope");
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
| **authServerId** | **String**|  | |
| **scopeId** | **String**|  | |

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

<a name="deleteSuccess"></a>
# **deleteSuccess**
> deleteSuccess(authServerId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    try {
      client
              .authorizationServer
              .deleteSuccess(authServerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorizationServer
              .deleteSuccess(authServerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#deleteSuccess");
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
| **authServerId** | **String**|  | |

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

<a name="enumeratePolicyRules"></a>
# **enumeratePolicyRules**
> List&lt;AuthorizationServerPolicyRule&gt; enumeratePolicyRules(authServerId, policyId).execute();



Enumerates all policy rules for the specified Custom Authorization Server and Policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    try {
      List<AuthorizationServerPolicyRule> result = client
              .authorizationServer
              .enumeratePolicyRules(authServerId, policyId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#enumeratePolicyRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AuthorizationServerPolicyRule>> response = client
              .authorizationServer
              .enumeratePolicyRules(authServerId, policyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#enumeratePolicyRules");
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
| **authServerId** | **String**|  | |
| **policyId** | **String**|  | |

### Return type

[**List&lt;AuthorizationServerPolicyRule&gt;**](AuthorizationServerPolicyRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getById"></a>
# **getById**
> AuthorizationServer getById(authServerId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    try {
      AuthorizationServer result = client
              .authorizationServer
              .getById(authServerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getAudiences());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getDefault());
      System.out.println(result.getId());
      System.out.println(result.getIssuer());
      System.out.println(result.getIssuerMode());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizationServer> response = client
              .authorizationServer
              .getById(authServerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getById");
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
| **authServerId** | **String**|  | |

### Return type

[**AuthorizationServer**](AuthorizationServer.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getClaims"></a>
# **getClaims**
> List&lt;OAuth2Claim&gt; getClaims(authServerId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    try {
      List<OAuth2Claim> result = client
              .authorizationServer
              .getClaims(authServerId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getClaims");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2Claim>> response = client
              .authorizationServer
              .getClaims(authServerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getClaims");
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
| **authServerId** | **String**|  | |

### Return type

[**List&lt;OAuth2Claim&gt;**](OAuth2Claim.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getClaims_0"></a>
# **getClaims_0**
> OAuth2Claim getClaims_0(authServerId, claimId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String claimId = "claimId_example";
    try {
      OAuth2Claim result = client
              .authorizationServer
              .getClaims_0(authServerId, claimId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlwaysIncludeInToken());
      System.out.println(result.getClaimType());
      System.out.println(result.getConditions());
      System.out.println(result.getGroupFilterType());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getValue());
      System.out.println(result.getValueType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getClaims_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2Claim> response = client
              .authorizationServer
              .getClaims_0(authServerId, claimId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getClaims_0");
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
| **authServerId** | **String**|  | |
| **claimId** | **String**|  | |

### Return type

[**OAuth2Claim**](OAuth2Claim.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getClientAuthToken"></a>
# **getClientAuthToken**
> OAuth2RefreshToken getClientAuthToken(authServerId, clientId, tokenId).expand(expand).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String clientId = "clientId_example";
    String tokenId = "tokenId_example";
    String expand = "expand_example";
    try {
      OAuth2RefreshToken result = client
              .authorizationServer
              .getClientAuthToken(authServerId, clientId, tokenId)
              .expand(expand)
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
      System.err.println("Exception when calling AuthorizationServerApi#getClientAuthToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2RefreshToken> response = client
              .authorizationServer
              .getClientAuthToken(authServerId, clientId, tokenId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getClientAuthToken");
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
| **authServerId** | **String**|  | |
| **clientId** | **String**|  | |
| **tokenId** | **String**|  | |
| **expand** | **String**|  | [optional] |

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

<a name="getClientTokens"></a>
# **getClientTokens**
> List&lt;OAuth2RefreshToken&gt; getClientTokens(authServerId, clientId).expand(expand).after(after).limit(limit).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String clientId = "clientId_example";
    String expand = "expand_example";
    String after = "after_example";
    Integer limit = -1;
    try {
      List<OAuth2RefreshToken> result = client
              .authorizationServer
              .getClientTokens(authServerId, clientId)
              .expand(expand)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getClientTokens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2RefreshToken>> response = client
              .authorizationServer
              .getClientTokens(authServerId, clientId)
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
      System.err.println("Exception when calling AuthorizationServerApi#getClientTokens");
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
| **authServerId** | **String**|  | |
| **clientId** | **String**|  | |
| **expand** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to -1] |

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

<a name="getPolicies"></a>
# **getPolicies**
> AuthorizationServerPolicy getPolicies(authServerId, policyId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    try {
      AuthorizationServerPolicy result = client
              .authorizationServer
              .getPolicies(authServerId, policyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getConditions());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPriority());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getPolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizationServerPolicy> response = client
              .authorizationServer
              .getPolicies(authServerId, policyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getPolicies");
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
| **authServerId** | **String**|  | |
| **policyId** | **String**|  | |

### Return type

[**AuthorizationServerPolicy**](AuthorizationServerPolicy.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPoliciesSuccess"></a>
# **getPoliciesSuccess**
> List&lt;AuthorizationServerPolicy&gt; getPoliciesSuccess(authServerId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    try {
      List<AuthorizationServerPolicy> result = client
              .authorizationServer
              .getPoliciesSuccess(authServerId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getPoliciesSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AuthorizationServerPolicy>> response = client
              .authorizationServer
              .getPoliciesSuccess(authServerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getPoliciesSuccess");
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
| **authServerId** | **String**|  | |

### Return type

[**List&lt;AuthorizationServerPolicy&gt;**](AuthorizationServerPolicy.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPolicyRuleById"></a>
# **getPolicyRuleById**
> AuthorizationServerPolicyRule getPolicyRuleById(authServerId, policyId, ruleId).execute();



Returns a Policy Rule by ID that is defined in the specified Custom Authorization Server and Policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    try {
      AuthorizationServerPolicyRule result = client
              .authorizationServer
              .getPolicyRuleById(authServerId, policyId, ruleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getActions());
      System.out.println(result.getConditions());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPriority());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getPolicyRuleById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizationServerPolicyRule> response = client
              .authorizationServer
              .getPolicyRuleById(authServerId, policyId, ruleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getPolicyRuleById");
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
| **authServerId** | **String**|  | |
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |

### Return type

[**AuthorizationServerPolicyRule**](AuthorizationServerPolicyRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getScopes"></a>
# **getScopes**
> List&lt;OAuth2Scope&gt; getScopes(authServerId).q(q).filter(filter).cursor(cursor).limit(limit).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String q = "q_example";
    String filter = "filter_example";
    String cursor = "cursor_example";
    Integer limit = -1;
    try {
      List<OAuth2Scope> result = client
              .authorizationServer
              .getScopes(authServerId)
              .q(q)
              .filter(filter)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getScopes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2Scope>> response = client
              .authorizationServer
              .getScopes(authServerId)
              .q(q)
              .filter(filter)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getScopes");
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
| **authServerId** | **String**|  | |
| **q** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **cursor** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to -1] |

### Return type

[**List&lt;OAuth2Scope&gt;**](OAuth2Scope.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getScopes_0"></a>
# **getScopes_0**
> OAuth2Scope getScopes_0(authServerId, scopeId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String scopeId = "scopeId_example";
    try {
      OAuth2Scope result = client
              .authorizationServer
              .getScopes_0(authServerId, scopeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getConsent());
      System.out.println(result.getDefault());
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getMetadataPublish());
      System.out.println(result.getName());
      System.out.println(result.getSystem());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getScopes_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2Scope> response = client
              .authorizationServer
              .getScopes_0(authServerId, scopeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#getScopes_0");
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
| **authServerId** | **String**|  | |
| **scopeId** | **String**|  | |

### Return type

[**OAuth2Scope**](OAuth2Scope.md)

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
> List&lt;OAuth2Client&gt; listClients(authServerId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    try {
      List<OAuth2Client> result = client
              .authorizationServer
              .listClients(authServerId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#listClients");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OAuth2Client>> response = client
              .authorizationServer
              .listClients(authServerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#listClients");
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
| **authServerId** | **String**|  | |

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

<a name="listCredentialsKeys"></a>
# **listCredentialsKeys**
> List&lt;JsonWebKey&gt; listCredentialsKeys(authServerId).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    try {
      List<JsonWebKey> result = client
              .authorizationServer
              .listCredentialsKeys(authServerId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#listCredentialsKeys");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<JsonWebKey>> response = client
              .authorizationServer
              .listCredentialsKeys(authServerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#listCredentialsKeys");
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
| **authServerId** | **String**|  | |

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

<a name="listServers"></a>
# **listServers**
> List&lt;AuthorizationServer&gt; listServers().q(q).limit(limit).after(after).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
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
    String limit = "limit_example";
    String after = "after_example";
    try {
      List<AuthorizationServer> result = client
              .authorizationServer
              .listServers()
              .q(q)
              .limit(limit)
              .after(after)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#listServers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AuthorizationServer>> response = client
              .authorizationServer
              .listServers()
              .q(q)
              .limit(limit)
              .after(after)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#listServers");
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
| **limit** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |

### Return type

[**List&lt;AuthorizationServer&gt;**](AuthorizationServer.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="rotateKeyLifecycle"></a>
# **rotateKeyLifecycle**
> List&lt;JsonWebKey&gt; rotateKeyLifecycle(authServerId, jwkUse).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String use = "sig";
    try {
      List<JsonWebKey> result = client
              .authorizationServer
              .rotateKeyLifecycle(authServerId)
              .use(use)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#rotateKeyLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<JsonWebKey>> response = client
              .authorizationServer
              .rotateKeyLifecycle(authServerId)
              .use(use)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#rotateKeyLifecycle");
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
| **authServerId** | **String**|  | |
| **jwkUse** | [**JwkUse**](JwkUse.md)|  | |

### Return type

[**List&lt;JsonWebKey&gt;**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateById"></a>
# **updateById**
> AuthorizationServer updateById(authServerId, authorizationServer).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String description = "description_example";
    Map<String, Object> links = new HashMap();
    List<String> audiences = Arrays.asList();
    OffsetDateTime created = OffsetDateTime.now();
    AuthorizationServerCredentials credentials = new AuthorizationServerCredentials();
    Boolean _default = true;
    String id = "id_example";
    String issuer = "issuer_example";
    String issuerMode = "ORG_URL";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    String status = "ACTIVE";
    try {
      AuthorizationServer result = client
              .authorizationServer
              .updateById(authServerId)
              .description(description)
              .links(links)
              .audiences(audiences)
              .created(created)
              .credentials(credentials)
              ._default(_default)
              .id(id)
              .issuer(issuer)
              .issuerMode(issuerMode)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getAudiences());
      System.out.println(result.getCreated());
      System.out.println(result.getCredentials());
      System.out.println(result.getDefault());
      System.out.println(result.getId());
      System.out.println(result.getIssuer());
      System.out.println(result.getIssuerMode());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizationServer> response = client
              .authorizationServer
              .updateById(authServerId)
              .description(description)
              .links(links)
              .audiences(audiences)
              .created(created)
              .credentials(credentials)
              ._default(_default)
              .id(id)
              .issuer(issuer)
              .issuerMode(issuerMode)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updateById");
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
| **authServerId** | **String**|  | |
| **authorizationServer** | [**AuthorizationServer**](AuthorizationServer.md)|  | |

### Return type

[**AuthorizationServer**](AuthorizationServer.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateClaimSuccess"></a>
# **updateClaimSuccess**
> OAuth2Claim updateClaimSuccess(authServerId, claimId, oauth2Claim).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String claimId = "claimId_example";
    Map<String, Object> links = new HashMap();
    Boolean alwaysIncludeInToken = true;
    String claimType = "IDENTITY";
    OAuth2ClaimConditions conditions = new OAuth2ClaimConditions();
    String groupFilterType = "STARTS_WITH";
    String id = "id_example";
    String name = "name_example";
    String status = "ACTIVE";
    Boolean system = true;
    String value = "value_example";
    String valueType = "EXPRESSION";
    try {
      OAuth2Claim result = client
              .authorizationServer
              .updateClaimSuccess(authServerId, claimId)
              .links(links)
              .alwaysIncludeInToken(alwaysIncludeInToken)
              .claimType(claimType)
              .conditions(conditions)
              .groupFilterType(groupFilterType)
              .id(id)
              .name(name)
              .status(status)
              .system(system)
              .value(value)
              .valueType(valueType)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlwaysIncludeInToken());
      System.out.println(result.getClaimType());
      System.out.println(result.getConditions());
      System.out.println(result.getGroupFilterType());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getValue());
      System.out.println(result.getValueType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updateClaimSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2Claim> response = client
              .authorizationServer
              .updateClaimSuccess(authServerId, claimId)
              .links(links)
              .alwaysIncludeInToken(alwaysIncludeInToken)
              .claimType(claimType)
              .conditions(conditions)
              .groupFilterType(groupFilterType)
              .id(id)
              .name(name)
              .status(status)
              .system(system)
              .value(value)
              .valueType(valueType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updateClaimSuccess");
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
| **authServerId** | **String**|  | |
| **claimId** | **String**|  | |
| **oauth2Claim** | [**OAuth2Claim**](OAuth2Claim.md)|  | |

### Return type

[**OAuth2Claim**](OAuth2Claim.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePolicyRuleConfiguration"></a>
# **updatePolicyRuleConfiguration**
> AuthorizationServerPolicyRule updatePolicyRuleConfiguration(authServerId, policyId, ruleId, authorizationServerPolicyRule).execute();



Updates the configuration of the Policy Rule defined in the specified Custom Authorization Server and Policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    AuthorizationServerPolicyRuleActions actions = new AuthorizationServerPolicyRuleActions();
    AuthorizationServerPolicyRuleConditions conditions = new AuthorizationServerPolicyRuleConditions();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    Integer priority = 56;
    String status = "ACTIVE";
    Boolean system = false;
    String type = "RESOURCE_ACCESS";
    try {
      AuthorizationServerPolicyRule result = client
              .authorizationServer
              .updatePolicyRuleConfiguration(authServerId, policyId, ruleId)
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
      System.out.println(result);
      System.out.println(result.getActions());
      System.out.println(result.getConditions());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPriority());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updatePolicyRuleConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizationServerPolicyRule> response = client
              .authorizationServer
              .updatePolicyRuleConfiguration(authServerId, policyId, ruleId)
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
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updatePolicyRuleConfiguration");
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
| **authServerId** | **String**|  | |
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |
| **authorizationServerPolicyRule** | [**AuthorizationServerPolicyRule**](AuthorizationServerPolicyRule.md)|  | |

### Return type

[**AuthorizationServerPolicyRule**](AuthorizationServerPolicyRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePolicySuccess"></a>
# **updatePolicySuccess**
> AuthorizationServerPolicy updatePolicySuccess(authServerId, policyId, authorizationServerPolicy).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String policyId = "policyId_example";
    String description = "description_example";
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    PolicyRuleConditions conditions = new PolicyRuleConditions();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    Integer priority = 56;
    String status = "ACTIVE";
    Boolean system = true;
    PolicyType type = PolicyType.fromValue("OAUTH_AUTHORIZATION_POLICY");
    try {
      AuthorizationServerPolicy result = client
              .authorizationServer
              .updatePolicySuccess(authServerId, policyId)
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
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getConditions());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPriority());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updatePolicySuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizationServerPolicy> response = client
              .authorizationServer
              .updatePolicySuccess(authServerId, policyId)
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
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updatePolicySuccess");
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
| **authServerId** | **String**|  | |
| **policyId** | **String**|  | |
| **authorizationServerPolicy** | [**AuthorizationServerPolicy**](AuthorizationServerPolicy.md)|  | |

### Return type

[**AuthorizationServerPolicy**](AuthorizationServerPolicy.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateScopeSuccess"></a>
# **updateScopeSuccess**
> OAuth2Scope updateScopeSuccess(authServerId, scopeId, oauth2Scope).execute();



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
import com.konfigthis.client.api.AuthorizationServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authServerId = "authServerId_example";
    String scopeId = "scopeId_example";
    String description = "description_example";
    String consent = "REQUIRED";
    Boolean _default = true;
    String displayName = "displayName_example";
    String id = "id_example";
    String metadataPublish = "ALL_CLIENTS";
    String name = "name_example";
    Boolean system = true;
    try {
      OAuth2Scope result = client
              .authorizationServer
              .updateScopeSuccess(authServerId, scopeId)
              .description(description)
              .consent(consent)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .metadataPublish(metadataPublish)
              .name(name)
              .system(system)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getConsent());
      System.out.println(result.getDefault());
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getMetadataPublish());
      System.out.println(result.getName());
      System.out.println(result.getSystem());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updateScopeSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OAuth2Scope> response = client
              .authorizationServer
              .updateScopeSuccess(authServerId, scopeId)
              .description(description)
              .consent(consent)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .metadataPublish(metadataPublish)
              .name(name)
              .system(system)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationServerApi#updateScopeSuccess");
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
| **authServerId** | **String**|  | |
| **scopeId** | **String**|  | |
| **oauth2Scope** | [**OAuth2Scope**](OAuth2Scope.md)|  | |

### Return type

[**OAuth2Scope**](OAuth2Scope.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

