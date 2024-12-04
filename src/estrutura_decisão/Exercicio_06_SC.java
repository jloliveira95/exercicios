
package estrutura_decisão;

import java.util.Scanner;

public class Exercicio_06_SC {
    public static void main(String[] args) {
        //início
        Scanner leia = new Scanner(System.in);
        
        //Variáveis
        String nomeColaborador, cargo = "";
        int codigoCargo;
        float salario, novoSalario;

        //Apresentação
        System.out.println("\nReajuste de Salário");
        System.out.println("======================");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor(a)");
        System.out.println("3 - Supervisor(a)");
        System.out.println("4 - Motorista");
        System.out.println("5 - Estoquista");
        System.out.println("6 - Técnico(a) de TI");
        System.out.println("==================");
        System.out.println();
        
        //validação do código do cargo
        
        //entrada dos dados
        System.out.println("Digite o Nome do Colaborador: ");
        nomeColaborador = leia.nextLine();
        
        System.out.println("Digite o Código do Cargo (1-6): ");
        codigoCargo = leia.nextInt();
        
        System.out.println("Digite o Salário: ");
        salario = leia.nextFloat();
        
        //processamento
        switch (codigoCargo) {
            case 1:
                novoSalario = salario + (salario * 0.10f);
                cargo = "Gerente";
                break;
            case 2:
                novoSalario = salario + (salario * 0.07f);
                cargo = "Vendedor";
                break;
            case 3:
                novoSalario = salario + (salario * 0.09f);
                cargo = "Supervisor";
                break;
            case 4:
                novoSalario = salario + (salario * 0.06f);
                cargo = "Motorista";
                break;
            case 5:
                novoSalario = salario + (salario * 0.05f);
                cargo = "Estoquista";
                break;
            case 6:
                novoSalario = salario + (salario * 0.08f);
                cargo = "Técnico de TI";
                break;
            default:
                novoSalario = 0;
                System.out.println("código inválido");
            break;
        }
        
        //saída
        System.out.println("\nNome do Colaborador: " + nomeColaborador);
        System.out.println("Cargo: " + cargo);
        System.out.println("Novo Salário: " + novoSalario);
        
        //fim
    }
}
