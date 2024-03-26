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
 * OktaSignOnPolicyRuleSignonSessionActions
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OktaSignOnPolicyRuleSignonSessionActions {
  public static final String SERIALIZED_NAME_MAX_SESSION_IDLE_MINUTES = "maxSessionIdleMinutes";
  @SerializedName(SERIALIZED_NAME_MAX_SESSION_IDLE_MINUTES)
  private Integer maxSessionIdleMinutes = 120;

  public static final String SERIALIZED_NAME_MAX_SESSION_LIFETIME_MINUTES = "maxSessionLifetimeMinutes";
  @SerializedName(SERIALIZED_NAME_MAX_SESSION_LIFETIME_MINUTES)
  private Integer maxSessionLifetimeMinutes = 0;

  public static final String SERIALIZED_NAME_USE_PERSISTENT_COOKIE = "usePersistentCookie";
  @SerializedName(SERIALIZED_NAME_USE_PERSISTENT_COOKIE)
  private Boolean usePersistentCookie = false;

  public OktaSignOnPolicyRuleSignonSessionActions() {
  }

  public OktaSignOnPolicyRuleSignonSessionActions maxSessionIdleMinutes(Integer maxSessionIdleMinutes) {
    
    
    
    
    this.maxSessionIdleMinutes = maxSessionIdleMinutes;
    return this;
  }

   /**
   * Get maxSessionIdleMinutes
   * @return maxSessionIdleMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "")

  public Integer getMaxSessionIdleMinutes() {
    return maxSessionIdleMinutes;
  }


  public void setMaxSessionIdleMinutes(Integer maxSessionIdleMinutes) {
    
    
    
    this.maxSessionIdleMinutes = maxSessionIdleMinutes;
  }


  public OktaSignOnPolicyRuleSignonSessionActions maxSessionLifetimeMinutes(Integer maxSessionLifetimeMinutes) {
    
    
    
    
    this.maxSessionLifetimeMinutes = maxSessionLifetimeMinutes;
    return this;
  }

   /**
   * Get maxSessionLifetimeMinutes
   * @return maxSessionLifetimeMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getMaxSessionLifetimeMinutes() {
    return maxSessionLifetimeMinutes;
  }


  public void setMaxSessionLifetimeMinutes(Integer maxSessionLifetimeMinutes) {
    
    
    
    this.maxSessionLifetimeMinutes = maxSessionLifetimeMinutes;
  }


  public OktaSignOnPolicyRuleSignonSessionActions usePersistentCookie(Boolean usePersistentCookie) {
    
    
    
    
    this.usePersistentCookie = usePersistentCookie;
    return this;
  }

   /**
   * Get usePersistentCookie
   * @return usePersistentCookie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getUsePersistentCookie() {
    return usePersistentCookie;
  }


  public void setUsePersistentCookie(Boolean usePersistentCookie) {
    
    
    
    this.usePersistentCookie = usePersistentCookie;
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
   * @return the OktaSignOnPolicyRuleSignonSessionActions instance itself
   */
  public OktaSignOnPolicyRuleSignonSessionActions putAdditionalProperty(String key, Object value) {
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
    OktaSignOnPolicyRuleSignonSessionActions oktaSignOnPolicyRuleSignonSessionActions = (OktaSignOnPolicyRuleSignonSessionActions) o;
    return Objects.equals(this.maxSessionIdleMinutes, oktaSignOnPolicyRuleSignonSessionActions.maxSessionIdleMinutes) &&
        Objects.equals(this.maxSessionLifetimeMinutes, oktaSignOnPolicyRuleSignonSessionActions.maxSessionLifetimeMinutes) &&
        Objects.equals(this.usePersistentCookie, oktaSignOnPolicyRuleSignonSessionActions.usePersistentCookie)&&
        Objects.equals(this.additionalProperties, oktaSignOnPolicyRuleSignonSessionActions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSessionIdleMinutes, maxSessionLifetimeMinutes, usePersistentCookie, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OktaSignOnPolicyRuleSignonSessionActions {\n");
    sb.append("    maxSessionIdleMinutes: ").append(toIndentedString(maxSessionIdleMinutes)).append("\n");
    sb.append("    maxSessionLifetimeMinutes: ").append(toIndentedString(maxSessionLifetimeMinutes)).append("\n");
    sb.append("    usePersistentCookie: ").append(toIndentedString(usePersistentCookie)).append("\n");
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
    openapiFields.add("maxSessionIdleMinutes");
    openapiFields.add("maxSessionLifetimeMinutes");
    openapiFields.add("usePersistentCookie");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OktaSignOnPolicyRuleSignonSessionActions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OktaSignOnPolicyRuleSignonSessionActions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OktaSignOnPolicyRuleSignonSessionActions is not found in the empty JSON string", OktaSignOnPolicyRuleSignonSessionActions.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OktaSignOnPolicyRuleSignonSessionActions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OktaSignOnPolicyRuleSignonSessionActions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OktaSignOnPolicyRuleSignonSessionActions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OktaSignOnPolicyRuleSignonSessionActions.class));

       return (TypeAdapter<T>) new TypeAdapter<OktaSignOnPolicyRuleSignonSessionActions>() {
           @Override
           public void write(JsonWriter out, OktaSignOnPolicyRuleSignonSessionActions value) throws IOException {
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
           public OktaSignOnPolicyRuleSignonSessionActions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OktaSignOnPolicyRuleSignonSessionActions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OktaSignOnPolicyRuleSignonSessionActions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OktaSignOnPolicyRuleSignonSessionActions
  * @throws IOException if the JSON string is invalid with respect to OktaSignOnPolicyRuleSignonSessionActions
  */
  public static OktaSignOnPolicyRuleSignonSessionActions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OktaSignOnPolicyRuleSignonSessionActions.class);
  }

 /**
  * Convert an instance of OktaSignOnPolicyRuleSignonSessionActions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

