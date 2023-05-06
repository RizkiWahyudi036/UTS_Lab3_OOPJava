package No4;
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        Bola bola1 = new Bola(49.0);
        System.out.println("Volume bola 1 adalah: " + bola1.hitungVolume());

        Bola bola2 = new Bola(21.0);
        System.out.println("Volume bola 2 adalah: " + bola2.hitungVolume());

        System.out.println("------------------------------------------------------------------------");

        Hidrostatis hidrostatis1 = new Hidrostatis(500, 9.81, 7.5);
        System.out.println("Tekanan hidrostatis 1 adalah: " + hidrostatis1.hitungTekanan());

        Hidrostatis hidrostatis2 = new Hidrostatis(850, 9.81, 10.0);
        System.out.println("Tekanan hidrostatis 2 adalah: " + hidrostatis2.hitungTekanan());
    }
}
