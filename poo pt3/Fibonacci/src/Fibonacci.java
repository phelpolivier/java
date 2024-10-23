import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println("Sequência de Fibonacci até " + n + ":");
        while (a <= n) {
                System.out.println(a);
                int temp = a + b;
                a = b;
                b = temp;
        }

        scanner.close();
    }
}                                                                                                                                                                             