package com.example.investappv2.data.model


import java.util.*

data class Task(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val commissionId: String = "",
    val commissionName: String = "",
    val clubId: String = "",
    val assignedTo: String = "", // User ID
    val assignedToName: String = "",
    val assignedBy: String = "", // User ID
    val assignedByName: String = "",
    val deadline: Date = Date(),
    val createdAt: Date = Date(),
    val completedAt: Date? = null,
    val status: TaskStatus = TaskStatus.PENDING,
    val priority: Priority = Priority.MEDIUM,
    val category: TaskCategory = TaskCategory.GENERAL,
    val tags: List<String> = emptyList(),
    val notes: String = "",
    val attachments: List<String> = emptyList(),
    val reminderSent24h: Boolean = false,
    val reminderSent1h: Boolean = false,
    val sanctionApplied: Boolean = false
)




