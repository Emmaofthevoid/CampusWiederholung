package Observer;

public class WebAbonnent extends Abonnent {

    public WebAbonnent(String name, Zeitung zeitung) {
        super(name, zeitung);
    }

    @Override
    public void erhalteArtikel(Artikel a) {
        System.out.println("WebAbonnent is getting an article...");
    }
}
