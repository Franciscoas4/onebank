package com.aula.kotlin.teste

import com.aula.kotlin.Banco

fun main() {
    val oneBank = Banco(nome = "DigitalOne", numero = 12)

    println(oneBank.nome)
    println(oneBank.numero)

    val oneBank2 = oneBank.copy(nome = "Banco2")

    println(oneBank2.info())
}