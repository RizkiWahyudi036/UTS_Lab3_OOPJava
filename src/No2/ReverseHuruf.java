package No2;
import java.util.Scanner;
public class ReverseHuruf {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan Kata atau Kalimat : ");
            String kata = input.nextLine();

            String hasil = "";
            for(int i=kata.length()-1; i>=0; i--) {
                hasil += kata.charAt(i);
            }

            System.out.println("Hasil Reverse Huruf : " + hasil);
        }
    }
