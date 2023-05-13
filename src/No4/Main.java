package No4;
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        Bola bola1 = new Bola(49.0);
        System.out.println("Volume bola 1 adalah: " + bola1.hitungVolume());

        Bola bola2 = new Bola(21.0);
        System.out.println("Volume bola 2 adalah: " + bola2.hitungVolume());

        System.out.println("------------------------------------------------------------------------");

            Hidrostatis tekanan1 = new Hidrostatis(-8, 5);
            if (tekanan1.getTekanan() > 0) {
            System.out.println("Tekanan 1: " + tekanan1.getTekanan() + " N/m^2");
            }

            Hidrostatis tekanan2 = new Hidrostatis(9, 10);
            if (tekanan2.getTekanan() > 0) {
                System.out.println("Tekanan 2: " + tekanan2.getTekanan() + " N/m^2");
            }



    }
}
