package com.example.investappv2.data.model

enum class TaskStatus(val displayName: String, val color: String) {
    PENDING("En attente", "#FFA726"),
    IN_PROGRESS("En cours", "#29B6F6"),
    COMPLETED("Terminée", "#66BB6A"),
    OVERDUE("En retard", "#EF5350"),
    CANCELLED("Annulée", "#78909C")
}
