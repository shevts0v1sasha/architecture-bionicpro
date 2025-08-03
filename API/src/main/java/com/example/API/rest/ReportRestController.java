package com.example.API.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ReportRestController {

    @GetMapping("/reports")
    @PreAuthorize("hasAuthority('ROLE_prothetic_user')")
    public ResponseEntity<String> getReport() throws InterruptedException {
        Thread.sleep(2000);
        return ResponseEntity.ok().body("This is the report");
    }
}
