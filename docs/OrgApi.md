# OrgApi

All URIs are relative to *https://your-subdomain.okta.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**extendOktaSupport**](OrgApi.md#extendOktaSupport) | **POST** /api/v1/org/privacy/oktaSupport/extend | Extend Okta Support |
| [**extendOktaSupport_0**](OrgApi.md#extendOktaSupport_0) | **POST** /api/v1/org/privacy/oktaSupport/revoke | Extend Okta Support |
| [**getContactUser**](OrgApi.md#getContactUser) | **GET** /api/v1/org/contacts/{contactType} | Get org contact user |
| [**getOktaCommunicationSettings**](OrgApi.md#getOktaCommunicationSettings) | **GET** /api/v1/org/privacy/oktaCommunication | Get Okta Communication Settings |
| [**getOktaSupportSettings**](OrgApi.md#getOktaSupportSettings) | **GET** /api/v1/org/privacy/oktaSupport | Get Okta Support settings |
| [**getOrgPreferences**](OrgApi.md#getOrgPreferences) | **GET** /api/v1/org/preferences | Get org preferences |
| [**getSettings**](OrgApi.md#getSettings) | **GET** /api/v1/org | Get org settings |
| [**grantOktaSupportAccess**](OrgApi.md#grantOktaSupportAccess) | **POST** /api/v1/org/privacy/oktaSupport/grant | Grant Okta Support |
| [**hideEndUserFooter**](OrgApi.md#hideEndUserFooter) | **POST** /api/v1/org/preferences/hideEndUserFooter | Show Okta UI Footer |
| [**listContactTypes**](OrgApi.md#listContactTypes) | **GET** /api/v1/org/contacts | Get org contact types |
| [**makeOktaUiFooterVisible**](OrgApi.md#makeOktaUiFooterVisible) | **POST** /api/v1/org/preferences/showEndUserFooter | Show Okta UI Footer |
| [**optInOktaCommunicationEmails**](OrgApi.md#optInOktaCommunicationEmails) | **POST** /api/v1/org/privacy/oktaCommunication/optIn | Opt in all users to Okta Communication emails |
| [**optOutOktaCommunicationEmails**](OrgApi.md#optOutOktaCommunicationEmails) | **POST** /api/v1/org/privacy/oktaCommunication/optOut | Opt out all users from Okta Communication emails |
| [**updateContactUser**](OrgApi.md#updateContactUser) | **PUT** /api/v1/org/contacts/{contactType} | Update org contact user |
| [**updateOrganizationLogo**](OrgApi.md#updateOrganizationLogo) | **POST** /api/v1/org/logo | Update org logo |
| [**updateSetting**](OrgApi.md#updateSetting) | **PUT** /api/v1/org | Update Org setting |
| [**updateSettings**](OrgApi.md#updateSettings) | **POST** /api/v1/org | Partial update Org setting |


<a name="extendOktaSupport"></a>
# **extendOktaSupport**
> OrgOktaSupportSettingsObj extendOktaSupport().execute();

Extend Okta Support

Extends the length of time that Okta Support can access your org by 24 hours. This means that 24 hours are added to the remaining access time.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgOktaSupportSettingsObj result = client
              .org
              .extendOktaSupport()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getExpiration());
      System.out.println(result.getSupport());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#extendOktaSupport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgOktaSupportSettingsObj> response = client
              .org
              .extendOktaSupport()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#extendOktaSupport");
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

[**OrgOktaSupportSettingsObj**](OrgOktaSupportSettingsObj.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="extendOktaSupport_0"></a>
# **extendOktaSupport_0**
> OrgOktaSupportSettingsObj extendOktaSupport_0().execute();

Extend Okta Support

Revokes Okta Support access to your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgOktaSupportSettingsObj result = client
              .org
              .extendOktaSupport_0()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getExpiration());
      System.out.println(result.getSupport());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#extendOktaSupport_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgOktaSupportSettingsObj> response = client
              .org
              .extendOktaSupport_0()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#extendOktaSupport_0");
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

[**OrgOktaSupportSettingsObj**](OrgOktaSupportSettingsObj.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getContactUser"></a>
# **getContactUser**
> OrgContactUser getContactUser(contactType).execute();

Get org contact user

Retrieves the URL of the User associated with the specified Contact Type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String contactType = "contactType_example";
    try {
      OrgContactUser result = client
              .org
              .getContactUser(contactType)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getContactUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgContactUser> response = client
              .org
              .getContactUser(contactType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getContactUser");
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
| **contactType** | **String**|  | |

### Return type

[**OrgContactUser**](OrgContactUser.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOktaCommunicationSettings"></a>
# **getOktaCommunicationSettings**
> OrgOktaCommunicationSetting getOktaCommunicationSettings().execute();

Get Okta Communication Settings

Gets Okta Communication Settings of your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgOktaCommunicationSetting result = client
              .org
              .getOktaCommunicationSettings()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getOptOutEmailUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getOktaCommunicationSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgOktaCommunicationSetting> response = client
              .org
              .getOktaCommunicationSettings()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getOktaCommunicationSettings");
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

[**OrgOktaCommunicationSetting**](OrgOktaCommunicationSetting.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOktaSupportSettings"></a>
# **getOktaSupportSettings**
> OrgOktaSupportSettingsObj getOktaSupportSettings().execute();

Get Okta Support settings

Gets Okta Support Settings of your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgOktaSupportSettingsObj result = client
              .org
              .getOktaSupportSettings()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getExpiration());
      System.out.println(result.getSupport());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getOktaSupportSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgOktaSupportSettingsObj> response = client
              .org
              .getOktaSupportSettings()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getOktaSupportSettings");
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

[**OrgOktaSupportSettingsObj**](OrgOktaSupportSettingsObj.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrgPreferences"></a>
# **getOrgPreferences**
> OrgPreferences getOrgPreferences().execute();

Get org preferences

Gets preferences of your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgPreferences result = client
              .org
              .getOrgPreferences()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getShowEndUserFooter());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getOrgPreferences");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgPreferences> response = client
              .org
              .getOrgPreferences()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getOrgPreferences");
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

[**OrgPreferences**](OrgPreferences.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSettings"></a>
# **getSettings**
> OrgSetting getSettings().execute();

Get org settings

Get settings of your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgSetting result = client
              .org
              .getSettings()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAddress1());
      System.out.println(result.getAddress2());
      System.out.println(result.getCity());
      System.out.println(result.getCompanyName());
      System.out.println(result.getCountry());
      System.out.println(result.getCreated());
      System.out.println(result.getEndUserSupportHelpURL());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getPostalCode());
      System.out.println(result.getState());
      System.out.println(result.getStatus());
      System.out.println(result.getSubdomain());
      System.out.println(result.getSupportPhoneNumber());
      System.out.println(result.getWebsite());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgSetting> response = client
              .org
              .getSettings()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#getSettings");
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

[**OrgSetting**](OrgSetting.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="grantOktaSupportAccess"></a>
# **grantOktaSupportAccess**
> OrgOktaSupportSettingsObj grantOktaSupportAccess().execute();

Grant Okta Support

Enables you to temporarily allow Okta Support to access your org as an administrator for eight hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgOktaSupportSettingsObj result = client
              .org
              .grantOktaSupportAccess()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getExpiration());
      System.out.println(result.getSupport());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#grantOktaSupportAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgOktaSupportSettingsObj> response = client
              .org
              .grantOktaSupportAccess()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#grantOktaSupportAccess");
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

[**OrgOktaSupportSettingsObj**](OrgOktaSupportSettingsObj.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="hideEndUserFooter"></a>
# **hideEndUserFooter**
> OrgPreferences hideEndUserFooter().execute();

Show Okta UI Footer

Hide the Okta UI footer for all end users of your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgPreferences result = client
              .org
              .hideEndUserFooter()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getShowEndUserFooter());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#hideEndUserFooter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgPreferences> response = client
              .org
              .hideEndUserFooter()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#hideEndUserFooter");
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

[**OrgPreferences**](OrgPreferences.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listContactTypes"></a>
# **listContactTypes**
> List&lt;OrgContactTypeObj&gt; listContactTypes().execute();

Get org contact types

Gets Contact Types of your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      List<OrgContactTypeObj> result = client
              .org
              .listContactTypes()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#listContactTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OrgContactTypeObj>> response = client
              .org
              .listContactTypes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#listContactTypes");
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

[**List&lt;OrgContactTypeObj&gt;**](OrgContactTypeObj.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="makeOktaUiFooterVisible"></a>
# **makeOktaUiFooterVisible**
> OrgPreferences makeOktaUiFooterVisible().execute();

Show Okta UI Footer

Makes the Okta UI footer visible for all end users of your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgPreferences result = client
              .org
              .makeOktaUiFooterVisible()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getShowEndUserFooter());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#makeOktaUiFooterVisible");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgPreferences> response = client
              .org
              .makeOktaUiFooterVisible()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#makeOktaUiFooterVisible");
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

[**OrgPreferences**](OrgPreferences.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="optInOktaCommunicationEmails"></a>
# **optInOktaCommunicationEmails**
> OrgOktaCommunicationSetting optInOktaCommunicationEmails().execute();

Opt in all users to Okta Communication emails

Opts in all users of this org to Okta Communication emails.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgOktaCommunicationSetting result = client
              .org
              .optInOktaCommunicationEmails()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getOptOutEmailUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#optInOktaCommunicationEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgOktaCommunicationSetting> response = client
              .org
              .optInOktaCommunicationEmails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#optInOktaCommunicationEmails");
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

[**OrgOktaCommunicationSetting**](OrgOktaCommunicationSetting.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="optOutOktaCommunicationEmails"></a>
# **optOutOktaCommunicationEmails**
> OrgOktaCommunicationSetting optOutOktaCommunicationEmails().execute();

Opt out all users from Okta Communication emails

Opts out all users of this org from Okta Communication emails.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
      OrgOktaCommunicationSetting result = client
              .org
              .optOutOktaCommunicationEmails()
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getOptOutEmailUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#optOutOktaCommunicationEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgOktaCommunicationSetting> response = client
              .org
              .optOutOktaCommunicationEmails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#optOutOktaCommunicationEmails");
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

[**OrgOktaCommunicationSetting**](OrgOktaCommunicationSetting.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateContactUser"></a>
# **updateContactUser**
> OrgContactUser updateContactUser(contactType, userIdString).execute();

Update org contact user

Updates the User associated with the specified Contact Type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-subdomain.okta.com";
    
    configuration.apiToken  = "YOUR API KEY";
    Okta client = new Okta(configuration);
    String contactType = "contactType_example";
    String userId = "userId_example";
    try {
      OrgContactUser result = client
              .org
              .updateContactUser(contactType)
              .userId(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateContactUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgContactUser> response = client
              .org
              .updateContactUser(contactType)
              .userId(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateContactUser");
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
| **contactType** | **String**|  | |
| **userIdString** | [**UserIdString**](UserIdString.md)|  | |

### Return type

[**OrgContactUser**](OrgContactUser.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateOrganizationLogo"></a>
# **updateOrganizationLogo**
> updateOrganizationLogo(applicationUpdateLogoRequest).execute();

Update org logo

Updates the logo for your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
    try {
      client
              .org
              .updateOrganizationLogo(_file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateOrganizationLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .org
              .updateOrganizationLogo(_file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateOrganizationLogo");
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
| **applicationUpdateLogoRequest** | [**ApplicationUpdateLogoRequest**](ApplicationUpdateLogoRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="updateSetting"></a>
# **updateSetting**
> OrgSetting updateSetting(orgSetting).execute();

Update Org setting

Update settings of your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
    String address1 = "address1_example";
    String address2 = "address2_example";
    String city = "city_example";
    String companyName = "companyName_example";
    String country = "country_example";
    OffsetDateTime created = OffsetDateTime.now();
    String endUserSupportHelpURL = "endUserSupportHelpURL_example";
    OffsetDateTime expiresAt = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String phoneNumber = "phoneNumber_example";
    String postalCode = "postalCode_example";
    String state = "state_example";
    String status = "status_example";
    String subdomain = "subdomain_example";
    String supportPhoneNumber = "supportPhoneNumber_example";
    String website = "website_example";
    try {
      OrgSetting result = client
              .org
              .updateSetting()
              .links(links)
              .address1(address1)
              .address2(address2)
              .city(city)
              .companyName(companyName)
              .country(country)
              .created(created)
              .endUserSupportHelpURL(endUserSupportHelpURL)
              .expiresAt(expiresAt)
              .id(id)
              .lastUpdated(lastUpdated)
              .phoneNumber(phoneNumber)
              .postalCode(postalCode)
              .state(state)
              .status(status)
              .subdomain(subdomain)
              .supportPhoneNumber(supportPhoneNumber)
              .website(website)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAddress1());
      System.out.println(result.getAddress2());
      System.out.println(result.getCity());
      System.out.println(result.getCompanyName());
      System.out.println(result.getCountry());
      System.out.println(result.getCreated());
      System.out.println(result.getEndUserSupportHelpURL());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getPostalCode());
      System.out.println(result.getState());
      System.out.println(result.getStatus());
      System.out.println(result.getSubdomain());
      System.out.println(result.getSupportPhoneNumber());
      System.out.println(result.getWebsite());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateSetting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgSetting> response = client
              .org
              .updateSetting()
              .links(links)
              .address1(address1)
              .address2(address2)
              .city(city)
              .companyName(companyName)
              .country(country)
              .created(created)
              .endUserSupportHelpURL(endUserSupportHelpURL)
              .expiresAt(expiresAt)
              .id(id)
              .lastUpdated(lastUpdated)
              .phoneNumber(phoneNumber)
              .postalCode(postalCode)
              .state(state)
              .status(status)
              .subdomain(subdomain)
              .supportPhoneNumber(supportPhoneNumber)
              .website(website)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateSetting");
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
| **orgSetting** | [**OrgSetting**](OrgSetting.md)|  | |

### Return type

[**OrgSetting**](OrgSetting.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSettings"></a>
# **updateSettings**
> OrgSetting updateSettings(orgSetting).execute();

Partial update Org setting

Partial update settings of your organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Okta;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgApi;
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
    String address1 = "address1_example";
    String address2 = "address2_example";
    String city = "city_example";
    String companyName = "companyName_example";
    String country = "country_example";
    OffsetDateTime created = OffsetDateTime.now();
    String endUserSupportHelpURL = "endUserSupportHelpURL_example";
    OffsetDateTime expiresAt = OffsetDateTime.now();
    String id = "id_example";
    OffsetDateTime lastUpdated = OffsetDateTime.now();
    String phoneNumber = "phoneNumber_example";
    String postalCode = "postalCode_example";
    String state = "state_example";
    String status = "status_example";
    String subdomain = "subdomain_example";
    String supportPhoneNumber = "supportPhoneNumber_example";
    String website = "website_example";
    try {
      OrgSetting result = client
              .org
              .updateSettings()
              .links(links)
              .address1(address1)
              .address2(address2)
              .city(city)
              .companyName(companyName)
              .country(country)
              .created(created)
              .endUserSupportHelpURL(endUserSupportHelpURL)
              .expiresAt(expiresAt)
              .id(id)
              .lastUpdated(lastUpdated)
              .phoneNumber(phoneNumber)
              .postalCode(postalCode)
              .state(state)
              .status(status)
              .subdomain(subdomain)
              .supportPhoneNumber(supportPhoneNumber)
              .website(website)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getAddress1());
      System.out.println(result.getAddress2());
      System.out.println(result.getCity());
      System.out.println(result.getCompanyName());
      System.out.println(result.getCountry());
      System.out.println(result.getCreated());
      System.out.println(result.getEndUserSupportHelpURL());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getPostalCode());
      System.out.println(result.getState());
      System.out.println(result.getStatus());
      System.out.println(result.getSubdomain());
      System.out.println(result.getSupportPhoneNumber());
      System.out.println(result.getWebsite());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgSetting> response = client
              .org
              .updateSettings()
              .links(links)
              .address1(address1)
              .address2(address2)
              .city(city)
              .companyName(companyName)
              .country(country)
              .created(created)
              .endUserSupportHelpURL(endUserSupportHelpURL)
              .expiresAt(expiresAt)
              .id(id)
              .lastUpdated(lastUpdated)
              .phoneNumber(phoneNumber)
              .postalCode(postalCode)
              .state(state)
              .status(status)
              .subdomain(subdomain)
              .supportPhoneNumber(supportPhoneNumber)
              .website(website)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgApi#updateSettings");
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
| **orgSetting** | [**OrgSetting**](OrgSetting.md)|  | |

### Return type

[**OrgSetting**](OrgSetting.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

