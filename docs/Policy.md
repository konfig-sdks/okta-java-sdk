

# Policy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**embedded** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**links** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**conditions** | [**PolicyRuleConditions**](PolicyRuleConditions.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**id** | **String** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] |
|**priority** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**system** | **Boolean** |  |  [optional] |
|**type** | **PolicyType** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



