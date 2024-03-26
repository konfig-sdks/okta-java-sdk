

# EventHook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**channel** | [**EventHookChannel**](EventHookChannel.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**createdBy** | **String** |  |  [optional] |
|**events** | [**EventSubscriptions**](EventSubscriptions.md) |  |  [optional] |
|**id** | **String** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: VerificationStatusEnum

| Name | Value |
|---- | -----|
| UNVERIFIED | &quot;UNVERIFIED&quot; |
| VERIFIED | &quot;VERIFIED&quot; |



