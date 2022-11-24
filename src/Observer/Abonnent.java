package Observer;

public abstract class Abonnent {
    String name;
    Zeitung zeitung;

    public Abonnent(String name, Zeitung zeitung) {
        this.name = name;
        this.zeitung = zeitung;
    }

    abstract void erhalteArtikel(Artikel a);

}
