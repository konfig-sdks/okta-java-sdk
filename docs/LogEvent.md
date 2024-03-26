

# LogEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** |  |  [optional] [readonly] |
|**actor** | [**LogActor**](LogActor.md) |  |  [optional] |
|**authenticationContext** | [**LogAuthenticationContext**](LogAuthenticationContext.md) |  |  [optional] |
|**client** | [**LogClient**](LogClient.md) |  |  [optional] |
|**debugContext** | [**LogDebugContext**](LogDebugContext.md) |  |  [optional] |
|**displayMessage** | **String** |  |  [optional] [readonly] |
|**eventType** | **String** |  |  [optional] [readonly] |
|**legacyEventType** | **String** |  |  [optional] [readonly] |
|**outcome** | [**LogOutcome**](LogOutcome.md) |  |  [optional] |
|**published** | **OffsetDateTime** |  |  [optional] [readonly] |
|**request** | [**LogRequest**](LogRequest.md) |  |  [optional] |
|**securityContext** | [**LogSecurityContext**](LogSecurityContext.md) |  |  [optional] |
|**severity** | **LogSeverity** |  |  [optional] |
|**target** | [**List&lt;LogTarget&gt;**](LogTarget.md) |  |  [optional] [readonly] |
|**transaction** | [**LogTransaction**](LogTransaction.md) |  |  [optional] |
|**uuid** | **String** |  |  [optional] [readonly] |



