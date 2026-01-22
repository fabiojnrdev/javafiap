import java.util.Scanner;
public class ParOuImpar{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = leitor.nextInt();

        int resto = numero % 2;

        if (resto == 0){
            System.out.println("O número " + numero + " é par");
        } else{
            System.out.println("O número " + numero + " é impar.");
        }
        leitor.close();
    }
}