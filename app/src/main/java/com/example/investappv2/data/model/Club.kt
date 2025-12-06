package com.example.investappv2.data.model

import java.util.Date



data class Club(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val logoUrl: String = "",
    val bannerUrl: String = "",
    val primaryColor: String = "#1976D2",
    val secondaryColor: String = "#FF4081",
    val accentColor: String = "#4CAF50",
    val presidentId: String = "",
    val presidentName: String = "",
    val vicePresidentId: String = "",
    val vicePresidentName: String = "",
    val secretaryId: String = "",
    val secretaryName: String = "",
    val protocolManagerId: String = "",
    val protocolManagerName: String = "",
    val commissionIds: List<String> = emptyList(),
    val memberCount: Int = 0,
    val activeTaskCount: Int = 0,
    val totalSanctions: Int = 0,
    val createdAt: Date = Date(),
    val address: String = "",
    val website: String = "",
    val email: String = "",
    val phone: String = ""
)