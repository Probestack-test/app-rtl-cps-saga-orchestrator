package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.SagaExecutionStepsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SagaExecution
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")public class SagaExecution {

  private UUID executionId;

  private UUID sagaId;

  private String sagaName;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    RUNNING("RUNNING"),
    
    COMPLETED("COMPLETED"),
    
    COMPENSATING("COMPENSATING"),
    
    COMPENSATED("COMPENSATED"),
    
    FAILED("FAILED"),
    
    CANCELLED("CANCELLED"),
    
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

  private String idempotencyKey;

  @Valid
  private Map<String, Object> input = new HashMap<>();

  private Integer currentStep;

  private Integer totalSteps;

  private Integer progressPercent;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private Integer durationSeconds;

  @Valid
  private List<@Valid SagaExecutionStepsInner> steps = new ArrayList<>();

  @Valid
  private Map<String, Object> outputContext = new HashMap<>();

  private String failureReason;

  private String cancellationReason;

  private String auditReference;

  public SagaExecution() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SagaExecution(UUID executionId, UUID sagaId, String sagaName, StatusEnum status, OffsetDateTime startedAt, List<@Valid SagaExecutionStepsInner> steps) {
    this.executionId = executionId;
    this.sagaId = sagaId;
    this.sagaName = sagaName;
    this.status = status;
    this.startedAt = startedAt;
    this.steps = steps;
  }

  public SagaExecution executionId(UUID executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Get executionId
   * @return executionId
  */
  @NotNull @Valid   @Schema(name = "executionId", example = "a1b2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("executionId")
  public UUID getExecutionId() {
    return executionId;
  }

  public void setExecutionId(UUID executionId) {
    this.executionId = executionId;
  }

  public SagaExecution sagaId(UUID sagaId) {
    this.sagaId = sagaId;
    return this;
  }

  /**
   * Get sagaId
   * @return sagaId
  */
  @NotNull @Valid   @Schema(name = "sagaId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sagaId")
  public UUID getSagaId() {
    return sagaId;
  }

  public void setSagaId(UUID sagaId) {
    this.sagaId = sagaId;
  }

  public SagaExecution sagaName(String sagaName) {
    this.sagaName = sagaName;
    return this;
  }

  /**
   * Get sagaName
   * @return sagaName
  */
  @NotNull   @Schema(name = "sagaName", example = "order-to-cash-flow", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sagaName")
  public String getSagaName() {
    return sagaName;
  }

  public void setSagaName(String sagaName) {
    this.sagaName = sagaName;
  }

  public SagaExecution status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "RUNNING", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public SagaExecution idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

  /**
   * Get idempotencyKey
   * @return idempotencyKey
  */
    @Schema(name = "idempotencyKey", example = "order-ORD-12345-2026-10-09", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idempotencyKey")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public SagaExecution input(Map<String, Object> input) {
    this.input = input;
    return this;
  }

  public SagaExecution putInputItem(String key, Object inputItem) {
    if (this.input == null) {
      this.input = new HashMap<>();
    }
    this.input.put(key, inputItem);
    return this;
  }

  /**
   * Get input
   * @return input
  */
    @Schema(name = "input", example = "{\"orderId\":\"ORD-12345\",\"sku\":\"SKU-ABC\",\"quantity\":2}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input")
  public Map<String, Object> getInput() {
    return input;
  }

  public void setInput(Map<String, Object> input) {
    this.input = input;
  }

  public SagaExecution currentStep(Integer currentStep) {
    this.currentStep = currentStep;
    return this;
  }

  /**
   * The step currently executing (1-indexed).
   * @return currentStep
  */
    @Schema(name = "currentStep", example = "2", description = "The step currently executing (1-indexed).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentStep")
  public Integer getCurrentStep() {
    return currentStep;
  }

  public void setCurrentStep(Integer currentStep) {
    this.currentStep = currentStep;
  }

  public SagaExecution totalSteps(Integer totalSteps) {
    this.totalSteps = totalSteps;
    return this;
  }

  /**
   * Get totalSteps
   * @return totalSteps
  */
    @Schema(name = "totalSteps", example = "4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalSteps")
  public Integer getTotalSteps() {
    return totalSteps;
  }

  public void setTotalSteps(Integer totalSteps) {
    this.totalSteps = totalSteps;
  }

  public SagaExecution progressPercent(Integer progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

  /**
   * Get progressPercent
   * @return progressPercent
  */
    @Schema(name = "progressPercent", example = "50", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressPercent")
  public Integer getProgressPercent() {
    return progressPercent;
  }

  public void setProgressPercent(Integer progressPercent) {
    this.progressPercent = progressPercent;
  }

  public SagaExecution startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
  @NotNull @Valid   @Schema(name = "startedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startedAt")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public SagaExecution completedAt(OffsetDateTime completedAt) {
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

  public SagaExecution durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * Get durationSeconds
   * @return durationSeconds
  */
    @Schema(name = "durationSeconds", example = "8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public SagaExecution steps(List<@Valid SagaExecutionStepsInner> steps) {
    this.steps = steps;
    return this;
  }

  public SagaExecution addStepsItem(SagaExecutionStepsInner stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Detailed state of each step.
   * @return steps
  */
  @NotNull @Valid   @Schema(name = "steps", description = "Detailed state of each step.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("steps")
  public List<@Valid SagaExecutionStepsInner> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid SagaExecutionStepsInner> steps) {
    this.steps = steps;
  }

  public SagaExecution outputContext(Map<String, Object> outputContext) {
    this.outputContext = outputContext;
    return this;
  }

  public SagaExecution putOutputContextItem(String key, Object outputContextItem) {
    if (this.outputContext == null) {
      this.outputContext = new HashMap<>();
    }
    this.outputContext.put(key, outputContextItem);
    return this;
  }

  /**
   * Accumulated outputs from completed steps.
   * @return outputContext
  */
    @Schema(name = "outputContext", example = "{\"reservationId\":\"RES-98765\",\"paymentId\":\"PAY-11111\"}", description = "Accumulated outputs from completed steps.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputContext")
  public Map<String, Object> getOutputContext() {
    return outputContext;
  }

  public void setOutputContext(Map<String, Object> outputContext) {
    this.outputContext = outputContext;
  }

  public SagaExecution failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
  */
    @Schema(name = "failureReason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  public SagaExecution cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Get cancellationReason
   * @return cancellationReason
  */
    @Schema(name = "cancellationReason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancellationReason")
  public String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public SagaExecution auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://saga-orchestrator/exec-a1b2c3d4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SagaExecution sagaExecution = (SagaExecution) o;
    return Objects.equals(this.executionId, sagaExecution.executionId) &&
        Objects.equals(this.sagaId, sagaExecution.sagaId) &&
        Objects.equals(this.sagaName, sagaExecution.sagaName) &&
        Objects.equals(this.status, sagaExecution.status) &&
        Objects.equals(this.idempotencyKey, sagaExecution.idempotencyKey) &&
        Objects.equals(this.input, sagaExecution.input) &&
        Objects.equals(this.currentStep, sagaExecution.currentStep) &&
        Objects.equals(this.totalSteps, sagaExecution.totalSteps) &&
        Objects.equals(this.progressPercent, sagaExecution.progressPercent) &&
        Objects.equals(this.startedAt, sagaExecution.startedAt) &&
        Objects.equals(this.completedAt, sagaExecution.completedAt) &&
        Objects.equals(this.durationSeconds, sagaExecution.durationSeconds) &&
        Objects.equals(this.steps, sagaExecution.steps) &&
        Objects.equals(this.outputContext, sagaExecution.outputContext) &&
        Objects.equals(this.failureReason, sagaExecution.failureReason) &&
        Objects.equals(this.cancellationReason, sagaExecution.cancellationReason) &&
        Objects.equals(this.auditReference, sagaExecution.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionId, sagaId, sagaName, status, idempotencyKey, input, currentStep, totalSteps, progressPercent, startedAt, completedAt, durationSeconds, steps, outputContext, failureReason, cancellationReason, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SagaExecution {\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    sagaId: ").append(toIndentedString(sagaId)).append("\n");
    sb.append("    sagaName: ").append(toIndentedString(sagaName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    currentStep: ").append(toIndentedString(currentStep)).append("\n");
    sb.append("    totalSteps: ").append(toIndentedString(totalSteps)).append("\n");
    sb.append("    progressPercent: ").append(toIndentedString(progressPercent)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    outputContext: ").append(toIndentedString(outputContext)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
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

