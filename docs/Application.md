

# Application


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**embedded** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**links** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**accessibility** | [**ApplicationAccessibility**](ApplicationAccessibility.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**credentials** | [**ApplicationCredentials**](ApplicationCredentials.md) |  |  [optional] |
|**features** | **List&lt;String&gt;** |  |  [optional] |
|**id** | **String** |  |  [optional] [readonly] |
|**label** | **String** |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**licensing** | [**ApplicationLicensing**](ApplicationLicensing.md) |  |  [optional] |
|**name** | **String** |  |  [optional] [readonly] |
|**profile** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**settings** | [**ApplicationSettings**](ApplicationSettings.md) |  |  [optional] |
|**signOnMode** | **ApplicationSignOnMode** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] [readonly] |
|**visibility** | [**ApplicationVisibility**](ApplicationVisibility.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



