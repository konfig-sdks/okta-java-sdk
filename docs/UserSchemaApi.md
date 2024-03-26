# UserSchemaApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSchemaById**](UserSchemaApi.md#getSchemaById) | **GET** /api/v1/meta/schemas/user/{schemaId} | Fetches the schema for a Schema Id. |
| [**getUserSchema**](UserSchemaApi.md#getUserSchema) | **GET** /api/v1/meta/schemas/apps/{appInstanceId}/default | Fetches the Schema for an App User |
| [**partialUpdateUserProfile**](UserSchemaApi.md#partialUpdateUserProfile) | **POST** /api/v1/meta/schemas/apps/{appInstanceId}/default | Partial updates on the User Profile properties of the Application User Schema. |
| [**partialUpdateUserProfile_0**](UserSchemaApi.md#partialUpdateUserProfile_0) | **POST** /api/v1/meta/schemas/user/{schemaId} |  |


<a name="getSchemaById"></a>
# **getSchemaById**
> UserSchema getSchemaById(schemaId).execute();

Fetches the schema for a Schema Id.

Fetches the schema for a Schema Id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserSchemaApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String schemaId = "schemaId_example";
    try {
      UserSchema result = client
              .userSchema
              .getSchemaById(schemaId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.get$Schema());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getDefinitions());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getProperties());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSchemaApi#getSchemaById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserSchema> response = client
              .userSchema
              .getSchemaById(schemaId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSchemaApi#getSchemaById");
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
| **schemaId** | **String**|  | |

### Return type

[**UserSchema**](UserSchema.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserSchema"></a>
# **getUserSchema**
> UserSchema getUserSchema(appInstanceId).execute();

Fetches the Schema for an App User

Fetches the Schema for an App User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserSchemaApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appInstanceId = "appInstanceId_example";
    try {
      UserSchema result = client
              .userSchema
              .getUserSchema(appInstanceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.get$Schema());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getDefinitions());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getProperties());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSchemaApi#getUserSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserSchema> response = client
              .userSchema
              .getUserSchema(appInstanceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSchemaApi#getUserSchema");
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
| **appInstanceId** | **String**|  | |

### Return type

[**UserSchema**](UserSchema.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="partialUpdateUserProfile"></a>
# **partialUpdateUserProfile**
> UserSchema partialUpdateUserProfile(appInstanceId).userSchema(userSchema).execute();

Partial updates on the User Profile properties of the Application User Schema.

Partial updates on the User Profile properties of the Application User Schema.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserSchemaApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String appInstanceId = "appInstanceId_example";
    String title = "title_example";
    String $schema = "$schema_example";
    Map<String, Object> links = new HashMap();
    String created = "created_example";
    UserSchemaDefinitions definitions = new UserSchemaDefinitions();
    String id = "id_example";
    String lastUpdated = "lastUpdated_example";
    String name = "name_example";
    UserSchemaProperties properties = new UserSchemaProperties();
    String type = "type_example";
    try {
      UserSchema result = client
              .userSchema
              .partialUpdateUserProfile(appInstanceId)
              .title(title)
              .$schema($schema)
              .links(links)
              .created(created)
              .definitions(definitions)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .properties(properties)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.get$Schema());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getDefinitions());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getProperties());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSchemaApi#partialUpdateUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserSchema> response = client
              .userSchema
              .partialUpdateUserProfile(appInstanceId)
              .title(title)
              .$schema($schema)
              .links(links)
              .created(created)
              .definitions(definitions)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .properties(properties)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSchemaApi#partialUpdateUserProfile");
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
| **appInstanceId** | **String**|  | |
| **userSchema** | [**UserSchema**](UserSchema.md)|  | [optional] |

### Return type

[**UserSchema**](UserSchema.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="partialUpdateUserProfile_0"></a>
# **partialUpdateUserProfile_0**
> UserSchema partialUpdateUserProfile_0(schemaId, userSchema).execute();



Partial updates on the User Profile properties of the user schema.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserSchemaApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String schemaId = "schemaId_example";
    String title = "title_example";
    String $schema = "$schema_example";
    Map<String, Object> links = new HashMap();
    String created = "created_example";
    UserSchemaDefinitions definitions = new UserSchemaDefinitions();
    String id = "id_example";
    String lastUpdated = "lastUpdated_example";
    String name = "name_example";
    UserSchemaProperties properties = new UserSchemaProperties();
    String type = "type_example";
    try {
      UserSchema result = client
              .userSchema
              .partialUpdateUserProfile_0(schemaId)
              .title(title)
              .$schema($schema)
              .links(links)
              .created(created)
              .definitions(definitions)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .properties(properties)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.get$Schema());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getDefinitions());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getProperties());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSchemaApi#partialUpdateUserProfile_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserSchema> response = client
              .userSchema
              .partialUpdateUserProfile_0(schemaId)
              .title(title)
              .$schema($schema)
              .links(links)
              .created(created)
              .definitions(definitions)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .properties(properties)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserSchemaApi#partialUpdateUserProfile_0");
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
| **schemaId** | **String**|  | |
| **userSchema** | [**UserSchema**](UserSchema.md)|  | |

### Return type

[**UserSchema**](UserSchema.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

