package ex1;

public class Professor extends Pessoa{

    private String areaFormacao;

    public Professor(String nome, String areaFormacao) {
        super(nome);
        this.areaFormacao = areaFormacao;
    }

    @Override
    public void apresentar(){
        System.out.println("Meu nome é : "+super.getNome()+" \nMinha formacao é em : "+this.areaFormacao);
    }

    public String getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }
}
