package Exercicio6

/*
Faça um programa que permita que a pessoa usuária digite o nome
de uma banda musical e insira o nome de 3 músicas dessa banda, as
músicas deverão ser armazenadas e no final o programa deverá
mostrar a seguinte mensagem:
NomeDaBanda
Musica1
Musica2
Musica3
 */

fun main (){
    println(" Digite o nome da banda: ")
    var banda = readln().toString()

    println(" Digite o nome da primeira musica: ")
    var musica1 = readln().toString()

    println(" Digite o nome da segunda musica: ")
    var musica2 = readln().toString()

    println("Digite o nome da terceira musica: ")
    var musica3 = readln().toString()

    println("Nome da Banda $banda, \nmusica 1: $musica1, \nmusica 2: $musica2, \nmusica 3: $musica3")
}