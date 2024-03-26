# SubscriptionApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customRoleNotificationUnsubscribe**](SubscriptionApi.md#customRoleNotificationUnsubscribe) | **POST** /api/v1/roles/{roleTypeOrRoleId}/subscriptions/{notificationType}/unsubscribe | Unsubscribe a Custom Role from a specific notification type |
| [**getRoleSubscriptionsByNotificationType**](SubscriptionApi.md#getRoleSubscriptionsByNotificationType) | **GET** /api/v1/roles/{roleTypeOrRoleId}/subscriptions/{notificationType} | Get subscriptions of a Custom Role with a specific notification type |
| [**listRoleSubscriptions**](SubscriptionApi.md#listRoleSubscriptions) | **GET** /api/v1/roles/{roleTypeOrRoleId}/subscriptions | List all subscriptions of a Custom Role |
| [**roleNotificationSubscribe**](SubscriptionApi.md#roleNotificationSubscribe) | **POST** /api/v1/roles/{roleTypeOrRoleId}/subscriptions/{notificationType}/subscribe | Subscribe a Custom Role to a specific notification type |
| [**unsubscribeUserSubscriptionByNotificationType**](SubscriptionApi.md#unsubscribeUserSubscriptionByNotificationType) | **POST** /api/v1/users/{userId}/subscriptions/{notificationType}/unsubscribe | Unsubscribe from a specific notification type |
| [**userNotificationSubscribe**](SubscriptionApi.md#userNotificationSubscribe) | **POST** /api/v1/users/{userId}/subscriptions/{notificationType}/subscribe | Subscribe to a specific notification type |


<a name="customRoleNotificationUnsubscribe"></a>
# **customRoleNotificationUnsubscribe**
> customRoleNotificationUnsubscribe(roleTypeOrRoleId, notificationType).execute();

Unsubscribe a Custom Role from a specific notification type

When roleType Unsubscribes a Role from a specific notification type. When you change the subscription status of a Role, it overrides the subscription of any individual user of that Role. Else when roleId Unsubscribes a Custom Role from a specific notification type. When you change the subscription status of a Custom Role, it overrides the subscription of any individual user of that Custom Role.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String roleTypeOrRoleId = "roleTypeOrRoleId_example";
    String notificationType = "notificationType_example";
    try {
      client
              .subscription
              .customRoleNotificationUnsubscribe(roleTypeOrRoleId, notificationType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#customRoleNotificationUnsubscribe");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .customRoleNotificationUnsubscribe(roleTypeOrRoleId, notificationType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#customRoleNotificationUnsubscribe");
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
| **roleTypeOrRoleId** | **String**|  | |
| **notificationType** | **String**|  | |

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
| **404** | Not Found |  -  |

<a name="getRoleSubscriptionsByNotificationType"></a>
# **getRoleSubscriptionsByNotificationType**
> Subscription getRoleSubscriptionsByNotificationType(roleTypeOrRoleId, notificationType).execute();

Get subscriptions of a Custom Role with a specific notification type

When roleType Get subscriptions of a Role with a specific notification type. Else when roleId Get subscription of a Custom Role with a specific notification type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String roleTypeOrRoleId = "roleTypeOrRoleId_example";
    String notificationType = "notificationType_example";
    try {
      Subscription result = client
              .subscription
              .getRoleSubscriptionsByNotificationType(roleTypeOrRoleId, notificationType)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getChannels());
      System.out.println(result.getNotificationType());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getRoleSubscriptionsByNotificationType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Subscription> response = client
              .subscription
              .getRoleSubscriptionsByNotificationType(roleTypeOrRoleId, notificationType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getRoleSubscriptionsByNotificationType");
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
| **roleTypeOrRoleId** | **String**|  | |
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

<a name="listRoleSubscriptions"></a>
# **listRoleSubscriptions**
> List&lt;Subscription&gt; listRoleSubscriptions(roleTypeOrRoleId).execute();

List all subscriptions of a Custom Role

When roleType List all subscriptions of a Role. Else when roleId List subscriptions of a Custom Role

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String roleTypeOrRoleId = "roleTypeOrRoleId_example";
    try {
      List<Subscription> result = client
              .subscription
              .listRoleSubscriptions(roleTypeOrRoleId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listRoleSubscriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Subscription>> response = client
              .subscription
              .listRoleSubscriptions(roleTypeOrRoleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#listRoleSubscriptions");
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
| **roleTypeOrRoleId** | **String**|  | |

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

<a name="roleNotificationSubscribe"></a>
# **roleNotificationSubscribe**
> roleNotificationSubscribe(roleTypeOrRoleId, notificationType).execute();

Subscribe a Custom Role to a specific notification type

When roleType Subscribes a Role to a specific notification type. When you change the subscription status of a Role, it overrides the subscription of any individual user of that Role. Else when roleId Subscribes a Custom Role to a specific notification type. When you change the subscription status of a Custom Role, it overrides the subscription of any individual user of that Custom Role.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String roleTypeOrRoleId = "roleTypeOrRoleId_example";
    String notificationType = "notificationType_example";
    try {
      client
              .subscription
              .roleNotificationSubscribe(roleTypeOrRoleId, notificationType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#roleNotificationSubscribe");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .roleNotificationSubscribe(roleTypeOrRoleId, notificationType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#roleNotificationSubscribe");
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
| **roleTypeOrRoleId** | **String**|  | |
| **notificationType** | **String**|  | |

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
| **404** | Not Found |  -  |

<a name="unsubscribeUserSubscriptionByNotificationType"></a>
# **unsubscribeUserSubscriptionByNotificationType**
> unsubscribeUserSubscriptionByNotificationType(userId, notificationType).execute();

Unsubscribe from a specific notification type

Unsubscribes a User from a specific notification type. Only the current User can unsubscribe from a specific notification type. An AccessDeniedException message is sent if requests are made from other users.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
      client
              .subscription
              .unsubscribeUserSubscriptionByNotificationType(userId, notificationType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#unsubscribeUserSubscriptionByNotificationType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .unsubscribeUserSubscriptionByNotificationType(userId, notificationType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#unsubscribeUserSubscriptionByNotificationType");
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
| **404** | Not Found |  -  |

<a name="userNotificationSubscribe"></a>
# **userNotificationSubscribe**
> userNotificationSubscribe(userId, notificationType).execute();

Subscribe to a specific notification type

Subscribes a User to a specific notification type. Only the current User can subscribe to a specific notification type. An AccessDeniedException message is sent if requests are made from other users.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionApi;
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
      client
              .subscription
              .userNotificationSubscribe(userId, notificationType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#userNotificationSubscribe");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscription
              .userNotificationSubscribe(userId, notificationType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#userNotificationSubscribe");
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
| **404** | Not Found |  -  |

