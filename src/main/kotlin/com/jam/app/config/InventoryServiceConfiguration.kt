package com.jam.app.config

import com.jam.app.repo.InMemoryInventoryRepository
import com.jam.app.service.InventoryService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InventoryServiceConfiguration {

    @Bean
    fun inventoryService() : InventoryService {
        return  InventoryService(InMemoryInventoryRepository())
    }
}