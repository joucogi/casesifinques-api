package com.casesifinques.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {
    @GetMapping("/health-check")
    fun check() = ResponseEntity.ok().body("Status OK")
}