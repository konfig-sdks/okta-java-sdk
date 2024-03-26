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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

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
 * VerifyUserFactorResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VerifyUserFactorResponse {
  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private Map<String, Object> embedded = null;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Object> links = null;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  /**
   * Gets or Sets factorResult
   */
  @JsonAdapter(FactorResultEnum.Adapter.class)
 public enum FactorResultEnum {
    SUCCESS("SUCCESS"),
    
    EXPIRED("EXPIRED"),
    
    CHALLENGE("CHALLENGE"),
    
    WAITING("WAITING"),
    
    FAILED("FAILED"),
    
    REJECTED("REJECTED"),
    
    TIMEOUT("TIMEOUT"),
    
    TIME_WINDOW_EXCEEDED("TIME_WINDOW_EXCEEDED"),
    
    PASSCODE_REPLAYED("PASSCODE_REPLAYED"),
    
    ERROR("ERROR");

    private String value;

    FactorResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FactorResultEnum fromValue(String value) {
      for (FactorResultEnum b : FactorResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FactorResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FactorResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FactorResultEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FactorResultEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FACTOR_RESULT = "factorResult";
  @SerializedName(SERIALIZED_NAME_FACTOR_RESULT)
  private FactorResultEnum factorResult;

  public static final String SERIALIZED_NAME_FACTOR_RESULT_MESSAGE = "factorResultMessage";
  @SerializedName(SERIALIZED_NAME_FACTOR_RESULT_MESSAGE)
  private String factorResultMessage;

  public VerifyUserFactorResponse() {
  }

  
  public VerifyUserFactorResponse(
     Map<String, Object> embedded, 
     Map<String, Object> links, 
     OffsetDateTime expiresAt
  ) {
    this();
    this.embedded = embedded;
    this.links = links;
    this.expiresAt = expiresAt;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getEmbedded() {
    return embedded;
  }




   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getLinks() {
    return links;
  }




   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }




  public VerifyUserFactorResponse factorResult(FactorResultEnum factorResult) {
    
    
    
    
    this.factorResult = factorResult;
    return this;
  }

   /**
   * Get factorResult
   * @return factorResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FactorResultEnum getFactorResult() {
    return factorResult;
  }


  public void setFactorResult(FactorResultEnum factorResult) {
    
    
    
    this.factorResult = factorResult;
  }


  public VerifyUserFactorResponse factorResultMessage(String factorResultMessage) {
    
    
    
    
    this.factorResultMessage = factorResultMessage;
    return this;
  }

   /**
   * Get factorResultMessage
   * @return factorResultMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFactorResultMessage() {
    return factorResultMessage;
  }


  public void setFactorResultMessage(String factorResultMessage) {
    
    
    
    this.factorResultMessage = factorResultMessage;
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
   * @return the VerifyUserFactorResponse instance itself
   */
  public VerifyUserFactorResponse putAdditionalProperty(String key, Object value) {
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
    VerifyUserFactorResponse verifyUserFactorResponse = (VerifyUserFactorResponse) o;
    return Objects.equals(this.embedded, verifyUserFactorResponse.embedded) &&
        Objects.equals(this.links, verifyUserFactorResponse.links) &&
        Objects.equals(this.expiresAt, verifyUserFactorResponse.expiresAt) &&
        Objects.equals(this.factorResult, verifyUserFactorResponse.factorResult) &&
        Objects.equals(this.factorResultMessage, verifyUserFactorResponse.factorResultMessage)&&
        Objects.equals(this.additionalProperties, verifyUserFactorResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links, expiresAt, factorResult, factorResultMessage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyUserFactorResponse {\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    factorResult: ").append(toIndentedString(factorResult)).append("\n");
    sb.append("    factorResultMessage: ").append(toIndentedString(factorResultMessage)).append("\n");
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
    openapiFields.add("_embedded");
    openapiFields.add("_links");
    openapiFields.add("expiresAt");
    openapiFields.add("factorResult");
    openapiFields.add("factorResultMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerifyUserFactorResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerifyUserFactorResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifyUserFactorResponse is not found in the empty JSON string", VerifyUserFactorResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("factorResult") != null && !jsonObj.get("factorResult").isJsonNull()) && !jsonObj.get("factorResult").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `factorResult` to be a primitive type in the JSON string but got `%s`", jsonObj.get("factorResult").toString()));
      }
      if ((jsonObj.get("factorResultMessage") != null && !jsonObj.get("factorResultMessage").isJsonNull()) && !jsonObj.get("factorResultMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `factorResultMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("factorResultMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerifyUserFactorResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyUserFactorResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyUserFactorResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyUserFactorResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyUserFactorResponse>() {
           @Override
           public void write(JsonWriter out, VerifyUserFactorResponse value) throws IOException {
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
           public VerifyUserFactorResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VerifyUserFactorResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VerifyUserFactorResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifyUserFactorResponse
  * @throws IOException if the JSON string is invalid with respect to VerifyUserFactorResponse
  */
  public static VerifyUserFactorResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyUserFactorResponse.class);
  }

 /**
  * Convert an instance of VerifyUserFactorResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

