package expsLoops;
import java.util.Scanner;
public class exp39 {
    public static void main(String[] args) {

        int n;
        Scanner imp = new Scanner(System.in);
        int top = 0;

        do {

            System.out.print("Bir sayı giriniz: ");
            n = imp.nextInt();
            if (n % 4 == 0) {
                top += n;
            } else System.out.println("Döngüden çıkıyorum");

        } while (n % 2 == 0);

        System.out.print("Sayıların toplamı: " + top);

    }
}


