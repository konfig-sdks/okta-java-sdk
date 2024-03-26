# NetworkZoneApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateLifecycle**](NetworkZoneApi.md#activateLifecycle) | **POST** /api/v1/zones/{zoneId}/lifecycle/activate | Activate Network Zone |
| [**createNew**](NetworkZoneApi.md#createNew) | **POST** /api/v1/zones | Add Network Zone |
| [**deactivateZoneLifecycle**](NetworkZoneApi.md#deactivateZoneLifecycle) | **POST** /api/v1/zones/{zoneId}/lifecycle/deactivate | Deactivate Network Zone |
| [**getById**](NetworkZoneApi.md#getById) | **GET** /api/v1/zones/{zoneId} | Get Network Zone |
| [**listZones**](NetworkZoneApi.md#listZones) | **GET** /api/v1/zones | List Network Zones |
| [**removeZone**](NetworkZoneApi.md#removeZone) | **DELETE** /api/v1/zones/{zoneId} | Delete Network Zone |
| [**updateZone**](NetworkZoneApi.md#updateZone) | **PUT** /api/v1/zones/{zoneId} | Update Network Zone |


<a name="activateLifecycle"></a>
# **activateLifecycle**
> NetworkZone activateLifecycle(zoneId).execute();

Activate Network Zone

Activate Network Zone

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NetworkZoneApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String zoneId = "zoneId_example";
    try {
      NetworkZone result = client
              .networkZone
              .activateLifecycle(zoneId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAsns());
      System.out.println(result.getCreated());
      System.out.println(result.getGateways());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLocations());
      System.out.println(result.getName());
      System.out.println(result.getProxies());
      System.out.println(result.getProxyType());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
      System.out.println(result.getUsage());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#activateLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NetworkZone> response = client
              .networkZone
              .activateLifecycle(zoneId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#activateLifecycle");
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
| **zoneId** | **String**|  | |

### Return type

[**NetworkZone**](NetworkZone.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createNew"></a>
# **createNew**
> NetworkZone createNew(networkZone).execute();

Add Network Zone

Adds a new network zone to your Okta organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NetworkZoneApi;
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
    List<String> asns = Arrays.asList();
    OffsetDateTime created = OffsetDateTime.now();
    List<NetworkZoneAddress> gateways = Arrays.asList();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    List<NetworkZoneLocation> locations = Arrays.asList();
    String name = "name_example";
    List<NetworkZoneAddress> proxies = Arrays.asList();
    String proxyType = "proxyType_example";
    NetworkZoneStatus status = NetworkZoneStatus.fromValue("ACTIVE");
    Boolean system = true;
    NetworkZoneType type = NetworkZoneType.fromValue("IP");
    NetworkZoneUsage usage = NetworkZoneUsage.fromValue("POLICY");
    try {
      NetworkZone result = client
              .networkZone
              .createNew()
              .links(links)
              .asns(asns)
              .created(created)
              .gateways(gateways)
              .id(id)
              .lastUpdated(lastUpdated)
              .locations(locations)
              .name(name)
              .proxies(proxies)
              .proxyType(proxyType)
              .status(status)
              .system(system)
              .type(type)
              .usage(usage)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAsns());
      System.out.println(result.getCreated());
      System.out.println(result.getGateways());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLocations());
      System.out.println(result.getName());
      System.out.println(result.getProxies());
      System.out.println(result.getProxyType());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
      System.out.println(result.getUsage());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NetworkZone> response = client
              .networkZone
              .createNew()
              .links(links)
              .asns(asns)
              .created(created)
              .gateways(gateways)
              .id(id)
              .lastUpdated(lastUpdated)
              .locations(locations)
              .name(name)
              .proxies(proxies)
              .proxyType(proxyType)
              .status(status)
              .system(system)
              .type(type)
              .usage(usage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#createNew");
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
| **networkZone** | [**NetworkZone**](NetworkZone.md)|  | |

### Return type

[**NetworkZone**](NetworkZone.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deactivateZoneLifecycle"></a>
# **deactivateZoneLifecycle**
> NetworkZone deactivateZoneLifecycle(zoneId).execute();

Deactivate Network Zone

Deactivates a network zone.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NetworkZoneApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String zoneId = "zoneId_example";
    try {
      NetworkZone result = client
              .networkZone
              .deactivateZoneLifecycle(zoneId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAsns());
      System.out.println(result.getCreated());
      System.out.println(result.getGateways());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLocations());
      System.out.println(result.getName());
      System.out.println(result.getProxies());
      System.out.println(result.getProxyType());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
      System.out.println(result.getUsage());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#deactivateZoneLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NetworkZone> response = client
              .networkZone
              .deactivateZoneLifecycle(zoneId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#deactivateZoneLifecycle");
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
| **zoneId** | **String**|  | |

### Return type

[**NetworkZone**](NetworkZone.md)

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
> NetworkZone getById(zoneId).execute();

Get Network Zone

Fetches a network zone from your Okta organization by &#x60;id&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NetworkZoneApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String zoneId = "zoneId_example";
    try {
      NetworkZone result = client
              .networkZone
              .getById(zoneId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAsns());
      System.out.println(result.getCreated());
      System.out.println(result.getGateways());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLocations());
      System.out.println(result.getName());
      System.out.println(result.getProxies());
      System.out.println(result.getProxyType());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
      System.out.println(result.getUsage());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NetworkZone> response = client
              .networkZone
              .getById(zoneId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#getById");
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
| **zoneId** | **String**|  | |

### Return type

[**NetworkZone**](NetworkZone.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listZones"></a>
# **listZones**
> List&lt;NetworkZone&gt; listZones().after(after).limit(limit).filter(filter).execute();

List Network Zones

Enumerates network zones added to your organization with pagination. A subset of zones can be returned that match a supported filter expression or query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NetworkZoneApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String after = "after_example"; // Specifies the pagination cursor for the next page of network zones
    Integer limit = -1; // Specifies the number of results for a page
    String filter = "filter_example"; // Filters zones by usage or id expression
    try {
      List<NetworkZone> result = client
              .networkZone
              .listZones()
              .after(after)
              .limit(limit)
              .filter(filter)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#listZones");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<NetworkZone>> response = client
              .networkZone
              .listZones()
              .after(after)
              .limit(limit)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#listZones");
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
| **after** | **String**| Specifies the pagination cursor for the next page of network zones | [optional] |
| **limit** | **Integer**| Specifies the number of results for a page | [optional] [default to -1] |
| **filter** | **String**| Filters zones by usage or id expression | [optional] |

### Return type

[**List&lt;NetworkZone&gt;**](NetworkZone.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeZone"></a>
# **removeZone**
> removeZone(zoneId).execute();

Delete Network Zone

Removes network zone.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NetworkZoneApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String zoneId = "zoneId_example";
    try {
      client
              .networkZone
              .removeZone(zoneId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#removeZone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .networkZone
              .removeZone(zoneId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#removeZone");
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
| **zoneId** | **String**|  | |

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

<a name="updateZone"></a>
# **updateZone**
> NetworkZone updateZone(zoneId, networkZone).execute();

Update Network Zone

Updates a network zone in your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NetworkZoneApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String zoneId = "zoneId_example";
    Map<String, Object> links = new HashMap();
    List<String> asns = Arrays.asList();
    OffsetDateTime created = OffsetDateTime.now();
    List<NetworkZoneAddress> gateways = Arrays.asList();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    List<NetworkZoneLocation> locations = Arrays.asList();
    String name = "name_example";
    List<NetworkZoneAddress> proxies = Arrays.asList();
    String proxyType = "proxyType_example";
    NetworkZoneStatus status = NetworkZoneStatus.fromValue("ACTIVE");
    Boolean system = true;
    NetworkZoneType type = NetworkZoneType.fromValue("IP");
    NetworkZoneUsage usage = NetworkZoneUsage.fromValue("POLICY");
    try {
      NetworkZone result = client
              .networkZone
              .updateZone(zoneId)
              .links(links)
              .asns(asns)
              .created(created)
              .gateways(gateways)
              .id(id)
              .lastUpdated(lastUpdated)
              .locations(locations)
              .name(name)
              .proxies(proxies)
              .proxyType(proxyType)
              .status(status)
              .system(system)
              .type(type)
              .usage(usage)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAsns());
      System.out.println(result.getCreated());
      System.out.println(result.getGateways());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getLocations());
      System.out.println(result.getName());
      System.out.println(result.getProxies());
      System.out.println(result.getProxyType());
      System.out.println(result.getStatus());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
      System.out.println(result.getUsage());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#updateZone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NetworkZone> response = client
              .networkZone
              .updateZone(zoneId)
              .links(links)
              .asns(asns)
              .created(created)
              .gateways(gateways)
              .id(id)
              .lastUpdated(lastUpdated)
              .locations(locations)
              .name(name)
              .proxies(proxies)
              .proxyType(proxyType)
              .status(status)
              .system(system)
              .type(type)
              .usage(usage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkZoneApi#updateZone");
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
| **zoneId** | **String**|  | |
| **networkZone** | [**NetworkZone**](NetworkZone.md)|  | |

### Return type

[**NetworkZone**](NetworkZone.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

