
package estrutura_decisão;

import java.util.Scanner;

public class Exercicio_05_SC {
    public static void main(String[] args) {
        //início
        Scanner leia = new Scanner(System.in);

        //Variáveis
        int codigo, quantidade;
        float valorTotal;

        //exibição do menu
        System.out.println("\nMenu:");
        System.out.println("==============================");
        System.out.println("1 - Cachorro Quente R$ 10.00");
        System.out.println("2 - X-Salada R$ 15.00");
        System.out.println("3 - X-Bacon R$ 18.00");
        System.out.println("4 - Bauru R$ 12.00");
        System.out.println("5 - Refrigerante R$ 8.00");
        System.out.println("6 - Suco de laranja R$ 13.00");
        System.out.println("===============================");
        
        //entrada dos dados
        System.out.println("Digite o código do item: (1 à 6)");
        codigo = leia.nextInt();
        
        System.out.println("Digite a quantidade comprada: ");
        quantidade = leia.nextInt();
        
        //processamento
        switch (codigo) {
            case 1:
                valorTotal = quantidade * 10.00f;
                System.out.println("Cachorro Quente");
                System.out.println("Total R$: " + valorTotal);
                break;
            case 2:
                valorTotal = quantidade * 15.00f;
                System.out.println("X-Salada");
                System.out.println("Total R$: " + valorTotal);
                break;
            case 3:
                valorTotal = quantidade * 18.00f;
                System.out.println("X-Bacon");
                System.out.println("Total R$: " + valorTotal);
                break;
            case 4:
                valorTotal = quantidade * 12.00f;
                System.out.println("Bauru");
                System.out.println("Total R$: " + valorTotal);
                break;
            case 5:
                valorTotal = quantidade * 8.00f;
                System.out.println("Refrigerante");
                System.out.println("Total R$: " + valorTotal);
                break;
            case 6:
                valorTotal = quantidade * 13.00f;
                System.out.println("Suco de laranja");
                System.out.println("Total R$: " + valorTotal);
                break;
            default:
                System.out.println("Código inválido!");
        }
    }
}