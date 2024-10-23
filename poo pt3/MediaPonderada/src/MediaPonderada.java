import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da nota 1: ");
        double peso1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da nota 2: ");
        double peso2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da nota 3: ");
        double peso3 = scanner.nextDouble();
        
        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 +peso2+peso3);
        System.out.println("A média ponderada é: " + media);
        
        scanner.close();
    }
}
