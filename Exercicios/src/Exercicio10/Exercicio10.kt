package Exercicio10
/*
Escreva um algoritmo que calcule a soma dos números de 1 a 15.
Utilize o comando de repetição Do While
 */

fun main (){

    var calc = 0
    var resultado = 1

    while (calc  <= 15){

        resultado += calc
        calc ++
        println(resultado)

    }
}