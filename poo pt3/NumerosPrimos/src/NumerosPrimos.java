import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        System.out.println("Números primos até " + n + ":");
        for (int i = 2; i <= n; i++) {
                boolean primo = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                             primo = false;
                             break;   
                        }
                }
                if (primo) {
                        System.out.println(i);
                }
        }
        scanner.close();
    }
}