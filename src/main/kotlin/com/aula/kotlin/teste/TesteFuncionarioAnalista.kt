package com.aula.kotlin.teste

import com.aula.kotlin.Analista

fun main() {
    val joao = Analista("João Pedro", "987.654.321-00", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
