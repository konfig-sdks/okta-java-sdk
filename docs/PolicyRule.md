

# PolicyRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actions** | [**PolicyRuleActions**](PolicyRuleActions.md) |  |  [optional] |
|**conditions** | [**PolicyRuleConditions**](PolicyRuleConditions.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**id** | **String** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] |
|**priority** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**system** | **Boolean** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIGN_ON | &quot;SIGN_ON&quot; |
| PASSWORD | &quot;PASSWORD&quot; |



