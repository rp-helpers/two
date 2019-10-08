package com.example.clienttwo.service

import com.example.clienttwo.model.ClientModel
import org.springframework.stereotype.Service

@Service
class ClientServiceImpl : ClientService {

    override fun getClient(): List<ClientModel> {
        Thread.sleep(2000L); // delay
        return listOf(
                ClientModel("Mike", "Tyson", 33),
                ClientModel("Grzegorz", "Taki", 40),
                ClientModel("Tobiasz", "Tobiasz", 46)
        )
    }
}