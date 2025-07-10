package com.example.activity_service.repository

import com.example.activity_service.model.Activity
import org.springframework.data.mongodb.repository.MongoRepository

interface ActivityRepository : MongoRepository<Activity, String>
