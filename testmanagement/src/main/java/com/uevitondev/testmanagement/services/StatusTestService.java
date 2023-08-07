package com.uevitondev.testmanagement.services;

import com.uevitondev.testmanagement.dtos.NewStatusTestDTO;
import com.uevitondev.testmanagement.dtos.StatusTestDTO;
import com.uevitondev.testmanagement.entities.StatusTest;
import com.uevitondev.testmanagement.entities.TestCase;
import com.uevitondev.testmanagement.repositories.StatusTestRepository;
import com.uevitondev.testmanagement.repositories.TestCaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class StatusTestService {
    @Autowired
    private StatusTestRepository statusTestRepository;
    @Autowired
    private TestCaseRepository testCaseRepository;

    @Transactional
    public List<StatusTestDTO> getAll() {
        return statusTestRepository.findAll().stream().map(StatusTestDTO::new).toList();
    }

    @Transactional
    public StatusTestDTO insertStatusTest(NewStatusTestDTO dto) {

        TestCase testCase = testCaseRepository.findById(dto.getTestCaseId())
                .orElseThrow(() -> new RuntimeException("entity not found for id: " + dto.getTestCaseId()));
        StatusTest statusTest = new StatusTest();
        statusTest.setStatus(dto.getStatus());
        statusTest.setInstant(Instant.now());
        statusTest.setTime(dto.getTime());
        statusTest.setTestCase(testCase);

        statusTest = statusTestRepository.save(statusTest);

        return new StatusTestDTO(statusTest);
    }
}
