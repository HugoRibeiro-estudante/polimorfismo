package ex3;

public class Veiculo {

    private String modelo, ano, capacidade, combustivel;

    public Veiculo(String modelo, String ano, String capacidade, String combustivel) {
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.combustivel = combustivel;
    }

    public void acelerar(int velocidade){
        System.out.println("seu carro esta a "+velocidade+"KM/h   ... acelerando");
    }



}


