package com.uevitondev.testmanagement.repositories;

import com.uevitondev.testmanagement.entities.SwitchTest;
import com.uevitondev.testmanagement.entities.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCaseRepository extends JpaRepository<TestCase, Long> {
}
