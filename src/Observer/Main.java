package Observer;

public class Main {
    public static void main(String[] args) {

        Zeitung zeitung = new Zeitung();
        Artikel a1 = new Artikel("Noone came to Campus", "All the girls are lazy asses and only a handful of us are here giving it our best. Shame on them");
        Abonnent mikey = new SMSAbonnent("Mikey", zeitung);
        Abonnent melissa = new WebAbonnent("Melissa", zeitung);


        zeitung.addAbonnent(mikey);
        zeitung.addAbonnent(melissa
                );
        zeitung.sendArtikel(a1);

    }

}
