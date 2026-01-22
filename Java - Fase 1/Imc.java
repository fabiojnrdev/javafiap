import java.util.Scanner; 
import java.util.Locale;

public class Imc {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): "); 
        double altura = sc.nextDouble(); 

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso normal.");
        } else if (imc < 30) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }

        sc.close();
    }
}