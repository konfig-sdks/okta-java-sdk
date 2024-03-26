# ProfileMappingApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](ProfileMappingApi.md#getById) | **GET** /api/v1/mappings/{mappingId} | Get Profile Mapping |
| [**listWithPagination**](ProfileMappingApi.md#listWithPagination) | **GET** /api/v1/mappings |  |
| [**updatePropertyMappings**](ProfileMappingApi.md#updatePropertyMappings) | **POST** /api/v1/mappings/{mappingId} | Update Profile Mapping |


<a name="getById"></a>
# **getById**
> ProfileMapping getById(mappingId).execute();

Get Profile Mapping

Fetches a single Profile Mapping referenced by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileMappingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String mappingId = "mappingId_example";
    try {
      ProfileMapping result = client
              .profileMapping
              .getById(mappingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getProperties());
      System.out.println(result.getSource());
      System.out.println(result.getTarget());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileMappingApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileMapping> response = client
              .profileMapping
              .getById(mappingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileMappingApi#getById");
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
| **mappingId** | **String**|  | |

### Return type

[**ProfileMapping**](ProfileMapping.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listWithPagination"></a>
# **listWithPagination**
> List&lt;ProfileMapping&gt; listWithPagination().after(after).limit(limit).sourceId(sourceId).targetId(targetId).execute();



Enumerates Profile Mappings in your organization with pagination.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileMappingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String after = "after_example";
    Integer limit = -1;
    String sourceId = "sourceId_example";
    String targetId = "";
    try {
      List<ProfileMapping> result = client
              .profileMapping
              .listWithPagination()
              .after(after)
              .limit(limit)
              .sourceId(sourceId)
              .targetId(targetId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileMappingApi#listWithPagination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ProfileMapping>> response = client
              .profileMapping
              .listWithPagination()
              .after(after)
              .limit(limit)
              .sourceId(sourceId)
              .targetId(targetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileMappingApi#listWithPagination");
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
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to -1] |
| **sourceId** | **String**|  | [optional] |
| **targetId** | **String**|  | [optional] [default to ] |

### Return type

[**List&lt;ProfileMapping&gt;**](ProfileMapping.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePropertyMappings"></a>
# **updatePropertyMappings**
> ProfileMapping updatePropertyMappings(mappingId, profileMapping).execute();

Update Profile Mapping

Updates an existing Profile Mapping by adding, updating, or removing one or many Property Mappings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileMappingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String mappingId = "mappingId_example";
    Map<String, Object> links = new HashMap();
    String id = "id_example";
    Map<String, ProfileMappingProperty> properties = new HashMap();
    ProfileMappingSource source = new ProfileMappingSource();
    ProfileMappingSource target = new ProfileMappingSource();
    try {
      ProfileMapping result = client
              .profileMapping
              .updatePropertyMappings(mappingId)
              .links(links)
              .id(id)
              .properties(properties)
              .source(source)
              .target(target)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getId());
      System.out.println(result.getProperties());
      System.out.println(result.getSource());
      System.out.println(result.getTarget());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileMappingApi#updatePropertyMappings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileMapping> response = client
              .profileMapping
              .updatePropertyMappings(mappingId)
              .links(links)
              .id(id)
              .properties(properties)
              .source(source)
              .target(target)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileMappingApi#updatePropertyMappings");
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
| **mappingId** | **String**|  | |
| **profileMapping** | [**ProfileMapping**](ProfileMapping.md)|  | |

### Return type

[**ProfileMapping**](ProfileMapping.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

