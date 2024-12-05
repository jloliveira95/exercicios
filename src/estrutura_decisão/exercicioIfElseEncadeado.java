
package estrutura_decisão;

import java.util.Scanner;


public class exercicioIfElseEncadeado {
    
    public static void main(String[] args) {
        //variáveis
        float media;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite sua média: ");
        media = leia.nextFloat();
        
        if(media >=6){
            System.out.println("Parabéns!! você passou.");
        } else if(media>=5) {
            System.out.println("está em recuperação!");
        } else {
            System.out.println("Reprovado!");
               }
        }
    }
    
}
