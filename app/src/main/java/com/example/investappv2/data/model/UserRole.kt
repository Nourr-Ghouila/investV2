package com.example.investappv2.data.model

enum class UserRole(val displayName: String, val level: Int) {
    RECRUIT("Recrue", 1),
    MEMBER("Membre", 2),
    COMMISSION_HEAD("Chef de Commission", 3),
    CO_HEAD("Co-Chef", 3),
    SECRETARY("Secrétaire", 4),
    REPRESENTATIVE("Représentant", 4),
    PROTOCOL_MANAGER("Responsable Protocole", 5),
    VICE_PRESIDENT("Vice-Président", 6),
    PRESIDENT("Président", 7)
}