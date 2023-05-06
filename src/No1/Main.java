package No1;

public class Main {
    public static void main(String[] args) {
//        Objek
        Film film1 = new Film("Avengers - End Game", "Anthony Russo, Joe Russo", 2019, 9.5);
        Film film2 = new Film("Spiderman-No Way Home", "Jon Watts", 2021, 9.0);

        System.out.println("-----------------------------------------------");
        film1.Movie();
        System.out.println("-----------------------------------------------");
        film2.Movie();
        System.out.println("-----------------------------------------------");

//        Contoh Melakukan Set And Get satu per satu
        film1.setJudul("Guardian Of The Galaxy Volume 3");
        System.out.println("Judul Film  : "+ film1.getJudul());
        film1.setSutradara("James Gunn");
        System.out.println("Sutradara   : "+film1.getSutradara());
        film1.setTahun(2023);
        System.out.println("Tahun Rilis : "+film1.getTahun());
        film1.setRating(9.0);
        System.out.println("Rating      : "+film1.getRating());
    }
}

