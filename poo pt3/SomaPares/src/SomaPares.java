import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        
        int soma = 0;
        for (int i = 2; i <= n; i += 2) {
            soma += i;
        }
    
        System.out.println("A soma dos números pares até " + n + " é: " +soma);
        
        scanner.close();
    }
    
}