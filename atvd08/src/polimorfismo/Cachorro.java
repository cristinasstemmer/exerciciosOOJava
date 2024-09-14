package polimorfismo;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro faz: Au Au");
    }
}