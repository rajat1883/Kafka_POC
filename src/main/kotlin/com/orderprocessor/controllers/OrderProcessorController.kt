package com.orderprocessor.controllers

import com.orderprocessor.services.ProducerService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/orders")
class OrderProcessorController(private val producerService: ProducerService) {

    @PostMapping("/process")
    fun startProcessing(@RequestBody message: String) {
        producerService.sendMessage(message)
    }
}