package com.aula.kotlin

class Gerente(
    nome: String,
    cpf: String,
    salario : Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoAuxilio(): Double = salario * 0.4
}