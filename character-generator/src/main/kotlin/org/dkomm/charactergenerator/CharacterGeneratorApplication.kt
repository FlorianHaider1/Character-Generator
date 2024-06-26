package org.dkomm.charactergenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CharacterGeneratorApplication

fun main(args: Array<String>) {
    runApplication<CharacterGeneratorApplication>(*args)
}
