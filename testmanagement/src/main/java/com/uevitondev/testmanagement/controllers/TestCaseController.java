package com.uevitondev.testmanagement.controllers;

import com.uevitondev.testmanagement.dtos.NewTestCaseDTO;
import com.uevitondev.testmanagement.dtos.TestCaseDTO;
import com.uevitondev.testmanagement.services.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cases")
public class TestCaseController {
    @Autowired
    private TestCaseService testCaseService;

    @GetMapping
    public ResponseEntity<List<TestCaseDTO>> getAll() {
        return ResponseEntity.ok().body(testCaseService.getAll());
    }

    @PostMapping
    public ResponseEntity<TestCaseDTO> insertTestCase(@RequestBody NewTestCaseDTO dto) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/cases").toUriString());
        return ResponseEntity.created(uri).body(testCaseService.insertTestCase(dto));
    }
}
