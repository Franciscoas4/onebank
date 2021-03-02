package com.aula.kotlin.teste

import com.aula.kotlin.Cliente
import com.aula.kotlin.ClienteTipo

fun main() {
    val paulo = Cliente(
        nome = "Paulo Silva",
        cpf = "123.456.789-00",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(paulo)

    TesteAutenticacao().autentica(paulo)
}