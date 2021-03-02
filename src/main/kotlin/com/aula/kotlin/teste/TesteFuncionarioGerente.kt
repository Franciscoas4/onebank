package com.aula.kotlin.teste

import com.aula.kotlin.Gerente

fun main() {
    val jose = Gerente("José Pedrosa", "987.654.321-00", 5000.0)
    ImprimeRelatorioFuncionario.imprime(jose)
}