package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class DemoService {

    fun getHealthMessage (): String {

        return "RUNNING"
    }
}