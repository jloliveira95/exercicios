
package estrutura_repeticao;

import java.util.Scanner;


public class Exercicio_5_while {
    
        public static void main(String[] args) {
            
            Scanner leia = new Scanner(System.in);
    
            // Variáveis
            int soma = 0, index = 1, numero = 0;
    
            // Entrada de dados
            System.out.print("Digite números inteiros (digite 0 para encerrar)\nDigite o " + index + "° número: ");
            numero = leia.nextInt();
            index++;

    
            while (numero != 0) {

                System.out.print(index + "° número: ");
                
                if (numero > 0) {
                    soma += numero;
                    index++;
                }

                numero = leia.nextInt();
            }
    
            // Exibe a soma total
            System.out.println("A soma dos números positivos é: " + soma);
    
            leia.close();
        }
    }    
}
