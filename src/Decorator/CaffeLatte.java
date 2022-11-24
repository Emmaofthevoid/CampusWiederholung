package Decorator;

public class CaffeLatte extends Getraenk{
    @Override
    public double kostet() {

        return 3.4;
    }

    @Override
    public String beschreibung() {
        return "Cafe Latte + ";
    }
}
