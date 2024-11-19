import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        double percentualAumento = 0;
        double valorAumento = 0;
        double novoSalario = 0;
        double inflacao = 3.8;

        if (salarioAtual <= 280){
            percentualAumento = 20;
        } else if (salarioAtual > 280 && salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual > 700 && salarioAtual <= 1500) {
            percentualAumento = 10;
        } else if (salarioAtual > 1500) {
            percentualAumento = 5;
        }

        valorAumento = salarioAtual * (percentualAumento / 100);
        novoSalario = salarioAtual + valorAumento;

        double aumentoReal = valorAumento - (salarioAtual * (inflacao / 100));

        System.out.println("Resultado do reajuste:");
        System.out.println("1. Salário antes do reajuste: R$" + salarioAtual);
        System.out.println("2. Percentual de aumento aplicado:" + percentualAumento + "%");
        System.out.println("3. Valor do aumento: R$" + valorAumento);
        System.out.println("4. Novo salário, após o aumento: R$" + novoSalario);
        System.out.println("5. Valor do aumento real (descontando a inflação): R$" + aumentoReal);

        scanner.close();
    }
}
