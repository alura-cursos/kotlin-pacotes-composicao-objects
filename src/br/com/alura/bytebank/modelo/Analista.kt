package br.com.alura.bytebank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int = 0
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

    override fun autentica(senha: Int): Boolean = this.senha == senha
}