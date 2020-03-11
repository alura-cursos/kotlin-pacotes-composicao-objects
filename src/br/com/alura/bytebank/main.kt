package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaFuncionarios

fun main() {
    val endereco = Endereco()

    val objeto: Any = Any()
    objeto.

    imprime(objeto)

    imprime(1)
    imprime(1.0)
    val teste: Any = imprime(endereco)
    println(teste)

    testaFuncionarios()
}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}