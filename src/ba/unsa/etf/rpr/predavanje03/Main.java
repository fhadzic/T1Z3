package ba.unsa.etf.rpr.predavanje03;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world!");
	    Sat s = new Sat (15, 30, 45);
        s.ispisi();
        s.setSljedeci();
        s.ispisi();
        s.setPomjeriZa(-48);
        s.ispisi();
        s.setSat(0,0,0);
        s.ispisi();
    }
}
