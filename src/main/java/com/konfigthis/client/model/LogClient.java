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
import com.konfigthis.client.model.LogGeographicalContext;
import com.konfigthis.client.model.LogUserAgent;
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
 * LogClient
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LogClient {
  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_GEOGRAPHICAL_CONTEXT = "geographicalContext";
  @SerializedName(SERIALIZED_NAME_GEOGRAPHICAL_CONTEXT)
  private LogGeographicalContext geographicalContext;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_USER_AGENT = "userAgent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private LogUserAgent userAgent;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private String zone;

  public LogClient() {
  }

  
  public LogClient(
     String device, 
     String id, 
     String ipAddress, 
     String zone
  ) {
    this();
    this.device = device;
    this.id = id;
    this.ipAddress = ipAddress;
    this.zone = zone;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDevice() {
    return device;
  }




  public LogClient geographicalContext(LogGeographicalContext geographicalContext) {
    
    
    
    
    this.geographicalContext = geographicalContext;
    return this;
  }

   /**
   * Get geographicalContext
   * @return geographicalContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LogGeographicalContext getGeographicalContext() {
    return geographicalContext;
  }


  public void setGeographicalContext(LogGeographicalContext geographicalContext) {
    
    
    
    this.geographicalContext = geographicalContext;
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
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }




  public LogClient userAgent(LogUserAgent userAgent) {
    
    
    
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LogUserAgent getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(LogUserAgent userAgent) {
    
    
    
    this.userAgent = userAgent;
  }


   /**
   * Get zone
   * @return zone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZone() {
    return zone;
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
   * @return the LogClient instance itself
   */
  public LogClient putAdditionalProperty(String key, Object value) {
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
    LogClient logClient = (LogClient) o;
    return Objects.equals(this.device, logClient.device) &&
        Objects.equals(this.geographicalContext, logClient.geographicalContext) &&
        Objects.equals(this.id, logClient.id) &&
        Objects.equals(this.ipAddress, logClient.ipAddress) &&
        Objects.equals(this.userAgent, logClient.userAgent) &&
        Objects.equals(this.zone, logClient.zone)&&
        Objects.equals(this.additionalProperties, logClient.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, geographicalContext, id, ipAddress, userAgent, zone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogClient {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    geographicalContext: ").append(toIndentedString(geographicalContext)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
    openapiFields.add("device");
    openapiFields.add("geographicalContext");
    openapiFields.add("id");
    openapiFields.add("ipAddress");
    openapiFields.add("userAgent");
    openapiFields.add("zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LogClient
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LogClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogClient is not found in the empty JSON string", LogClient.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      // validate the optional field `geographicalContext`
      if (jsonObj.get("geographicalContext") != null && !jsonObj.get("geographicalContext").isJsonNull()) {
        LogGeographicalContext.validateJsonObject(jsonObj.getAsJsonObject("geographicalContext"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      // validate the optional field `userAgent`
      if (jsonObj.get("userAgent") != null && !jsonObj.get("userAgent").isJsonNull()) {
        LogUserAgent.validateJsonObject(jsonObj.getAsJsonObject("userAgent"));
      }
      if ((jsonObj.get("zone") != null && !jsonObj.get("zone").isJsonNull()) && !jsonObj.get("zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogClient.class));

       return (TypeAdapter<T>) new TypeAdapter<LogClient>() {
           @Override
           public void write(JsonWriter out, LogClient value) throws IOException {
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
           public LogClient read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LogClient instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LogClient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogClient
  * @throws IOException if the JSON string is invalid with respect to LogClient
  */
  public static LogClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogClient.class);
  }

 /**
  * Convert an instance of LogClient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

