package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateSagaRequestStepsInnerForwardAction
 */
@JsonTypeName("createSaga_request_steps_inner_forwardAction")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")public class CreateSagaRequestStepsInnerForwardAction {

  /**
   * Gets or Sets method
   */
  public enum MethodEnum {
    POST("POST"),
    
    PUT("PUT"),
    
    PATCH("PATCH"),
    
    DELETE("DELETE");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private MethodEnum method;

  private String url;

  @Valid
  private Map<String, String> headers = new HashMap<>();

  @Valid
  private Map<String, Object> bodyTemplate = new HashMap<>();

  private Integer timeoutSeconds;

  private Integer retries;

  public CreateSagaRequestStepsInnerForwardAction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSagaRequestStepsInnerForwardAction(MethodEnum method, String url) {
    this.method = method;
    this.url = url;
  }

  public CreateSagaRequestStepsInnerForwardAction method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @NotNull   @Schema(name = "method", example = "POST", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public CreateSagaRequestStepsInnerForwardAction url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @NotNull   @Schema(name = "url", example = "https://inventory-service.internal/v1/reservations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CreateSagaRequestStepsInnerForwardAction headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public CreateSagaRequestStepsInnerForwardAction putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Get headers
   * @return headers
  */
    @Schema(name = "headers", example = "{\"Content-Type\":\"application/json\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public CreateSagaRequestStepsInnerForwardAction bodyTemplate(Map<String, Object> bodyTemplate) {
    this.bodyTemplate = bodyTemplate;
    return this;
  }

  public CreateSagaRequestStepsInnerForwardAction putBodyTemplateItem(String key, Object bodyTemplateItem) {
    if (this.bodyTemplate == null) {
      this.bodyTemplate = new HashMap<>();
    }
    this.bodyTemplate.put(key, bodyTemplateItem);
    return this;
  }

  /**
   * Get bodyTemplate
   * @return bodyTemplate
  */
    @Schema(name = "bodyTemplate", example = "{\"orderId\":\"${saga.input.orderId}\",\"sku\":\"${saga.input.sku}\",\"quantity\":\"${saga.input.quantity}\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bodyTemplate")
  public Map<String, Object> getBodyTemplate() {
    return bodyTemplate;
  }

  public void setBodyTemplate(Map<String, Object> bodyTemplate) {
    this.bodyTemplate = bodyTemplate;
  }

  public CreateSagaRequestStepsInnerForwardAction timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * Get timeoutSeconds
   * @return timeoutSeconds
  */
    @Schema(name = "timeoutSeconds", example = "30", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public CreateSagaRequestStepsInnerForwardAction retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * Get retries
   * @return retries
  */
    @Schema(name = "retries", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retries")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSagaRequestStepsInnerForwardAction createSagaRequestStepsInnerForwardAction = (CreateSagaRequestStepsInnerForwardAction) o;
    return Objects.equals(this.method, createSagaRequestStepsInnerForwardAction.method) &&
        Objects.equals(this.url, createSagaRequestStepsInnerForwardAction.url) &&
        Objects.equals(this.headers, createSagaRequestStepsInnerForwardAction.headers) &&
        Objects.equals(this.bodyTemplate, createSagaRequestStepsInnerForwardAction.bodyTemplate) &&
        Objects.equals(this.timeoutSeconds, createSagaRequestStepsInnerForwardAction.timeoutSeconds) &&
        Objects.equals(this.retries, createSagaRequestStepsInnerForwardAction.retries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, url, headers, bodyTemplate, timeoutSeconds, retries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSagaRequestStepsInnerForwardAction {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    bodyTemplate: ").append(toIndentedString(bodyTemplate)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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
}

