package Decorator;

public class Espresso extends Getraenk {
    @Override
    public double kostet() {
        return 2.5;
    }

    @Override
    public String beschreibung() {
        return "Espresso + ";
    }
}
