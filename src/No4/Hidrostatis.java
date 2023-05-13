package No4;

public class Hidrostatis {
    private double tekanan;


    public Hidrostatis(double massaJenis, double kedalaman) {
        if (massaJenis <= 0 || kedalaman <= 0) {
            System.out.println("nilai tidak boleh kurang dari 0 atau negatif");
        }
        this.tekanan= hitungTekanan(massaJenis,kedalaman);
    }

    public double hitungTekanan(double massaJenis, double kedalaman) {
        double gravitasi = 9.8;
        return massaJenis * gravitasi * kedalaman;
    }
    public double getTekanan() {
        return tekanan;
    }
}
