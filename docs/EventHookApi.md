# EventHookApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateLifecycleSuccess**](EventHookApi.md#activateLifecycleSuccess) | **POST** /api/v1/eventHooks/{eventHookId}/lifecycle/activate |  |
| [**createSuccess**](EventHookApi.md#createSuccess) | **POST** /api/v1/eventHooks |  |
| [**deactivateLifecycleEvent**](EventHookApi.md#deactivateLifecycleEvent) | **POST** /api/v1/eventHooks/{eventHookId}/lifecycle/deactivate |  |
| [**getSuccessEvent**](EventHookApi.md#getSuccessEvent) | **GET** /api/v1/eventHooks/{eventHookId} |  |
| [**listSuccessEvents**](EventHookApi.md#listSuccessEvents) | **GET** /api/v1/eventHooks |  |
| [**removeSuccessEvent**](EventHookApi.md#removeSuccessEvent) | **DELETE** /api/v1/eventHooks/{eventHookId} |  |
| [**updateSuccessEvent**](EventHookApi.md#updateSuccessEvent) | **PUT** /api/v1/eventHooks/{eventHookId} |  |
| [**verifyLifecycleSuccess**](EventHookApi.md#verifyLifecycleSuccess) | **POST** /api/v1/eventHooks/{eventHookId}/lifecycle/verify |  |


<a name="activateLifecycleSuccess"></a>
# **activateLifecycleSuccess**
> EventHook activateLifecycleSuccess(eventHookId).execute();



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
import com.konfigthis.client.api.EventHookApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String eventHookId = "eventHookId_example";
    try {
      EventHook result = client
              .eventHook
              .activateLifecycleSuccess(eventHookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getChannel());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getEvents());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getVerificationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#activateLifecycleSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventHook> response = client
              .eventHook
              .activateLifecycleSuccess(eventHookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#activateLifecycleSuccess");
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
| **eventHookId** | **String**|  | |

### Return type

[**EventHook**](EventHook.md)

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
> EventHook createSuccess(eventHook).execute();



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
import com.konfigthis.client.api.EventHookApi;
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
    EventHookChannel channel = new EventHookChannel();
    OffsetDateTime created = OffsetDateTime.now();
    String createdBy = "createdBy_example";
    EventSubscriptions events = new EventSubscriptions();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    String status = "ACTIVE";
    String verificationStatus = "UNVERIFIED";
    try {
      EventHook result = client
              .eventHook
              .createSuccess()
              .links(links)
              .channel(channel)
              .created(created)
              .createdBy(createdBy)
              .events(events)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .verificationStatus(verificationStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getChannel());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getEvents());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getVerificationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#createSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventHook> response = client
              .eventHook
              .createSuccess()
              .links(links)
              .channel(channel)
              .created(created)
              .createdBy(createdBy)
              .events(events)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .verificationStatus(verificationStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#createSuccess");
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
| **eventHook** | [**EventHook**](EventHook.md)|  | |

### Return type

[**EventHook**](EventHook.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deactivateLifecycleEvent"></a>
# **deactivateLifecycleEvent**
> EventHook deactivateLifecycleEvent(eventHookId).execute();



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
import com.konfigthis.client.api.EventHookApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String eventHookId = "eventHookId_example";
    try {
      EventHook result = client
              .eventHook
              .deactivateLifecycleEvent(eventHookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getChannel());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getEvents());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getVerificationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#deactivateLifecycleEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventHook> response = client
              .eventHook
              .deactivateLifecycleEvent(eventHookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#deactivateLifecycleEvent");
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
| **eventHookId** | **String**|  | |

### Return type

[**EventHook**](EventHook.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSuccessEvent"></a>
# **getSuccessEvent**
> EventHook getSuccessEvent(eventHookId).execute();



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
import com.konfigthis.client.api.EventHookApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String eventHookId = "eventHookId_example";
    try {
      EventHook result = client
              .eventHook
              .getSuccessEvent(eventHookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getChannel());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getEvents());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getVerificationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#getSuccessEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventHook> response = client
              .eventHook
              .getSuccessEvent(eventHookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#getSuccessEvent");
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
| **eventHookId** | **String**|  | |

### Return type

[**EventHook**](EventHook.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listSuccessEvents"></a>
# **listSuccessEvents**
> List&lt;EventHook&gt; listSuccessEvents().execute();



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
import com.konfigthis.client.api.EventHookApi;
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
      List<EventHook> result = client
              .eventHook
              .listSuccessEvents()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#listSuccessEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EventHook>> response = client
              .eventHook
              .listSuccessEvents()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#listSuccessEvents");
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

[**List&lt;EventHook&gt;**](EventHook.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeSuccessEvent"></a>
# **removeSuccessEvent**
> removeSuccessEvent(eventHookId).execute();



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
import com.konfigthis.client.api.EventHookApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String eventHookId = "eventHookId_example";
    try {
      client
              .eventHook
              .removeSuccessEvent(eventHookId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#removeSuccessEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .eventHook
              .removeSuccessEvent(eventHookId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#removeSuccessEvent");
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
| **eventHookId** | **String**|  | |

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

<a name="updateSuccessEvent"></a>
# **updateSuccessEvent**
> EventHook updateSuccessEvent(eventHookId, eventHook).execute();



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
import com.konfigthis.client.api.EventHookApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String eventHookId = "eventHookId_example";
    Map<String, Object> links = new HashMap();
    EventHookChannel channel = new EventHookChannel();
    OffsetDateTime created = OffsetDateTime.now();
    String createdBy = "createdBy_example";
    EventSubscriptions events = new EventSubscriptions();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    String status = "ACTIVE";
    String verificationStatus = "UNVERIFIED";
    try {
      EventHook result = client
              .eventHook
              .updateSuccessEvent(eventHookId)
              .links(links)
              .channel(channel)
              .created(created)
              .createdBy(createdBy)
              .events(events)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .verificationStatus(verificationStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getChannel());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getEvents());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getVerificationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#updateSuccessEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventHook> response = client
              .eventHook
              .updateSuccessEvent(eventHookId)
              .links(links)
              .channel(channel)
              .created(created)
              .createdBy(createdBy)
              .events(events)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .status(status)
              .verificationStatus(verificationStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#updateSuccessEvent");
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
| **eventHookId** | **String**|  | |
| **eventHook** | [**EventHook**](EventHook.md)|  | |

### Return type

[**EventHook**](EventHook.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="verifyLifecycleSuccess"></a>
# **verifyLifecycleSuccess**
> EventHook verifyLifecycleSuccess(eventHookId).execute();



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
import com.konfigthis.client.api.EventHookApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String eventHookId = "eventHookId_example";
    try {
      EventHook result = client
              .eventHook
              .verifyLifecycleSuccess(eventHookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getChannel());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getEvents());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getVerificationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#verifyLifecycleSuccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventHook> response = client
              .eventHook
              .verifyLifecycleSuccess(eventHookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHookApi#verifyLifecycleSuccess");
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
| **eventHookId** | **String**|  | |

### Return type

[**EventHook**](EventHook.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

