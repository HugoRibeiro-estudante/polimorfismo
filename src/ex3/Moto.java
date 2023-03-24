package ex3;

public class Moto extends Veiculo{

    public Moto(String modelo, String ano, String capacidade, String combustivel) {
        super(modelo, ano, capacidade, combustivel);
    }
    public void acelerar(int velocidade){
        System.out.println("sua moto esta a "+velocidade+"KM/h   ... acelerando");
    }

}
