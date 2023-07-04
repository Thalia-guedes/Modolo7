package Exercicio2

/*
Escreva um algoritmo que leia um número inteiro (de 1 a 7)
representando o dia da semana e informe o nome do dia
correspondente.
 */

fun main(){
    println(" Digite um numero de 1 a 7 para verificar o dia da semana")
    val num = readln().toInt()

    val c = when ( num){
        1 -> "Segunda"
        2 -> "Terça "
        3 -> "Quarta"
        4 -> " Quinta "
        5 -> "Sexta "
        6 -> "Sabado "
        7 -> "Domingo "
        else
            -> " Opcao invalida"

    }
    println(c)

}