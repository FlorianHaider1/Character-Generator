package org.dkomm.charactergenerator

import java.time.OffsetDateTime

data class CharacterResponse(
    val id: Int,
    val name: String,
    val nickName: String? = null,
    val description: String,
    val dateOfBirth: OffsetDateTime? = null,
)