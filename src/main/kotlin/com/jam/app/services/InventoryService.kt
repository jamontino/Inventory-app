package com.jam.app.services

import com.jam.app.model.Inventory
import com.jam.app.repo.InMemoryInventoryRepository

class InventoryService(private val repository: InMemoryInventoryRepository) {

    fun getItems(): List<Inventory> {
        return repository.getItems()
    }

    fun addItem(inventoryName: String) {
        repository.addItem(inventoryName)
    }

    fun deleteItem(inventoryName: String) {
        repository.deleteItem(inventoryName)
    }


}
