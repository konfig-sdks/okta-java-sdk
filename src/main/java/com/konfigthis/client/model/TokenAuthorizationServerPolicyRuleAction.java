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
import com.konfigthis.client.model.TokenAuthorizationServerPolicyRuleActionInlineHook;
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
 * TokenAuthorizationServerPolicyRuleAction
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TokenAuthorizationServerPolicyRuleAction {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN_LIFETIME_MINUTES = "accessTokenLifetimeMinutes";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_LIFETIME_MINUTES)
  private Integer accessTokenLifetimeMinutes;

  public static final String SERIALIZED_NAME_INLINE_HOOK = "inlineHook";
  @SerializedName(SERIALIZED_NAME_INLINE_HOOK)
  private TokenAuthorizationServerPolicyRuleActionInlineHook inlineHook;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN_LIFETIME_MINUTES = "refreshTokenLifetimeMinutes";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN_LIFETIME_MINUTES)
  private Integer refreshTokenLifetimeMinutes;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN_WINDOW_MINUTES = "refreshTokenWindowMinutes";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN_WINDOW_MINUTES)
  private Integer refreshTokenWindowMinutes;

  public TokenAuthorizationServerPolicyRuleAction() {
  }

  public TokenAuthorizationServerPolicyRuleAction accessTokenLifetimeMinutes(Integer accessTokenLifetimeMinutes) {
    
    
    
    
    this.accessTokenLifetimeMinutes = accessTokenLifetimeMinutes;
    return this;
  }

   /**
   * Get accessTokenLifetimeMinutes
   * @return accessTokenLifetimeMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAccessTokenLifetimeMinutes() {
    return accessTokenLifetimeMinutes;
  }


  public void setAccessTokenLifetimeMinutes(Integer accessTokenLifetimeMinutes) {
    
    
    
    this.accessTokenLifetimeMinutes = accessTokenLifetimeMinutes;
  }


  public TokenAuthorizationServerPolicyRuleAction inlineHook(TokenAuthorizationServerPolicyRuleActionInlineHook inlineHook) {
    
    
    
    
    this.inlineHook = inlineHook;
    return this;
  }

   /**
   * Get inlineHook
   * @return inlineHook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TokenAuthorizationServerPolicyRuleActionInlineHook getInlineHook() {
    return inlineHook;
  }


  public void setInlineHook(TokenAuthorizationServerPolicyRuleActionInlineHook inlineHook) {
    
    
    
    this.inlineHook = inlineHook;
  }


  public TokenAuthorizationServerPolicyRuleAction refreshTokenLifetimeMinutes(Integer refreshTokenLifetimeMinutes) {
    
    
    
    
    this.refreshTokenLifetimeMinutes = refreshTokenLifetimeMinutes;
    return this;
  }

   /**
   * Get refreshTokenLifetimeMinutes
   * @return refreshTokenLifetimeMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRefreshTokenLifetimeMinutes() {
    return refreshTokenLifetimeMinutes;
  }


  public void setRefreshTokenLifetimeMinutes(Integer refreshTokenLifetimeMinutes) {
    
    
    
    this.refreshTokenLifetimeMinutes = refreshTokenLifetimeMinutes;
  }


  public TokenAuthorizationServerPolicyRuleAction refreshTokenWindowMinutes(Integer refreshTokenWindowMinutes) {
    
    
    
    
    this.refreshTokenWindowMinutes = refreshTokenWindowMinutes;
    return this;
  }

   /**
   * Get refreshTokenWindowMinutes
   * @return refreshTokenWindowMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRefreshTokenWindowMinutes() {
    return refreshTokenWindowMinutes;
  }


  public void setRefreshTokenWindowMinutes(Integer refreshTokenWindowMinutes) {
    
    
    
    this.refreshTokenWindowMinutes = refreshTokenWindowMinutes;
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
   * @return the TokenAuthorizationServerPolicyRuleAction instance itself
   */
  public TokenAuthorizationServerPolicyRuleAction putAdditionalProperty(String key, Object value) {
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
    TokenAuthorizationServerPolicyRuleAction tokenAuthorizationServerPolicyRuleAction = (TokenAuthorizationServerPolicyRuleAction) o;
    return Objects.equals(this.accessTokenLifetimeMinutes, tokenAuthorizationServerPolicyRuleAction.accessTokenLifetimeMinutes) &&
        Objects.equals(this.inlineHook, tokenAuthorizationServerPolicyRuleAction.inlineHook) &&
        Objects.equals(this.refreshTokenLifetimeMinutes, tokenAuthorizationServerPolicyRuleAction.refreshTokenLifetimeMinutes) &&
        Objects.equals(this.refreshTokenWindowMinutes, tokenAuthorizationServerPolicyRuleAction.refreshTokenWindowMinutes)&&
        Objects.equals(this.additionalProperties, tokenAuthorizationServerPolicyRuleAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenLifetimeMinutes, inlineHook, refreshTokenLifetimeMinutes, refreshTokenWindowMinutes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenAuthorizationServerPolicyRuleAction {\n");
    sb.append("    accessTokenLifetimeMinutes: ").append(toIndentedString(accessTokenLifetimeMinutes)).append("\n");
    sb.append("    inlineHook: ").append(toIndentedString(inlineHook)).append("\n");
    sb.append("    refreshTokenLifetimeMinutes: ").append(toIndentedString(refreshTokenLifetimeMinutes)).append("\n");
    sb.append("    refreshTokenWindowMinutes: ").append(toIndentedString(refreshTokenWindowMinutes)).append("\n");
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
    openapiFields.add("accessTokenLifetimeMinutes");
    openapiFields.add("inlineHook");
    openapiFields.add("refreshTokenLifetimeMinutes");
    openapiFields.add("refreshTokenWindowMinutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokenAuthorizationServerPolicyRuleAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TokenAuthorizationServerPolicyRuleAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenAuthorizationServerPolicyRuleAction is not found in the empty JSON string", TokenAuthorizationServerPolicyRuleAction.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `inlineHook`
      if (jsonObj.get("inlineHook") != null && !jsonObj.get("inlineHook").isJsonNull()) {
        TokenAuthorizationServerPolicyRuleActionInlineHook.validateJsonObject(jsonObj.getAsJsonObject("inlineHook"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenAuthorizationServerPolicyRuleAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenAuthorizationServerPolicyRuleAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenAuthorizationServerPolicyRuleAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenAuthorizationServerPolicyRuleAction.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenAuthorizationServerPolicyRuleAction>() {
           @Override
           public void write(JsonWriter out, TokenAuthorizationServerPolicyRuleAction value) throws IOException {
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
           public TokenAuthorizationServerPolicyRuleAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TokenAuthorizationServerPolicyRuleAction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TokenAuthorizationServerPolicyRuleAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenAuthorizationServerPolicyRuleAction
  * @throws IOException if the JSON string is invalid with respect to TokenAuthorizationServerPolicyRuleAction
  */
  public static TokenAuthorizationServerPolicyRuleAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenAuthorizationServerPolicyRuleAction.class);
  }

 /**
  * Convert an instance of TokenAuthorizationServerPolicyRuleAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

