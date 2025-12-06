package com.example.investappv2.data.model

enum class NotificationType(val displayName: String) {
    INFO("Information"),
    TASK_ASSIGNED("Tâche assignée"),
    TASK_REMINDER("Rappel de tâche"),
    TASK_OVERDUE("Tâche en retard"),
    TASK_COMPLETED("Tâche terminée"),
    SANCTION("Sanction"),
    ROLE_CHANGED("Changement de rôle"),
    COMMISSION("Commission"),
    EVENT("Événement"),
    CHAT("Message")
}