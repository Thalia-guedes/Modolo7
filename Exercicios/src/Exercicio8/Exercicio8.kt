package Exercicio8

/*
Desenvolva um programa que leia um valor e apresente o número de
Fibonacci correspondente a este valor lido. Lembre-se que os 2 primeiros
elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma
dos 2 anteriores a ele. No final imprima a mensagem "Fib(N) = X", onde X é
o N-ésimo termo da série de Fibonacci.
 */

fun main (){
    println(" Digite um valor")
    var num = readln().toInt()

    val calfibonacci = calcularfibonacci(num)

    println("Numero fibonacci $calfibonacci")
}

fun calcularfibonacci(numerof: Int): Int{
    if (numerof <= 1){
        return numerof
    }

    var fibonacci1 = 0
    var fibonacci2 = 1
    var fibonacci3 = 0

    for (i in 2..numerof){
        fibonacci1 = fibonacci2 + fibonacci3
        fibonacci3 = fibonacci2
        fibonacci2 = fibonacci1

    }
    return fibonacci1


}