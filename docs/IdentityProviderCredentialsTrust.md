

# IdentityProviderCredentialsTrust


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audience** | **String** |  |  [optional] |
|**issuer** | **String** |  |  [optional] |
|**kid** | **String** |  |  [optional] |
|**revocation** | [**RevocationEnum**](#RevocationEnum) |  |  [optional] |
|**revocationCacheLifetime** | **Integer** |  |  [optional] |



## Enum: RevocationEnum

| Name | Value |
|---- | -----|
| CRL | &quot;CRL&quot; |
| DELTA_CRL | &quot;DELTA_CRL&quot; |
| OCSP | &quot;OCSP&quot; |



