package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StartSagaExecutionRequest
 */
@JsonTypeName("startSagaExecution_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")public class StartSagaExecutionRequest {

  private String sagaName;

  @Valid
  private Map<String, Object> input = new HashMap<>();

  private String idempotencyKey;

  /**
   * Gets or Sets priority
   */
  public enum PriorityEnum {
    LOW("LOW"),
    
    NORMAL("NORMAL"),
    
    HIGH("HIGH"),
    
    URGENT("URGENT");

    private String value;

    PriorityEnum(String value) {
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
    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private PriorityEnum priority = PriorityEnum.NORMAL;

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

  public StartSagaExecutionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StartSagaExecutionRequest(String sagaName, Map<String, Object> input, String idempotencyKey) {
    this.sagaName = sagaName;
    this.input = input;
    this.idempotencyKey = idempotencyKey;
  }

  public StartSagaExecutionRequest sagaName(String sagaName) {
    this.sagaName = sagaName;
    return this;
  }

  /**
   * Name of the saga to execute.
   * @return sagaName
  */
  @NotNull   @Schema(name = "sagaName", example = "order-to-cash-flow", description = "Name of the saga to execute.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sagaName")
  public String getSagaName() {
    return sagaName;
  }

  public void setSagaName(String sagaName) {
    this.sagaName = sagaName;
  }

  public StartSagaExecutionRequest input(Map<String, Object> input) {
    this.input = input;
    return this;
  }

  public StartSagaExecutionRequest putInputItem(String key, Object inputItem) {
    if (this.input == null) {
      this.input = new HashMap<>();
    }
    this.input.put(key, inputItem);
    return this;
  }

  /**
   * Input context for the saga.
   * @return input
  */
  @NotNull   @Schema(name = "input", example = "{\"orderId\":\"ORD-12345\",\"sku\":\"SKU-ABC\",\"quantity\":2,\"customerId\":\"CUST-789\",\"amount\":149.99}", description = "Input context for the saga.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("input")
  public Map<String, Object> getInput() {
    return input;
  }

  public void setInput(Map<String, Object> input) {
    this.input = input;
  }

  public StartSagaExecutionRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

  /**
   * Client-generated key to prevent duplicate executions.
   * @return idempotencyKey
  */
  @NotNull   @Schema(name = "idempotencyKey", example = "order-ORD-12345-2026-10-09", description = "Client-generated key to prevent duplicate executions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idempotencyKey")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public StartSagaExecutionRequest priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
    @Schema(name = "priority", example = "HIGH", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  public StartSagaExecutionRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public StartSagaExecutionRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Channels to notify on completion or failure.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", description = "Channels to notify on completion or failure.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    StartSagaExecutionRequest startSagaExecutionRequest = (StartSagaExecutionRequest) o;
    return Objects.equals(this.sagaName, startSagaExecutionRequest.sagaName) &&
        Objects.equals(this.input, startSagaExecutionRequest.input) &&
        Objects.equals(this.idempotencyKey, startSagaExecutionRequest.idempotencyKey) &&
        Objects.equals(this.priority, startSagaExecutionRequest.priority) &&
        Objects.equals(this.notifyChannels, startSagaExecutionRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sagaName, input, idempotencyKey, priority, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartSagaExecutionRequest {\n");
    sb.append("    sagaName: ").append(toIndentedString(sagaName)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

