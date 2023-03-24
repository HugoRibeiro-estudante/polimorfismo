package ex1;

public class Aluno extends Pessoa{

    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    @Override
    public void apresentar(){
        System.out.println("Meu nome é : "+ super.getNome()+"\n sou do curso de "+this.curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

