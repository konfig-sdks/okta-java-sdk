

# OAuth2RefreshToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**embedded** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**links** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**clientId** | **String** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**createdBy** | [**OAuth2Actor**](OAuth2Actor.md) |  |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**id** | **String** |  |  [optional] [readonly] |
|**issuer** | **String** |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**scopes** | **List&lt;String&gt;** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**userId** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| REVOKED | &quot;REVOKED&quot; |



