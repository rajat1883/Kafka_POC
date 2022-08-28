package com.orderprocessor.services

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import java.io.IOException

@Service
class ConsumerService {
    private val log = LoggerFactory.getLogger(ConsumerService::class.java)

//    @KafkaListener(topics = ["users"], groupId = "group_id")
//    @Throws(IOException::class)
//    fun consumeUsers(message: String?) {
//        log.info(String.format("#### -> Consumed message -> %s", message))
//    }

    @KafkaListener(topics = ["users-v2"], groupId = "group_id")
    @Throws(IOException::class)
    fun consumeUsersV2(message: String?) {
        log.info(String.format("#### -> Consumed message -> %s", message))
    }
}