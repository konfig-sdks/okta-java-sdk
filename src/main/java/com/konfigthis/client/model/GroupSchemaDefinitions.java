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
import com.konfigthis.client.model.GroupSchemaBase;
import com.konfigthis.client.model.GroupSchemaCustom;
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
 * GroupSchemaDefinitions
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GroupSchemaDefinitions {
  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private GroupSchemaBase base;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private GroupSchemaCustom custom;

  public GroupSchemaDefinitions() {
  }

  public GroupSchemaDefinitions base(GroupSchemaBase base) {
    
    
    
    
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupSchemaBase getBase() {
    return base;
  }


  public void setBase(GroupSchemaBase base) {
    
    
    
    this.base = base;
  }


  public GroupSchemaDefinitions custom(GroupSchemaCustom custom) {
    
    
    
    
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupSchemaCustom getCustom() {
    return custom;
  }


  public void setCustom(GroupSchemaCustom custom) {
    
    
    
    this.custom = custom;
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
   * @return the GroupSchemaDefinitions instance itself
   */
  public GroupSchemaDefinitions putAdditionalProperty(String key, Object value) {
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
    GroupSchemaDefinitions groupSchemaDefinitions = (GroupSchemaDefinitions) o;
    return Objects.equals(this.base, groupSchemaDefinitions.base) &&
        Objects.equals(this.custom, groupSchemaDefinitions.custom)&&
        Objects.equals(this.additionalProperties, groupSchemaDefinitions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, custom, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupSchemaDefinitions {\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
    openapiFields.add("base");
    openapiFields.add("custom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupSchemaDefinitions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupSchemaDefinitions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupSchemaDefinitions is not found in the empty JSON string", GroupSchemaDefinitions.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `base`
      if (jsonObj.get("base") != null && !jsonObj.get("base").isJsonNull()) {
        GroupSchemaBase.validateJsonObject(jsonObj.getAsJsonObject("base"));
      }
      // validate the optional field `custom`
      if (jsonObj.get("custom") != null && !jsonObj.get("custom").isJsonNull()) {
        GroupSchemaCustom.validateJsonObject(jsonObj.getAsJsonObject("custom"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupSchemaDefinitions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupSchemaDefinitions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupSchemaDefinitions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupSchemaDefinitions.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupSchemaDefinitions>() {
           @Override
           public void write(JsonWriter out, GroupSchemaDefinitions value) throws IOException {
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
           public GroupSchemaDefinitions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupSchemaDefinitions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupSchemaDefinitions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupSchemaDefinitions
  * @throws IOException if the JSON string is invalid with respect to GroupSchemaDefinitions
  */
  public static GroupSchemaDefinitions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupSchemaDefinitions.class);
  }

 /**
  * Convert an instance of GroupSchemaDefinitions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

