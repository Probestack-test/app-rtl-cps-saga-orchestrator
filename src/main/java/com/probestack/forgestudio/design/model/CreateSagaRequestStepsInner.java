package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.probestack.forgestudio.design.model.CreateSagaRequestStepsInnerCompensationAction;
import com.probestack.forgestudio.design.model.CreateSagaRequestStepsInnerForwardAction;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateSagaRequestStepsInner
 */
@JsonTypeName("createSaga_request_steps_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")public class CreateSagaRequestStepsInner {

  private Integer stepNumber;

  private String stepName;

  private String serviceName;

  private CreateSagaRequestStepsInnerForwardAction forwardAction;

  private CreateSagaRequestStepsInnerCompensationAction compensationAction;

  @Valid
  private Map<String, String> outputMapping = new HashMap<>();

  public CreateSagaRequestStepsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSagaRequestStepsInner(Integer stepNumber, String stepName, String serviceName, CreateSagaRequestStepsInnerForwardAction forwardAction, CreateSagaRequestStepsInnerCompensationAction compensationAction) {
    this.stepNumber = stepNumber;
    this.stepName = stepName;
    this.serviceName = serviceName;
    this.forwardAction = forwardAction;
    this.compensationAction = compensationAction;
  }

  public CreateSagaRequestStepsInner stepNumber(Integer stepNumber) {
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

  public CreateSagaRequestStepsInner stepName(String stepName) {
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

  public CreateSagaRequestStepsInner serviceName(String serviceName) {
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

  public CreateSagaRequestStepsInner forwardAction(CreateSagaRequestStepsInnerForwardAction forwardAction) {
    this.forwardAction = forwardAction;
    return this;
  }

  /**
   * Get forwardAction
   * @return forwardAction
  */
  @NotNull @Valid   @Schema(name = "forwardAction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("forwardAction")
  public CreateSagaRequestStepsInnerForwardAction getForwardAction() {
    return forwardAction;
  }

  public void setForwardAction(CreateSagaRequestStepsInnerForwardAction forwardAction) {
    this.forwardAction = forwardAction;
  }

  public CreateSagaRequestStepsInner compensationAction(CreateSagaRequestStepsInnerCompensationAction compensationAction) {
    this.compensationAction = compensationAction;
    return this;
  }

  /**
   * Get compensationAction
   * @return compensationAction
  */
  @NotNull @Valid   @Schema(name = "compensationAction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("compensationAction")
  public CreateSagaRequestStepsInnerCompensationAction getCompensationAction() {
    return compensationAction;
  }

  public void setCompensationAction(CreateSagaRequestStepsInnerCompensationAction compensationAction) {
    this.compensationAction = compensationAction;
  }

  public CreateSagaRequestStepsInner outputMapping(Map<String, String> outputMapping) {
    this.outputMapping = outputMapping;
    return this;
  }

  public CreateSagaRequestStepsInner putOutputMappingItem(String key, String outputMappingItem) {
    if (this.outputMapping == null) {
      this.outputMapping = new HashMap<>();
    }
    this.outputMapping.put(key, outputMappingItem);
    return this;
  }

  /**
   * Extract values from the response for use in later steps.
   * @return outputMapping
  */
    @Schema(name = "outputMapping", example = "{\"reservationId\":\"$.id\"}", description = "Extract values from the response for use in later steps.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outputMapping")
  public Map<String, String> getOutputMapping() {
    return outputMapping;
  }

  public void setOutputMapping(Map<String, String> outputMapping) {
    this.outputMapping = outputMapping;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSagaRequestStepsInner createSagaRequestStepsInner = (CreateSagaRequestStepsInner) o;
    return Objects.equals(this.stepNumber, createSagaRequestStepsInner.stepNumber) &&
        Objects.equals(this.stepName, createSagaRequestStepsInner.stepName) &&
        Objects.equals(this.serviceName, createSagaRequestStepsInner.serviceName) &&
        Objects.equals(this.forwardAction, createSagaRequestStepsInner.forwardAction) &&
        Objects.equals(this.compensationAction, createSagaRequestStepsInner.compensationAction) &&
        Objects.equals(this.outputMapping, createSagaRequestStepsInner.outputMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepNumber, stepName, serviceName, forwardAction, compensationAction, outputMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSagaRequestStepsInner {\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    forwardAction: ").append(toIndentedString(forwardAction)).append("\n");
    sb.append("    compensationAction: ").append(toIndentedString(compensationAction)).append("\n");
    sb.append("    outputMapping: ").append(toIndentedString(outputMapping)).append("\n");
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

