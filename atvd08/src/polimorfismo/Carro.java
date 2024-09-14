package polimorfismo;

public class Carro implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("Carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Carro está freando.");
    }
}
