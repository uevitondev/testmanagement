package com.uevitondev.testmanagement.repositories;

import com.uevitondev.testmanagement.entities.SwitchTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchTestRepository extends JpaRepository<SwitchTest, Long> {
}
