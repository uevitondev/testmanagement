package com.uevitondev.testmanagement.dtos;

import com.uevitondev.testmanagement.entities.StatusTest;
import com.uevitondev.testmanagement.entities.TestCase;

import java.io.Serializable;
import java.time.Instant;

public class StatusTestDTO implements Serializable {
    private Long id;
    private String status;
    private Instant instant;
    private Long time;
    private Long testCaseId;

    public StatusTestDTO() {

    }

    public StatusTestDTO(Long id, String status, Instant instant, Long time, Long testCaseId) {
        this.id = id;
        this.status = status;
        this.instant = instant;
        this.time = time;
        this.testCaseId = testCaseId;
    }

    public StatusTestDTO(StatusTest statusTest) {
        this.id = statusTest.getId();
        this.status = statusTest.getStatus();
        this.instant = statusTest.getInstant();
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
