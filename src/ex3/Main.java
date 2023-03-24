package ex3;

public class Main {

    public static void main(String[] args) {

        Veiculo carro = new Carro("ka", "2022","5","flex");
        Veiculo moto = new Moto("fan", "2011","2","flex");
        Veiculo caminhao = new Caminhao("1132", "2001","3","dielsel");

        carro.acelerar(100);
        moto.acelerar(120);
        caminhao.acelerar(50);

    }
}
