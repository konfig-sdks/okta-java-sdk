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
import com.konfigthis.client.model.LifecycleDeactivateSettingObject;
import com.konfigthis.client.model.PasswordSettingObject;
import com.konfigthis.client.model.ProfileSettingObject;
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
 * CapabilitiesUpdateObject
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CapabilitiesUpdateObject {
  public static final String SERIALIZED_NAME_LIFECYCLE_DEACTIVATE = "lifecycleDeactivate";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_DEACTIVATE)
  private LifecycleDeactivateSettingObject lifecycleDeactivate;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private PasswordSettingObject password;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private ProfileSettingObject profile;

  public CapabilitiesUpdateObject() {
  }

  public CapabilitiesUpdateObject lifecycleDeactivate(LifecycleDeactivateSettingObject lifecycleDeactivate) {
    
    
    
    
    this.lifecycleDeactivate = lifecycleDeactivate;
    return this;
  }

   /**
   * Get lifecycleDeactivate
   * @return lifecycleDeactivate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LifecycleDeactivateSettingObject getLifecycleDeactivate() {
    return lifecycleDeactivate;
  }


  public void setLifecycleDeactivate(LifecycleDeactivateSettingObject lifecycleDeactivate) {
    
    
    
    this.lifecycleDeactivate = lifecycleDeactivate;
  }


  public CapabilitiesUpdateObject password(PasswordSettingObject password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PasswordSettingObject getPassword() {
    return password;
  }


  public void setPassword(PasswordSettingObject password) {
    
    
    
    this.password = password;
  }


  public CapabilitiesUpdateObject profile(ProfileSettingObject profile) {
    
    
    
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProfileSettingObject getProfile() {
    return profile;
  }


  public void setProfile(ProfileSettingObject profile) {
    
    
    
    this.profile = profile;
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
   * @return the CapabilitiesUpdateObject instance itself
   */
  public CapabilitiesUpdateObject putAdditionalProperty(String key, Object value) {
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
    CapabilitiesUpdateObject capabilitiesUpdateObject = (CapabilitiesUpdateObject) o;
    return Objects.equals(this.lifecycleDeactivate, capabilitiesUpdateObject.lifecycleDeactivate) &&
        Objects.equals(this.password, capabilitiesUpdateObject.password) &&
        Objects.equals(this.profile, capabilitiesUpdateObject.profile)&&
        Objects.equals(this.additionalProperties, capabilitiesUpdateObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleDeactivate, password, profile, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilitiesUpdateObject {\n");
    sb.append("    lifecycleDeactivate: ").append(toIndentedString(lifecycleDeactivate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
    openapiFields.add("lifecycleDeactivate");
    openapiFields.add("password");
    openapiFields.add("profile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CapabilitiesUpdateObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CapabilitiesUpdateObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CapabilitiesUpdateObject is not found in the empty JSON string", CapabilitiesUpdateObject.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `lifecycleDeactivate`
      if (jsonObj.get("lifecycleDeactivate") != null && !jsonObj.get("lifecycleDeactivate").isJsonNull()) {
        LifecycleDeactivateSettingObject.validateJsonObject(jsonObj.getAsJsonObject("lifecycleDeactivate"));
      }
      // validate the optional field `password`
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) {
        PasswordSettingObject.validateJsonObject(jsonObj.getAsJsonObject("password"));
      }
      // validate the optional field `profile`
      if (jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) {
        ProfileSettingObject.validateJsonObject(jsonObj.getAsJsonObject("profile"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CapabilitiesUpdateObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CapabilitiesUpdateObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CapabilitiesUpdateObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CapabilitiesUpdateObject.class));

       return (TypeAdapter<T>) new TypeAdapter<CapabilitiesUpdateObject>() {
           @Override
           public void write(JsonWriter out, CapabilitiesUpdateObject value) throws IOException {
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
           public CapabilitiesUpdateObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CapabilitiesUpdateObject instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CapabilitiesUpdateObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CapabilitiesUpdateObject
  * @throws IOException if the JSON string is invalid with respect to CapabilitiesUpdateObject
  */
  public static CapabilitiesUpdateObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CapabilitiesUpdateObject.class);
  }

 /**
  * Convert an instance of CapabilitiesUpdateObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

