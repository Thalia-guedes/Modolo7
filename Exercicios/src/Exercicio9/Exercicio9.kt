package Exercicio9
/*
Escreva um algoritmo que leia dois números e apresente um menu
com 4 opções:
a. 1) Somar os números;
b. 2) Subtrair os números;
c. 3) Multiplicar os números;
d. 4) Dividir os números. Leia a opção do usuário e execute a
operação e apresente o resultado. Caso a opção digitada seja
inválida, apresente a mensagem de “Opção inválida” para o
usuário
 */

fun main (){
    println("Digite um numero: ")
    var numero1 = readln().toInt()

    println("Digite outro numero: ")

    var numero2 = readln().toInt()

    var opcao = 0
    println("Digite o numero da operaçao que deseja fazer \n1- Multiplicar \n2- Subtrair \n3- Somar")
    var escolha = readln().toInt()

    var num = when (escolha){
        1 -> println(numero1 * numero2)
        2 -> println(numero1 - numero2)
        3 -> println(numero1 + numero2)
        else
            -> null

    }
    var mensagem = "O resultado da operaçao é: "
    if (num != null){
        println( mensagem + num )
    }
    println()
}