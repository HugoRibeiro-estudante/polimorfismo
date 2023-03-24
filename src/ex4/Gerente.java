package ex4;

public class Gerente extends Funcionario{

    public Gerente(String nome, int horasTrabalhadas, double valorHora) {
        super(nome, horasTrabalhadas, valorHora);
    }


    @Override
    public double calcularSalario(){
        return super.getHorasTrabalhadas() * super.getValorHora() * 2.5;
    }
}
