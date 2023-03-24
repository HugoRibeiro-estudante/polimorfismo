package ex1;

public class Funcionario extends Pessoa {

    private String funcao;

    public Funcionario(String nome, String funcao) {
        super(nome);
        this.funcao = funcao;
    }

    public void apresentar(){
        System.out.println("Meu nome é : "+super.getNome()+"\nMinha funcao é de : "+this.funcao);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
