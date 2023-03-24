package ex4;

public class Assistente extends Funcionario{

    public Assistente(String nome, int horasTrabalhadas, double valorHora) {
        super(nome, horasTrabalhadas, valorHora);
    }

    @Override
    public double calcularSalario(){
        return super.getHorasTrabalhadas() * super.getValorHora() * 1.5;
    }

}
