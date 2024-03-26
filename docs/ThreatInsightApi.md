# ThreatInsightApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentConfiguration**](ThreatInsightApi.md#getCurrentConfiguration) | **GET** /api/v1/threats/configuration |  |
| [**updateConfiguration**](ThreatInsightApi.md#updateConfiguration) | **POST** /api/v1/threats/configuration |  |


<a name="getCurrentConfiguration"></a>
# **getCurrentConfiguration**
> ThreatInsightConfiguration getCurrentConfiguration().execute();



Gets current ThreatInsight configuration

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreatInsightApi;
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
      ThreatInsightConfiguration result = client
              .threatInsight
              .getCurrentConfiguration()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAction());
      System.out.println(result.getCreated());
      System.out.println(result.getExcludeZones());
      System.out.println(result.getLastUpdated());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreatInsightApi#getCurrentConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ThreatInsightConfiguration> response = client
              .threatInsight
              .getCurrentConfiguration()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreatInsightApi#getCurrentConfiguration");
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

[**ThreatInsightConfiguration**](ThreatInsightConfiguration.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateConfiguration"></a>
# **updateConfiguration**
> ThreatInsightConfiguration updateConfiguration(threatInsightConfiguration).execute();



Updates ThreatInsight configuration

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThreatInsightApi;
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
    String action = "action_example";
    OffsetDateTime created = OffsetDateTime.now();
    List<String> excludeZones = Arrays.asList();
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    try {
      ThreatInsightConfiguration result = client
              .threatInsight
              .updateConfiguration()
              .links(links)
              .action(action)
              .created(created)
              .excludeZones(excludeZones)
              .lastUpdated(lastUpdated)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAction());
      System.out.println(result.getCreated());
      System.out.println(result.getExcludeZones());
      System.out.println(result.getLastUpdated());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreatInsightApi#updateConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ThreatInsightConfiguration> response = client
              .threatInsight
              .updateConfiguration()
              .links(links)
              .action(action)
              .created(created)
              .excludeZones(excludeZones)
              .lastUpdated(lastUpdated)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThreatInsightApi#updateConfiguration");
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
| **threatInsightConfiguration** | [**ThreatInsightConfiguration**](ThreatInsightConfiguration.md)|  | |

### Return type

[**ThreatInsightConfiguration**](ThreatInsightConfiguration.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

