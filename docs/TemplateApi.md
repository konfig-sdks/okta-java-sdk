# TemplateApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewCustomSms**](TemplateApi.md#addNewCustomSms) | **POST** /api/v1/templates/sms | Add SMS Template |
| [**enumerateSmsTemplates**](TemplateApi.md#enumerateSmsTemplates) | **GET** /api/v1/templates/sms | List SMS Templates |
| [**getById**](TemplateApi.md#getById) | **GET** /api/v1/templates/sms/{templateId} | Get SMS Template |
| [**partialSmsUpdate**](TemplateApi.md#partialSmsUpdate) | **POST** /api/v1/templates/sms/{templateId} | Partial SMS Template Update |
| [**removeSms**](TemplateApi.md#removeSms) | **DELETE** /api/v1/templates/sms/{templateId} | Remove SMS Template |
| [**updateSmsTemplate**](TemplateApi.md#updateSmsTemplate) | **PUT** /api/v1/templates/sms/{templateId} | Update SMS Template |


<a name="addNewCustomSms"></a>
# **addNewCustomSms**
> SmsTemplate addNewCustomSms(smsTemplate).execute();

Add SMS Template

Adds a new custom SMS template to your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    String template = "template_example";
    Object translations = null;
    SmsTemplateType type = SmsTemplateType.fromValue("SMS_VERIFY_CODE");
    try {
      SmsTemplate result = client
              .template
              .addNewCustomSms()
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .template(template)
              .translations(translations)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getTemplate());
      System.out.println(result.getTranslations());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#addNewCustomSms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SmsTemplate> response = client
              .template
              .addNewCustomSms()
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .template(template)
              .translations(translations)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#addNewCustomSms");
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
| **smsTemplate** | [**SmsTemplate**](SmsTemplate.md)|  | |

### Return type

[**SmsTemplate**](SmsTemplate.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="enumerateSmsTemplates"></a>
# **enumerateSmsTemplates**
> List&lt;SmsTemplate&gt; enumerateSmsTemplates().templateType(templateType).execute();

List SMS Templates

Enumerates custom SMS templates in your organization. A subset of templates can be returned that match a template type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String templateType = "templateType_example";
    try {
      List<SmsTemplate> result = client
              .template
              .enumerateSmsTemplates()
              .templateType(templateType)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#enumerateSmsTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SmsTemplate>> response = client
              .template
              .enumerateSmsTemplates()
              .templateType(templateType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#enumerateSmsTemplates");
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
| **templateType** | **String**|  | [optional] |

### Return type

[**List&lt;SmsTemplate&gt;**](SmsTemplate.md)

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
> SmsTemplate getById(templateId).execute();

Get SMS Template

Fetches a specific template by &#x60;id&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String templateId = "templateId_example";
    try {
      SmsTemplate result = client
              .template
              .getById(templateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getTemplate());
      System.out.println(result.getTranslations());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SmsTemplate> response = client
              .template
              .getById(templateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getById");
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
| **templateId** | **String**|  | |

### Return type

[**SmsTemplate**](SmsTemplate.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="partialSmsUpdate"></a>
# **partialSmsUpdate**
> SmsTemplate partialSmsUpdate(templateId, smsTemplate).execute();

Partial SMS Template Update

Updates only some of the SMS template properties:

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String templateId = "templateId_example";
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    String template = "template_example";
    Object translations = null;
    SmsTemplateType type = SmsTemplateType.fromValue("SMS_VERIFY_CODE");
    try {
      SmsTemplate result = client
              .template
              .partialSmsUpdate(templateId)
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .template(template)
              .translations(translations)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getTemplate());
      System.out.println(result.getTranslations());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#partialSmsUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SmsTemplate> response = client
              .template
              .partialSmsUpdate(templateId)
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .template(template)
              .translations(translations)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#partialSmsUpdate");
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
| **templateId** | **String**|  | |
| **smsTemplate** | [**SmsTemplate**](SmsTemplate.md)|  | |

### Return type

[**SmsTemplate**](SmsTemplate.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeSms"></a>
# **removeSms**
> removeSms(templateId).execute();

Remove SMS Template

Removes an SMS template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String templateId = "templateId_example";
    try {
      client
              .template
              .removeSms(templateId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#removeSms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .template
              .removeSms(templateId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#removeSms");
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
| **templateId** | **String**|  | |

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

<a name="updateSmsTemplate"></a>
# **updateSmsTemplate**
> SmsTemplate updateSmsTemplate(templateId, smsTemplate).execute();

Update SMS Template

Updates the SMS template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String templateId = "templateId_example";
    OffsetDateTime created = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String name = "name_example";
    String template = "template_example";
    Object translations = null;
    SmsTemplateType type = SmsTemplateType.fromValue("SMS_VERIFY_CODE");
    try {
      SmsTemplate result = client
              .template
              .updateSmsTemplate(templateId)
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .template(template)
              .translations(translations)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getName());
      System.out.println(result.getTemplate());
      System.out.println(result.getTranslations());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateSmsTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SmsTemplate> response = client
              .template
              .updateSmsTemplate(templateId)
              .created(created)
              .id(id)
              .lastUpdated(lastUpdated)
              .name(name)
              .template(template)
              .translations(translations)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateSmsTemplate");
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
| **templateId** | **String**|  | |
| **smsTemplate** | [**SmsTemplate**](SmsTemplate.md)|  | |

### Return type

[**SmsTemplate**](SmsTemplate.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

