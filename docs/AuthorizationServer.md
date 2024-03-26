

# AuthorizationServer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**links** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**audiences** | **List&lt;String&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**credentials** | [**AuthorizationServerCredentials**](AuthorizationServerCredentials.md) |  |  [optional] |
|**_default** | **Boolean** |  |  [optional] [readonly] |
|**id** | **String** |  |  [optional] [readonly] |
|**issuer** | **String** |  |  [optional] |
|**issuerMode** | [**IssuerModeEnum**](#IssuerModeEnum) |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



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



