/*
Criação de um loop para ler um intervalo de números e imprimir a soma dos pares.
 */
import java.util.Scanner;
public class SomaPares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Entrada para inicio do intervalo
        System.out.println("Escreva o inicio do intervalo: ");
        int inicio = leitor.nextInt();
        // Entrada para o final do intervalo
        System.out.println("Escreva o fim do intervalo: ");
        int fim = leitor.nextInt();

        if (inicio < 0 || fim < 0){
            System.out.println("Digite apenas números inteiros positivos!");
            return;
        }
        if (inicio > fim){
            System.out.println("O inicio não pode ser maior que o fim do intervalo");
            return;
        }
        int soma = 0;

        
        if (inicio % 2 != 0){
            inicio ++;
        }
        for  (int i = inicio; i <= fim; i +=2){
            soma += i;
        }
        System.out.println("A soma dos pares é: " + soma);
    }
}
