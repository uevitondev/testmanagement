package com.uevitondev.testmanagement.repositories;

import com.uevitondev.testmanagement.entities.StatusTest;
import com.uevitondev.testmanagement.entities.SwitchTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwitchTestRepository extends JpaRepository<SwitchTest, Long> {
}
