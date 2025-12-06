package com.example.investappv2.data.model

import java.util.*

data class Event(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val clubId: String = "",
    val commissionId: String = "",
    val commissionName: String = "",
    val organizerId: String = "",
    val organizerName: String = "",
    val startDate: Date = Date(),
    val endDate: Date = Date(),
    val location: String = "",
    val address: String = "",
    val participantIds: List<String> = emptyList(),
    val maxParticipants: Int = 0,
    val status: EventStatus = EventStatus.PLANNED,
    val type: EventType = EventType.MEETING,
    val createdAt: Date = Date()
)

