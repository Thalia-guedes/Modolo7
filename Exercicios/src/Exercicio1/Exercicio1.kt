package Exercicio1

/*
1. Faça um programa que leia 5 valores inteiros, armazene-os em um
vetor, calcule e apresente a soma destes valores.

 */


fun main () {


    var numeros = arrayOf(5, 8, 12, 20, 1)
    var soma = 0
    for (numeros in numeros){
        soma += numeros

    }
    println(" A soma de todos os valores da lista é $soma")


//    println(" Digite 5 valores ")
//    var valores = readln().toInt()
//    val lista = mutableListOf<Int>()
//
//    do {
//        println(valores)
//        valores++
//    }
//    while (valores < 5)
//    var soma = 0
//
//    for ( valores in lista){
//        soma += valores
//
//    }
//    println(soma)

}


