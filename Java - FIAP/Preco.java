/* 
*/


import java.util.Scanner;
public class Preco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de laranjas: ");

        int qtd = leitor.nextInt();

        System.out.println("Pagamento via pix? S(true)/N(false)");
        boolean pix = leitor.nextBoolean();

        double valorFinal;

        if (qtd < 10){
            valorFinal = qtd * 2.5;
        } else{
            valorFinal = qtd * 2;
        }
        if (pix){
            valorFinal *= 0.9;
        }
        System.out.println("O valor total foi: " + valorFinal);
        leitor.close();
    }
    
}
