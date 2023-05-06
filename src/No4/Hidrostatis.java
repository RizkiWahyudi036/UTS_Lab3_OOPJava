package No4;

public class Hidrostatis {
    private double massaJenis, gravitasi, kedalaman;

    public Hidrostatis(double densitas, double gravitasi, double kedalaman) {
        this.massaJenis = densitas;
        this.gravitasi = gravitasi;
        this.kedalaman = kedalaman;
    }

    public double hitungTekanan() {
        return massaJenis * gravitasi * kedalaman;
    }
}
