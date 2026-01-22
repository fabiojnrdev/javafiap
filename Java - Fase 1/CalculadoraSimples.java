///Crie uma classe CalculadoraSimples. 
// Declare variáveis para dois ints (a=5, b=3). Imprima soma, subtração, multiplicação, divisão e resto (%). Rode e veja saídas.
// Adicione uma variável double (c=2.5). Calcule a + b * c e verifique se (a > b) && (c != 0). 
// Imprima resultados com mensagens claras.

public class CalculadoraSimples {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        double c = 2.5;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));
        System.out.println("Cálculo de a + b * c: " + (a + b * c));
        System.out.println("verificação (a > b) && (c != 0): " + ((a > b) && (c != 0)));

        
    }
}