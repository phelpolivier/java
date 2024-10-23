import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        boolean isPrime = true;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if(isPrime) {
            System.out.println(num + " é um número primo");
        } else {
            System.out.println(num + " não é um número primo");
        }
    }
}