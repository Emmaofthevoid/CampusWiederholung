package Decorator;

public abstract class ZutatDecorator extends Getraenk {

    protected Getraenk getraenk;

    public ZutatDecorator(Getraenk getraenk) {
        this.getraenk = getraenk;
    }
}
