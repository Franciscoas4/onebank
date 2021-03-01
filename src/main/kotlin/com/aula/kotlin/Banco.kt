package com.aula.kotlin

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "Banco: $nome = Número: $numero"
}
