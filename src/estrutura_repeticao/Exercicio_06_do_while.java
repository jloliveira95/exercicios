
package estrutura_repeticao;

import java.util.Scanner;

public class Exercicio_06_do_while {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;
        int quantidade = 0;
        int index = 1;

        System.out.println("Digite números inteiros (0 para encerrar):");

        // Entrada de dados
        do {
            System.out.print(index+"° número: ");
            numero = leia.nextInt();
            index++;


            // processamento
            if (numero != 0 && numero % 3 == 0) {
                soma += numero;  // Soma os múltiplos de 3
                quantidade++;    // Conta os múltiplos de 3
            }
        } while (numero != 0); // Encerra quando o número for 0


        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.printf("A média dos números múltiplos de 3 é: %.2f%n", media);
        } else {
            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
        }
    }
}