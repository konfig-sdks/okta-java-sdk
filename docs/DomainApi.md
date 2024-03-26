# DomainApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCertificate**](DomainApi.md#createCertificate) | **PUT** /api/v1/domains/{domainId}/certificate | Create Certificate |
| [**createNewDomain**](DomainApi.md#createNewDomain) | **POST** /api/v1/domains | Create Domain |
| [**getById**](DomainApi.md#getById) | **GET** /api/v1/domains/{domainId} | Get Domain |
| [**listVerifiedCustom**](DomainApi.md#listVerifiedCustom) | **GET** /api/v1/domains | List Domains |
| [**removeById**](DomainApi.md#removeById) | **DELETE** /api/v1/domains/{domainId} | Delete Domain |
| [**verifyById**](DomainApi.md#verifyById) | **POST** /api/v1/domains/{domainId}/verify | Verify Domain |


<a name="createCertificate"></a>
# **createCertificate**
> createCertificate(domainId, domainCertificate).execute();

Create Certificate

Creates the Certificate for the Domain.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String domainId = "domainId_example";
    String certificate = "certificate_example";
    String certificateChain = "certificateChain_example";
    String privateKey = "privateKey_example";
    DomainCertificateType type = DomainCertificateType.fromValue("PEM");
    try {
      client
              .domain
              .createCertificate(domainId)
              .certificate(certificate)
              .certificateChain(certificateChain)
              .privateKey(privateKey)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#createCertificate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domain
              .createCertificate(domainId)
              .certificate(certificate)
              .certificateChain(certificateChain)
              .privateKey(privateKey)
              .type(type)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#createCertificate");
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
| **domainId** | **String**|  | |
| **domainCertificate** | [**DomainCertificate**](DomainCertificate.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="createNewDomain"></a>
# **createNewDomain**
> Domain createNewDomain(domain).execute();

Create Domain

Creates your domain.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    DomainCertificateSourceType certificateSourceType = DomainCertificateSourceType.fromValue("MANUAL");
    List<DNSRecord> dnsRecords = Arrays.asList();
    String domain = "domain_example";
    String id = "id_example";
    DomainCertificateMetadata publicCertificate = new DomainCertificateMetadata();
    DomainValidationStatus validationStatus = DomainValidationStatus.fromValue("NOT_STARTED");
    try {
      Domain result = client
              .domain
              .createNewDomain()
              .certificateSourceType(certificateSourceType)
              .dnsRecords(dnsRecords)
              .domain(domain)
              .id(id)
              .publicCertificate(publicCertificate)
              .validationStatus(validationStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getCertificateSourceType());
      System.out.println(result.getDnsRecords());
      System.out.println(result.getDomain());
      System.out.println(result.getId());
      System.out.println(result.getPublicCertificate());
      System.out.println(result.getValidationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#createNewDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Domain> response = client
              .domain
              .createNewDomain()
              .certificateSourceType(certificateSourceType)
              .dnsRecords(dnsRecords)
              .domain(domain)
              .id(id)
              .publicCertificate(publicCertificate)
              .validationStatus(validationStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#createNewDomain");
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
| **domain** | [**Domain**](Domain.md)|  | |

### Return type

[**Domain**](Domain.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getById"></a>
# **getById**
> Domain getById(domainId).execute();

Get Domain

Fetches a Domain by &#x60;id&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String domainId = "domainId_example";
    try {
      Domain result = client
              .domain
              .getById(domainId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCertificateSourceType());
      System.out.println(result.getDnsRecords());
      System.out.println(result.getDomain());
      System.out.println(result.getId());
      System.out.println(result.getPublicCertificate());
      System.out.println(result.getValidationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Domain> response = client
              .domain
              .getById(domainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#getById");
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
| **domainId** | **String**|  | |

### Return type

[**Domain**](Domain.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listVerifiedCustom"></a>
# **listVerifiedCustom**
> DomainListResponse listVerifiedCustom().execute();

List Domains

List all verified custom Domains for the org.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainApi;
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
      DomainListResponse result = client
              .domain
              .listVerifiedCustom()
              .execute();
      System.out.println(result);
      System.out.println(result.getDomains());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#listVerifiedCustom");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainListResponse> response = client
              .domain
              .listVerifiedCustom()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#listVerifiedCustom");
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

[**DomainListResponse**](DomainListResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(domainId).execute();

Delete Domain

Deletes a Domain by &#x60;id&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String domainId = "domainId_example";
    try {
      client
              .domain
              .removeById(domainId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domain
              .removeById(domainId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#removeById");
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
| **domainId** | **String**|  | |

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

<a name="verifyById"></a>
# **verifyById**
> Domain verifyById(domainId).execute();

Verify Domain

Verifies the Domain by &#x60;id&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String domainId = "domainId_example";
    try {
      Domain result = client
              .domain
              .verifyById(domainId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCertificateSourceType());
      System.out.println(result.getDnsRecords());
      System.out.println(result.getDomain());
      System.out.println(result.getId());
      System.out.println(result.getPublicCertificate());
      System.out.println(result.getValidationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#verifyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Domain> response = client
              .domain
              .verifyById(domainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainApi#verifyById");
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
| **domainId** | **String**|  | |

### Return type

[**Domain**](Domain.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

