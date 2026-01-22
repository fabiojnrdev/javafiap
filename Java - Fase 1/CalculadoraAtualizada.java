public class CalculadoraAtualizada {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        double c = 2.5;

        double semParentese = a + b * c;
        System.out.println("Sem parênteses: " + semParentese);

        double comParentese = (a+b) * c;
        System.out.println("Com parênteses: " + comParentese);

        boolean Logico = true;
        System.out.println("Exemplo lógico: " + Logico);
    }
}
