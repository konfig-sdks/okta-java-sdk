

# OAuth2Scope


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**consent** | [**ConsentEnum**](#ConsentEnum) |  |  [optional] |
|**_default** | **Boolean** |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] [readonly] |
|**metadataPublish** | [**MetadataPublishEnum**](#MetadataPublishEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**system** | **Boolean** |  |  [optional] |



## Enum: ConsentEnum

| Name | Value |
|---- | -----|
| REQUIRED | &quot;REQUIRED&quot; |
| IMPLICIT | &quot;IMPLICIT&quot; |
| ADMIN | &quot;ADMIN&quot; |



## Enum: MetadataPublishEnum

| Name | Value |
|---- | -----|
| ALL_CLIENTS | &quot;ALL_CLIENTS&quot; |
| NO_CLIENTS | &quot;NO_CLIENTS&quot; |



