package ex3;

public class Caminhao extends Veiculo{

    public Caminhao(String modelo, String ano, String capacidade, String combustivel) {
        super(modelo, ano, capacidade, combustivel);
    }



    public void acelerar(int velocidade){
        System.out.println("seu caminhao esta a "+velocidade+"KM/h   ... acelerando");
    }
}
