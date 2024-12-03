/*Elabore um algoritmo em Java que leia 4 notas de um 
participante, em variáveis do tipo float e exiba na tela
a média final do participante. */

package exercicios;

import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {

              //Variáveis do tipo float
        float n1, n2, n3, n4;
        Scanner leia = new Scanner(System.in);
        
        //entrada dos dados
        System.out.println("Digite a primeira nota: ");
        n1 = leia.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        n3 = leia.nextFloat();
        
        System.out.println("Digite a quarta nota: ");
        n4 = leia.nextFloat();       
        
        //processamento
        float media = (n1 + n2 + n3 + n4) / 4;
        
        //saída
        System.out.println("Média Final: " + media);
    } 
}