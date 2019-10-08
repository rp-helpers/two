package com.example.clienttwo.service

import com.example.clienttwo.model.ClientModel

interface ClientService {
    fun getClient(): List<ClientModel>
}