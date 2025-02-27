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
import com.konfigthis.client.model.CatalogApplicationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * CatalogApplication
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CatalogApplication {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, Object> links = null;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<String> features = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIGN_ON_MODES = "signOnModes";
  @SerializedName(SERIALIZED_NAME_SIGN_ON_MODES)
  private List<String> signOnModes = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CatalogApplicationStatus status;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verificationStatus";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private String verificationStatus;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public CatalogApplication() {
  }

  
  public CatalogApplication(
     Map<String, Object> links, 
     String id, 
     OffsetDateTime lastUpdated
  ) {
    this();
    this.links = links;
    this.id = id;
    this.lastUpdated = lastUpdated;
  }

  public CatalogApplication description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
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




  public CatalogApplication category(String category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    
    
    
    this.category = category;
  }


  public CatalogApplication displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public CatalogApplication features(List<String> features) {
    
    
    
    
    this.features = features;
    return this;
  }

  public CatalogApplication addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFeatures() {
    return features;
  }


  public void setFeatures(List<String> features) {
    
    
    
    this.features = features;
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
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }




  public CatalogApplication name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CatalogApplication signOnModes(List<String> signOnModes) {
    
    
    
    
    this.signOnModes = signOnModes;
    return this;
  }

  public CatalogApplication addSignOnModesItem(String signOnModesItem) {
    if (this.signOnModes == null) {
      this.signOnModes = new ArrayList<>();
    }
    this.signOnModes.add(signOnModesItem);
    return this;
  }

   /**
   * Get signOnModes
   * @return signOnModes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSignOnModes() {
    return signOnModes;
  }


  public void setSignOnModes(List<String> signOnModes) {
    
    
    
    this.signOnModes = signOnModes;
  }


  public CatalogApplication status(CatalogApplicationStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogApplicationStatus getStatus() {
    return status;
  }


  public void setStatus(CatalogApplicationStatus status) {
    
    
    
    this.status = status;
  }


  public CatalogApplication verificationStatus(String verificationStatus) {
    
    
    
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(String verificationStatus) {
    
    
    
    this.verificationStatus = verificationStatus;
  }


  public CatalogApplication website(String website) {
    
    
    
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    
    
    
    this.website = website;
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
   * @return the CatalogApplication instance itself
   */
  public CatalogApplication putAdditionalProperty(String key, Object value) {
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
    CatalogApplication catalogApplication = (CatalogApplication) o;
    return Objects.equals(this.description, catalogApplication.description) &&
        Objects.equals(this.links, catalogApplication.links) &&
        Objects.equals(this.category, catalogApplication.category) &&
        Objects.equals(this.displayName, catalogApplication.displayName) &&
        Objects.equals(this.features, catalogApplication.features) &&
        Objects.equals(this.id, catalogApplication.id) &&
        Objects.equals(this.lastUpdated, catalogApplication.lastUpdated) &&
        Objects.equals(this.name, catalogApplication.name) &&
        Objects.equals(this.signOnModes, catalogApplication.signOnModes) &&
        Objects.equals(this.status, catalogApplication.status) &&
        Objects.equals(this.verificationStatus, catalogApplication.verificationStatus) &&
        Objects.equals(this.website, catalogApplication.website)&&
        Objects.equals(this.additionalProperties, catalogApplication.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, links, category, displayName, features, id, lastUpdated, name, signOnModes, status, verificationStatus, website, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogApplication {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signOnModes: ").append(toIndentedString(signOnModes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("_links");
    openapiFields.add("category");
    openapiFields.add("displayName");
    openapiFields.add("features");
    openapiFields.add("id");
    openapiFields.add("lastUpdated");
    openapiFields.add("name");
    openapiFields.add("signOnModes");
    openapiFields.add("status");
    openapiFields.add("verificationStatus");
    openapiFields.add("website");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogApplication
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogApplication.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogApplication is not found in the empty JSON string", CatalogApplication.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("signOnModes") != null && !jsonObj.get("signOnModes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `signOnModes` to be an array in the JSON string but got `%s`", jsonObj.get("signOnModes").toString()));
      }
      if ((jsonObj.get("verificationStatus") != null && !jsonObj.get("verificationStatus").isJsonNull()) && !jsonObj.get("verificationStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verificationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationStatus").toString()));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogApplication.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogApplication' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogApplication> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogApplication.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogApplication>() {
           @Override
           public void write(JsonWriter out, CatalogApplication value) throws IOException {
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
           public CatalogApplication read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CatalogApplication instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CatalogApplication given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogApplication
  * @throws IOException if the JSON string is invalid with respect to CatalogApplication
  */
  public static CatalogApplication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogApplication.class);
  }

 /**
  * Convert an instance of CatalogApplication to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

