# LogApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getListEvents**](LogApi.md#getListEvents) | **GET** /api/v1/logs | Fetch a list of events from your Okta organization system log. |


<a name="getListEvents"></a>
# **getListEvents**
> List&lt;LogEvent&gt; getListEvents().since(since).until(until).filter(filter).q(q).limit(limit).sortOrder(sortOrder).after(after).execute();

Fetch a list of events from your Okta organization system log.

The Okta System Log API provides read access to your organization’s system log. This API provides more functionality than the Events API

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LogApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    OffsetDateTime since = OffsetDateTime.now();
    OffsetDateTime until = OffsetDateTime.now();
    String filter = "filter_example";
    String q = "q_example";
    Integer limit = 100;
    String sortOrder = "ASCENDING";
    String after = "after_example";
    try {
      List<LogEvent> result = client
              .log
              .getListEvents()
              .since(since)
              .until(until)
              .filter(filter)
              .q(q)
              .limit(limit)
              .sortOrder(sortOrder)
              .after(after)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogApi#getListEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LogEvent>> response = client
              .log
              .getListEvents()
              .since(since)
              .until(until)
              .filter(filter)
              .q(q)
              .limit(limit)
              .sortOrder(sortOrder)
              .after(after)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LogApi#getListEvents");
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
| **since** | **OffsetDateTime**|  | [optional] |
| **until** | **OffsetDateTime**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 100] |
| **sortOrder** | **String**|  | [optional] [default to ASCENDING] |
| **after** | **String**|  | [optional] |

### Return type

[**List&lt;LogEvent&gt;**](LogEvent.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

