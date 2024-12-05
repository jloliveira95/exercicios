//Escreva um algoritmo em Java, que leia um número inteiro via teclado
//e mostre na tela uma mensagem indicando se este número é par ou ímpar
//e se o número é positivo ou negativo. Veja os exemplos abaixo:
package exercicios;

import java.util.Scanner;

//inicio
public class Exe_02_if_else {
    public static void main(String[] args) {
        //inicio
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = leia.nextInt();
        
        //processamento
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        
        // Verifica se o número é positivo ou negativo
        if (numero > 0) {
            System.out.println(numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo.");
        } else {
            System.out.println(numero + " é zero.");
        }
        
    }//fim
} 