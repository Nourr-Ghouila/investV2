package com.example.investappv2.data.model

import java.util.*

data class Commission(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val clubId: String = "",
    val headId: String = "",
    val headName: String = "",
    val coHeadId: String = "",
    val coHeadName: String = "",
    val memberIds: List<String> = emptyList(),
    val memberCount: Int = 0,
    val activeTaskCount: Int = 0,
    val completedTaskCount: Int = 0,
    val overdueTaskCount: Int = 0,
    val createdAt: Date = Date(),
    val isActive: Boolean = true,
    val color: String = "#3F51B5"
)