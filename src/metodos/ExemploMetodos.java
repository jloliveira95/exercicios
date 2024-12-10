
package metodos;

public class ExemploMetodos {
    
    public static void main(String[] args) {
        int resultado = somar(2,5);
        System.out.println("o primeiro resultado é: " + resultado);
        System.out.println("o segundo resultado é: " + somar(8, 5));
        ExemploMetodoExterno.mensagem();
    }
    
    //definição do método(Com retorno e parâmetro) nome somar
    public static int somar(int x, int y){
        return x+y; // 2+5
    }
}
