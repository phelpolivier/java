import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é ímpar.");
        }
    }  
}