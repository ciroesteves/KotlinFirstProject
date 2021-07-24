package digiBank.testes

import digiBank.Analista
import digiBank.Funcionario
import digiBank.Pessoa

fun main(){
    val joao = Analista(nome = "Joao Pedro", cpf = "321.321.321-32", salario = 2000.00)

    ImprimeRelatorioFuncionario.imprime(joao)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())