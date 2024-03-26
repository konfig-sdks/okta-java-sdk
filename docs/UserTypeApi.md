# UserTypeApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewUserType**](UserTypeApi.md#createNewUserType) | **POST** /api/v1/meta/types/user |  |
| [**deletePermanently**](UserTypeApi.md#deletePermanently) | **DELETE** /api/v1/meta/types/user/{typeId} |  |
| [**getAllUserTypes**](UserTypeApi.md#getAllUserTypes) | **GET** /api/v1/meta/types/user |  |
| [**getById**](UserTypeApi.md#getById) | **GET** /api/v1/meta/types/user/{typeId} |  |
| [**replaceExistingType**](UserTypeApi.md#replaceExistingType) | **PUT** /api/v1/meta/types/user/{typeId} |  |
| [**updateExistingType**](UserTypeApi.md#updateExistingType) | **POST** /api/v1/meta/types/user/{typeId} |  |


<a name="createNewUserType"></a>
# **createNewUserType**
> UserType createNewUserType(userType).execute();



Creates a new User Type. A default User Type is automatically created along with your org, and you may add another 9 User Types for a maximum of 10.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserTypeApi;
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
    OffsetDateTime created = OffsetDateTime.now();
    String createdBy = "createdBy_example";
    Boolean _default = true;
    String displayName = "displayName_example";
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String lastUpdatedBy = "lastUpdatedBy_example";
    String name = "name_example";
    try {
      UserType result = client
              .userType
              .createNewUserType()
              .description(description)
              .links(links)
              .created(created)
              .createdBy(createdBy)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getDefault());
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLastUpdatedBy());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#createNewUserType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserType> response = client
              .userType
              .createNewUserType()
              .description(description)
              .links(links)
              .created(created)
              .createdBy(createdBy)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#createNewUserType");
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
| **userType** | [**UserType**](UserType.md)|  | |

### Return type

[**UserType**](UserType.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deletePermanently"></a>
# **deletePermanently**
> deletePermanently(typeId).execute();



Deletes a User Type permanently. This operation is not permitted for the default type, nor for any User Type that has existing users

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserTypeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String typeId = "typeId_example";
    try {
      client
              .userType
              .deletePermanently(typeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#deletePermanently");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .userType
              .deletePermanently(typeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#deletePermanently");
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
| **typeId** | **String**|  | |

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

<a name="getAllUserTypes"></a>
# **getAllUserTypes**
> List&lt;UserType&gt; getAllUserTypes().execute();



Fetches all User Types in your org

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserTypeApi;
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
      List<UserType> result = client
              .userType
              .getAllUserTypes()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#getAllUserTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UserType>> response = client
              .userType
              .getAllUserTypes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#getAllUserTypes");
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

[**List&lt;UserType&gt;**](UserType.md)

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
> UserType getById(typeId).execute();



Fetches a User Type by ID. The special identifier &#x60;default&#x60; may be used to fetch the default User Type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserTypeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String typeId = "typeId_example";
    try {
      UserType result = client
              .userType
              .getById(typeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getDefault());
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLastUpdatedBy());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserType> response = client
              .userType
              .getById(typeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#getById");
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
| **typeId** | **String**|  | |

### Return type

[**UserType**](UserType.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="replaceExistingType"></a>
# **replaceExistingType**
> UserType replaceExistingType(typeId, userType).execute();



Replace an existing User Type

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserTypeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String typeId = "typeId_example";
    String description = "description_example";
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    String createdBy = "createdBy_example";
    Boolean _default = true;
    String displayName = "displayName_example";
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String lastUpdatedBy = "lastUpdatedBy_example";
    String name = "name_example";
    try {
      UserType result = client
              .userType
              .replaceExistingType(typeId)
              .description(description)
              .links(links)
              .created(created)
              .createdBy(createdBy)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getDefault());
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLastUpdatedBy());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#replaceExistingType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserType> response = client
              .userType
              .replaceExistingType(typeId)
              .description(description)
              .links(links)
              .created(created)
              .createdBy(createdBy)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#replaceExistingType");
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
| **typeId** | **String**|  | |
| **userType** | [**UserType**](UserType.md)|  | |

### Return type

[**UserType**](UserType.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateExistingType"></a>
# **updateExistingType**
> UserType updateExistingType(typeId, userType).execute();



Updates an existing User Type

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserTypeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String typeId = "typeId_example";
    String description = "description_example";
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    String createdBy = "createdBy_example";
    Boolean _default = true;
    String displayName = "displayName_example";
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String lastUpdatedBy = "lastUpdatedBy_example";
    String name = "name_example";
    try {
      UserType result = client
              .userType
              .updateExistingType(typeId)
              .description(description)
              .links(links)
              .created(created)
              .createdBy(createdBy)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getDefault());
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLastUpdatedBy());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#updateExistingType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserType> response = client
              .userType
              .updateExistingType(typeId)
              .description(description)
              .links(links)
              .created(created)
              .createdBy(createdBy)
              ._default(_default)
              .displayName(displayName)
              .id(id)
              .lastUpdated(lastUpdated)
              .lastUpdatedBy(lastUpdatedBy)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTypeApi#updateExistingType");
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
| **typeId** | **String**|  | |
| **userType** | [**UserType**](UserType.md)|  | |

### Return type

[**UserType**](UserType.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

