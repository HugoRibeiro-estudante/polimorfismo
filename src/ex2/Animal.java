package ex2;

public class Animal {

    private String cor, ambiente, classe;

    public Animal(String cor, String ambiente, String classe) {
        this.cor = cor;
        this.ambiente = ambiente;
        this.classe = classe;
    }

    public void emitirSom(){
        System.out.println("Som");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
