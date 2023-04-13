package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController (val userService: UserService) {

    @PostMapping("/user")
    fun createUser (@RequestBody user: User) : Long? {
        return userService.createUser(user)
    }

    @GetMapping("/users")
    fun getAllUsers() : List<User> {
        return  userService.getAllUsers()
    }
}