
/*Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java: Início
Digite o Salário:
Leia o Salário
Digite o Abono:
Leia o Abono
NovoSalário =
Salário + Abono
Exibe o
NovoSalári0
Fim
*/

package exercicios;

//inicio

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o Salário:");
        float salario = leia.nextFloat();
        System.out.println("Digite o Abono:");
        float abono = leia.nextFloat();
        
        //processamento
        float novoSalario = salario + abono;

        //saída
        System.out.println("Novo Salário: " + novoSalario);
        //fim
        
    }
    
}
