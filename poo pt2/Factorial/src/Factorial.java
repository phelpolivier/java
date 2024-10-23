import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;           
        }
        System.out.println("O factorial de " + num + " é: " + factorial);
    
    }
    
}