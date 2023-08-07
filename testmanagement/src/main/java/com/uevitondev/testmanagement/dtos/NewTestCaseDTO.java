package com.uevitondev.testmanagement.dtos;

import com.uevitondev.testmanagement.entities.StatusTest;
import com.uevitondev.testmanagement.entities.TestCase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NewTestCaseDTO implements Serializable {
    private String stepsActions;
    private String stepsData;
    private String stepsResult;
    private String type;

    public NewTestCaseDTO() {

    }

    public NewTestCaseDTO(String stepsActions, String stepsData, String stepsResult, String type) {
        this.stepsActions = stepsActions;
        this.stepsData = stepsData;
        this.stepsResult = stepsResult;
        this.type = type;
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
}
