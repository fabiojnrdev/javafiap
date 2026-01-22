import java.util.Scanner;
public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        try{
            int numero = sc.nextInt();
            int fatorial = 1;
            int i = 1;
            while (i <= numero) {
                fatorial *= i;
                i++;
            }
            System.out.println("O fatorial de "+ numero + " é " + fatorial);
        } catch (Exception e){
            System.out.println("Erro: Digite um número válido!");
        } finally{
            sc.close();
        }
    }
}
