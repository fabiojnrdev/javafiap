
import java.util.Scanner;

public class Estacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o mês: ");
        String mes = sc.nextLine();
        mes = mes.substring(0, 1).toUpperCase() + mes.substring(1).toLowerCase();
        String estacao = "";
        sc.close();
        if (mes != null && mes.length()> 0){
            switch (mes) {
            case "Dezembro":
            case "Janeiro":
            case "Fevereiro":
                estacao = "Verão";
                break;
            case "Março":
            case "Abril":
            case "Maio":
                estacao = "Outono";
                break;
            case "Junho":
            case "Julho":
            case "Agosto":
                estacao = "Inverno";
                break;
            case "Setembro":
            case "Outubro":
            case "Novembro":
                estacao = "Primavera";
                break;
            default:
                System.out.println("Mês inválido.");
                break;
        }
            System.out.println("Estação de " + mes + ": " + estacao);
        } else{
            System.out.println("Mês inválido");
        }
    }
}
