import java.util.InputMismatchException;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        try {
            int idade = sc.nextInt();
            System.out.println("Sua idade: " + idade);
            if (idade < 18) {
                System.out.println("Menor de idade");
            } else {
                System.out.println("Adulto");
            }
        } catch (InputMismatchException e) {
            System.out.println("Idade inválida, utilize um número inteiro.");
        }
        sc.close();
    }
}
