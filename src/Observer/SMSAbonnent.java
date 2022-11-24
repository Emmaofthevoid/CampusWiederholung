package Observer;

public class SMSAbonnent extends Abonnent {


    public SMSAbonnent(String name, Zeitung zeitung) {
        super(name, zeitung);
    }

    @Override
    public void erhalteArtikel(Artikel a) {
        System.out.println("SMSAbonnent hat ein Artikel erhalten");
    }
}
