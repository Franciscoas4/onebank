package com.aula.kotlin.teste

import com.aula.kotlin.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}