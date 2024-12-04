
package exercicios;

import java.util.Scanner;

public class Exe_01_if_else {
    public static void main(String[] args) {
        // inicio
        Scanner leia = new Scanner(System.in);
        int A, B, C;
        
        // Entrada dos dados
        System.out.println("Digite o primeiro número: ");
        A = leia.nextInt();
        
        System.out.println("Digite o segundo número: ");
        B = leia.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        C = leia.nextInt();
        
        // Processamento
        if (A + B > C) {
            System.out.println("A soma de " + A + " + " + B + " é maior que " + C);
        } else if (A + B < C) {
            System.out.println("A soma de " + A + " + " + B + " é menor que " + C);
        } else {
            System.out.println("A soma de " + A + " + " + B + " é igual a " + C);
        }
        // Fim

    }
}
