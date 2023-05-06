package No2;
import java.util.Scanner;
public class ReverseKata {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan sebuah kalimat: ");
            String kalimat = input.nextLine();

            String kata = "";
            String hasil = "";

            for(int i=0; i<kalimat.length(); i++) {
                if(kalimat.charAt(i) == ' ') {
                    hasil = kata + " " + hasil;
                    kata = "";
                } else {
                    kata += kalimat.charAt(i);
                }
            }

            hasil = kata + " " + hasil;

            System.out.println("Hasil: " + hasil.trim());
        }
}

