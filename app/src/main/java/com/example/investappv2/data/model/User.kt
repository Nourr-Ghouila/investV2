package com.example.investappv2.data.model

import java.io.Serializable
import java.util.Date

data class User(
    val id: String = "",
    val email: String = "",
    val fullName: String = "",
    val phone: String = "",
    val profileImage: String = "",
    val role: UserRole = UserRole.RECRUIT,
    val clubId: String = "",
    val clubName: String = "",
    val commissionIds: List<String> = emptyList(),
    val tasksAssigned: List<String> = emptyList(),
    val tasksCompleted: Int = 0,
    val tasksOverdue: Int = 0,
    val sanctions: Int = 0,
    val totalSanctions: Int = 0,
    val joinDate: Date = Date(),
    val isActive: Boolean = true,
    val lastLogin: Date? = null,
    val fcmToken: String = ""
): Serializable
