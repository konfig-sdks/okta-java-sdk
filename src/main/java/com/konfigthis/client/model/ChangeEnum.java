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
 * Gets or Sets ChangeEnum
 */
@JsonAdapter(ChangeEnum.Adapter.class)public enum ChangeEnum {
  
  KEEP_EXISTING("KEEP_EXISTING"),
  
  CHANGE("CHANGE");

  private String value;

  ChangeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChangeEnum fromValue(String value) {
    for (ChangeEnum b : ChangeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ChangeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChangeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChangeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChangeEnum.fromValue(value);
    }
  }
}

