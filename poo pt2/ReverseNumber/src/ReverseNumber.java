import java.util.Scanner;

public class ReverseNumber {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Digite um número: ");
     int num = scanner.nextInt();
     
     int reversedNum = 0;
     while(num != 0) {
         int digit = num % 10;
         reversedNum = reversedNum * 10 + digit;
         num /= 10;
     }
    System.out.println("O número invertido é: " + reversedNum);
    }
}