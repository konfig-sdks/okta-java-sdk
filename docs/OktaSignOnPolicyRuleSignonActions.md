

# OktaSignOnPolicyRuleSignonActions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**AccessEnum**](#AccessEnum) |  |  [optional] |
|**factorLifetime** | **Integer** |  |  [optional] |
|**factorPromptMode** | [**FactorPromptModeEnum**](#FactorPromptModeEnum) |  |  [optional] |
|**rememberDeviceByDefault** | **Boolean** |  |  [optional] |
|**requireFactor** | **Boolean** |  |  [optional] |
|**session** | [**OktaSignOnPolicyRuleSignonSessionActions**](OktaSignOnPolicyRuleSignonSessionActions.md) |  |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| ALLOW | &quot;ALLOW&quot; |
| DENY | &quot;DENY&quot; |



## Enum: FactorPromptModeEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;ALWAYS&quot; |
| DEVICE | &quot;DEVICE&quot; |
| SESSION | &quot;SESSION&quot; |



