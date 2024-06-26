package org.dkomm.charactergenerator

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/characters")
class CharacterController {

    @GetMapping(produces = ["application/json"])
    fun getCharacter(): CharacterResponse {
        val characterResponse = CharacterResponse(
            id = 1,
            name = "Ayoun",
            description = "A religious Paladin",
        )
        return characterResponse
    }
}