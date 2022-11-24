package Observer;

import java.util.ArrayList;
import java.util.List;

public class Zeitung {
    private List<Abonnent> abonnenten;

    public Zeitung() {
        this.abonnenten = new ArrayList<>();
    }

    public void addAbonnent(Abonnent a) {
        abonnenten.add(a);
    }

    public void sendArtikel(Artikel a) {
        for (Abonnent ab : abonnenten) {
            ab.erhalteArtikel(a);
            System.out.println(ab.name + " got article " + a.name);
        }

    }
}
