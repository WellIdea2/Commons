package org.commons.feature.shared.utils;

import com.google.gson.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GsonWrapper {

  Gson gson = new GsonBuilder()
      .registerTypeAdapter(
          LocalDate.class,
          (JsonDeserializer<LocalDate>) (json, typeOfT, context) -> LocalDate.parse(
              json.getAsString(), DateTimeFormatter.ISO_LOCAL_DATE))
      .registerTypeAdapter(
          LocalDate.class,
          (JsonSerializer<LocalDate>) (src, typeOfSrc, context) -> new JsonPrimitive(
              src.format(DateTimeFormatter.ISO_LOCAL_DATE)))
      .create();

  public String toJson(Object src) {
    return gson.toJson(src);
  }

  public <T> T fromJson(String json, Class<T> classOfT) {
    return gson.fromJson(json, classOfT);
  }
}