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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OpenIdConnectApplicationIssuerMode
 */
@JsonAdapter(OpenIdConnectApplicationIssuerMode.Adapter.class)public enum OpenIdConnectApplicationIssuerMode {
  
  CUSTOM_URL("CUSTOM_URL"),
  
  ORG_URL("ORG_URL"),
  
  DYNAMIC("DYNAMIC");

  private String value;

  OpenIdConnectApplicationIssuerMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OpenIdConnectApplicationIssuerMode fromValue(String value) {
    for (OpenIdConnectApplicationIssuerMode b : OpenIdConnectApplicationIssuerMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OpenIdConnectApplicationIssuerMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final OpenIdConnectApplicationIssuerMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OpenIdConnectApplicationIssuerMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OpenIdConnectApplicationIssuerMode.fromValue(value);
    }
  }
}

