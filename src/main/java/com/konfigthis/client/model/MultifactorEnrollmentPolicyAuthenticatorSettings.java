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
import com.konfigthis.client.model.MultifactorEnrollmentPolicyAuthenticatorSettingsConstraints;
import com.konfigthis.client.model.MultifactorEnrollmentPolicyAuthenticatorSettingsEnroll;
import com.konfigthis.client.model.MultifactorEnrollmentPolicyAuthenticatorType;
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
 * MultifactorEnrollmentPolicyAuthenticatorSettings
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MultifactorEnrollmentPolicyAuthenticatorSettings {
  public static final String SERIALIZED_NAME_CONSTRAINTS = "constraints";
  @SerializedName(SERIALIZED_NAME_CONSTRAINTS)
  private MultifactorEnrollmentPolicyAuthenticatorSettingsConstraints constraints;

  public static final String SERIALIZED_NAME_ENROLL = "enroll";
  @SerializedName(SERIALIZED_NAME_ENROLL)
  private MultifactorEnrollmentPolicyAuthenticatorSettingsEnroll enroll;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private MultifactorEnrollmentPolicyAuthenticatorType key;

  public MultifactorEnrollmentPolicyAuthenticatorSettings() {
  }

  public MultifactorEnrollmentPolicyAuthenticatorSettings constraints(MultifactorEnrollmentPolicyAuthenticatorSettingsConstraints constraints) {
    
    
    
    
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultifactorEnrollmentPolicyAuthenticatorSettingsConstraints getConstraints() {
    return constraints;
  }


  public void setConstraints(MultifactorEnrollmentPolicyAuthenticatorSettingsConstraints constraints) {
    
    
    
    this.constraints = constraints;
  }


  public MultifactorEnrollmentPolicyAuthenticatorSettings enroll(MultifactorEnrollmentPolicyAuthenticatorSettingsEnroll enroll) {
    
    
    
    
    this.enroll = enroll;
    return this;
  }

   /**
   * Get enroll
   * @return enroll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultifactorEnrollmentPolicyAuthenticatorSettingsEnroll getEnroll() {
    return enroll;
  }


  public void setEnroll(MultifactorEnrollmentPolicyAuthenticatorSettingsEnroll enroll) {
    
    
    
    this.enroll = enroll;
  }


  public MultifactorEnrollmentPolicyAuthenticatorSettings key(MultifactorEnrollmentPolicyAuthenticatorType key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultifactorEnrollmentPolicyAuthenticatorType getKey() {
    return key;
  }


  public void setKey(MultifactorEnrollmentPolicyAuthenticatorType key) {
    
    
    
    this.key = key;
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
   * @return the MultifactorEnrollmentPolicyAuthenticatorSettings instance itself
   */
  public MultifactorEnrollmentPolicyAuthenticatorSettings putAdditionalProperty(String key, Object value) {
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
    MultifactorEnrollmentPolicyAuthenticatorSettings multifactorEnrollmentPolicyAuthenticatorSettings = (MultifactorEnrollmentPolicyAuthenticatorSettings) o;
    return Objects.equals(this.constraints, multifactorEnrollmentPolicyAuthenticatorSettings.constraints) &&
        Objects.equals(this.enroll, multifactorEnrollmentPolicyAuthenticatorSettings.enroll) &&
        Objects.equals(this.key, multifactorEnrollmentPolicyAuthenticatorSettings.key)&&
        Objects.equals(this.additionalProperties, multifactorEnrollmentPolicyAuthenticatorSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraints, enroll, key, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultifactorEnrollmentPolicyAuthenticatorSettings {\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    enroll: ").append(toIndentedString(enroll)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("constraints");
    openapiFields.add("enroll");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MultifactorEnrollmentPolicyAuthenticatorSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MultifactorEnrollmentPolicyAuthenticatorSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultifactorEnrollmentPolicyAuthenticatorSettings is not found in the empty JSON string", MultifactorEnrollmentPolicyAuthenticatorSettings.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `constraints`
      if (jsonObj.get("constraints") != null && !jsonObj.get("constraints").isJsonNull()) {
        MultifactorEnrollmentPolicyAuthenticatorSettingsConstraints.validateJsonObject(jsonObj.getAsJsonObject("constraints"));
      }
      // validate the optional field `enroll`
      if (jsonObj.get("enroll") != null && !jsonObj.get("enroll").isJsonNull()) {
        MultifactorEnrollmentPolicyAuthenticatorSettingsEnroll.validateJsonObject(jsonObj.getAsJsonObject("enroll"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultifactorEnrollmentPolicyAuthenticatorSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultifactorEnrollmentPolicyAuthenticatorSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultifactorEnrollmentPolicyAuthenticatorSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultifactorEnrollmentPolicyAuthenticatorSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<MultifactorEnrollmentPolicyAuthenticatorSettings>() {
           @Override
           public void write(JsonWriter out, MultifactorEnrollmentPolicyAuthenticatorSettings value) throws IOException {
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
           public MultifactorEnrollmentPolicyAuthenticatorSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MultifactorEnrollmentPolicyAuthenticatorSettings instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MultifactorEnrollmentPolicyAuthenticatorSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultifactorEnrollmentPolicyAuthenticatorSettings
  * @throws IOException if the JSON string is invalid with respect to MultifactorEnrollmentPolicyAuthenticatorSettings
  */
  public static MultifactorEnrollmentPolicyAuthenticatorSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultifactorEnrollmentPolicyAuthenticatorSettings.class);
  }

 /**
  * Convert an instance of MultifactorEnrollmentPolicyAuthenticatorSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

