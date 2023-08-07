package com.uevitondev.testmanagement.controllers;

import com.uevitondev.testmanagement.dtos.NewStatusTestDTO;
import com.uevitondev.testmanagement.dtos.NewTestCaseDTO;
import com.uevitondev.testmanagement.dtos.StatusTestDTO;
import com.uevitondev.testmanagement.dtos.TestCaseDTO;
import com.uevitondev.testmanagement.entities.StatusTest;
import com.uevitondev.testmanagement.services.StatusTestService;
import com.uevitondev.testmanagement.services.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusTestController {
    @Autowired
    private StatusTestService statusTestService;

    @GetMapping
    public ResponseEntity<List<StatusTestDTO>> getAll() {
        return ResponseEntity.ok().body(statusTestService.getAll());
    }

    @PostMapping
    public ResponseEntity<StatusTestDTO> insertStatusTest(@RequestBody NewStatusTestDTO dto) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/status").toUriString());
        return ResponseEntity.created(uri).body(statusTestService.insertStatusTest(dto));
    }
}
