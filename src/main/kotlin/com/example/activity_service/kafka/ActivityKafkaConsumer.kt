package com.example.activity_service.kafka

import com.example.activity_service.service.ActivityService
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ActivityKafkaConsumer(
    private val activityService: ActivityService
) {
    @KafkaListener(topics = ["activity-topic"], groupId = "activity_group")
    fun listen(message: Map<String, Any>) {
        val action = message["action"] as? String ?: throw IllegalArgumentException("Missing action")
        val userId = (message["userId"] as? Number)?.toLong() ?: throw IllegalArgumentException("Missing userId")
        val imageId = (message["imageId"] as? Number)?.toLong() ?: throw IllegalArgumentException("Missing imageId")
        activityService.saveActivity(action, userId, imageId)
    }
}