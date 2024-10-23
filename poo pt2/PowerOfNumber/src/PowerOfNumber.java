import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite o expoente: ");
        int exponent = scanner.nextInt();
        
        double result = Math.pow(base, exponent);
        System.out.println(base + " elevado a " + exponent + " é " + result);
    }
    
}