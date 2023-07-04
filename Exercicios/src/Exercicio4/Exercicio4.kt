package Exercicio4
/*
Faça um programa que receba 10 números inteiros informados pela
pessoa usuária, armazene-os e verifique quais números são pares, e
exiba para o usuário apenas os números pares da lista.
 */

fun main() {

    val numeros = mutableListOf<Int>()

    println("Digite 10 numeros inteiros (digite 'fim' para encerrar):")

    var entrada: String? = readLine()

    while (entrada != "fim") {
        val numero = entrada?.toIntOrNull()
        if (numero != null) {
            numeros.add(numero)

        } else {
            println("Valor inválido. Digite um número inteiro.")
        }

        entrada = readLine()

    }
    val numerosPares = numeros.filter { it % 2 == 0 }


    println("Números Pares: $numerosPares")

    println()




    //var numeros = IntArray(10)
//    println("Digite um numero")
//    var numero = readln().toInt()
//
//
//
//    numeros.forEach { numero -> println(numero) }


//    val numeros = mutableListOf<Int>()
//    val nume=true
//
//    while (nume){
//        println("Digite um numero")
//        var num = readln().toInt()
//        num ++
//        numeros.addAll(listOf(num))
//        if (num % 2 == 0){
//            println(" esses sao os numeros pares $num")
//        }
}


//
//    for (numeros in 1..10){
//        println("Digite 10 numeros inteiros ")
//        var numero = readln().toInt()
//
//        do {
//
//        }
//
//
//    }


//    numeros.forEach{numero -> println(numero)
//
//    }
//    numeros.addAll(numeros)
//    val numerosPares = numeros.filter { it % 2== 0 }
//    println(numerosPares)

