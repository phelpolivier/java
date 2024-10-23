import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();

        String reverso = new StringBuilder(palavra).reverse().toString();
        if (palavra.equalsIgnoreCase(reverso)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        scanner.close();
    }
}                                                                                                                                                                             