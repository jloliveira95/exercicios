
package colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList {
    public static void main(String[] args) {
        // inicio
        Scanner scanner = new Scanner(System.in);

        // vaiáveis ou Listas
        ArrayList<String> cores = new ArrayList<>();

        // entrada de dados
        System.out.println("Digite 5 cores:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a cor " + (i + 1) + ": ");
            String cor = scanner.nextLine();
            cores.add(cor);  // Adiciona a cor no ArrayList
        }

        //Processamento: Exibe as cores na ordem em que foram adicionadas
        System.out.println("\nCores adicionadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        //Processamento: Ordena as cores em ordem crescente
        Collections.sort(cores);

        //Processamento: Exibe as cores ordenadas em ordem crescente
        System.out.println("\nCores ordenadas em ordem alfabética:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // fim
        scanner.close();
    }
}