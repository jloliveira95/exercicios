
package estrutura_decisão;

import java.util.Scanner;

public class ExercicioIfElse {
    
    public static void main(String[] args) {
        //variáveis
        float media;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite sua média: ");
        media = leia.nextFloat();
        
        if(media >=6){
            System.out.println("Parabéns!! você passou.");
            } else {
                    System.out.println("Reprovado!");
                }
        }
    }
    
}