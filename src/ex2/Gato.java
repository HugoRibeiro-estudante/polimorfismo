package ex2;

public class Gato extends Animal{

    public Gato(String cor, String ambiente, String classe) {
        super(cor, ambiente, classe);
    }

    @Override
    public void emitirSom(){
        System.out.println("MIAU");
    }
}
