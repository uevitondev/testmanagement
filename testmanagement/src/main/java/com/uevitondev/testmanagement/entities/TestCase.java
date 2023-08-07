package com.uevitondev.testmanagement.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_testcase")
public class TestCase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stepsActions;
    private String stepsData;
    private String stepsResult;
    private String type;
    @OneToMany
    @JoinColumn(name = "testcase_id")
    List<StatusTest> statusTests = new ArrayList<>();

    public TestCase() {

    }

    public TestCase(Long id, String stepsActions, String stepsData, String stepsResult, String type) {
        this.id = id;
        this.stepsActions = stepsActions;
        this.stepsData = stepsData;
        this.stepsResult = stepsResult;
        this.type = type;
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

    public List<StatusTest> getStatusTests() {
        return statusTests;
    }

    public void setStatusTests(List<StatusTest> statusTests) {
        this.statusTests = statusTests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestCase testCase = (TestCase) o;
        return Objects.equals(id, testCase.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
