package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CancelSagaExecutionRequest
 */
@JsonTypeName("cancelSagaExecution_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")public class CancelSagaExecutionRequest {

  private String reason;

  private Boolean compensateCompletedSteps = true;

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

  public CancelSagaExecutionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CancelSagaExecutionRequest(String reason) {
    this.reason = reason;
  }

  public CancelSagaExecutionRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the cancellation (min 15 chars).
   * @return reason
  */
  @NotNull @Size(min = 15)   @Schema(name = "reason", example = "Customer requested order cancellation before shipment.", description = "Reason for the cancellation (min 15 chars).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CancelSagaExecutionRequest compensateCompletedSteps(Boolean compensateCompletedSteps) {
    this.compensateCompletedSteps = compensateCompletedSteps;
    return this;
  }

  /**
   * If true, run compensation for completed steps.
   * @return compensateCompletedSteps
  */
    @Schema(name = "compensateCompletedSteps", example = "true", description = "If true, run compensation for completed steps.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compensateCompletedSteps")
  public Boolean getCompensateCompletedSteps() {
    return compensateCompletedSteps;
  }

  public void setCompensateCompletedSteps(Boolean compensateCompletedSteps) {
    this.compensateCompletedSteps = compensateCompletedSteps;
  }

  public CancelSagaExecutionRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public CancelSagaExecutionRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Channels to notify of the cancellation.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", description = "Channels to notify of the cancellation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CancelSagaExecutionRequest cancelSagaExecutionRequest = (CancelSagaExecutionRequest) o;
    return Objects.equals(this.reason, cancelSagaExecutionRequest.reason) &&
        Objects.equals(this.compensateCompletedSteps, cancelSagaExecutionRequest.compensateCompletedSteps) &&
        Objects.equals(this.notifyChannels, cancelSagaExecutionRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, compensateCompletedSteps, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelSagaExecutionRequest {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    compensateCompletedSteps: ").append(toIndentedString(compensateCompletedSteps)).append("\n");
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

