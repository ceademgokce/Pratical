package expsLoops;

import java.util.Scanner;

public class exp40 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();
        int sayac4=0, sayac5=0;

        System.out.println("5'in Kuvvetleri");
        for (int five = 1; five <= n; five *= 5) {
            System.out.println ( sayac5 + ". kuvveti ----> " +  five);
            sayac5++;
        }

        System.out.println("---------------------");

        System.out.println("4'in Kuvvetleri");
        for (int four = 1; four <= n; four *= 4) {
            System.out.println(sayac4 + ". kuvveti ----> " +  four);
            sayac4++;
        }
    }
}
