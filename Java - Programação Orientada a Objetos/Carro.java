// Crie classe Carro com atributos cor, modelo (String),
// ano (int). Método exibirInfo() imprime detalhes. No main, crie objeto, set valores, chame método.

// Adicione método acelerar(int velocidade) que imprime "Acelerando a X km/h".
public class Carro {
    String cor;
    String modelo;
    int ano;

    public Carro(String cor, String modelo, int ano){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    public Carro(){
        this.modelo = "Bmw X5";
        this.cor = "Branco";
        this.ano = 2023;
    }
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    public void acelerar(int velocidade){
        System.out.println("Velocidade atual: "+ velocidade + " km/h");
    }
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Preto","Bmw 320i", 2026);
        Carro outroCarro = new Carro("Prata", "Audi R8", 2022);
        Carro carroDefault = new Carro();
        
        System.out.println("===Meu carro===");
        meuCarro.exibirInfo();
        meuCarro.acelerar(130);

        System.out.println("\n===Outro carro===");
        outroCarro.exibirInfo();
        outroCarro.acelerar(125);

        System.out.println("\n===Mais outro carro===");
        carroDefault.exibirInfo();
        carroDefault.acelerar(110);
        
        System.out.println("\n===Comparação de anos===");
        
        
        if (meuCarro.ano > outroCarro.ano){
            System.out.println("O " + meuCarro.modelo + " é mais recente que o " + outroCarro.modelo);
        } else if(meuCarro.ano < outroCarro.ano){
            System.out.println("O " + outroCarro.modelo + " é mais recente que o " + meuCarro.modelo);
        } else{
            System.out.println("O " + meuCarro.modelo + " e o " + outroCarro.modelo + " são do mesmo ano.");
        }
        
        
        if (meuCarro.ano > carroDefault.ano){
            System.out.println("O " + meuCarro.modelo + " é mais recente que o " + carroDefault.modelo);
        } else if(meuCarro.ano < carroDefault.ano){
            System.out.println("O " + carroDefault.modelo + " é mais recente que o " + meuCarro.modelo);
        } else{
            System.out.println("O " + meuCarro.modelo + " e o " + carroDefault.modelo + " são do mesmo ano.");
        }
        
        
        if (outroCarro.ano > carroDefault.ano){
            System.out.println("O " + outroCarro.modelo + " é mais recente que o " + carroDefault.modelo);
        } else if(outroCarro.ano < carroDefault.ano){
            System.out.println("O " + carroDefault.modelo + " é mais recente que o " + outroCarro.modelo);
        } else{
            System.out.println("O " + outroCarro.modelo + " e o " + carroDefault.modelo + " são do mesmo ano.");
        }
        
        
        System.out.println("\n===Carro mais recente===");
        if (meuCarro.ano >= outroCarro.ano && meuCarro.ano >= carroDefault.ano){
            System.out.println("O carro mais recente é o " + meuCarro.modelo + " (" + meuCarro.ano + ")");
        } else if (outroCarro.ano >= meuCarro.ano && outroCarro.ano >= carroDefault.ano){
            System.out.println("O carro mais recente é o " + outroCarro.modelo + " (" + outroCarro.ano + ")");
        } else {
            System.out.println("O carro mais recente é o " + carroDefault.modelo + " (" + carroDefault.ano + ")");
        }
    }
}
//Crie 2 objetos Carro, compare anos com if no main.