package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class HealthService {

    fun getHealthMessage (): String {

        return "RUNNING"
    }
}