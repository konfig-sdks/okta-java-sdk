

# Protocol


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**algorithms** | [**ProtocolAlgorithms**](ProtocolAlgorithms.md) |  |  [optional] |
|**credentials** | [**IdentityProviderCredentials**](IdentityProviderCredentials.md) |  |  [optional] |
|**endpoints** | [**ProtocolEndpoints**](ProtocolEndpoints.md) |  |  [optional] |
|**issuer** | [**ProtocolEndpoint**](ProtocolEndpoint.md) |  |  [optional] |
|**relayState** | [**ProtocolRelayState**](ProtocolRelayState.md) |  |  [optional] |
|**scopes** | **List&lt;String&gt;** |  |  [optional] |
|**settings** | [**ProtocolSettings**](ProtocolSettings.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SAML2 | &quot;SAML2&quot; |
| OIDC | &quot;OIDC&quot; |
| OAUTH2 | &quot;OAUTH2&quot; |
| MTLS | &quot;MTLS&quot; |



