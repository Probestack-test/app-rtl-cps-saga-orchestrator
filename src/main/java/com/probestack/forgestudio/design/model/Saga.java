package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.SagaStepsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Saga
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")public class Saga {

  private UUID sagaId;

  private String sagaName;

  private String description;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    PAUSED("PAUSED"),
    
    DEPRECATED("DEPRECATED"),
    
    ARCHIVED("ARCHIVED");

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

  @Valid
  private List<@Valid SagaStepsInner> steps = new ArrayList<>();

  /**
   * Gets or Sets failurePolicy
   */
  public enum FailurePolicyEnum {
    COMPENSATE_ALL("COMPENSATE_ALL"),
    
    COMPENSATE_FAILED_STEP("COMPENSATE_FAILED_STEP"),
    
    RETRY_THEN_COMPENSATE("RETRY_THEN_COMPENSATE"),
    
    ABORT_NO_COMPENSATION("ABORT_NO_COMPENSATION");

    private String value;

    FailurePolicyEnum(String value) {
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
    public static FailurePolicyEnum fromValue(String value) {
      for (FailurePolicyEnum b : FailurePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private FailurePolicyEnum failurePolicy;

  private Integer maxTotalDurationSeconds;

  private String owner;

  /**
   * Gets or Sets notifyChannels
   */
  public enum NotifyChannelsEnum {
    EMAIL("EMAIL"),
    
    SLACK("SLACK"),
    
    PAGERDUTY("PAGERDUTY"),
    
    WEBHOOK("WEBHOOK");

    private String value;

    NotifyChannelsEnum(String value) {
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
    public static NotifyChannelsEnum fromValue(String value) {
      for (NotifyChannelsEnum b : NotifyChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @Valid
  private List<NotifyChannelsEnum> notifyChannels;

  private Integer executionCount30d;

  private Double successRatePercent;

  private Integer averageDurationSeconds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public Saga() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Saga(UUID sagaId, String sagaName, String description, StatusEnum status, List<@Valid SagaStepsInner> steps, FailurePolicyEnum failurePolicy, OffsetDateTime createdAt) {
    this.sagaId = sagaId;
    this.sagaName = sagaName;
    this.description = description;
    this.status = status;
    this.steps = steps;
    this.failurePolicy = failurePolicy;
    this.createdAt = createdAt;
  }

  public Saga sagaId(UUID sagaId) {
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

  public Saga sagaName(String sagaName) {
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

  public Saga description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull   @Schema(name = "description", example = "Complete order fulfillment across payment, inventory, and shipping.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Saga status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "ACTIVE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Saga steps(List<@Valid SagaStepsInner> steps) {
    this.steps = steps;
    return this;
  }

  public Saga addStepsItem(SagaStepsInner stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Get steps
   * @return steps
  */
  @NotNull @Valid   @Schema(name = "steps", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("steps")
  public List<@Valid SagaStepsInner> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid SagaStepsInner> steps) {
    this.steps = steps;
  }

  public Saga failurePolicy(FailurePolicyEnum failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

  /**
   * Get failurePolicy
   * @return failurePolicy
  */
  @NotNull   @Schema(name = "failurePolicy", example = "COMPENSATE_ALL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("failurePolicy")
  public FailurePolicyEnum getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(FailurePolicyEnum failurePolicy) {
    this.failurePolicy = failurePolicy;
  }

  public Saga maxTotalDurationSeconds(Integer maxTotalDurationSeconds) {
    this.maxTotalDurationSeconds = maxTotalDurationSeconds;
    return this;
  }

  /**
   * Get maxTotalDurationSeconds
   * @return maxTotalDurationSeconds
  */
    @Schema(name = "maxTotalDurationSeconds", example = "300", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTotalDurationSeconds")
  public Integer getMaxTotalDurationSeconds() {
    return maxTotalDurationSeconds;
  }

  public void setMaxTotalDurationSeconds(Integer maxTotalDurationSeconds) {
    this.maxTotalDurationSeconds = maxTotalDurationSeconds;
  }

  public Saga owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
    @Schema(name = "owner", example = "commerce-team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Saga notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public Saga addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Get notifyChannels
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }

  public Saga executionCount30d(Integer executionCount30d) {
    this.executionCount30d = executionCount30d;
    return this;
  }

  /**
   * Get executionCount30d
   * @return executionCount30d
  */
    @Schema(name = "executionCount30d", example = "4520", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionCount30d")
  public Integer getExecutionCount30d() {
    return executionCount30d;
  }

  public void setExecutionCount30d(Integer executionCount30d) {
    this.executionCount30d = executionCount30d;
  }

  public Saga successRatePercent(Double successRatePercent) {
    this.successRatePercent = successRatePercent;
    return this;
  }

  /**
   * Get successRatePercent
   * @return successRatePercent
  */
    @Schema(name = "successRatePercent", example = "98.7", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successRatePercent")
  public Double getSuccessRatePercent() {
    return successRatePercent;
  }

  public void setSuccessRatePercent(Double successRatePercent) {
    this.successRatePercent = successRatePercent;
  }

  public Saga averageDurationSeconds(Integer averageDurationSeconds) {
    this.averageDurationSeconds = averageDurationSeconds;
    return this;
  }

  /**
   * Get averageDurationSeconds
   * @return averageDurationSeconds
  */
    @Schema(name = "averageDurationSeconds", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageDurationSeconds")
  public Integer getAverageDurationSeconds() {
    return averageDurationSeconds;
  }

  public void setAverageDurationSeconds(Integer averageDurationSeconds) {
    this.averageDurationSeconds = averageDurationSeconds;
  }

  public Saga createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Saga updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid   @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Saga saga = (Saga) o;
    return Objects.equals(this.sagaId, saga.sagaId) &&
        Objects.equals(this.sagaName, saga.sagaName) &&
        Objects.equals(this.description, saga.description) &&
        Objects.equals(this.status, saga.status) &&
        Objects.equals(this.steps, saga.steps) &&
        Objects.equals(this.failurePolicy, saga.failurePolicy) &&
        Objects.equals(this.maxTotalDurationSeconds, saga.maxTotalDurationSeconds) &&
        Objects.equals(this.owner, saga.owner) &&
        Objects.equals(this.notifyChannels, saga.notifyChannels) &&
        Objects.equals(this.executionCount30d, saga.executionCount30d) &&
        Objects.equals(this.successRatePercent, saga.successRatePercent) &&
        Objects.equals(this.averageDurationSeconds, saga.averageDurationSeconds) &&
        Objects.equals(this.createdAt, saga.createdAt) &&
        Objects.equals(this.updatedAt, saga.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sagaId, sagaName, description, status, steps, failurePolicy, maxTotalDurationSeconds, owner, notifyChannels, executionCount30d, successRatePercent, averageDurationSeconds, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Saga {\n");
    sb.append("    sagaId: ").append(toIndentedString(sagaId)).append("\n");
    sb.append("    sagaName: ").append(toIndentedString(sagaName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    maxTotalDurationSeconds: ").append(toIndentedString(maxTotalDurationSeconds)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
    sb.append("    executionCount30d: ").append(toIndentedString(executionCount30d)).append("\n");
    sb.append("    successRatePercent: ").append(toIndentedString(successRatePercent)).append("\n");
    sb.append("    averageDurationSeconds: ").append(toIndentedString(averageDurationSeconds)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

