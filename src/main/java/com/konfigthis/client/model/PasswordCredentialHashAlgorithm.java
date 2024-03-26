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
 * Gets or Sets PasswordCredentialHashAlgorithm
 */
@JsonAdapter(PasswordCredentialHashAlgorithm.Adapter.class)public enum PasswordCredentialHashAlgorithm {
  
  BCRYPT("BCRYPT"),
  
  SHA_512("SHA-512"),
  
  SHA_256("SHA-256"),
  
  SHA_1("SHA-1"),
  
  MD5("MD5");

  private String value;

  PasswordCredentialHashAlgorithm(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PasswordCredentialHashAlgorithm fromValue(String value) {
    for (PasswordCredentialHashAlgorithm b : PasswordCredentialHashAlgorithm.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PasswordCredentialHashAlgorithm> {
    @Override
    public void write(final JsonWriter jsonWriter, final PasswordCredentialHashAlgorithm enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PasswordCredentialHashAlgorithm read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PasswordCredentialHashAlgorithm.fromValue(value);
    }
  }
}

