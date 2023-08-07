package com.uevitondev.testmanagement.dtos;

import java.io.Serializable;

public class NewStatusTestDTO implements Serializable {
    private String status;
    private String date;
    private Long time;
    private Long testCaseId;

    public NewStatusTestDTO() {

    }

    public NewStatusTestDTO(String status, String date, Long time, Long testCaseId) {
        this.status = status;
        this.date = date;
        this.time = time;
        this.testCaseId = testCaseId;
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
