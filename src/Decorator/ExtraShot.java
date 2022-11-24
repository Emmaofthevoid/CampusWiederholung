package Decorator;

public class ExtraShot extends ZutatDecorator {
    public ExtraShot(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + .5;
    }

    @Override
    public String beschreibung() {

        return getraenk.beschreibung() + " extra shot";

    }
}
