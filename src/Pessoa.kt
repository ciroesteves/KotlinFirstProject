class Pessoa {
    var nome: String = "Ciro"
    var cpf: String = "123.456.789.01"

    inner class Endereco(){
        var rua: String = "Rua teste"
    }
}

fun main(){
    val result = Pessoa()

    println(result.nome)
    println(result.cpf)
    println(result.Endereco().rua)
}