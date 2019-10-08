package com.example.clienttwo.controller

import com.example.clienttwo.service.ClientService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientController(private val clientService: ClientService) {

    @GetMapping("/clients")
    fun getClient() = clientService.getClient()
}