package ex2;

public class Main {

    public static void main(String[] args) {
        Animal gato = new Gato("amarelo", "terrestre", "mamifero");
        Animal cachorro = new Cachorro("amarelo", "terrestre", "mamifero", "hugo");
        Animal vaca = new Vaca("amarelo", "terrestre", "mamifero");

        gato.emitirSom();
        vaca.emitirSom();
        cachorro.emitirSom();

    }
}
