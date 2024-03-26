# UserFactorApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateFactorLifecycle**](UserFactorApi.md#activateFactorLifecycle) | **POST** /api/v1/users/{userId}/factors/{factorId}/lifecycle/activate | Activate Factor |
| [**enrollSupportedFactor**](UserFactorApi.md#enrollSupportedFactor) | **POST** /api/v1/users/{userId}/factors | Enroll Factor |
| [**enumerateEnrolled**](UserFactorApi.md#enumerateEnrolled) | **GET** /api/v1/users/{userId}/factors |  |
| [**enumerateSecurityQuestions**](UserFactorApi.md#enumerateSecurityQuestions) | **GET** /api/v1/users/{userId}/factors/questions |  |
| [**enumerateSupportedFactors**](UserFactorApi.md#enumerateSupportedFactors) | **GET** /api/v1/users/{userId}/factors/catalog |  |
| [**getFactor**](UserFactorApi.md#getFactor) | **GET** /api/v1/users/{userId}/factors/{factorId} |  |
| [**pollFactorTransactionStatus**](UserFactorApi.md#pollFactorTransactionStatus) | **GET** /api/v1/users/{userId}/factors/{factorId}/transactions/{transactionId} |  |
| [**unenrollFactor**](UserFactorApi.md#unenrollFactor) | **DELETE** /api/v1/users/{userId}/factors/{factorId} |  |
| [**verifyOtp**](UserFactorApi.md#verifyOtp) | **POST** /api/v1/users/{userId}/factors/{factorId}/verify | Verify MFA Factor |


<a name="activateFactorLifecycle"></a>
# **activateFactorLifecycle**
> UserFactor activateFactorLifecycle(userId, factorId).activateFactorRequest(activateFactorRequest).execute();

Activate Factor

The &#x60;sms&#x60; and &#x60;token:software:totp&#x60; factor types require activation to complete the enrollment process.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserFactorApi;
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
    String factorId = "factorId_example";
    String attestation = "attestation_example";
    String clientData = "clientData_example";
    String passCode = "passCode_example";
    String registrationData = "registrationData_example";
    String stateToken = "stateToken_example";
    try {
      UserFactor result = client
              .userFactor
              .activateFactorLifecycle(userId, factorId)
              .attestation(attestation)
              .clientData(clientData)
              .passCode(passCode)
              .registrationData(registrationData)
              .stateToken(stateToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getFactorType());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getProvider());
      System.out.println(result.getStatus());
      System.out.println(result.getVerify());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#activateFactorLifecycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserFactor> response = client
              .userFactor
              .activateFactorLifecycle(userId, factorId)
              .attestation(attestation)
              .clientData(clientData)
              .passCode(passCode)
              .registrationData(registrationData)
              .stateToken(stateToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#activateFactorLifecycle");
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
| **factorId** | **String**|  | |
| **activateFactorRequest** | [**ActivateFactorRequest**](ActivateFactorRequest.md)|  | [optional] |

### Return type

[**UserFactor**](UserFactor.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="enrollSupportedFactor"></a>
# **enrollSupportedFactor**
> UserFactor enrollSupportedFactor(userId, userFactor).updatePhone(updatePhone).templateId(templateId).tokenLifetimeSeconds(tokenLifetimeSeconds).activate(activate).execute();

Enroll Factor

Enrolls a user with a supported factor.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserFactorApi;
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
    Map<String, Object> embedded = new HashMap();
    Map<String, Object> links = new HashMap();
    OffsetDateTime created = OffsetDateTime.now();
    FactorType factorType = FactorType.fromValue("call");
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    FactorProvider provider = FactorProvider.fromValue("OKTA");
    FactorStatus status = FactorStatus.fromValue("PENDING_ACTIVATION");
    VerifyFactorRequest verify = new VerifyFactorRequest();
    Boolean updatePhone = false;
    String templateId = "templateId_example"; // id of SMS template (only for SMS factor)
    Integer tokenLifetimeSeconds = 300;
    Boolean activate = false;
    try {
      UserFactor result = client
              .userFactor
              .enrollSupportedFactor(userId)
              .embedded(embedded)
              .links(links)
              .created(created)
              .factorType(factorType)
              .id(id)
              .lastUpdated(lastUpdated)
              .provider(provider)
              .status(status)
              .verify(verify)
              .updatePhone(updatePhone)
              .templateId(templateId)
              .tokenLifetimeSeconds(tokenLifetimeSeconds)
              .activate(activate)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getFactorType());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getProvider());
      System.out.println(result.getStatus());
      System.out.println(result.getVerify());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#enrollSupportedFactor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserFactor> response = client
              .userFactor
              .enrollSupportedFactor(userId)
              .embedded(embedded)
              .links(links)
              .created(created)
              .factorType(factorType)
              .id(id)
              .lastUpdated(lastUpdated)
              .provider(provider)
              .status(status)
              .verify(verify)
              .updatePhone(updatePhone)
              .templateId(templateId)
              .tokenLifetimeSeconds(tokenLifetimeSeconds)
              .activate(activate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#enrollSupportedFactor");
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
| **userFactor** | [**UserFactor**](UserFactor.md)| Factor | |
| **updatePhone** | **Boolean**|  | [optional] [default to false] |
| **templateId** | **String**| id of SMS template (only for SMS factor) | [optional] |
| **tokenLifetimeSeconds** | **Integer**|  | [optional] [default to 300] |
| **activate** | **Boolean**|  | [optional] [default to false] |

### Return type

[**UserFactor**](UserFactor.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="enumerateEnrolled"></a>
# **enumerateEnrolled**
> List&lt;UserFactor&gt; enumerateEnrolled(userId).execute();



Enumerates all the enrolled factors for the specified user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserFactorApi;
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
    try {
      List<UserFactor> result = client
              .userFactor
              .enumerateEnrolled(userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#enumerateEnrolled");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UserFactor>> response = client
              .userFactor
              .enumerateEnrolled(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#enumerateEnrolled");
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

### Return type

[**List&lt;UserFactor&gt;**](UserFactor.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="enumerateSecurityQuestions"></a>
# **enumerateSecurityQuestions**
> List&lt;SecurityQuestion&gt; enumerateSecurityQuestions(userId).execute();



Enumerates all available security questions for a user&#39;s &#x60;question&#x60; factor

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserFactorApi;
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
    try {
      List<SecurityQuestion> result = client
              .userFactor
              .enumerateSecurityQuestions(userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#enumerateSecurityQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SecurityQuestion>> response = client
              .userFactor
              .enumerateSecurityQuestions(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#enumerateSecurityQuestions");
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

### Return type

[**List&lt;SecurityQuestion&gt;**](SecurityQuestion.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="enumerateSupportedFactors"></a>
# **enumerateSupportedFactors**
> List&lt;UserFactor&gt; enumerateSupportedFactors(userId).execute();



Enumerates all the supported factors that can be enrolled for the specified user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserFactorApi;
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
    try {
      List<UserFactor> result = client
              .userFactor
              .enumerateSupportedFactors(userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#enumerateSupportedFactors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UserFactor>> response = client
              .userFactor
              .enumerateSupportedFactors(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#enumerateSupportedFactors");
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

### Return type

[**List&lt;UserFactor&gt;**](UserFactor.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFactor"></a>
# **getFactor**
> UserFactor getFactor(userId, factorId).execute();



Fetches a factor for the specified user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserFactorApi;
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
    String factorId = "factorId_example";
    try {
      UserFactor result = client
              .userFactor
              .getFactor(userId, factorId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getCreated());
      System.out.println(result.getFactorType());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getProvider());
      System.out.println(result.getStatus());
      System.out.println(result.getVerify());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#getFactor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserFactor> response = client
              .userFactor
              .getFactor(userId, factorId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#getFactor");
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
| **factorId** | **String**|  | |

### Return type

[**UserFactor**](UserFactor.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="pollFactorTransactionStatus"></a>
# **pollFactorTransactionStatus**
> VerifyUserFactorResponse pollFactorTransactionStatus(userId, factorId, transactionId).execute();



Polls factors verification transaction for status.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserFactorApi;
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
    String factorId = "factorId_example";
    String transactionId = "transactionId_example";
    try {
      VerifyUserFactorResponse result = client
              .userFactor
              .pollFactorTransactionStatus(userId, factorId, transactionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getFactorResult());
      System.out.println(result.getFactorResultMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#pollFactorTransactionStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VerifyUserFactorResponse> response = client
              .userFactor
              .pollFactorTransactionStatus(userId, factorId, transactionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#pollFactorTransactionStatus");
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
| **factorId** | **String**|  | |
| **transactionId** | **String**|  | |

### Return type

[**VerifyUserFactorResponse**](VerifyUserFactorResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="unenrollFactor"></a>
# **unenrollFactor**
> unenrollFactor(userId, factorId).execute();



Unenrolls an existing factor for the specified user, allowing the user to enroll a new factor.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserFactorApi;
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
    String factorId = "factorId_example";
    try {
      client
              .userFactor
              .unenrollFactor(userId, factorId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#unenrollFactor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .userFactor
              .unenrollFactor(userId, factorId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#unenrollFactor");
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
| **factorId** | **String**|  | |

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

<a name="verifyOtp"></a>
# **verifyOtp**
> VerifyUserFactorResponse verifyOtp(userId, factorId).templateId(templateId).tokenLifetimeSeconds(tokenLifetimeSeconds).xForwardedFor(xForwardedFor).userAgent(userAgent).acceptLanguage(acceptLanguage).verifyFactorRequest(verifyFactorRequest).execute();

Verify MFA Factor

Verifies an OTP for a &#x60;token&#x60; or &#x60;token:hardware&#x60; factor

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserFactorApi;
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
    String factorId = "factorId_example";
    String activationToken = "activationToken_example";
    String answer = "answer_example";
    String attestation = "attestation_example";
    String clientData = "clientData_example";
    String nextPassCode = "nextPassCode_example";
    String passCode = "passCode_example";
    String registrationData = "registrationData_example";
    String stateToken = "stateToken_example";
    String templateId = "templateId_example";
    Integer tokenLifetimeSeconds = 300;
    String xForwardedFor = "xForwardedFor_example";
    String userAgent = "userAgent_example";
    String acceptLanguage = "acceptLanguage_example";
    try {
      VerifyUserFactorResponse result = client
              .userFactor
              .verifyOtp(userId, factorId)
              .activationToken(activationToken)
              .answer(answer)
              .attestation(attestation)
              .clientData(clientData)
              .nextPassCode(nextPassCode)
              .passCode(passCode)
              .registrationData(registrationData)
              .stateToken(stateToken)
              .templateId(templateId)
              .tokenLifetimeSeconds(tokenLifetimeSeconds)
              .xForwardedFor(xForwardedFor)
              .userAgent(userAgent)
              .acceptLanguage(acceptLanguage)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmbedded());
      System.out.println(result.getLinks());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getFactorResult());
      System.out.println(result.getFactorResultMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#verifyOtp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VerifyUserFactorResponse> response = client
              .userFactor
              .verifyOtp(userId, factorId)
              .activationToken(activationToken)
              .answer(answer)
              .attestation(attestation)
              .clientData(clientData)
              .nextPassCode(nextPassCode)
              .passCode(passCode)
              .registrationData(registrationData)
              .stateToken(stateToken)
              .templateId(templateId)
              .tokenLifetimeSeconds(tokenLifetimeSeconds)
              .xForwardedFor(xForwardedFor)
              .userAgent(userAgent)
              .acceptLanguage(acceptLanguage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFactorApi#verifyOtp");
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
| **factorId** | **String**|  | |
| **templateId** | **String**|  | [optional] |
| **tokenLifetimeSeconds** | **Integer**|  | [optional] [default to 300] |
| **xForwardedFor** | **String**|  | [optional] |
| **userAgent** | **String**|  | [optional] |
| **acceptLanguage** | **String**|  | [optional] |
| **verifyFactorRequest** | [**VerifyFactorRequest**](VerifyFactorRequest.md)|  | [optional] |

### Return type

[**VerifyUserFactorResponse**](VerifyUserFactorResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

