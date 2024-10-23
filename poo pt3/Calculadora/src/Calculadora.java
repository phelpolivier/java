import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        int opcao = scanner.nextInt();

        double resultado = 0;
        switch (opcao) {
                case 1:
                        resultado = num1 + num2;
                        break;
                case 2:
                        resultado = num1 - num2;
                        break;
                case 3:
                        resultado = num1 * num2;
                        break;
                case 4:
                        if (num2 != 0) {
                                resultado = num1 / num2;
                        } else {
                                System.out.println("Erro: divisão por zero.");
                        }
                        break;
                default:
                        System.out.println("Opcão Inválida.");
                        break;
                
        }

        if (opcao >= 1 && opcao <= 4) {
                System.out.println("O resultado da operação é: " + resultado);
        }

        scanner.close();
    }
}