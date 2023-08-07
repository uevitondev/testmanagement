package com.uevitondev.testmanagement.dtos;

import com.uevitondev.testmanagement.entities.StatusTest;

import java.io.Serializable;

public class StatusTestDTO implements Serializable {
    private Long id;
    private String status;
    private String date;
    private Long time;
    private Long testCaseId;

    public StatusTestDTO() {

    }

    public StatusTestDTO(Long id, String status, String date, Long time, Long testCaseId) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.time = time;
        this.testCaseId = testCaseId;
    }

    public StatusTestDTO(StatusTest statusTest) {
        this.id = statusTest.getId();
        this.status = statusTest.getStatus();
        this.date = statusTest.getDate();
        this.time = statusTest.getTime();
        this.testCaseId = statusTest.getTestCase().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(Long testCaseId) {
        this.testCaseId = testCaseId;
    }
}
