# SessionApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**close**](SessionApi.md#close) | **DELETE** /api/v1/sessions/{sessionId} | Close Session |
| [**createSessionWithToken**](SessionApi.md#createSessionWithToken) | **POST** /api/v1/sessions | Create Session with Session Token |
| [**getDetails**](SessionApi.md#getDetails) | **GET** /api/v1/sessions/{sessionId} |  |
| [**refreshLifecycle**](SessionApi.md#refreshLifecycle) | **POST** /api/v1/sessions/{sessionId}/lifecycle/refresh | Refresh Session |


<a name="close"></a>
# **close**
> close(sessionId).execute();

Close Session



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String sessionId = "sessionId_example";
    try {
      client
              .session
              .close(sessionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#close");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .session
              .close(sessionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#close");
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
| **sessionId** | **String**|  | |

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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="createSessionWithToken"></a>
# **createSessionWithToken**
> Session createSessionWithToken(createSessionRequest).execute();

Create Session with Session Token

Creates a new session for a user with a valid session token. Use this API if, for example, you want to set the session cookie yourself instead of allowing Okta to set it, or want to hold the session ID in order to delete a session via the API instead of visiting the logout URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String sessionToken = "sessionToken_example";
    try {
      Session result = client
              .session
              .createSessionWithToken()
              .sessionToken(sessionToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAmr());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getId());
      System.out.println(result.getIdp());
      System.out.println(result.getLastFactorVerification());
      System.out.println(result.getLastPasswordVerification());
      System.out.println(result.getLogin());
      System.out.println(result.getStatus());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#createSessionWithToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .session
              .createSessionWithToken()
              .sessionToken(sessionToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#createSessionWithToken");
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
| **createSessionRequest** | [**CreateSessionRequest**](CreateSessionRequest.md)|  | |

### Return type

[**Session**](Session.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="getDetails"></a>
# **getDetails**
> Session getDetails(sessionId).execute();



Get details about a session.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String sessionId = "sessionId_example";
    try {
      Session result = client
              .session
              .getDetails(sessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAmr());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getId());
      System.out.println(result.getIdp());
      System.out.println(result.getLastFactorVerification());
      System.out.println(result.getLastPasswordVerification());
      System.out.println(result.getLogin());
      System.out.println(result.getStatus());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .session
              .getDetails(sessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#getDetails");
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
| **sessionId** | **String**|  | |

### Return type

[**Session**](Session.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="refreshLifecycle"></a>
# **refreshLifecycle**
> Session refreshLifecycle(sessionId).execute();

Refresh Session



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String sessionId = "sessionId_example";
    try {
      Session result = client
              .session
              .refreshLifecycle(sessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAmr());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getId());
      System.out.println(result.getIdp());
      System.out.println(result.getLastFactorVerification());
      System.out.println(result.getLastPasswordVerification());
      System.out.println(result.getLogin());
      System.out.println(result.getStatus());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#refreshLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .session
              .refreshLifecycle(sessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#refreshLifecycle");
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
| **sessionId** | **String**|  | |

### Return type

[**Session**](Session.md)

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

