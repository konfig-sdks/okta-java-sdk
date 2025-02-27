/*
 * Okta API
 * Allows customers to easily access the Okta API
 *
 * The version of the OpenAPI document: 2.16.0
 * Contact: devex-public@okta.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * AppLink
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AppLink {
  public static final String SERIALIZED_NAME_APP_ASSIGNMENT_ID = "appAssignmentId";
  @SerializedName(SERIALIZED_NAME_APP_ASSIGNMENT_ID)
  private String appAssignmentId;

  public static final String SERIALIZED_NAME_APP_INSTANCE_ID = "appInstanceId";
  @SerializedName(SERIALIZED_NAME_APP_INSTANCE_ID)
  private String appInstanceId;

  public static final String SERIALIZED_NAME_APP_NAME = "appName";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_CREDENTIALS_SETUP = "credentialsSetup";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS_SETUP)
  private Boolean credentialsSetup;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_LINK_URL = "linkUrl";
  @SerializedName(SERIALIZED_NAME_LINK_URL)
  private String linkUrl;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public AppLink() {
  }

  
  public AppLink(
     String appAssignmentId, 
     String appInstanceId, 
     String appName, 
     Boolean credentialsSetup, 
     Boolean hidden, 
     String id, 
     String label, 
     String linkUrl, 
     String logoUrl, 
     Integer sortOrder
  ) {
    this();
    this.appAssignmentId = appAssignmentId;
    this.appInstanceId = appInstanceId;
    this.appName = appName;
    this.credentialsSetup = credentialsSetup;
    this.hidden = hidden;
    this.id = id;
    this.label = label;
    this.linkUrl = linkUrl;
    this.logoUrl = logoUrl;
    this.sortOrder = sortOrder;
  }

   /**
   * Get appAssignmentId
   * @return appAssignmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppAssignmentId() {
    return appAssignmentId;
  }




   /**
   * Get appInstanceId
   * @return appInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppInstanceId() {
    return appInstanceId;
  }




   /**
   * Get appName
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppName() {
    return appName;
  }




   /**
   * Get credentialsSetup
   * @return credentialsSetup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCredentialsSetup() {
    return credentialsSetup;
  }




   /**
   * Get hidden
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHidden() {
    return hidden;
  }




   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }




   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }




   /**
   * Get linkUrl
   * @return linkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLinkUrl() {
    return linkUrl;
  }




   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoUrl() {
    return logoUrl;
  }




   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSortOrder() {
    return sortOrder;
  }



  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AppLink instance itself
   */
  public AppLink putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLink appLink = (AppLink) o;
    return Objects.equals(this.appAssignmentId, appLink.appAssignmentId) &&
        Objects.equals(this.appInstanceId, appLink.appInstanceId) &&
        Objects.equals(this.appName, appLink.appName) &&
        Objects.equals(this.credentialsSetup, appLink.credentialsSetup) &&
        Objects.equals(this.hidden, appLink.hidden) &&
        Objects.equals(this.id, appLink.id) &&
        Objects.equals(this.label, appLink.label) &&
        Objects.equals(this.linkUrl, appLink.linkUrl) &&
        Objects.equals(this.logoUrl, appLink.logoUrl) &&
        Objects.equals(this.sortOrder, appLink.sortOrder)&&
        Objects.equals(this.additionalProperties, appLink.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appAssignmentId, appInstanceId, appName, credentialsSetup, hidden, id, label, linkUrl, logoUrl, sortOrder, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLink {\n");
    sb.append("    appAssignmentId: ").append(toIndentedString(appAssignmentId)).append("\n");
    sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    credentialsSetup: ").append(toIndentedString(credentialsSetup)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("appAssignmentId");
    openapiFields.add("appInstanceId");
    openapiFields.add("appName");
    openapiFields.add("credentialsSetup");
    openapiFields.add("hidden");
    openapiFields.add("id");
    openapiFields.add("label");
    openapiFields.add("linkUrl");
    openapiFields.add("logoUrl");
    openapiFields.add("sortOrder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppLink
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppLink.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppLink is not found in the empty JSON string", AppLink.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("appAssignmentId") != null && !jsonObj.get("appAssignmentId").isJsonNull()) && !jsonObj.get("appAssignmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appAssignmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appAssignmentId").toString()));
      }
      if ((jsonObj.get("appInstanceId") != null && !jsonObj.get("appInstanceId").isJsonNull()) && !jsonObj.get("appInstanceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appInstanceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appInstanceId").toString()));
      }
      if ((jsonObj.get("appName") != null && !jsonObj.get("appName").isJsonNull()) && !jsonObj.get("appName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appName").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("linkUrl") != null && !jsonObj.get("linkUrl").isJsonNull()) && !jsonObj.get("linkUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkUrl").toString()));
      }
      if ((jsonObj.get("logoUrl") != null && !jsonObj.get("logoUrl").isJsonNull()) && !jsonObj.get("logoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppLink.class));

       return (TypeAdapter<T>) new TypeAdapter<AppLink>() {
           @Override
           public void write(JsonWriter out, AppLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AppLink read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AppLink instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppLink
  * @throws IOException if the JSON string is invalid with respect to AppLink
  */
  public static AppLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppLink.class);
  }

 /**
  * Convert an instance of AppLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

