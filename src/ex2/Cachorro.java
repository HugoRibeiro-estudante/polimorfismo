package ex2;

public class Cachorro extends Animal{

    private String dono;

    public Cachorro(String cor, String ambiente, String classe, String dono) {
        super(cor, ambiente, classe);
        this.dono = dono;
    }

    @Override
    public void emitirSom(){
        System.out.println("AU AU AU");
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
