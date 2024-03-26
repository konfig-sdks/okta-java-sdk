

# OAuth2Claim


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**alwaysIncludeInToken** | **Boolean** |  |  [optional] |
|**claimType** | [**ClaimTypeEnum**](#ClaimTypeEnum) |  |  [optional] |
|**conditions** | [**OAuth2ClaimConditions**](OAuth2ClaimConditions.md) |  |  [optional] |
|**groupFilterType** | [**GroupFilterTypeEnum**](#GroupFilterTypeEnum) |  |  [optional] |
|**id** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**system** | **Boolean** |  |  [optional] |
|**value** | **String** |  |  [optional] |
|**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) |  |  [optional] |



## Enum: ClaimTypeEnum

| Name | Value |
|---- | -----|
| IDENTITY | &quot;IDENTITY&quot; |
| RESOURCE | &quot;RESOURCE&quot; |



## Enum: GroupFilterTypeEnum

| Name | Value |
|---- | -----|
| STARTS_WITH | &quot;STARTS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| REGEX | &quot;REGEX&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: ValueTypeEnum

| Name | Value |
|---- | -----|
| EXPRESSION | &quot;EXPRESSION&quot; |
| GROUPS | &quot;GROUPS&quot; |
| SYSTEM | &quot;SYSTEM&quot; |



