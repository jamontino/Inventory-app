package com.jam.app.controller

import com.jam.app.model.Inventory
import com.jam.app.services.InventoryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class InventoryController(val inventoryService: InventoryService) {

    @GetMapping("/getInventoryItems")
    fun getInventoryItems(): List<Inventory> {
        return inventoryService.getItems()
    }

    @GetMapping("/addInventoryItem")
    fun addItem(@RequestParam("inventoryName") inventoryName: String) {
        inventoryService.addItem(inventoryName)
    }

    @GetMapping("/deleteInventoryItem")
    fun deleteItem(@RequestParam("inventoryName") inventoryName: String) {
        inventoryService.deleteItem(inventoryName)
    }
}