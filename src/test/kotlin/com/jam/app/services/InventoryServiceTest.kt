package com.jam.app.services

import com.jam.app.repo.InMemoryInventoryRepository
import com.jam.app.service.InventoryService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class InventoryServiceTest{

    private lateinit var testSubject: InventoryService

    @BeforeEach
    internal fun setUp() {
        testSubject = InventoryService(InMemoryInventoryRepository())
    }

    @Test
    internal fun getItems_WhenRepositoryIsEmpty() {
        assertTrue(testSubject.getItems().isEmpty())
    }

    @Test
    internal fun addItems() {
        testSubject.addItem("arbitraryInventoryItem_1")
        testSubject.addItem("arbitraryInventoryItem_2")

        assertEquals(2, testSubject.getItems().size)
        assertEquals("arbitraryInventoryItem_1", testSubject.getItems()[0].name)
        assertEquals("arbitraryInventoryItem_2", testSubject.getItems()[1].name)
    }

    @Test
    internal fun deleteItems() {
        testSubject.addItem("arbitraryInventoryItem_1")
        testSubject.addItem("arbitraryInventoryItem_2")

        assertEquals(2, testSubject.getItems().size)
        assertEquals("arbitraryInventoryItem_1", testSubject.getItems()[0].name)
        assertEquals("arbitraryInventoryItem_2", testSubject.getItems()[1].name)

        testSubject.deleteItem("arbitraryInventoryItem_1")
        assertEquals(1, testSubject.getItems().size)
        assertEquals("arbitraryInventoryItem_2", testSubject.getItems()[0].name)
    }

    @Test
    internal fun addDuplicateItems() {
        testSubject.addItem("arbitraryInventoryItem_1")
        testSubject.addItem("arbitraryInventoryItem_1")

        assertEquals(1, testSubject.getItems().size)
        assertEquals("arbitraryInventoryItem_1", testSubject.getItems()[0].name)
    }
}