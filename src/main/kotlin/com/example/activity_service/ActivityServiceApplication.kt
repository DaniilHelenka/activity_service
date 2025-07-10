package com.example.activity_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ActivityServiceApplication

fun main(args: Array<String>) {
	runApplication<ActivityServiceApplication>(*args)
}
