package Exercicio11

/*
Escreva um algoritmo que leia 15 números do usuário. Ao final exiba
a média dos 15 números. Utilize o comando de repetição Para (For)
 */

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val quantidadeNumeros = 15
    var soma = 0

    for (num in 1..quantidadeNumeros) {
        print("Digite o $num número: ")
        val numero = scanner.nextInt()
        soma += numero
    }

    val media = soma.toDouble() / quantidadeNumeros
    println("A média dos 15 números é: $media")

    scanner.close()
}
