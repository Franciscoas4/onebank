package com.aula.kotlin

class Pessoa {
    var nome: String = "Francisco"
    var cpf: String = "123.456.789-00"
    private set
}

fun main() {
    val francisco = Pessoa()

    println(francisco)
    println(francisco.nome)
    println(francisco.cpf)
}