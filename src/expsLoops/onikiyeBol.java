package expsLoops;

import java.util.Scanner;

public class onikiyeBol {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = inp.nextInt();
        double ort, top = 0,counter = 0;

        for (int k = 1; k < a; k++) {
            if ((k %3 == 0)&&(k %4 == 0)) {
                System.out.println(k);
                top = top + k ;
                counter++ ;
            }
        }
        ort = top / counter;
        System.out.print("Sayıların ortalaması: "+ort);
    }
}


