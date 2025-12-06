package com.example.investappv2.data.model




import java.io.Serializable
import java.util.*

data class Sanction(
    val id: String = "",
    val userId: String = "",
    val userName: String = "",
    val taskId: String = "",
    val taskTitle: String = "",
    val commissionId: String = "",
    val commissionName: String = "",
    val reason: String = "",
    val points: Int = 1,
    val appliedBy: String = "", // User ID
    val appliedByName: String = "",
    val appliedDate: Date = Date(),
    val isActive: Boolean = true,
    val expirationDate: Date? = null,
    val notes: String = ""
): Serializable
{
    companion object {
        const val POINTS_FOR_OVERDUE_TASK = 1
        const val POINTS_FOR_NO_SHOW = 2
        const val POINTS_FOR_SERIOUS_OFFENSE = 3
    }
}