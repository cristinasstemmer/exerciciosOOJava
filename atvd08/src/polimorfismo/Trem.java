package polimorfismo;

public class Trem implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("Trem está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Trem está freando.");
    }
}
