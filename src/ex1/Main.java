package ex1;

public class Main {

    public static void main(String[] args) {

        Pessoa aluno = new Aluno("Hugo", "SPI");
        Pessoa funcionario = new Funcionario("Carla", "Developer");
        Pessoa professor = new Professor("Vanessa", "SPI");

        aluno.apresentar();
        funcionario.apresentar();
        professor.apresentar();

    }

}
