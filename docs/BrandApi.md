# BrandApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmailTemplateCustomization**](BrandApi.md#createEmailTemplateCustomization) | **POST** /api/v1/brands/{brandId}/templates/email/{templateName}/customizations | Create Email Template Customization |
| [**deleteEmailCustomization**](BrandApi.md#deleteEmailCustomization) | **DELETE** /api/v1/brands/{brandId}/templates/email/{templateName}/customizations/{customizationId} | Delete Email Customization |
| [**deleteEmailTemplateCustomizations**](BrandApi.md#deleteEmailTemplateCustomizations) | **DELETE** /api/v1/brands/{brandId}/templates/email/{templateName}/customizations | Delete Email Template Customization |
| [**deleteThemeBackgroundImage**](BrandApi.md#deleteThemeBackgroundImage) | **DELETE** /api/v1/brands/{brandId}/themes/{themeId}/background-image | Deletes a Theme background image |
| [**deleteThemeFavicon**](BrandApi.md#deleteThemeFavicon) | **DELETE** /api/v1/brands/{brandId}/themes/{themeId}/favicon | Deletes a Theme favicon. The org then uses the Okta default favicon. |
| [**deleteThemeLogo**](BrandApi.md#deleteThemeLogo) | **DELETE** /api/v1/brands/{brandId}/themes/{themeId}/logo | Deletes a Theme logo. The org then uses the Okta default logo. |
| [**getAllBrands**](BrandApi.md#getAllBrands) | **GET** /api/v1/brands | List Brands |
| [**getById**](BrandApi.md#getById) | **GET** /api/v1/brands/{brandId} | Get Brand |
| [**getEmailCustomizationPreview**](BrandApi.md#getEmailCustomizationPreview) | **GET** /api/v1/brands/{brandId}/templates/email/{templateName}/customizations/{customizationId}/preview | Get Preview Content of Email Customization |
| [**getEmailTemplate**](BrandApi.md#getEmailTemplate) | **GET** /api/v1/brands/{brandId}/templates/email/{templateName} | Get Email Template |
| [**getEmailTemplateCustomizationById**](BrandApi.md#getEmailTemplateCustomizationById) | **GET** /api/v1/brands/{brandId}/templates/email/{templateName}/customizations/{customizationId} | Get Email Template Customization |
| [**getEmailTemplateDefaultContent**](BrandApi.md#getEmailTemplateDefaultContent) | **GET** /api/v1/brands/{brandId}/templates/email/{templateName}/default-content | Get Default Content of Email Template |
| [**getEmailTemplateDefaultContentPreview**](BrandApi.md#getEmailTemplateDefaultContentPreview) | **GET** /api/v1/brands/{brandId}/templates/email/{templateName}/default-content/preview | Get Preview of Email Template Default Content |
| [**getEmailTemplateDefaultContentPreview_0**](BrandApi.md#getEmailTemplateDefaultContentPreview_0) | **POST** /api/v1/brands/{brandId}/templates/email/{templateName}/test | Get Preview of Email Template Default Content |
| [**getThemeById**](BrandApi.md#getThemeById) | **GET** /api/v1/brands/{brandId}/themes/{themeId} | Get a theme for a brand |
| [**getThemes**](BrandApi.md#getThemes) | **GET** /api/v1/brands/{brandId}/themes | Get Brand Themes |
| [**listEmailTemplateCustomizations**](BrandApi.md#listEmailTemplateCustomizations) | **GET** /api/v1/brands/{brandId}/templates/email/{templateName}/customizations | List Email Template Customization |
| [**listEmailTemplates**](BrandApi.md#listEmailTemplates) | **GET** /api/v1/brands/{brandId}/templates/email | List Email Templates |
| [**updateByBrandId**](BrandApi.md#updateByBrandId) | **PUT** /api/v1/brands/{brandId} | Update Brand |
| [**updateEmailCustomization**](BrandApi.md#updateEmailCustomization) | **PUT** /api/v1/brands/{brandId}/templates/email/{templateName}/customizations/{customizationId} | Update Email Customization |
| [**updateTheme**](BrandApi.md#updateTheme) | **PUT** /api/v1/brands/{brandId}/themes/{themeId} | Update a theme for a brand |
| [**updateThemeBackgroundImage**](BrandApi.md#updateThemeBackgroundImage) | **POST** /api/v1/brands/{brandId}/themes/{themeId}/background-image | Updates the background image for your Theme |
| [**updateThemeFavicon**](BrandApi.md#updateThemeFavicon) | **POST** /api/v1/brands/{brandId}/themes/{themeId}/favicon | Updates the favicon for your theme |
| [**updateThemeLogo**](BrandApi.md#updateThemeLogo) | **POST** /api/v1/brands/{brandId}/themes/{themeId}/logo | Update a themes logo |


<a name="createEmailTemplateCustomization"></a>
# **createEmailTemplateCustomization**
> EmailTemplateCustomization createEmailTemplateCustomization(brandId, templateName, emailTemplateCustomizationRequest).execute();

Create Email Template Customization

Create an email customization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    String body = "body_example";
    Boolean isDefault = true;
    String language = "language_example"; // unique under each email template
    String subject = "subject_example";
    try {
      EmailTemplateCustomization result = client
              .brand
              .createEmailTemplateCustomization(brandId, templateName)
              .body(body)
              .isDefault(isDefault)
              .language(language)
              .subject(subject)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getBody());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIsDefault());
      System.out.println(result.getLanguage());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getSubject());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#createEmailTemplateCustomization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailTemplateCustomization> response = client
              .brand
              .createEmailTemplateCustomization(brandId, templateName)
              .body(body)
              .isDefault(isDefault)
              .language(language)
              .subject(subject)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#createEmailTemplateCustomization");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |
| **emailTemplateCustomizationRequest** | [**EmailTemplateCustomizationRequest**](EmailTemplateCustomizationRequest.md)|  | |

### Return type

[**EmailTemplateCustomization**](EmailTemplateCustomization.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **409** | Conflict |  -  |

<a name="deleteEmailCustomization"></a>
# **deleteEmailCustomization**
> deleteEmailCustomization(brandId, templateName, customizationId).execute();

Delete Email Customization

Delete an email customization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    String customizationId = "customizationId_example";
    try {
      client
              .brand
              .deleteEmailCustomization(brandId, templateName, customizationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteEmailCustomization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .brand
              .deleteEmailCustomization(brandId, templateName, customizationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteEmailCustomization");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |
| **customizationId** | **String**|  | |

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
| **409** | Conflict |  -  |

<a name="deleteEmailTemplateCustomizations"></a>
# **deleteEmailTemplateCustomizations**
> deleteEmailTemplateCustomizations(brandId, templateName).execute();

Delete Email Template Customization

Delete all customizations for an email template. Also known as “Reset to Default”.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    try {
      client
              .brand
              .deleteEmailTemplateCustomizations(brandId, templateName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteEmailTemplateCustomizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .brand
              .deleteEmailTemplateCustomizations(brandId, templateName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteEmailTemplateCustomizations");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |

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
| **204** | Success |  -  |

<a name="deleteThemeBackgroundImage"></a>
# **deleteThemeBackgroundImage**
> deleteThemeBackgroundImage(brandId, themeId).execute();

Deletes a Theme background image

Deletes a Theme background image

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String themeId = "themeId_example";
    try {
      client
              .brand
              .deleteThemeBackgroundImage(brandId, themeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteThemeBackgroundImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .brand
              .deleteThemeBackgroundImage(brandId, themeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteThemeBackgroundImage");
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
| **brandId** | **String**|  | |
| **themeId** | **String**|  | |

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
| **404** | Not Found |  -  |

<a name="deleteThemeFavicon"></a>
# **deleteThemeFavicon**
> deleteThemeFavicon(brandId, themeId).execute();

Deletes a Theme favicon. The org then uses the Okta default favicon.

Deletes a Theme favicon. The org then uses the Okta default favicon.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String themeId = "themeId_example";
    try {
      client
              .brand
              .deleteThemeFavicon(brandId, themeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteThemeFavicon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .brand
              .deleteThemeFavicon(brandId, themeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteThemeFavicon");
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
| **brandId** | **String**|  | |
| **themeId** | **String**|  | |

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
| **404** | Not Found |  -  |

<a name="deleteThemeLogo"></a>
# **deleteThemeLogo**
> deleteThemeLogo(brandId, themeId).execute();

Deletes a Theme logo. The org then uses the Okta default logo.

Deletes a Theme logo. The org then uses the Okta default logo.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String themeId = "themeId_example";
    try {
      client
              .brand
              .deleteThemeLogo(brandId, themeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteThemeLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .brand
              .deleteThemeLogo(brandId, themeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteThemeLogo");
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
| **brandId** | **String**|  | |
| **themeId** | **String**|  | |

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
| **404** | Not Found |  -  |

<a name="getAllBrands"></a>
# **getAllBrands**
> List&lt;Brand&gt; getAllBrands().execute();

List Brands

List all the brands in your org.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
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
      List<Brand> result = client
              .brand
              .getAllBrands()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getAllBrands");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Brand>> response = client
              .brand
              .getAllBrands()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getAllBrands");
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

[**List&lt;Brand&gt;**](Brand.md)

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
> Brand getById(brandId).execute();

Get Brand

Fetches a brand by &#x60;brandId&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    try {
      Brand result = client
              .brand
              .getById(brandId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAgreeToCustomPrivacyPolicy());
      System.out.println(result.getCustomPrivacyPolicyUrl());
      System.out.println(result.getId());
      System.out.println(result.getRemovePoweredByOkta());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Brand> response = client
              .brand
              .getById(brandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getById");
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
| **brandId** | **String**|  | |

### Return type

[**Brand**](Brand.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

<a name="getEmailCustomizationPreview"></a>
# **getEmailCustomizationPreview**
> EmailTemplateContent getEmailCustomizationPreview(brandId, templateName, customizationId).execute();

Get Preview Content of Email Customization

Get a preview of an email template customization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    String customizationId = "customizationId_example";
    try {
      EmailTemplateContent result = client
              .brand
              .getEmailCustomizationPreview(brandId, templateName, customizationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getBody());
      System.out.println(result.getFromAddress());
      System.out.println(result.getFromName());
      System.out.println(result.getSubject());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailCustomizationPreview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailTemplateContent> response = client
              .brand
              .getEmailCustomizationPreview(brandId, templateName, customizationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailCustomizationPreview");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |
| **customizationId** | **String**|  | |

### Return type

[**EmailTemplateContent**](EmailTemplateContent.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getEmailTemplate"></a>
# **getEmailTemplate**
> EmailTemplate getEmailTemplate(brandId, templateName).execute();

Get Email Template

Fetch an email template by templateName

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    try {
      EmailTemplate result = client
              .brand
              .getEmailTemplate(brandId, templateName)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailTemplate> response = client
              .brand
              .getEmailTemplate(brandId, templateName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplate");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |

### Return type

[**EmailTemplate**](EmailTemplate.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getEmailTemplateCustomizationById"></a>
# **getEmailTemplateCustomizationById**
> EmailTemplateCustomization getEmailTemplateCustomizationById(brandId, templateName, customizationId).execute();

Get Email Template Customization

Fetch an email customization by id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    String customizationId = "customizationId_example";
    try {
      EmailTemplateCustomization result = client
              .brand
              .getEmailTemplateCustomizationById(brandId, templateName, customizationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getBody());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIsDefault());
      System.out.println(result.getLanguage());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getSubject());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplateCustomizationById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailTemplateCustomization> response = client
              .brand
              .getEmailTemplateCustomizationById(brandId, templateName, customizationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplateCustomizationById");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |
| **customizationId** | **String**|  | |

### Return type

[**EmailTemplateCustomization**](EmailTemplateCustomization.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getEmailTemplateDefaultContent"></a>
# **getEmailTemplateDefaultContent**
> EmailTemplateContent getEmailTemplateDefaultContent(brandId, templateName).execute();

Get Default Content of Email Template

Fetch the default content for an email template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    try {
      EmailTemplateContent result = client
              .brand
              .getEmailTemplateDefaultContent(brandId, templateName)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getBody());
      System.out.println(result.getFromAddress());
      System.out.println(result.getFromName());
      System.out.println(result.getSubject());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplateDefaultContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailTemplateContent> response = client
              .brand
              .getEmailTemplateDefaultContent(brandId, templateName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplateDefaultContent");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |

### Return type

[**EmailTemplateContent**](EmailTemplateContent.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getEmailTemplateDefaultContentPreview"></a>
# **getEmailTemplateDefaultContentPreview**
> EmailTemplateContent getEmailTemplateDefaultContentPreview(brandId, templateName).execute();

Get Preview of Email Template Default Content

Fetch a preview of an email template&#39;s default content by populating velocity references with the current user&#39;s environment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    try {
      EmailTemplateContent result = client
              .brand
              .getEmailTemplateDefaultContentPreview(brandId, templateName)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getBody());
      System.out.println(result.getFromAddress());
      System.out.println(result.getFromName());
      System.out.println(result.getSubject());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplateDefaultContentPreview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailTemplateContent> response = client
              .brand
              .getEmailTemplateDefaultContentPreview(brandId, templateName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplateDefaultContentPreview");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |

### Return type

[**EmailTemplateContent**](EmailTemplateContent.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getEmailTemplateDefaultContentPreview_0"></a>
# **getEmailTemplateDefaultContentPreview_0**
> getEmailTemplateDefaultContentPreview_0(brandId, templateName, emailTemplateTestRequest).execute();

Get Preview of Email Template Default Content

Send a test email to the current users primary and secondary email addresses. The email content is selected based on the following priority: An email customization specifically for the users locale. The default language of email customizations. The email templates default content.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    String customizationId = "customizationId_example";
    try {
      client
              .brand
              .getEmailTemplateDefaultContentPreview_0(brandId, templateName)
              .customizationId(customizationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplateDefaultContentPreview_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .brand
              .getEmailTemplateDefaultContentPreview_0(brandId, templateName)
              .customizationId(customizationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getEmailTemplateDefaultContentPreview_0");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |
| **emailTemplateTestRequest** | [**EmailTemplateTestRequest**](EmailTemplateTestRequest.md)|  | |

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

<a name="getThemeById"></a>
# **getThemeById**
> ThemeResponse getThemeById(brandId, themeId).execute();

Get a theme for a brand

Fetches a theme for a brand

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String themeId = "themeId_example";
    try {
      ThemeResponse result = client
              .brand
              .getThemeById(brandId, themeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getBackgroundImage());
      System.out.println(result.getEmailTemplateTouchPointVariant());
      System.out.println(result.getEndUserDashboardTouchPointVariant());
      System.out.println(result.getErrorPageTouchPointVariant());
      System.out.println(result.getFavicon());
      System.out.println(result.getId());
      System.out.println(result.getLogo());
      System.out.println(result.getPrimaryColorContrastHex());
      System.out.println(result.getPrimaryColorHex());
      System.out.println(result.getSecondaryColorContrastHex());
      System.out.println(result.getSecondaryColorHex());
      System.out.println(result.getSignInPageTouchPointVariant());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getThemeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ThemeResponse> response = client
              .brand
              .getThemeById(brandId, themeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getThemeById");
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
| **brandId** | **String**|  | |
| **themeId** | **String**|  | |

### Return type

[**ThemeResponse**](ThemeResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getThemes"></a>
# **getThemes**
> List&lt;ThemeResponse&gt; getThemes(brandId).execute();

Get Brand Themes

List all the themes in your brand

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    try {
      List<ThemeResponse> result = client
              .brand
              .getThemes(brandId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getThemes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ThemeResponse>> response = client
              .brand
              .getThemes(brandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getThemes");
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
| **brandId** | **String**|  | |

### Return type

[**List&lt;ThemeResponse&gt;**](ThemeResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listEmailTemplateCustomizations"></a>
# **listEmailTemplateCustomizations**
> List&lt;EmailTemplateCustomization&gt; listEmailTemplateCustomizations(brandId, templateName).execute();

List Email Template Customization

List all email customizations for an email template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    try {
      List<EmailTemplateCustomization> result = client
              .brand
              .listEmailTemplateCustomizations(brandId, templateName)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#listEmailTemplateCustomizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmailTemplateCustomization>> response = client
              .brand
              .listEmailTemplateCustomizations(brandId, templateName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#listEmailTemplateCustomizations");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |

### Return type

[**List&lt;EmailTemplateCustomization&gt;**](EmailTemplateCustomization.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listEmailTemplates"></a>
# **listEmailTemplates**
> List&lt;EmailTemplate&gt; listEmailTemplates(brandId).after(after).limit(limit).execute();

List Email Templates

List email templates in your organization with pagination.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String after = "after_example"; // Specifies the pagination cursor for the next page of email templates.
    Integer limit = 20; // Specifies the number of results returned (maximum 200)
    try {
      List<EmailTemplate> result = client
              .brand
              .listEmailTemplates(brandId)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#listEmailTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmailTemplate>> response = client
              .brand
              .listEmailTemplates(brandId)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#listEmailTemplates");
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
| **brandId** | **String**|  | |
| **after** | **String**| Specifies the pagination cursor for the next page of email templates. | [optional] |
| **limit** | **Integer**| Specifies the number of results returned (maximum 200) | [optional] [default to 20] |

### Return type

[**List&lt;EmailTemplate&gt;**](EmailTemplate.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateByBrandId"></a>
# **updateByBrandId**
> Brand updateByBrandId(brandId, brand).execute();

Update Brand

Updates a brand by &#x60;brandId&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    Map<String, Object> links = new HashMap();
    Boolean agreeToCustomPrivacyPolicy = true;
    String customPrivacyPolicyUrl = "customPrivacyPolicyUrl_example";
    String id = "id_example";
    Boolean removePoweredByOkta = true;
    try {
      Brand result = client
              .brand
              .updateByBrandId(brandId)
              .links(links)
              .agreeToCustomPrivacyPolicy(agreeToCustomPrivacyPolicy)
              .customPrivacyPolicyUrl(customPrivacyPolicyUrl)
              .id(id)
              .removePoweredByOkta(removePoweredByOkta)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAgreeToCustomPrivacyPolicy());
      System.out.println(result.getCustomPrivacyPolicyUrl());
      System.out.println(result.getId());
      System.out.println(result.getRemovePoweredByOkta());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateByBrandId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Brand> response = client
              .brand
              .updateByBrandId(brandId)
              .links(links)
              .agreeToCustomPrivacyPolicy(agreeToCustomPrivacyPolicy)
              .customPrivacyPolicyUrl(customPrivacyPolicyUrl)
              .id(id)
              .removePoweredByOkta(removePoweredByOkta)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateByBrandId");
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
| **brandId** | **String**|  | |
| **brand** | [**Brand**](Brand.md)|  | |

### Return type

[**Brand**](Brand.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="updateEmailCustomization"></a>
# **updateEmailCustomization**
> EmailTemplateCustomization updateEmailCustomization(brandId, templateName, customizationId, emailTemplateCustomizationRequest).execute();

Update Email Customization

Update an email customization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String templateName = "templateName_example";
    String customizationId = "customizationId_example";
    String body = "body_example";
    Boolean isDefault = true;
    String language = "language_example"; // unique under each email template
    String subject = "subject_example";
    try {
      EmailTemplateCustomization result = client
              .brand
              .updateEmailCustomization(brandId, templateName, customizationId)
              .body(body)
              .isDefault(isDefault)
              .language(language)
              .subject(subject)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getBody());
      System.out.println(result.getCreated());
      System.out.println(result.getId());
      System.out.println(result.getIsDefault());
      System.out.println(result.getLanguage());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getSubject());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateEmailCustomization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmailTemplateCustomization> response = client
              .brand
              .updateEmailCustomization(brandId, templateName, customizationId)
              .body(body)
              .isDefault(isDefault)
              .language(language)
              .subject(subject)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateEmailCustomization");
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
| **brandId** | **String**|  | |
| **templateName** | **String**|  | |
| **customizationId** | **String**|  | |
| **emailTemplateCustomizationRequest** | [**EmailTemplateCustomizationRequest**](EmailTemplateCustomizationRequest.md)|  | |

### Return type

[**EmailTemplateCustomization**](EmailTemplateCustomization.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **409** | Conflict |  -  |

<a name="updateTheme"></a>
# **updateTheme**
> ThemeResponse updateTheme(brandId, themeId, theme).execute();

Update a theme for a brand

Updates a theme for a brand

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String brandId = "brandId_example";
    String themeId = "themeId_example";
    Map<String, Object> links = new HashMap();
    String backgroundImage = "backgroundImage_example";
    EmailTemplateTouchPointVariant emailTemplateTouchPointVariant = EmailTemplateTouchPointVariant.fromValue("OKTA_DEFAULT");
    EndUserDashboardTouchPointVariant endUserDashboardTouchPointVariant = EndUserDashboardTouchPointVariant.fromValue("OKTA_DEFAULT");
    ErrorPageTouchPointVariant errorPageTouchPointVariant = ErrorPageTouchPointVariant.fromValue("OKTA_DEFAULT");
    String primaryColorContrastHex = "primaryColorContrastHex_example";
    String primaryColorHex = "primaryColorHex_example";
    String secondaryColorContrastHex = "secondaryColorContrastHex_example";
    String secondaryColorHex = "secondaryColorHex_example";
    SignInPageTouchPointVariant signInPageTouchPointVariant = SignInPageTouchPointVariant.fromValue("OKTA_DEFAULT");
    try {
      ThemeResponse result = client
              .brand
              .updateTheme(brandId, themeId)
              .links(links)
              .backgroundImage(backgroundImage)
              .emailTemplateTouchPointVariant(emailTemplateTouchPointVariant)
              .endUserDashboardTouchPointVariant(endUserDashboardTouchPointVariant)
              .errorPageTouchPointVariant(errorPageTouchPointVariant)
              .primaryColorContrastHex(primaryColorContrastHex)
              .primaryColorHex(primaryColorHex)
              .secondaryColorContrastHex(secondaryColorContrastHex)
              .secondaryColorHex(secondaryColorHex)
              .signInPageTouchPointVariant(signInPageTouchPointVariant)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getBackgroundImage());
      System.out.println(result.getEmailTemplateTouchPointVariant());
      System.out.println(result.getEndUserDashboardTouchPointVariant());
      System.out.println(result.getErrorPageTouchPointVariant());
      System.out.println(result.getFavicon());
      System.out.println(result.getId());
      System.out.println(result.getLogo());
      System.out.println(result.getPrimaryColorContrastHex());
      System.out.println(result.getPrimaryColorHex());
      System.out.println(result.getSecondaryColorContrastHex());
      System.out.println(result.getSecondaryColorHex());
      System.out.println(result.getSignInPageTouchPointVariant());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateTheme");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ThemeResponse> response = client
              .brand
              .updateTheme(brandId, themeId)
              .links(links)
              .backgroundImage(backgroundImage)
              .emailTemplateTouchPointVariant(emailTemplateTouchPointVariant)
              .endUserDashboardTouchPointVariant(endUserDashboardTouchPointVariant)
              .errorPageTouchPointVariant(errorPageTouchPointVariant)
              .primaryColorContrastHex(primaryColorContrastHex)
              .primaryColorHex(primaryColorHex)
              .secondaryColorContrastHex(secondaryColorContrastHex)
              .secondaryColorHex(secondaryColorHex)
              .signInPageTouchPointVariant(signInPageTouchPointVariant)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateTheme");
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
| **brandId** | **String**|  | |
| **themeId** | **String**|  | |
| **theme** | [**Theme**](Theme.md)|  | |

### Return type

[**ThemeResponse**](ThemeResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="updateThemeBackgroundImage"></a>
# **updateThemeBackgroundImage**
> ImageUploadResponse updateThemeBackgroundImage(brandId, themeId, applicationUpdateLogoRequest).execute();

Updates the background image for your Theme

Updates the background image for your Theme

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    File _file = new File("/path/to/file");
    String brandId = "brandId_example";
    String themeId = "themeId_example";
    try {
      ImageUploadResponse result = client
              .brand
              .updateThemeBackgroundImage(_file, brandId, themeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateThemeBackgroundImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImageUploadResponse> response = client
              .brand
              .updateThemeBackgroundImage(_file, brandId, themeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateThemeBackgroundImage");
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
| **brandId** | **String**|  | |
| **themeId** | **String**|  | |
| **applicationUpdateLogoRequest** | [**ApplicationUpdateLogoRequest**](ApplicationUpdateLogoRequest.md)|  | |

### Return type

[**ImageUploadResponse**](ImageUploadResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="updateThemeFavicon"></a>
# **updateThemeFavicon**
> ImageUploadResponse updateThemeFavicon(brandId, themeId, applicationUpdateLogoRequest).execute();

Updates the favicon for your theme

Updates the favicon for your theme

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    File _file = new File("/path/to/file");
    String brandId = "brandId_example";
    String themeId = "themeId_example";
    try {
      ImageUploadResponse result = client
              .brand
              .updateThemeFavicon(_file, brandId, themeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateThemeFavicon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImageUploadResponse> response = client
              .brand
              .updateThemeFavicon(_file, brandId, themeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateThemeFavicon");
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
| **brandId** | **String**|  | |
| **themeId** | **String**|  | |
| **applicationUpdateLogoRequest** | [**ApplicationUpdateLogoRequest**](ApplicationUpdateLogoRequest.md)|  | |

### Return type

[**ImageUploadResponse**](ImageUploadResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="updateThemeLogo"></a>
# **updateThemeLogo**
> ImageUploadResponse updateThemeLogo(brandId, themeId, applicationUpdateLogoRequest).execute();

Update a themes logo

Updates the logo for your Theme

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    File _file = new File("/path/to/file");
    String brandId = "brandId_example";
    String themeId = "themeId_example";
    try {
      ImageUploadResponse result = client
              .brand
              .updateThemeLogo(_file, brandId, themeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateThemeLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImageUploadResponse> response = client
              .brand
              .updateThemeLogo(_file, brandId, themeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateThemeLogo");
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
| **brandId** | **String**|  | |
| **themeId** | **String**|  | |
| **applicationUpdateLogoRequest** | [**ApplicationUpdateLogoRequest**](ApplicationUpdateLogoRequest.md)|  | |

### Return type

[**ImageUploadResponse**](ImageUploadResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

