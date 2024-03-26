# AuthenticatorApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateLifecycleSuccess**](AuthenticatorApi.md#activateLifecycleSuccess) | **POST** /api/v1/authenticators/{authenticatorId}/lifecycle/activate |  |
| [**createNew**](AuthenticatorApi.md#createNew) | **POST** /api/v1/authenticators | Create an Authenticator |
| [**deactivateLifecycleSuccess**](AuthenticatorApi.md#deactivateLifecycleSuccess) | **POST** /api/v1/authenticators/{authenticatorId}/lifecycle/deactivate |  |
| [**getSuccess**](AuthenticatorApi.md#getSuccess) | **GET** /api/v1/authenticators/{authenticatorId} |  |
| [**listAllAvailable**](AuthenticatorApi.md#listAllAvailable) | **GET** /api/v1/authenticators | Lists all available Authenticators |
| [**updateAuthenticator**](AuthenticatorApi.md#updateAuthenticator) | **PUT** /api/v1/authenticators/{authenticatorId} | Update Authenticator |


<a name="activateLifecycleSuccess"></a>
# **activateLifecycleSuccess**
> Authenticator activateLifecycleSuccess(authenticatorId).execute();



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
import com.konfigthis.client.api.AuthenticatorApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authenticatorId = "authenticatorId_example";
    try {
      Authenticator result = client
              .authenticator
              .activateLifecycleSuccess(authenticatorId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getProvider());
      System.out.println(result.getSettings());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#activateLifecycleSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authenticator> response = client
              .authenticator
              .activateLifecycleSuccess(authenticatorId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#activateLifecycleSuccess");
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
| **authenticatorId** | **String**|  | |

### Return type

[**Authenticator**](Authenticator.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createNew"></a>
# **createNew**
> Authenticator createNew(authenticator).activate(activate).execute();

Create an Authenticator

Create Authenticator

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticatorApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    String key = "key_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    AuthenticatorProvider provider = new AuthenticatorProvider();
    AuthenticatorSettings settings = new AuthenticatorSettings();
    AuthenticatorStatus status = AuthenticatorStatus.fromValue("ACTIVE");
    AuthenticatorType type = AuthenticatorType.fromValue("app");
    Boolean activate = true;
    try {
      Authenticator result = client
              .authenticator
              .createNew()
              .links(links)
              .created(created)
              .id(id)
              .key(key)
              .lastUpdated(lastUpdated)
              .name(name)
              .provider(provider)
              .settings(settings)
              .status(status)
              .type(type)
              .activate(activate)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getProvider());
      System.out.println(result.getSettings());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authenticator> response = client
              .authenticator
              .createNew()
              .links(links)
              .created(created)
              .id(id)
              .key(key)
              .lastUpdated(lastUpdated)
              .name(name)
              .provider(provider)
              .settings(settings)
              .status(status)
              .type(type)
              .activate(activate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#createNew");
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
| **authenticator** | [**Authenticator**](Authenticator.md)|  | |
| **activate** | **Boolean**|  | [optional] |

### Return type

[**Authenticator**](Authenticator.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deactivateLifecycleSuccess"></a>
# **deactivateLifecycleSuccess**
> Authenticator deactivateLifecycleSuccess(authenticatorId).execute();



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
import com.konfigthis.client.api.AuthenticatorApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authenticatorId = "authenticatorId_example";
    try {
      Authenticator result = client
              .authenticator
              .deactivateLifecycleSuccess(authenticatorId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getProvider());
      System.out.println(result.getSettings());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#deactivateLifecycleSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authenticator> response = client
              .authenticator
              .deactivateLifecycleSuccess(authenticatorId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#deactivateLifecycleSuccess");
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
| **authenticatorId** | **String**|  | |

### Return type

[**Authenticator**](Authenticator.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSuccess"></a>
# **getSuccess**
> Authenticator getSuccess(authenticatorId).execute();



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
import com.konfigthis.client.api.AuthenticatorApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authenticatorId = "authenticatorId_example";
    try {
      Authenticator result = client
              .authenticator
              .getSuccess(authenticatorId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getProvider());
      System.out.println(result.getSettings());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#getSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authenticator> response = client
              .authenticator
              .getSuccess(authenticatorId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#getSuccess");
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
| **authenticatorId** | **String**|  | |

### Return type

[**Authenticator**](Authenticator.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAllAvailable"></a>
# **listAllAvailable**
> List&lt;Authenticator&gt; listAllAvailable().execute();

Lists all available Authenticators

List Authenticators

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticatorApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    try {
      List<Authenticator> result = client
              .authenticator
              .listAllAvailable()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#listAllAvailable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Authenticator>> response = client
              .authenticator
              .listAllAvailable()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#listAllAvailable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Authenticator&gt;**](Authenticator.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAuthenticator"></a>
# **updateAuthenticator**
> Authenticator updateAuthenticator(authenticatorId, authenticator).execute();

Update Authenticator

Updates an authenticator

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticatorApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String authenticatorId = "authenticatorId_example";
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    String key = "key_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    AuthenticatorProvider provider = new AuthenticatorProvider();
    AuthenticatorSettings settings = new AuthenticatorSettings();
    AuthenticatorStatus status = AuthenticatorStatus.fromValue("ACTIVE");
    AuthenticatorType type = AuthenticatorType.fromValue("app");
    try {
      Authenticator result = client
              .authenticator
              .updateAuthenticator(authenticatorId)
              .links(links)
              .created(created)
              .id(id)
              .key(key)
              .lastUpdated(lastUpdated)
              .name(name)
              .provider(provider)
              .settings(settings)
              .status(status)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getKey());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getProvider());
      System.out.println(result.getSettings());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#updateAuthenticator");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authenticator> response = client
              .authenticator
              .updateAuthenticator(authenticatorId)
              .links(links)
              .created(created)
              .id(id)
              .key(key)
              .lastUpdated(lastUpdated)
              .name(name)
              .provider(provider)
              .settings(settings)
              .status(status)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorApi#updateAuthenticator");
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
| **authenticatorId** | **String**|  | |
| **authenticator** | [**Authenticator**](Authenticator.md)|  | |

### Return type

[**Authenticator**](Authenticator.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

