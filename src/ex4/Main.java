package ex4;

public class Main {

    public static void main(String[] args) {
        Funcionario assis = new Assistente("Carol", 180,10);
        Funcionario gere = new Assistente("Davi", 200,30);
        Funcionario dire = new Assistente("Martinez", 280,50);

        System.out.println("Salario assistente : "+assis.calcularSalario());
        System.out.println("Salario gerente : "+gere.calcularSalario());
        System.out.println("Salario diretor : "+dire.calcularSalario());


    }
}
