package com.example.demo.controller

import com.example.demo.service.HealthService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController (val healthService: HealthService) {

    @GetMapping("/healthz")
    fun health(): String {
        return healthService.getHealthMessage()
    }
}