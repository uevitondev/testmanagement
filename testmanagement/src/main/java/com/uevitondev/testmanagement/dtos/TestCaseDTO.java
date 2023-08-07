package com.uevitondev.testmanagement.dtos;

import com.uevitondev.testmanagement.entities.StatusTest;
import com.uevitondev.testmanagement.entities.TestCase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TestCaseDTO implements Serializable {
    private Long id;
    private String stepsActions;
    private String stepsData;
    private String stepsResult;
    private String type;
    private List<StatusTestDTO> statusTestDTOS = new ArrayList<>();

    public TestCaseDTO() {

    }

    public TestCaseDTO(Long id, String stepsActions, String stepsData, String stepsResult, String type) {
        this.id = id;
        this.stepsActions = stepsActions;
        this.stepsData = stepsData;
        this.stepsResult = stepsResult;
        this.type = type;
    }

    public TestCaseDTO(TestCase testCase) {
        this.id = testCase.getId();
        this.stepsActions = testCase.getStepsActions();
        this.stepsData = testCase.getStepsData();
        this.stepsResult = testCase.getStepsResult();
        this.type = testCase.getType();
    }

    public TestCaseDTO(TestCase testCase, List<StatusTest> statusTests) {
        this.id = testCase.getId();
        this.stepsActions = testCase.getStepsActions();
        this.stepsData = testCase.getStepsData();
        this.stepsResult = testCase.getStepsResult();
        this.type = testCase.getType();
        for (StatusTest statusTest : statusTests) {
            this.statusTestDTOS.add(new StatusTestDTO(statusTest));
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStepsActions() {
        return stepsActions;
    }

    public void setStepsActions(String stepsActions) {
        this.stepsActions = stepsActions;
    }

    public String getStepsData() {
        return stepsData;
    }

    public void setStepsData(String stepsData) {
        this.stepsData = stepsData;
    }

    public String getStepsResult() {
        return stepsResult;
    }

    public void setStepsResult(String stepsResult) {
        this.stepsResult = stepsResult;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<StatusTestDTO> getStatusTestDTOS() {
        return statusTestDTOS;
    }

    public void setStatusTestDTOS(List<StatusTestDTO> statusTestDTOS) {
        this.statusTestDTOS = statusTestDTOS;
    }
}
