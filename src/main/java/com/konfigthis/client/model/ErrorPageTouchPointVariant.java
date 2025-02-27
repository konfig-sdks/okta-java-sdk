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
 * Gets or Sets ErrorPageTouchPointVariant
 */
@JsonAdapter(ErrorPageTouchPointVariant.Adapter.class)public enum ErrorPageTouchPointVariant {
  
  OKTA_DEFAULT("OKTA_DEFAULT"),
  
  BACKGROUND_SECONDARY_COLOR("BACKGROUND_SECONDARY_COLOR"),
  
  BACKGROUND_IMAGE("BACKGROUND_IMAGE");

  private String value;

  ErrorPageTouchPointVariant(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorPageTouchPointVariant fromValue(String value) {
    for (ErrorPageTouchPointVariant b : ErrorPageTouchPointVariant.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ErrorPageTouchPointVariant> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorPageTouchPointVariant enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorPageTouchPointVariant read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorPageTouchPointVariant.fromValue(value);
    }
  }
}

