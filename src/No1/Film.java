package No1;
//Contoh Class
public class Film {
    private String judul;
    private String sutradara;
    private int tahun;
    private double rating;

    // Contoh Constructor
    public Film(String judul, String sutradara, int tahun, double rating) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.tahun = tahun;
        this.rating = rating;
    }

    // Contoh Getter dan Setter
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getSutradara() {
        return sutradara;
    }
    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Contoh Method Overloading
    public void Movie() {
        System.out.println("Judul Film  : " + judul);
        System.out.println("Sutradara   : " + sutradara);
        System.out.println("Tahun Rilis : " + tahun);
        System.out.println("Rating      : " + rating);
    }
}

