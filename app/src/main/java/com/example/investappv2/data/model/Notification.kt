package com.example.investappv2.data.model

import java.util.*

data class Notification(
    val id: String = "",
    val userId: String = "",
    val title: String = "",
    val message: String = "",
    val type: NotificationType = NotificationType.INFO,
    val relatedId: String = "", // ID de la tâche, commission, etc.
    val relatedType: String = "",
    val isRead: Boolean = false,
    val createdAt: Date = Date(),
    val data: Map<String, Any> = emptyMap()
)