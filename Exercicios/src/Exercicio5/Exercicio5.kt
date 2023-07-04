package Exercicio5

/*
Faça um programa que receba de lista de compras sendo que a
pessoa usuária irá inserir a quantidade de itens que quer adicionar
na lista de compras e após inserir a quantidade o programa deverá
permitir que o usuário insira os produtos nessa lista. Exiba a lista
completa para o usuário.
 */
fun main (){
    val list = mutableListOf<String>()

    println("Digite os itens da lista (digite 'fim' para encerrar):")

    var lista: String? = readLine()

    while (lista != "fim"){
        val l = lista?.toString()
        if (l != null){
            list.add(l)
        }else{

        }
        lista = readln()

    }
    println(" Os lementos da lista sao $list")



}