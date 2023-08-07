package com.uevitondev.testmanagement.repositories;

import com.uevitondev.testmanagement.entities.StatusTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusTestRepository extends JpaRepository<StatusTest, Long> {
}
