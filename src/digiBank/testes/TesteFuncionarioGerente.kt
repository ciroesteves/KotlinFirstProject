package digiBank.testes

import digiBank.Funcionario
import digiBank.Gerente

fun main(){
    val maria = Gerente(nome = "Maria do Carmo", cpf = "555.555.321-32", salario = 5000.00)
    ImprimeRelatorioFuncionario.imprime(maria)
}

fun impreRelatorio(funcionario: Funcionario) = println(funcionario.toString())