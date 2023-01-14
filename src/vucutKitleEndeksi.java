
import java.util.Scanner;
public class vucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,boy,indeks;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu (kg cinsinden) giriniz: ");
        kilo=input.nextDouble();
        indeks=kilo/(boy*boy);
        System.out.print("Vucut kitle indeksiniz: " + indeks);

    }
}
