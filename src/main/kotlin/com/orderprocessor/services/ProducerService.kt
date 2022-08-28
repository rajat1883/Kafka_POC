package com.orderprocessor.services

import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class ProducerService(private val kafkaTemplate: KafkaTemplate<String, String?>? = null) {

    private val log = LoggerFactory.getLogger(ProducerService::class.java)

    fun sendMessage(message: String?) {
        log.info(String.format("#### -> Producing message -> %s", message))
        kafkaTemplate!!.send(TOPIC, message)
    }

    companion object {
        private const val TOPIC = "users-v2"
    }
}