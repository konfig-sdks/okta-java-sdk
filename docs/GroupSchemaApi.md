# GroupSchemaApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](GroupSchemaApi.md#get) | **GET** /api/v1/meta/schemas/group/default | Fetches the group schema |
| [**updateCustomProperties**](GroupSchemaApi.md#updateCustomProperties) | **POST** /api/v1/meta/schemas/group/default | Updates, adds ore removes one or more custom Group Profile properties in the schema |


<a name="get"></a>
# **get**
> GroupSchema get().execute();

Fetches the group schema

Fetches the group schema

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupSchemaApi;
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
      GroupSchema result = client
              .groupSchema
              .get()
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
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
      System.err.println("Exception when calling GroupSchemaApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupSchema> response = client
              .groupSchema
              .get()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupSchemaApi#get");
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

[**GroupSchema**](GroupSchema.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updateCustomProperties"></a>
# **updateCustomProperties**
> GroupSchema updateCustomProperties().groupSchema(groupSchema).execute();

Updates, adds ore removes one or more custom Group Profile properties in the schema

Updates, adds ore removes one or more custom Group Profile properties in the schema

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GroupSchemaApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String title = "title_example";
    String description = "description_example";
    String $schema = "$schema_example";
    Map<String, Object> links = new HashMap();
    String created = "created_example";
    GroupSchemaDefinitions definitions = new GroupSchemaDefinitions();
    String id = "id_example";
    String lastUpdated = "lastUpdated_example";
    String name = "name_example";
    UserSchemaProperties properties = new UserSchemaProperties();
    String type = "type_example";
    try {
      GroupSchema result = client
              .groupSchema
              .updateCustomProperties()
              .title(title)
              .description(description)
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
      System.out.println(result.getDescription());
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
      System.err.println("Exception when calling GroupSchemaApi#updateCustomProperties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GroupSchema> response = client
              .groupSchema
              .updateCustomProperties()
              .title(title)
              .description(description)
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
      System.err.println("Exception when calling GroupSchemaApi#updateCustomProperties");
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
| **groupSchema** | [**GroupSchema**](GroupSchema.md)|  | [optional] |

### Return type

[**GroupSchema**](GroupSchema.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

