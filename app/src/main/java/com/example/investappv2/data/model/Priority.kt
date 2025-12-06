package com.example.investappv2.data.model

enum class Priority(val displayName: String, val color: String) {
    LOW("Basse", "#4CAF50"),
    MEDIUM("Moyenne", "#FF9800"),
    HIGH("Haute", "#F44336"),
    URGENT("Urgente", "#D32F2F")
}