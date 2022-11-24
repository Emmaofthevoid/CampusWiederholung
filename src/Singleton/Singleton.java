package Singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            System.out.println("Instanciating a Singleton...");
            singleton = new Singleton();
        } else {

            System.out.println("A Singleton was already instanziert.");
        }

        return singleton;
    }


}
