
package colections;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class ExercicioSet {
    public static void main(String[] args) {
        // inicio
        Scanner leia = new Scanner(System.in);

        /*variáveis ou listas: Criação de um Set de 
        Inteiros para armazenar os valores inseridos*/
        Set<Integer> numerosSet = new HashSet<>();
        int index = 0;

        // Entrada de dados
        System.out.println("Digite 10 números inteiros não repetidos:");
        while (numerosSet.size() < 10) {
            index++;
            System.out.print(index +"° número inteiro: ");
            int numero = leia.nextInt();
            numerosSet.add(numero);
        }

        // Saída de dados: Set utilizando Classe Iterator
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numerosSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // fim
        leia.close();
    }
}