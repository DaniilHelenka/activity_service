package com.example.activity_service.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "activities")
data class Activity(
    @Id
    val id: String? = null,
    val action: String,
    val userId: Long,
    val imageId: Long,
    val timestamp: java.time.Instant = java.time.Instant.now()
)