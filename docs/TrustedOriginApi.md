# TrustedOriginApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateLifecycleSuccess**](TrustedOriginApi.md#activateLifecycleSuccess) | **POST** /api/v1/trustedOrigins/{trustedOriginId}/lifecycle/activate |  |
| [**createSuccess**](TrustedOriginApi.md#createSuccess) | **POST** /api/v1/trustedOrigins |  |
| [**deactivateLifecycleSuccess**](TrustedOriginApi.md#deactivateLifecycleSuccess) | **POST** /api/v1/trustedOrigins/{trustedOriginId}/lifecycle/deactivate |  |
| [**deleteSuccess**](TrustedOriginApi.md#deleteSuccess) | **DELETE** /api/v1/trustedOrigins/{trustedOriginId} |  |
| [**getList**](TrustedOriginApi.md#getList) | **GET** /api/v1/trustedOrigins |  |
| [**getSuccessById**](TrustedOriginApi.md#getSuccessById) | **GET** /api/v1/trustedOrigins/{trustedOriginId} |  |
| [**updateSuccess**](TrustedOriginApi.md#updateSuccess) | **PUT** /api/v1/trustedOrigins/{trustedOriginId} |  |


<a name="activateLifecycleSuccess"></a>
# **activateLifecycleSuccess**
> TrustedOrigin activateLifecycleSuccess(trustedOriginId).execute();



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
import com.konfigthis.client.api.TrustedOriginApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String trustedOriginId = "trustedOriginId_example";
    try {
      TrustedOrigin result = client
              .trustedOrigin
              .activateLifecycleSuccess(trustedOriginId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLastUpdatedBy());
      System.out.println(result.getName());
      System.out.println(result.getOrigin());
      System.out.println(result.getScopes());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#activateLifecycleSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrustedOrigin> response = client
              .trustedOrigin
              .activateLifecycleSuccess(trustedOriginId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#activateLifecycleSuccess");
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
| **trustedOriginId** | **String**|  | |

### Return type

[**TrustedOrigin**](TrustedOrigin.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createSuccess"></a>
# **createSuccess**
> TrustedOrigin createSuccess(trustedOrigin).execute();



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
import com.konfigthis.client.api.TrustedOriginApi;
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
    String createdBy = "createdBy_example";
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String lastUpdatedBy = "lastUpdatedBy_example";
    String name = "name_example";
    String origin = "origin_example";
    List<Scope> scopes = Arrays.asList();
    String status = "status_example";
    try {
      TrustedOrigin result = client
              .trustedOrigin
              .createSuccess()
              .links(links)
              .created(created)
              .createdBy(createdBy)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .origin(origin)
              .scopes(scopes)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLastUpdatedBy());
      System.out.println(result.getName());
      System.out.println(result.getOrigin());
      System.out.println(result.getScopes());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#createSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrustedOrigin> response = client
              .trustedOrigin
              .createSuccess()
              .links(links)
              .created(created)
              .createdBy(createdBy)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .origin(origin)
              .scopes(scopes)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#createSuccess");
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
| **trustedOrigin** | [**TrustedOrigin**](TrustedOrigin.md)|  | |

### Return type

[**TrustedOrigin**](TrustedOrigin.md)

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
> TrustedOrigin deactivateLifecycleSuccess(trustedOriginId).execute();



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
import com.konfigthis.client.api.TrustedOriginApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String trustedOriginId = "trustedOriginId_example";
    try {
      TrustedOrigin result = client
              .trustedOrigin
              .deactivateLifecycleSuccess(trustedOriginId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLastUpdatedBy());
      System.out.println(result.getName());
      System.out.println(result.getOrigin());
      System.out.println(result.getScopes());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#deactivateLifecycleSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrustedOrigin> response = client
              .trustedOrigin
              .deactivateLifecycleSuccess(trustedOriginId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#deactivateLifecycleSuccess");
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
| **trustedOriginId** | **String**|  | |

### Return type

[**TrustedOrigin**](TrustedOrigin.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteSuccess"></a>
# **deleteSuccess**
> deleteSuccess(trustedOriginId).execute();



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
import com.konfigthis.client.api.TrustedOriginApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String trustedOriginId = "trustedOriginId_example";
    try {
      client
              .trustedOrigin
              .deleteSuccess(trustedOriginId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#deleteSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .trustedOrigin
              .deleteSuccess(trustedOriginId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#deleteSuccess");
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
| **trustedOriginId** | **String**|  | |

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

<a name="getList"></a>
# **getList**
> List&lt;TrustedOrigin&gt; getList().q(q).filter(filter).after(after).limit(limit).execute();



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
import com.konfigthis.client.api.TrustedOriginApi;
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
    String filter = "filter_example";
    String after = "after_example";
    Integer limit = -1;
    try {
      List<TrustedOrigin> result = client
              .trustedOrigin
              .getList()
              .q(q)
              .filter(filter)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TrustedOrigin>> response = client
              .trustedOrigin
              .getList()
              .q(q)
              .filter(filter)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#getList");
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
| **filter** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to -1] |

### Return type

[**List&lt;TrustedOrigin&gt;**](TrustedOrigin.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSuccessById"></a>
# **getSuccessById**
> TrustedOrigin getSuccessById(trustedOriginId).execute();



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
import com.konfigthis.client.api.TrustedOriginApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String trustedOriginId = "trustedOriginId_example";
    try {
      TrustedOrigin result = client
              .trustedOrigin
              .getSuccessById(trustedOriginId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLastUpdatedBy());
      System.out.println(result.getName());
      System.out.println(result.getOrigin());
      System.out.println(result.getScopes());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#getSuccessById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrustedOrigin> response = client
              .trustedOrigin
              .getSuccessById(trustedOriginId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#getSuccessById");
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
| **trustedOriginId** | **String**|  | |

### Return type

[**TrustedOrigin**](TrustedOrigin.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSuccess"></a>
# **updateSuccess**
> TrustedOrigin updateSuccess(trustedOriginId, trustedOrigin).execute();



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
import com.konfigthis.client.api.TrustedOriginApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String trustedOriginId = "trustedOriginId_example";
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    String createdBy = "createdBy_example";
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String lastUpdatedBy = "lastUpdatedBy_example";
    String name = "name_example";
    String origin = "origin_example";
    List<Scope> scopes = Arrays.asList();
    String status = "status_example";
    try {
      TrustedOrigin result = client
              .trustedOrigin
              .updateSuccess(trustedOriginId)
              .links(links)
              .created(created)
              .createdBy(createdBy)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .origin(origin)
              .scopes(scopes)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLastUpdatedBy());
      System.out.println(result.getName());
      System.out.println(result.getOrigin());
      System.out.println(result.getScopes());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#updateSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrustedOrigin> response = client
              .trustedOrigin
              .updateSuccess(trustedOriginId)
              .links(links)
              .created(created)
              .createdBy(createdBy)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .origin(origin)
              .scopes(scopes)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrustedOriginApi#updateSuccess");
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
| **trustedOriginId** | **String**|  | |
| **trustedOrigin** | [**TrustedOrigin**](TrustedOrigin.md)|  | |

### Return type

[**TrustedOrigin**](TrustedOrigin.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

