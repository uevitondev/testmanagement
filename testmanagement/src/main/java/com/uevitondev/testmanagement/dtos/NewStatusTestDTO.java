package com.uevitondev.testmanagement.dtos;

import com.uevitondev.testmanagement.entities.StatusTest;

import java.io.Serializable;
import java.time.Instant;

public class NewStatusTestDTO implements Serializable {
    private String status;
    private Instant instant;
    private Long time;
    private Long testCaseId;

    public NewStatusTestDTO() {

    }

    public NewStatusTestDTO(String status, Instant instant, Long time, Long testCaseId) {
        this.status = status;
        this.instant = instant;
        this.time = time;
        this.testCaseId = testCaseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
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
