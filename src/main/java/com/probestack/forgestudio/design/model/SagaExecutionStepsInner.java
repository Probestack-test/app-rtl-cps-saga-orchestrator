package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SagaExecutionStepsInner
 */
@JsonTypeName("SagaExecution_steps_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")public class SagaExecutionStepsInner {

  private Integer stepNumber;

  private String stepName;

  private String serviceName;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    RUNNING("RUNNING"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED"),
    
    COMPENSATING("COMPENSATING"),
    
    COMPENSATED("COMPENSATED"),
    
    SKIPPED("SKIPPED"),
    
    TIMED_OUT("TIMED_OUT");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private Integer durationMs;

  private Integer attempts;

  private String requestUrl;

  private Integer responseStatus;

  @Valid
  private Map<String, Object> responseBody = new HashMap<>();

  private String error;

  /**
   * Gets or Sets compensationStatus
   */
  public enum CompensationStatusEnum {
    NOT_REQUIRED("NOT_REQUIRED"),
    
    PENDING("PENDING"),
    
    RUNNING("RUNNING"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED"),
    
    NOT_ATTEMPTED("NOT_ATTEMPTED");

    private String value;

    CompensationStatusEnum(String value) {
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
    public static CompensationStatusEnum fromValue(String value) {
      for (CompensationStatusEnum b : CompensationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CompensationStatusEnum compensationStatus;

  private Integer compensationDurationMs;

  private String compensationError;

  public SagaExecutionStepsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SagaExecutionStepsInner(Integer stepNumber, String stepName, String serviceName, StatusEnum status) {
    this.stepNumber = stepNumber;
    this.stepName = stepName;
    this.serviceName = serviceName;
    this.status = status;
  }

  public SagaExecutionStepsInner stepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
    return this;
  }

  /**
   * Get stepNumber
   * @return stepNumber
  */
  @NotNull   @Schema(name = "stepNumber", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stepNumber")
  public Integer getStepNumber() {
    return stepNumber;
  }

  public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }

  public SagaExecutionStepsInner stepName(String stepName) {
    this.stepName = stepName;
    return this;
  }

  /**
   * Get stepName
   * @return stepName
  */
  @NotNull   @Schema(name = "stepName", example = "reserve-inventory", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stepName")
  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) {
    this.stepName = stepName;
  }

  public SagaExecutionStepsInner serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  @NotNull   @Schema(name = "serviceName", example = "inventory-service", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public SagaExecutionStepsInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "COMPLETED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public SagaExecutionStepsInner startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
  @Valid   @Schema(name = "startedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startedAt")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public SagaExecutionStepsInner completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
  @Valid   @Schema(name = "completedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAt")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public SagaExecutionStepsInner durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * Get durationMs
   * @return durationMs
  */
    @Schema(name = "durationMs", example = "245", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationMs")
  public Integer getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }

  public SagaExecutionStepsInner attempts(Integer attempts) {
    this.attempts = attempts;
    return this;
  }

  /**
   * Get attempts
   * @return attempts
  */
    @Schema(name = "attempts", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attempts")
  public Integer getAttempts() {
    return attempts;
  }

  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }

  public SagaExecutionStepsInner requestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
    return this;
  }

  /**
   * Get requestUrl
   * @return requestUrl
  */
    @Schema(name = "requestUrl", example = "https://inventory-service.internal/v1/reservations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestUrl")
  public String getRequestUrl() {
    return requestUrl;
  }

  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }

  public SagaExecutionStepsInner responseStatus(Integer responseStatus) {
    this.responseStatus = responseStatus;
    return this;
  }

  /**
   * Get responseStatus
   * @return responseStatus
  */
    @Schema(name = "responseStatus", example = "201", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseStatus")
  public Integer getResponseStatus() {
    return responseStatus;
  }

  public void setResponseStatus(Integer responseStatus) {
    this.responseStatus = responseStatus;
  }

  public SagaExecutionStepsInner responseBody(Map<String, Object> responseBody) {
    this.responseBody = responseBody;
    return this;
  }

  public SagaExecutionStepsInner putResponseBodyItem(String key, Object responseBodyItem) {
    if (this.responseBody == null) {
      this.responseBody = new HashMap<>();
    }
    this.responseBody.put(key, responseBodyItem);
    return this;
  }

  /**
   * Get responseBody
   * @return responseBody
  */
    @Schema(name = "responseBody", example = "{\"reservationId\":\"RES-98765\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseBody")
  public Map<String, Object> getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(Map<String, Object> responseBody) {
    this.responseBody = responseBody;
  }

  public SagaExecutionStepsInner error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
    @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SagaExecutionStepsInner compensationStatus(CompensationStatusEnum compensationStatus) {
    this.compensationStatus = compensationStatus;
    return this;
  }

  /**
   * Get compensationStatus
   * @return compensationStatus
  */
    @Schema(name = "compensationStatus", example = "NOT_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compensationStatus")
  public CompensationStatusEnum getCompensationStatus() {
    return compensationStatus;
  }

  public void setCompensationStatus(CompensationStatusEnum compensationStatus) {
    this.compensationStatus = compensationStatus;
  }

  public SagaExecutionStepsInner compensationDurationMs(Integer compensationDurationMs) {
    this.compensationDurationMs = compensationDurationMs;
    return this;
  }

  /**
   * Get compensationDurationMs
   * @return compensationDurationMs
  */
    @Schema(name = "compensationDurationMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compensationDurationMs")
  public Integer getCompensationDurationMs() {
    return compensationDurationMs;
  }

  public void setCompensationDurationMs(Integer compensationDurationMs) {
    this.compensationDurationMs = compensationDurationMs;
  }

  public SagaExecutionStepsInner compensationError(String compensationError) {
    this.compensationError = compensationError;
    return this;
  }

  /**
   * Get compensationError
   * @return compensationError
  */
    @Schema(name = "compensationError", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compensationError")
  public String getCompensationError() {
    return compensationError;
  }

  public void setCompensationError(String compensationError) {
    this.compensationError = compensationError;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SagaExecutionStepsInner sagaExecutionStepsInner = (SagaExecutionStepsInner) o;
    return Objects.equals(this.stepNumber, sagaExecutionStepsInner.stepNumber) &&
        Objects.equals(this.stepName, sagaExecutionStepsInner.stepName) &&
        Objects.equals(this.serviceName, sagaExecutionStepsInner.serviceName) &&
        Objects.equals(this.status, sagaExecutionStepsInner.status) &&
        Objects.equals(this.startedAt, sagaExecutionStepsInner.startedAt) &&
        Objects.equals(this.completedAt, sagaExecutionStepsInner.completedAt) &&
        Objects.equals(this.durationMs, sagaExecutionStepsInner.durationMs) &&
        Objects.equals(this.attempts, sagaExecutionStepsInner.attempts) &&
        Objects.equals(this.requestUrl, sagaExecutionStepsInner.requestUrl) &&
        Objects.equals(this.responseStatus, sagaExecutionStepsInner.responseStatus) &&
        Objects.equals(this.responseBody, sagaExecutionStepsInner.responseBody) &&
        Objects.equals(this.error, sagaExecutionStepsInner.error) &&
        Objects.equals(this.compensationStatus, sagaExecutionStepsInner.compensationStatus) &&
        Objects.equals(this.compensationDurationMs, sagaExecutionStepsInner.compensationDurationMs) &&
        Objects.equals(this.compensationError, sagaExecutionStepsInner.compensationError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepNumber, stepName, serviceName, status, startedAt, completedAt, durationMs, attempts, requestUrl, responseStatus, responseBody, error, compensationStatus, compensationDurationMs, compensationError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SagaExecutionStepsInner {\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    compensationStatus: ").append(toIndentedString(compensationStatus)).append("\n");
    sb.append("    compensationDurationMs: ").append(toIndentedString(compensationDurationMs)).append("\n");
    sb.append("    compensationError: ").append(toIndentedString(compensationError)).append("\n");
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

