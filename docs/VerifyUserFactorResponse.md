

# VerifyUserFactorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**embedded** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**links** | **Map&lt;String, Object&gt;** |  |  [optional] [readonly] |
|**expiresAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**factorResult** | [**FactorResultEnum**](#FactorResultEnum) |  |  [optional] |
|**factorResultMessage** | **String** |  |  [optional] |



## Enum: FactorResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| CHALLENGE | &quot;CHALLENGE&quot; |
| WAITING | &quot;WAITING&quot; |
| FAILED | &quot;FAILED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
| TIME_WINDOW_EXCEEDED | &quot;TIME_WINDOW_EXCEEDED&quot; |
| PASSCODE_REPLAYED | &quot;PASSCODE_REPLAYED&quot; |
| ERROR | &quot;ERROR&quot; |



