package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.CreateSagaRequestStepsInner;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateSagaRequest
 */
@JsonTypeName("createSaga_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")public class CreateSagaRequest {

  private String sagaName;

  private String description;

  @Valid
  private List<@Valid CreateSagaRequestStepsInner> steps = new ArrayList<>();

  /**
   * How to handle step failures.
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

  public CreateSagaRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSagaRequest(String sagaName, String description, List<@Valid CreateSagaRequestStepsInner> steps, FailurePolicyEnum failurePolicy) {
    this.sagaName = sagaName;
    this.description = description;
    this.steps = steps;
    this.failurePolicy = failurePolicy;
  }

  public CreateSagaRequest sagaName(String sagaName) {
    this.sagaName = sagaName;
    return this;
  }

  /**
   * Unique name for the saga.
   * @return sagaName
  */
  @NotNull   @Schema(name = "sagaName", example = "order-to-cash-flow", description = "Unique name for the saga.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sagaName")
  public String getSagaName() {
    return sagaName;
  }

  public void setSagaName(String sagaName) {
    this.sagaName = sagaName;
  }

  public CreateSagaRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * What business process this saga represents.
   * @return description
  */
  @NotNull   @Schema(name = "description", example = "Complete order fulfillment across payment, inventory, and shipping.", description = "What business process this saga represents.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateSagaRequest steps(List<@Valid CreateSagaRequestStepsInner> steps) {
    this.steps = steps;
    return this;
  }

  public CreateSagaRequest addStepsItem(CreateSagaRequestStepsInner stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Ordered list of saga steps. Each step needs a forward action and a compensation.
   * @return steps
  */
  @NotNull @Valid   @Schema(name = "steps", description = "Ordered list of saga steps. Each step needs a forward action and a compensation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("steps")
  public List<@Valid CreateSagaRequestStepsInner> getSteps() {
    return steps;
  }

  public void setSteps(List<@Valid CreateSagaRequestStepsInner> steps) {
    this.steps = steps;
  }

  public CreateSagaRequest failurePolicy(FailurePolicyEnum failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

  /**
   * How to handle step failures.
   * @return failurePolicy
  */
  @NotNull   @Schema(name = "failurePolicy", example = "COMPENSATE_ALL", description = "How to handle step failures.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("failurePolicy")
  public FailurePolicyEnum getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(FailurePolicyEnum failurePolicy) {
    this.failurePolicy = failurePolicy;
  }

  public CreateSagaRequest maxTotalDurationSeconds(Integer maxTotalDurationSeconds) {
    this.maxTotalDurationSeconds = maxTotalDurationSeconds;
    return this;
  }

  /**
   * Saga-level timeout.
   * @return maxTotalDurationSeconds
  */
    @Schema(name = "maxTotalDurationSeconds", example = "300", description = "Saga-level timeout.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTotalDurationSeconds")
  public Integer getMaxTotalDurationSeconds() {
    return maxTotalDurationSeconds;
  }

  public void setMaxTotalDurationSeconds(Integer maxTotalDurationSeconds) {
    this.maxTotalDurationSeconds = maxTotalDurationSeconds;
  }

  public CreateSagaRequest owner(String owner) {
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

  public CreateSagaRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public CreateSagaRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Channels to notify on saga failures.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", description = "Channels to notify on saga failures.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSagaRequest createSagaRequest = (CreateSagaRequest) o;
    return Objects.equals(this.sagaName, createSagaRequest.sagaName) &&
        Objects.equals(this.description, createSagaRequest.description) &&
        Objects.equals(this.steps, createSagaRequest.steps) &&
        Objects.equals(this.failurePolicy, createSagaRequest.failurePolicy) &&
        Objects.equals(this.maxTotalDurationSeconds, createSagaRequest.maxTotalDurationSeconds) &&
        Objects.equals(this.owner, createSagaRequest.owner) &&
        Objects.equals(this.notifyChannels, createSagaRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sagaName, description, steps, failurePolicy, maxTotalDurationSeconds, owner, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSagaRequest {\n");
    sb.append("    sagaName: ").append(toIndentedString(sagaName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    maxTotalDurationSeconds: ").append(toIndentedString(maxTotalDurationSeconds)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
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

