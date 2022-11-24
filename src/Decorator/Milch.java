package Decorator;

public class Milch extends ZutatDecorator {
    public Milch(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + .7;
    }

    @Override
    public String beschreibung() {
       return getraenk.beschreibung() + " milch";
    }
}
