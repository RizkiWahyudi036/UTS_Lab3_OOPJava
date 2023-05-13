package No1;
import java.util.Calendar;

//Contoh Class
public class Film {
    private String judul;
    private String sutradara;
    private int tahunRilis;
    private float rating;

    // Contoh Constructor
    public Film(String judul, String sutradara, int tahunRilis, float rating) {
        this.judul = judul;
        this.sutradara = sutradara;
        setTahunRilis(tahunRilis);// Validari tahun rilis
        setRating(rating); // validasi rating
    }

    // Contoh Getter dan Setter
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getJudul() {
        return judul;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }
    public String getSutradara() {
        return sutradara;
    }

    public void setTahunRilis(int tahunRilis) {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        if (tahunRilis <= tahunSekarang) {
            this.tahunRilis = tahunRilis;
        } else {
            System.out.println("Tahun rilis film "+getJudul()+" tidak valid!");
            System.out.println(" ");
        }
    }
    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setRating(float rating) {
        if (rating >= 1 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Rating film "+getJudul()+" tidak valid. Harap masukkan rating antara 1 sampai 10.");
            System.out.println(" ");
        }
    }
    public float getRating() {
        return rating;
    }

    // Contoh Method Overloading
    public void printMovieDetails() {
        System.out.println("Judul Film  : " + judul);
        System.out.println("Sutradara   : " + sutradara);
        System.out.println("Tahun Rilis : " + tahunRilis);
        System.out.println("Rating      : " + rating);
    }
}

