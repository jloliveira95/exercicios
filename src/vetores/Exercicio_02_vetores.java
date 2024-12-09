
package vetores;

import java.util.Scanner;

public class Exercicio_02_vetores {

    public static void main(String[] args) {

        //início
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[10];
        
        //variáveis
        int soma = 0;
        double media;        

        //Apresentação
        System.out.println("\nInforme os 10 números inteiros:");

        //Entrada de dados
        for (int index = 0; index < numeros.length; index++) {
            System.out.print((index+1)+"° Número: " );
            numeros[index] = leia.nextInt();
        }
        
        //Processamento
        System.out.println("\nTodos os elementos dos índices(posições) ímpares inceridos:");
        for (int index = 0; index < numeros.length; index++) {
            if (index % 2 != 0) {
                System.out.print("_"+numeros[index] + "_");
            }
        }
        System.out.println();

        //processamento
        System.out.println("\nNúmeros pares:");
        for (int index = 0; index < numeros.length; index++) {
            if (numeros[index] % 2 == 0) {
                System.out.print("_"+numeros[index] + "_");
            }
        }
        System.out.println();

        //processamento
        for (int index = 0; index < numeros.length; index++) {
        soma += numeros[index];
        }
        System.out.println("\nSoma de todos os números: _" + soma +"_");

        //processamento
        media = (double) soma / numeros.length;
        System.out.println("\nMédia entre todos os números inecridos: _" + media +"_");

        //Fim
        System.out.println("_Programa Finalizado!_\n");
        
        leia.close();
    } 
}