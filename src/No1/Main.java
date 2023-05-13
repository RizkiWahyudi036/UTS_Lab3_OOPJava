package No1;

public class Main {
    public static void main(String[] args) {
//        Objek
        Film film1 = new Film("Avengers - End Game", "Anthony Russo, Joe Russo", 2022, 9);
        Film film2 = new Film("Spiderman-No Way Home", "Jon Watts", 2029, 11);
        Film film3 = new Film("Guardian Of The Galaxy Volume 3","James Gunn",2029,10);
        System.out.println("-----------------------------------------------");
        film1.printMovieDetails();
        System.out.println("-----------------------------------------------");
        film2.printMovieDetails();
        System.out.println("-----------------------------------------------");

//        Contoh Melakukan Set And Get satu per satu

        System.out.println("Judul Film  : "+ film3.getJudul());
        System.out.println("Sutradara   : "+film3.getSutradara());
        System.out.println("Tahun Rilis : "+film3.getTahunRilis());
        System.out.println("Rating      : "+film3.getRating());
    }
}

