package com.example.investappv2.data.model

import java.util.*

data class ChatMessage(
    val id: String = "",
    val senderId: String = "",
    val senderName: String = "",
    val senderRole: UserRole = UserRole.MEMBER,
    val message: String = "",
    val timestamp: Date = Date(),
    val isBot: Boolean = false,
    val type: MessageType = MessageType.TEXT,
    val attachments: List<String> = emptyList(),
    val readBy: List<String> = emptyList()
)