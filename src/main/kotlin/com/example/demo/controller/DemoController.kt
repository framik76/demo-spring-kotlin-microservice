package com.example.demo.controller

import com.example.demo.service.DemoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController (val demoService: DemoService) {

    @GetMapping("/demo")
    fun health(): String {
        return demoService.getHealthMessage()
    }
}