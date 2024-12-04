/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_decisão;

import java.util.Scanner;

/**
 *
 * @author User
 */
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
