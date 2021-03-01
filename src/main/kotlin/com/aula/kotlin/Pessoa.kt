package com.aula.kotlin

class Pessoa {
    var nome: String = "Francisco"
    var cpf: String = "123.456.789-00"
}

fun main() {
    val francisco = Pessoa()

    println(francisco.nome)
    println(francisco.cpf)
}