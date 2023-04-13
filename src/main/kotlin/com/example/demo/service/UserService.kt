package com.example.demo.service

import com.example.demo.model.User
import com.example.demo.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (val userRepository: UserRepository) {

    fun createUser (user: User): Long? {
        var savedUser =  userRepository.save(user)
        return savedUser.id
    }

    fun getAllUsers () : List<User> {
        return userRepository.findAll().distinct()
    }

}