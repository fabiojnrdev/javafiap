
// Crie menu simples: Do-while pede opção (1: Soma 1-10; 2: Imprime ímpares até 15; 0: Sair).
// Use switch dentro. Adicione continue se opção inválida; break no 0.
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Digite uma opção: ");
            System.out.println("1: Somar números de 1 a 10");
            System.out.println("2: Imprimir números ímpares até 15");
            System.out.println("0: Sair");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    int soma = 0;
                    for (int i = 1; i <=10; i++){
                        soma += i;
                    }
                    System.out.println("Soma de 1 até 10 = " + soma);
                    break;
                case 2:
                    System.out.print("Números impares até 15: ");
                    for(int i = 1; i <= 15; i += 2){
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                System.out.println("Opção inválida");
                continue;
            }
            } while (opcao != 0);
        sc.close();
    }
}

