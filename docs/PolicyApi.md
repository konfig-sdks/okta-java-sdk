# PolicyApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateLifecycle**](PolicyApi.md#activateLifecycle) | **POST** /api/v1/policies/{policyId}/lifecycle/activate |  |
| [**activateRuleLifecycle**](PolicyApi.md#activateRuleLifecycle) | **POST** /api/v1/policies/{policyId}/rules/{ruleId}/lifecycle/activate |  |
| [**createNewPolicy**](PolicyApi.md#createNewPolicy) | **POST** /api/v1/policies |  |
| [**createRule**](PolicyApi.md#createRule) | **POST** /api/v1/policies/{policyId}/rules |  |
| [**deactivateLifecycle**](PolicyApi.md#deactivateLifecycle) | **POST** /api/v1/policies/{policyId}/lifecycle/deactivate |  |
| [**deactivateRuleLifecycle**](PolicyApi.md#deactivateRuleLifecycle) | **POST** /api/v1/policies/{policyId}/rules/{ruleId}/lifecycle/deactivate |  |
| [**enumerateRules**](PolicyApi.md#enumerateRules) | **GET** /api/v1/policies/{policyId}/rules |  |
| [**getAllWithType**](PolicyApi.md#getAllWithType) | **GET** /api/v1/policies |  |
| [**getPolicy**](PolicyApi.md#getPolicy) | **GET** /api/v1/policies/{policyId} |  |
| [**getPolicyRule**](PolicyApi.md#getPolicyRule) | **GET** /api/v1/policies/{policyId}/rules/{ruleId} |  |
| [**removePolicyOperation**](PolicyApi.md#removePolicyOperation) | **DELETE** /api/v1/policies/{policyId} |  |
| [**removeRule**](PolicyApi.md#removeRule) | **DELETE** /api/v1/policies/{policyId}/rules/{ruleId} |  |
| [**updateOperation**](PolicyApi.md#updateOperation) | **PUT** /api/v1/policies/{policyId} |  |
| [**updateRule**](PolicyApi.md#updateRule) | **PUT** /api/v1/policies/{policyId}/rules/{ruleId} |  |


<a name="activateLifecycle"></a>
# **activateLifecycle**
> activateLifecycle(policyId).execute();



Activates a policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    try {
      client
              .policy
              .activateLifecycle(policyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#activateLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policy
              .activateLifecycle(policyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#activateLifecycle");
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

<a name="activateRuleLifecycle"></a>
# **activateRuleLifecycle**
> activateRuleLifecycle(policyId, ruleId).execute();



Activates a policy rule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    try {
      client
              .policy
              .activateRuleLifecycle(policyId, ruleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#activateRuleLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policy
              .activateRuleLifecycle(policyId, ruleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#activateRuleLifecycle");
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

<a name="createNewPolicy"></a>
# **createNewPolicy**
> Policy createNewPolicy(policy).activate(activate).execute();



Creates a policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
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
    Boolean activate = true;
    try {
      Policy result = client
              .policy
              .createNewPolicy()
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
      System.err.println("Exception when calling PolicyApi#createNewPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Policy> response = client
              .policy
              .createNewPolicy()
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
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#createNewPolicy");
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
| **policy** | [**Policy**](Policy.md)|  | |
| **activate** | **Boolean**|  | [optional] [default to true] |

### Return type

[**Policy**](Policy.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createRule"></a>
# **createRule**
> PolicyRule createRule(policyId, policyRule).execute();



Creates a policy rule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    PolicyRuleActions actions = new PolicyRuleActions();
    PolicyRuleConditions conditions = new PolicyRuleConditions();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    Integer priority = 56;
    String status = "ACTIVE";
    Boolean system = false;
    String type = "SIGN_ON";
    try {
      PolicyRule result = client
              .policy
              .createRule(policyId)
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
      System.err.println("Exception when calling PolicyApi#createRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PolicyRule> response = client
              .policy
              .createRule(policyId)
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
      System.err.println("Exception when calling PolicyApi#createRule");
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
| **policyId** | **String**|  | |
| **policyRule** | [**PolicyRule**](PolicyRule.md)|  | |

### Return type

[**PolicyRule**](PolicyRule.md)

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
> deactivateLifecycle(policyId).execute();



Deactivates a policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    try {
      client
              .policy
              .deactivateLifecycle(policyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#deactivateLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policy
              .deactivateLifecycle(policyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#deactivateLifecycle");
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

<a name="deactivateRuleLifecycle"></a>
# **deactivateRuleLifecycle**
> deactivateRuleLifecycle(policyId, ruleId).execute();



Deactivates a policy rule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    try {
      client
              .policy
              .deactivateRuleLifecycle(policyId, ruleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#deactivateRuleLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policy
              .deactivateRuleLifecycle(policyId, ruleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#deactivateRuleLifecycle");
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

<a name="enumerateRules"></a>
# **enumerateRules**
> List&lt;PolicyRule&gt; enumerateRules(policyId).execute();



Enumerates all policy rules.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    try {
      List<PolicyRule> result = client
              .policy
              .enumerateRules(policyId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#enumerateRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PolicyRule>> response = client
              .policy
              .enumerateRules(policyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#enumerateRules");
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
| **policyId** | **String**|  | |

### Return type

[**List&lt;PolicyRule&gt;**](PolicyRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAllWithType"></a>
# **getAllWithType**
> List&lt;Policy&gt; getAllWithType(type).status(status).expand(expand).execute();



Gets all policies with the specified type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String type = "type_example";
    String status = "status_example";
    String expand = "";
    try {
      List<Policy> result = client
              .policy
              .getAllWithType(type)
              .status(status)
              .expand(expand)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getAllWithType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Policy>> response = client
              .policy
              .getAllWithType(type)
              .status(status)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getAllWithType");
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
| **type** | **String**|  | |
| **status** | **String**|  | [optional] |
| **expand** | **String**|  | [optional] [default to ] |

### Return type

[**List&lt;Policy&gt;**](Policy.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPolicy"></a>
# **getPolicy**
> Policy getPolicy(policyId).expand(expand).execute();



Gets a policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    String expand = "";
    try {
      Policy result = client
              .policy
              .getPolicy(policyId)
              .expand(expand)
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
      System.err.println("Exception when calling PolicyApi#getPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Policy> response = client
              .policy
              .getPolicy(policyId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getPolicy");
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
| **policyId** | **String**|  | |
| **expand** | **String**|  | [optional] [default to ] |

### Return type

[**Policy**](Policy.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPolicyRule"></a>
# **getPolicyRule**
> PolicyRule getPolicyRule(policyId, ruleId).execute();



Gets a policy rule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    try {
      PolicyRule result = client
              .policy
              .getPolicyRule(policyId, ruleId)
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
      System.err.println("Exception when calling PolicyApi#getPolicyRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PolicyRule> response = client
              .policy
              .getPolicyRule(policyId, ruleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#getPolicyRule");
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
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |

### Return type

[**PolicyRule**](PolicyRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removePolicyOperation"></a>
# **removePolicyOperation**
> removePolicyOperation(policyId).execute();



Removes a policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    try {
      client
              .policy
              .removePolicyOperation(policyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#removePolicyOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policy
              .removePolicyOperation(policyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#removePolicyOperation");
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

<a name="removeRule"></a>
# **removeRule**
> removeRule(policyId, ruleId).execute();



Removes a policy rule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    try {
      client
              .policy
              .removeRule(policyId, ruleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#removeRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policy
              .removeRule(policyId, ruleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyApi#removeRule");
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

<a name="updateOperation"></a>
# **updateOperation**
> Policy updateOperation(policyId, policy).execute();



Updates a policy.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
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
      Policy result = client
              .policy
              .updateOperation(policyId)
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
      System.err.println("Exception when calling PolicyApi#updateOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Policy> response = client
              .policy
              .updateOperation(policyId)
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
      System.err.println("Exception when calling PolicyApi#updateOperation");
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
| **policyId** | **String**|  | |
| **policy** | [**Policy**](Policy.md)|  | |

### Return type

[**Policy**](Policy.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateRule"></a>
# **updateRule**
> PolicyRule updateRule(policyId, ruleId, policyRule).execute();



Updates a policy rule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String policyId = "policyId_example";
    String ruleId = "ruleId_example";
    PolicyRuleActions actions = new PolicyRuleActions();
    PolicyRuleConditions conditions = new PolicyRuleConditions();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    Integer priority = 56;
    String status = "ACTIVE";
    Boolean system = false;
    String type = "SIGN_ON";
    try {
      PolicyRule result = client
              .policy
              .updateRule(policyId, ruleId)
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
      System.err.println("Exception when calling PolicyApi#updateRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PolicyRule> response = client
              .policy
              .updateRule(policyId, ruleId)
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
      System.err.println("Exception when calling PolicyApi#updateRule");
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
| **policyId** | **String**|  | |
| **ruleId** | **String**|  | |
| **policyRule** | [**PolicyRule**](PolicyRule.md)|  | |

### Return type

[**PolicyRule**](PolicyRule.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

