package Exercicio12

import java.time.Year

fun main() {
    val anoAtual = Year.now().value

    print("Digite o ano de nascimento: ")
    val anoNascimento = readLine()!!.toInt()

    for (ano in anoNascimento..anoAtual) {
        val idade = ano - anoNascimento
        println("Ano: $ano - Idade: $idade anos")
    }
}
