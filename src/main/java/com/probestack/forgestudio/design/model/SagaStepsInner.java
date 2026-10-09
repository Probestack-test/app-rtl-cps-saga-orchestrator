package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SagaStepsInner
 */
@JsonTypeName("Saga_steps_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")public class SagaStepsInner {

  private Integer stepNumber;

  private String stepName;

  private String serviceName;

  private Boolean hasCompensation;

  private Integer timeoutSeconds;

  public SagaStepsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SagaStepsInner(Integer stepNumber, String stepName, String serviceName) {
    this.stepNumber = stepNumber;
    this.stepName = stepName;
    this.serviceName = serviceName;
  }

  public SagaStepsInner stepNumber(Integer stepNumber) {
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

  public SagaStepsInner stepName(String stepName) {
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

  public SagaStepsInner serviceName(String serviceName) {
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

  public SagaStepsInner hasCompensation(Boolean hasCompensation) {
    this.hasCompensation = hasCompensation;
    return this;
  }

  /**
   * Get hasCompensation
   * @return hasCompensation
  */
    @Schema(name = "hasCompensation", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasCompensation")
  public Boolean getHasCompensation() {
    return hasCompensation;
  }

  public void setHasCompensation(Boolean hasCompensation) {
    this.hasCompensation = hasCompensation;
  }

  public SagaStepsInner timeoutSeconds(Integer timeoutSeconds) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SagaStepsInner sagaStepsInner = (SagaStepsInner) o;
    return Objects.equals(this.stepNumber, sagaStepsInner.stepNumber) &&
        Objects.equals(this.stepName, sagaStepsInner.stepName) &&
        Objects.equals(this.serviceName, sagaStepsInner.serviceName) &&
        Objects.equals(this.hasCompensation, sagaStepsInner.hasCompensation) &&
        Objects.equals(this.timeoutSeconds, sagaStepsInner.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepNumber, stepName, serviceName, hasCompensation, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SagaStepsInner {\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    hasCompensation: ").append(toIndentedString(hasCompensation)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

