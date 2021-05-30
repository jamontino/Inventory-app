package com.jam.app.repo

import com.jam.app.model.Inventory

class InMemoryInventoryRepository {

    var inventoryList = mutableListOf<Inventory>()

    fun getItems(): List<Inventory> {
        return inventoryList
    }

    fun addItem(inventoryName: String) {
        if (isItemNotExisting(inventoryName)) {
            inventoryList.add(Inventory(inventoryName))
        }
    }

    fun deleteItem(inventoryName: String) {
        inventoryList.removeIf { it.name == inventoryName }
    }

    private fun isItemNotExisting(inventoryName: String): Boolean {
        return inventoryList.filter { it.name == inventoryName }.isEmpty()
    }
}
