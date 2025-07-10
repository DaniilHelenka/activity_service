package com.example.activity_service.service

import com.example.activity_service.model.Activity
import com.example.activity_service.repository.ActivityRepository
import org.springframework.stereotype.Service

@Service
class ActivityService(
    private val activityRepository: ActivityRepository
) {
    fun saveActivity(action: String, userId: Long, imageId: Long) {
        val activity = Activity(
            action = action,
            userId = userId,
            imageId = imageId
        )
        activityRepository.save(activity)
    }
}