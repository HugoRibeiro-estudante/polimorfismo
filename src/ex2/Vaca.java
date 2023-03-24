package ex2;

public class Vaca extends Animal{

    public Vaca(String cor, String ambiente, String classe) {
        super(cor, ambiente, classe);
    }

    @Override
    public void emitirSom(){
        System.out.println("MUUUU");
    }
}
