
/*Escreva um programa contendo uma Collection Queue (Fila)
 de Objetos do tipo string, para organizar uma fila por 
 ordem de chegada dos Clientes de um Banco. O programa 
 deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. 
Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a 
fila está vazia ao tentar retirar (chamar) um cliente da fila. */

package colections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner leia = new Scanner(System.in);
        int opcao = 0, index = 1;

        do {
            System.out.println("\n<___>");
            System.out.println("Menu:");
            System.out.println("_____________________________");
            System.out.println("1 - Adicionar um novo Cliente");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Chamar (Atender e retirar) uma pessoa");
            System.out.println("________");
            System.out.println("0 - Sair");
            System.out.println("___________________");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine(); // Limpa o buffer do teclado após ler uma string, evitando erro de conflito de dados com a próxima leitura.
        
            switch (opcao) {
                case 1:
                    System.out.println("OPÇÃO 1 - Adicionar Cliente");
                    System.out.print("Digite o "+ index + "° Cliente: ");
                    String nome = leia.nextLine();
                    filaClientes.add(nome);
                    System.out.println("Sucesso! Cliente adicionado");
                    index++;
                    break;
                case 2:
                    System.out.println("OPÇÃO 2 - Lista Completa:");
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazina!");
                    } else { 
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }    
                    }
                    break;
                case 3:
                    System.out.println("OPÇÃO 3 - Chamando:");
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        String chamado = filaClientes.poll();
                        System.out.println("Chamando: " + chamado);
                        System.out.println("Atendido e retirado da fila!");
                    }
                    break;
                case 0:
                    System.out.println("Obrigado! Total de "+(index-1)+ " Pessoas atendidas");
                    System.out.println("<Programa finalizado>\n");
                    break;
                default:
                    System.out.println("Opção inválida. Tente Novamente!!");
                    break;
            }     
        } while(opcao != 0); 
        leia.close();
    }
}
