package Decorator;

public class Main {
    public static void main(String[] args) {

        Getraenk g = new CaffeLatte();
        g = new ExtraShot(g);
        g = new ExtraShot(g);
        g = new ExtraShot(g);

        System.out.println(g.beschreibung());
    }
}
