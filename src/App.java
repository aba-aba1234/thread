public class App {
    public static void main(String[] args) throws Exception {
        Corridore c1 = new Corridore("marco");
        Corridore c2 = new Corridore("saul");
        Corridore c3 = new Corridore("cristian");
        Corridore c4 = new Corridore("giovanni");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}