
package colections;

/*Escreva um programa contendo uma Collection Stack (Pilha) de 
Objetos string, para organizar a retirada de livros de uma pilha. 
O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. Caso a pilha esteja vazia, ao tentar
 retirar um livro da pilha, o programa deverá informar que a pilha está vazia.
Para resolver este exercício, não se esqueça de criar a Classe Stack */

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Stack<String> pilhaLivro = new Stack<String>();

        int opcao, index = 1, retirada = 0;
        System.out.println("Programa de Gerenciamento de Livros(PILHA)");

        do {
            System.out.println("<___>");
            System.out.println("Menu:");
            System.out.println("______________________");
            System.out.println("1 - Adicionar um Livro");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Retirar o último Livro inserido");
            System.out.println("________");
            System.out.println("0 - Sair");
            System.out.println("___________________");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine(); // Limpeza de buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o Livro " + index + ": ");
                    pilhaLivro.push(leia.nextLine());
                    if (!pilhaLivro.isEmpty()) {
                        index++;
                    }
                    break;
                case 2:
                    if (pilhaLivro.isEmpty()) {
                        System.out.println("\n<Pilha de Livros vazia!>");
                    } else {
                        System.out.println("\nTodos os livros da pilha:");
                        for (String livro : pilhaLivro) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    if (pilhaLivro.isEmpty()) {
                        System.out.println("Pilha de Livros vazia!");
                    } else {
                        System.out.println("Livro retirado: " + pilhaLivro.pop());
                        retirada++;
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
                case 0:
                    System.out.println("Livros inceridos: " + (index - 1));
                    System.out.println("Livros retirados: " + retirada + "\nObrigado!");
                    System.out.println("\nPrograma Finalizado!");
                    break;
            }
        } while (opcao != 0);

    }
}
