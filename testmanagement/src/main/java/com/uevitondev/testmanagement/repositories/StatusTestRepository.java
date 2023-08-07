package com.uevitondev.testmanagement.repositories;

import com.uevitondev.testmanagement.entities.StatusTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusTestRepository extends JpaRepository<StatusTest, Long> {
}
