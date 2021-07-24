package digiBank.testes

import digiBank.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.nome)
    println(banco2.numero)
    println(banco2.info())
}