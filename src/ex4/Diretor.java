package ex4;

public class Diretor extends Funcionario{

    public Diretor(String nome, int horasTrabalhadas, double valorHora) {
        super(nome, horasTrabalhadas, valorHora);
    }

    @Override
    public double calcularSalario(){
        return super.getHorasTrabalhadas() * super.getValorHora() * 3.5;
    }
}
