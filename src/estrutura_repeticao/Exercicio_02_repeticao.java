
package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio_02_repeticao {
    public static void main(String[] args) {
        // início
        Scanner leia = new Scanner(System.in);

        //variáveis
        int nu, index, contadorPares = 0, contadorImpares = 0;

        //apresentação
        System.out.println("\nVerificador de pares e impares. À "
                + "seguir, digite 10 números inteiros\n");
        
        //entrada
        for (index = 1; index <= 10; index++) {
            System.out.print("Digite o " + index + "° número: ");
            nu = leia.nextInt();
            
            //processamento
            if (nu % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        
        //saída
        System.out.println("\nNúmeros pares: " + contadorPares);
        System.out.println("Números ímpares: " + contadorImpares);
        
        //fim
        System.out.println("\nCabô!\n");
    }
}