import java.util.Calendar;

class Film {
    private String judul;
    private String sutradara;
    private int tahunRilis;

    // Constructor
    public Film(String judul, String sutradara, int tahunRilis) {
        this.judul = judul;
        this.sutradara = sutradara;
        setTahunRilis(tahunRilis); // Validasi tahun rilis
    }

    // Overloaded Constructor
    public Film(String judul, String sutradara) {
        this(judul, sutradara, Calendar.getInstance().get(Calendar.YEAR));
    }

    // Setter untuk tahunRilis dengan validasi
    public void setTahunRilis(int tahunRilis) {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        if (tahunRilis <= tahunSekarang) {
            this.tahunRilis = tahunRilis;
        } else {
            System.out.println("Tahun rilis tidak valid!");
        }
    }

    // Getter untuk judul
    public String getJudul() {
        return judul;
    }

    // Getter untuk sutradara
    public String getSutradara() {
        return sutradara;
    }

    // Getter untuk tahunRilis
    public int getTahunRilis() {
        return tahunRilis;
    }
}

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Judul Film", "Sutradara Film", 2022);
        System.out.println("Judul: " + film1.getJudul());
        System.out.println("Sutradara: " + film1.getSutradara());
        System.out.println("Tahun Rilis: " + film1.getTahunRilis());

        Film film2 = new Film("Judul Film", "Sutradara Film");
        System.out.println("Judul: " + film2.getJudul());
        System.out.println("Sutradara: " + film2.getSutradara());
        System.out.println("Tahun Rilis: " + film2.getTahunRilis());
    }
}
