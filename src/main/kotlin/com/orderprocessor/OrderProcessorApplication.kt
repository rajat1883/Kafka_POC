package com.orderprocessor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrderProcessorApplication

fun main(args: Array<String>) {
    runApplication<OrderProcessorApplication>(*args)
}
