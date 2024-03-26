

# IdentityProvider


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**id** | **String** |  |  [optional] [readonly] |
|**issuerMode** | [**IssuerModeEnum**](#IssuerModeEnum) |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] |
|**policy** | [**IdentityProviderPolicy**](IdentityProviderPolicy.md) |  |  [optional] |
|**protocol** | [**Protocol**](Protocol.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: IssuerModeEnum

| Name | Value |
|---- | -----|
| ORG_URL | &quot;ORG_URL&quot; |
| CUSTOM_URL | &quot;CUSTOM_URL&quot; |
| DYNAMIC | &quot;DYNAMIC&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SAML2 | &quot;SAML2&quot; |
| GOOGLE | &quot;GOOGLE&quot; |
| FACEBOOK | &quot;FACEBOOK&quot; |
| LINKEDIN | &quot;LINKEDIN&quot; |
| MICROSOFT | &quot;MICROSOFT&quot; |
| OIDC | &quot;OIDC&quot; |
| OKTA | &quot;OKTA&quot; |
| IWA | &quot;IWA&quot; |
| AGENTLESSDSSO | &quot;AgentlessDSSO&quot; |
| X509 | &quot;X509&quot; |



