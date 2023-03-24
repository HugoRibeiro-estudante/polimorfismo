package ex3;

public class Carro extends Veiculo{

    public Carro(String modelo, String ano, String capacidade, String combustivel) {
        super(modelo, ano, capacidade, combustivel);
    }

    public void acelerar(int velocidade){
        System.out.println("seu carro esta a "+velocidade+"KM/h   ... acelerando");
    }
}
