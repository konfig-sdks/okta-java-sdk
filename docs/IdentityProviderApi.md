# IdentityProviderApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateIdpLifecycle**](IdentityProviderApi.md#activateIdpLifecycle) | **POST** /api/v1/idps/{idpId}/lifecycle/activate | Activate Identity Provider |
| [**addNewIdp**](IdentityProviderApi.md#addNewIdp) | **POST** /api/v1/idps | Add Identity Provider |
| [**addX509CertificatePublicKey**](IdentityProviderApi.md#addX509CertificatePublicKey) | **POST** /api/v1/idps/credentials/keys | Add X.509 Certificate Public Key |
| [**cloneSigningKeyCredential**](IdentityProviderApi.md#cloneSigningKeyCredential) | **POST** /api/v1/idps/{idpId}/credentials/keys/{keyId}/clone | Clone Signing Key Credential for IdP |
| [**deactivateIdp**](IdentityProviderApi.md#deactivateIdp) | **POST** /api/v1/idps/{idpId}/lifecycle/deactivate | Deactivate Identity Provider |
| [**deleteKeyCredential**](IdentityProviderApi.md#deleteKeyCredential) | **DELETE** /api/v1/idps/credentials/keys/{keyId} | Delete Key |
| [**enumerateIdpKeys**](IdentityProviderApi.md#enumerateIdpKeys) | **GET** /api/v1/idps/credentials/keys | List Keys |
| [**generateCsr**](IdentityProviderApi.md#generateCsr) | **POST** /api/v1/idps/{idpId}/credentials/csrs | Generate Certificate Signing Request for IdP |
| [**generateNewSigningKeyCredential**](IdentityProviderApi.md#generateNewSigningKeyCredential) | **POST** /api/v1/idps/{idpId}/credentials/keys/generate | Generate New IdP Signing Key Credential |
| [**getByIdp**](IdentityProviderApi.md#getByIdp) | **GET** /api/v1/idps/{idpId} | Get Identity Provider |
| [**getCsrByIdp**](IdentityProviderApi.md#getCsrByIdp) | **GET** /api/v1/idps/{idpId}/credentials/csrs/{csrId} |  |
| [**getKeyCredentialByIdp**](IdentityProviderApi.md#getKeyCredentialByIdp) | **GET** /api/v1/idps/credentials/keys/{keyId} | Get Key |
| [**getLinkedUserById**](IdentityProviderApi.md#getLinkedUserById) | **GET** /api/v1/idps/{idpId}/users/{userId} |  |
| [**getSigningKeyCredentialByIdp**](IdentityProviderApi.md#getSigningKeyCredentialByIdp) | **GET** /api/v1/idps/{idpId}/credentials/keys/{keyId} | Get Signing Key Credential for IdP |
| [**getSocialAuthTokens**](IdentityProviderApi.md#getSocialAuthTokens) | **GET** /api/v1/idps/{idpId}/users/{userId}/credentials/tokens | Social Authentication Token Operation |
| [**getUser**](IdentityProviderApi.md#getUser) | **GET** /api/v1/idps/{idpId}/users | Find Users |
| [**linkUserToIdpWithoutTransaction**](IdentityProviderApi.md#linkUserToIdpWithoutTransaction) | **POST** /api/v1/idps/{idpId}/users/{userId} | Link a user to a Social IdP without a transaction |
| [**list**](IdentityProviderApi.md#list) | **GET** /api/v1/idps | List Identity Providers |
| [**listCsrsForCertificateSigningRequests**](IdentityProviderApi.md#listCsrsForCertificateSigningRequests) | **GET** /api/v1/idps/{idpId}/credentials/csrs | List Certificate Signing Requests for IdP |
| [**listSigningKeyCredentials**](IdentityProviderApi.md#listSigningKeyCredentials) | **GET** /api/v1/idps/{idpId}/credentials/keys | List Signing Key Credentials for IdP |
| [**removeIdp**](IdentityProviderApi.md#removeIdp) | **DELETE** /api/v1/idps/{idpId} | Delete Identity Provider |
| [**revokeCsrForIdentityProvider**](IdentityProviderApi.md#revokeCsrForIdentityProvider) | **DELETE** /api/v1/idps/{idpId}/credentials/csrs/{csrId} |  |
| [**unlinkUser**](IdentityProviderApi.md#unlinkUser) | **DELETE** /api/v1/idps/{idpId}/users/{userId} | Unlink User from IdP |
| [**updateConfiguration**](IdentityProviderApi.md#updateConfiguration) | **PUT** /api/v1/idps/{idpId} | Update Identity Provider |
| [**updateCsrLifecyclePublish**](IdentityProviderApi.md#updateCsrLifecyclePublish) | **POST** /api/v1/idps/{idpId}/credentials/csrs/{csrId}/lifecycle/publish |  |


<a name="activateIdpLifecycle"></a>
# **activateIdpLifecycle**
> IdentityProvider activateIdpLifecycle(idpId).execute();

Activate Identity Provider

Activates an inactive IdP.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    try {
      IdentityProvider result = client
              .identityProvider
              .activateIdpLifecycle(idpId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIssuerMode());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPolicy());
      System.out.println(result.getProtocol());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#activateIdpLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdentityProvider> response = client
              .identityProvider
              .activateIdpLifecycle(idpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#activateIdpLifecycle");
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
| **idpId** | **String**|  | |

### Return type

[**IdentityProvider**](IdentityProvider.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addNewIdp"></a>
# **addNewIdp**
> IdentityProvider addNewIdp(identityProvider).execute();

Add Identity Provider

Adds a new IdP to your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
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
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    String issuerMode = "ORG_URL";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    IdentityProviderPolicy policy = new IdentityProviderPolicy();
    Protocol protocol = new Protocol();
    String status = "ACTIVE";
    String type = "SAML2";
    try {
      IdentityProvider result = client
              .identityProvider
              .addNewIdp()
              .links(links)
              .created(created)
              .id(id)
              .issuerMode(issuerMode)
              .lastUpdated(lastUpdated)
              .name(name)
              .policy(policy)
              .protocol(protocol)
              .status(status)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIssuerMode());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPolicy());
      System.out.println(result.getProtocol());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#addNewIdp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdentityProvider> response = client
              .identityProvider
              .addNewIdp()
              .links(links)
              .created(created)
              .id(id)
              .issuerMode(issuerMode)
              .lastUpdated(lastUpdated)
              .name(name)
              .policy(policy)
              .protocol(protocol)
              .status(status)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#addNewIdp");
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
| **identityProvider** | [**IdentityProvider**](IdentityProvider.md)|  | |

### Return type

[**IdentityProvider**](IdentityProvider.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addX509CertificatePublicKey"></a>
# **addX509CertificatePublicKey**
> JsonWebKey addX509CertificatePublicKey(jsonWebKey).execute();

Add X.509 Certificate Public Key

Adds a new X.509 certificate credential to the IdP key store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
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
    String alg = "alg_example";
    OffsetDateTime created = OffsetDateTime.now();
    String e = "e_example";
    OffsetDateTime expiresAt = OffsetDateTime.now();
    List<String> keyOps = Arrays.asList();
    String kid = "kid_example";
    String kty = "kty_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String n = "n_example";
    String status = "status_example";
    String use = "use_example";
    List<String> x5c = Arrays.asList();
    String x5t = "x5t_example";
    String x5tHashS256 = "x5tHashS256_example";
    String x5u = "x5u_example";
    try {
      JsonWebKey result = client
              .identityProvider
              .addX509CertificatePublicKey()
              .links(links)
              .alg(alg)
              .created(created)
              .e(e)
              .expiresAt(expiresAt)
              .keyOps(keyOps)
              .kid(kid)
              .kty(kty)
              .lastUpdated(lastUpdated)
              .n(n)
              .status(status)
              .use(use)
              .x5c(x5c)
              .x5t(x5t)
              .x5tHashS256(x5tHashS256)
              .x5u(x5u)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#addX509CertificatePublicKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .identityProvider
              .addX509CertificatePublicKey()
              .links(links)
              .alg(alg)
              .created(created)
              .e(e)
              .expiresAt(expiresAt)
              .keyOps(keyOps)
              .kid(kid)
              .kty(kty)
              .lastUpdated(lastUpdated)
              .n(n)
              .status(status)
              .use(use)
              .x5c(x5c)
              .x5t(x5t)
              .x5tHashS256(x5tHashS256)
              .x5u(x5u)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#addX509CertificatePublicKey");
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
| **jsonWebKey** | [**JsonWebKey**](JsonWebKey.md)|  | |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="cloneSigningKeyCredential"></a>
# **cloneSigningKeyCredential**
> JsonWebKey cloneSigningKeyCredential(idpId, keyId, targetIdpId).execute();

Clone Signing Key Credential for IdP

Clones a X.509 certificate for an IdP signing key credential from a source IdP to target IdP

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    String keyId = "keyId_example";
    String targetIdpId = "targetIdpId_example";
    try {
      JsonWebKey result = client
              .identityProvider
              .cloneSigningKeyCredential(idpId, keyId, targetIdpId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#cloneSigningKeyCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .identityProvider
              .cloneSigningKeyCredential(idpId, keyId, targetIdpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#cloneSigningKeyCredential");
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
| **idpId** | **String**|  | |
| **keyId** | **String**|  | |
| **targetIdpId** | **String**|  | |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="deactivateIdp"></a>
# **deactivateIdp**
> IdentityProvider deactivateIdp(idpId).execute();

Deactivate Identity Provider

Deactivates an active IdP.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    try {
      IdentityProvider result = client
              .identityProvider
              .deactivateIdp(idpId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIssuerMode());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPolicy());
      System.out.println(result.getProtocol());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#deactivateIdp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdentityProvider> response = client
              .identityProvider
              .deactivateIdp(idpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#deactivateIdp");
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
| **idpId** | **String**|  | |

### Return type

[**IdentityProvider**](IdentityProvider.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteKeyCredential"></a>
# **deleteKeyCredential**
> deleteKeyCredential(keyId).execute();

Delete Key

Deletes a specific IdP Key Credential by &#x60;kid&#x60; if it is not currently being used by an Active or Inactive IdP.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String keyId = "keyId_example";
    try {
      client
              .identityProvider
              .deleteKeyCredential(keyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#deleteKeyCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .identityProvider
              .deleteKeyCredential(keyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#deleteKeyCredential");
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
| **keyId** | **String**|  | |

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

<a name="enumerateIdpKeys"></a>
# **enumerateIdpKeys**
> List&lt;JsonWebKey&gt; enumerateIdpKeys().after(after).limit(limit).execute();

List Keys

Enumerates IdP key credentials.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String after = "after_example"; // Specifies the pagination cursor for the next page of keys
    Integer limit = 20; // Specifies the number of key results in a page
    try {
      List<JsonWebKey> result = client
              .identityProvider
              .enumerateIdpKeys()
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#enumerateIdpKeys");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<JsonWebKey>> response = client
              .identityProvider
              .enumerateIdpKeys()
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#enumerateIdpKeys");
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
| **after** | **String**| Specifies the pagination cursor for the next page of keys | [optional] |
| **limit** | **Integer**| Specifies the number of key results in a page | [optional] [default to 20] |

### Return type

[**List&lt;JsonWebKey&gt;**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="generateCsr"></a>
# **generateCsr**
> Csr generateCsr(idpId, csrMetadata).execute();

Generate Certificate Signing Request for IdP

Generates a new key pair and returns a Certificate Signing Request for it.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    CsrMetadataSubject subject = new CsrMetadataSubject();
    CsrMetadataSubjectAltNames subjectAltNames = new CsrMetadataSubjectAltNames();
    try {
      Csr result = client
              .identityProvider
              .generateCsr(idpId)
              .subject(subject)
              .subjectAltNames(subjectAltNames)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreated());
      System.out.println(result.getCsr());
      System.out.println(result.getId());
      System.out.println(result.getKty());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#generateCsr");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Csr> response = client
              .identityProvider
              .generateCsr(idpId)
              .subject(subject)
              .subjectAltNames(subjectAltNames)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#generateCsr");
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
| **idpId** | **String**|  | |
| **csrMetadata** | [**CsrMetadata**](CsrMetadata.md)|  | |

### Return type

[**Csr**](Csr.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="generateNewSigningKeyCredential"></a>
# **generateNewSigningKeyCredential**
> JsonWebKey generateNewSigningKeyCredential(idpId, validityYears).execute();

Generate New IdP Signing Key Credential

Generates a new X.509 certificate for an IdP signing key credential to be used for signing assertions sent to the IdP

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    Integer validityYears = 56; // expiry of the IdP Key Credential
    try {
      JsonWebKey result = client
              .identityProvider
              .generateNewSigningKeyCredential(idpId, validityYears)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#generateNewSigningKeyCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .identityProvider
              .generateNewSigningKeyCredential(idpId, validityYears)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#generateNewSigningKeyCredential");
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
| **idpId** | **String**|  | |
| **validityYears** | **Integer**| expiry of the IdP Key Credential | |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getByIdp"></a>
# **getByIdp**
> IdentityProvider getByIdp(idpId).execute();

Get Identity Provider

Fetches an IdP by &#x60;id&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    try {
      IdentityProvider result = client
              .identityProvider
              .getByIdp(idpId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIssuerMode());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPolicy());
      System.out.println(result.getProtocol());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getByIdp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdentityProvider> response = client
              .identityProvider
              .getByIdp(idpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getByIdp");
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
| **idpId** | **String**|  | |

### Return type

[**IdentityProvider**](IdentityProvider.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCsrByIdp"></a>
# **getCsrByIdp**
> Csr getCsrByIdp(idpId, csrId).execute();



Gets a specific Certificate Signing Request model by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    String csrId = "csrId_example";
    try {
      Csr result = client
              .identityProvider
              .getCsrByIdp(idpId, csrId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreated());
      System.out.println(result.getCsr());
      System.out.println(result.getId());
      System.out.println(result.getKty());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getCsrByIdp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Csr> response = client
              .identityProvider
              .getCsrByIdp(idpId, csrId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getCsrByIdp");
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
| **idpId** | **String**|  | |
| **csrId** | **String**|  | |

### Return type

[**Csr**](Csr.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getKeyCredentialByIdp"></a>
# **getKeyCredentialByIdp**
> JsonWebKey getKeyCredentialByIdp(keyId).execute();

Get Key

Gets a specific IdP Key Credential by &#x60;kid&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String keyId = "keyId_example";
    try {
      JsonWebKey result = client
              .identityProvider
              .getKeyCredentialByIdp(keyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getKeyCredentialByIdp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .identityProvider
              .getKeyCredentialByIdp(keyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getKeyCredentialByIdp");
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
| **keyId** | **String**|  | |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLinkedUserById"></a>
# **getLinkedUserById**
> IdentityProviderApplicationUser getLinkedUserById(idpId, userId).execute();



Fetches a linked IdP user by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    String userId = "userId_example";
    try {
      IdentityProviderApplicationUser result = client
              .identityProvider
              .getLinkedUserById(idpId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getExternalId());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getProfile());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getLinkedUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdentityProviderApplicationUser> response = client
              .identityProvider
              .getLinkedUserById(idpId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getLinkedUserById");
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
| **idpId** | **String**|  | |
| **userId** | **String**|  | |

### Return type

[**IdentityProviderApplicationUser**](IdentityProviderApplicationUser.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSigningKeyCredentialByIdp"></a>
# **getSigningKeyCredentialByIdp**
> JsonWebKey getSigningKeyCredentialByIdp(idpId, keyId).execute();

Get Signing Key Credential for IdP

Gets a specific IdP Key Credential by &#x60;kid&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    String keyId = "keyId_example";
    try {
      JsonWebKey result = client
              .identityProvider
              .getSigningKeyCredentialByIdp(idpId, keyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getSigningKeyCredentialByIdp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .identityProvider
              .getSigningKeyCredentialByIdp(idpId, keyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getSigningKeyCredentialByIdp");
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
| **idpId** | **String**|  | |
| **keyId** | **String**|  | |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSocialAuthTokens"></a>
# **getSocialAuthTokens**
> List&lt;SocialAuthToken&gt; getSocialAuthTokens(idpId, userId).execute();

Social Authentication Token Operation

Fetches the tokens minted by the Social Authentication Provider when the user authenticates with Okta via Social Auth.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    String userId = "userId_example";
    try {
      List<SocialAuthToken> result = client
              .identityProvider
              .getSocialAuthTokens(idpId, userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getSocialAuthTokens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SocialAuthToken>> response = client
              .identityProvider
              .getSocialAuthTokens(idpId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getSocialAuthTokens");
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
| **idpId** | **String**|  | |
| **userId** | **String**|  | |

### Return type

[**List&lt;SocialAuthToken&gt;**](SocialAuthToken.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUser"></a>
# **getUser**
> List&lt;IdentityProviderApplicationUser&gt; getUser(idpId).execute();

Find Users

Find all the users linked to an identity provider

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    try {
      List<IdentityProviderApplicationUser> result = client
              .identityProvider
              .getUser(idpId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<IdentityProviderApplicationUser>> response = client
              .identityProvider
              .getUser(idpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#getUser");
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
| **idpId** | **String**|  | |

### Return type

[**List&lt;IdentityProviderApplicationUser&gt;**](IdentityProviderApplicationUser.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="linkUserToIdpWithoutTransaction"></a>
# **linkUserToIdpWithoutTransaction**
> IdentityProviderApplicationUser linkUserToIdpWithoutTransaction(idpId, userId, userIdentityProviderLinkRequest).execute();

Link a user to a Social IdP without a transaction

Links an Okta user to an existing Social Identity Provider. This does not support the SAML2 Identity Provider Type

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    String userId = "userId_example";
    String externalId = "externalId_example";
    try {
      IdentityProviderApplicationUser result = client
              .identityProvider
              .linkUserToIdpWithoutTransaction(idpId, userId)
              .externalId(externalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getExternalId());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getProfile());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#linkUserToIdpWithoutTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdentityProviderApplicationUser> response = client
              .identityProvider
              .linkUserToIdpWithoutTransaction(idpId, userId)
              .externalId(externalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#linkUserToIdpWithoutTransaction");
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
| **idpId** | **String**|  | |
| **userId** | **String**|  | |
| **userIdentityProviderLinkRequest** | [**UserIdentityProviderLinkRequest**](UserIdentityProviderLinkRequest.md)|  | |

### Return type

[**IdentityProviderApplicationUser**](IdentityProviderApplicationUser.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="list"></a>
# **list**
> List&lt;IdentityProvider&gt; list().q(q).after(after).limit(limit).type(type).execute();

List Identity Providers

Enumerates IdPs in your organization with pagination. A subset of IdPs can be returned that match a supported filter expression or query.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String q = "q_example"; // Searches the name property of IdPs for matching value
    String after = "after_example"; // Specifies the pagination cursor for the next page of IdPs
    Integer limit = 20; // Specifies the number of IdP results in a page
    String type = "type_example"; // Filters IdPs by type
    try {
      List<IdentityProvider> result = client
              .identityProvider
              .list()
              .q(q)
              .after(after)
              .limit(limit)
              .type(type)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<IdentityProvider>> response = client
              .identityProvider
              .list()
              .q(q)
              .after(after)
              .limit(limit)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#list");
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
| **q** | **String**| Searches the name property of IdPs for matching value | [optional] |
| **after** | **String**| Specifies the pagination cursor for the next page of IdPs | [optional] |
| **limit** | **Integer**| Specifies the number of IdP results in a page | [optional] [default to 20] |
| **type** | **String**| Filters IdPs by type | [optional] |

### Return type

[**List&lt;IdentityProvider&gt;**](IdentityProvider.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listCsrsForCertificateSigningRequests"></a>
# **listCsrsForCertificateSigningRequests**
> List&lt;Csr&gt; listCsrsForCertificateSigningRequests(idpId).execute();

List Certificate Signing Requests for IdP

Enumerates Certificate Signing Requests for an IdP

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    try {
      List<Csr> result = client
              .identityProvider
              .listCsrsForCertificateSigningRequests(idpId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#listCsrsForCertificateSigningRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Csr>> response = client
              .identityProvider
              .listCsrsForCertificateSigningRequests(idpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#listCsrsForCertificateSigningRequests");
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
| **idpId** | **String**|  | |

### Return type

[**List&lt;Csr&gt;**](Csr.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listSigningKeyCredentials"></a>
# **listSigningKeyCredentials**
> List&lt;JsonWebKey&gt; listSigningKeyCredentials(idpId).execute();

List Signing Key Credentials for IdP

Enumerates signing key credentials for an IdP

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    try {
      List<JsonWebKey> result = client
              .identityProvider
              .listSigningKeyCredentials(idpId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#listSigningKeyCredentials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<JsonWebKey>> response = client
              .identityProvider
              .listSigningKeyCredentials(idpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#listSigningKeyCredentials");
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
| **idpId** | **String**|  | |

### Return type

[**List&lt;JsonWebKey&gt;**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeIdp"></a>
# **removeIdp**
> removeIdp(idpId).execute();

Delete Identity Provider

Removes an IdP from your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    try {
      client
              .identityProvider
              .removeIdp(idpId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#removeIdp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .identityProvider
              .removeIdp(idpId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#removeIdp");
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
| **idpId** | **String**|  | |

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

<a name="revokeCsrForIdentityProvider"></a>
# **revokeCsrForIdentityProvider**
> revokeCsrForIdentityProvider(idpId, csrId).execute();



Revoke a Certificate Signing Request and delete the key pair from the IdP

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    String csrId = "csrId_example";
    try {
      client
              .identityProvider
              .revokeCsrForIdentityProvider(idpId, csrId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#revokeCsrForIdentityProvider");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .identityProvider
              .revokeCsrForIdentityProvider(idpId, csrId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#revokeCsrForIdentityProvider");
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
| **idpId** | **String**|  | |
| **csrId** | **String**|  | |

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

<a name="unlinkUser"></a>
# **unlinkUser**
> unlinkUser(idpId, userId).execute();

Unlink User from IdP

Removes the link between the Okta user and the IdP user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    String userId = "userId_example";
    try {
      client
              .identityProvider
              .unlinkUser(idpId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#unlinkUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .identityProvider
              .unlinkUser(idpId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#unlinkUser");
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
| **idpId** | **String**|  | |
| **userId** | **String**|  | |

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

<a name="updateConfiguration"></a>
# **updateConfiguration**
> IdentityProvider updateConfiguration(idpId, identityProvider).execute();

Update Identity Provider

Updates the configuration for an IdP.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    String issuerMode = "ORG_URL";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    IdentityProviderPolicy policy = new IdentityProviderPolicy();
    Protocol protocol = new Protocol();
    String status = "ACTIVE";
    String type = "SAML2";
    try {
      IdentityProvider result = client
              .identityProvider
              .updateConfiguration(idpId)
              .links(links)
              .created(created)
              .id(id)
              .issuerMode(issuerMode)
              .lastUpdated(lastUpdated)
              .name(name)
              .policy(policy)
              .protocol(protocol)
              .status(status)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIssuerMode());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getPolicy());
      System.out.println(result.getProtocol());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#updateConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdentityProvider> response = client
              .identityProvider
              .updateConfiguration(idpId)
              .links(links)
              .created(created)
              .id(id)
              .issuerMode(issuerMode)
              .lastUpdated(lastUpdated)
              .name(name)
              .policy(policy)
              .protocol(protocol)
              .status(status)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#updateConfiguration");
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
| **idpId** | **String**|  | |
| **identityProvider** | [**IdentityProvider**](IdentityProvider.md)|  | |

### Return type

[**IdentityProvider**](IdentityProvider.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCsrLifecyclePublish"></a>
# **updateCsrLifecyclePublish**
> JsonWebKey updateCsrLifecyclePublish(idpId, csrId).execute();



Update the Certificate Signing Request with a signed X.509 certificate and add it into the signing key credentials for the IdP.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IdentityProviderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String idpId = "idpId_example";
    String csrId = "csrId_example";
    try {
      JsonWebKey result = client
              .identityProvider
              .updateCsrLifecyclePublish(idpId, csrId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAlg());
      System.out.println(result.getCreated());
      System.out.println(result.getE());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getKeyOps());
      System.out.println(result.getKid());
      System.out.println(result.getKty());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getN());
      System.out.println(result.getStatus());
      System.out.println(result.getUse());
      System.out.println(result.getX5c());
      System.out.println(result.getX5t());
      System.out.println(result.getX5tHashS256());
      System.out.println(result.getX5u());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#updateCsrLifecyclePublish");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonWebKey> response = client
              .identityProvider
              .updateCsrLifecyclePublish(idpId, csrId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#updateCsrLifecyclePublish");
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
| **idpId** | **String**|  | |
| **csrId** | **String**|  | |

### Return type

[**JsonWebKey**](JsonWebKey.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

