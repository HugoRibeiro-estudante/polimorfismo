package ex1;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar(){

        System.out.println("Meu nome e : "+ this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
