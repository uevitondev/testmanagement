package com.uevitondev.testmanagement.services;

import com.uevitondev.testmanagement.dtos.NewTestCaseDTO;
import com.uevitondev.testmanagement.dtos.TestCaseDTO;
import com.uevitondev.testmanagement.entities.TestCase;
import com.uevitondev.testmanagement.repositories.TestCaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCaseService {
    @Autowired
    private TestCaseRepository testCaseRepository;

    @Transactional()
    public List<TestCaseDTO> getAll() {
        return testCaseRepository.findAll()
                .stream()
                .map(testCase -> new TestCaseDTO(testCase, testCase.getStatusTests()))
                .toList();
    }

    @Transactional
    public TestCaseDTO insertTestCase(NewTestCaseDTO dto) {
        TestCase testCase = new TestCase();
        testCase.setStepsActions(dto.getStepsActions());
        testCase.setStepsData(dto.getStepsData());
        testCase.setStepsResult(dto.getStepsResult());
        testCase.setType(dto.getType());

        testCase = testCaseRepository.save(testCase);
        return new TestCaseDTO(testCase);
    }
}
