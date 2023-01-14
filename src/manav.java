//Meyveler ve KG Fiyatları
//
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL;

import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        double armutBF= 2.14;
        double elmaBF= 3.67;
        double domatesBF=1.11;
        double muzBF=0.95;
        double patlicanBF=5.00;
        System.out.print("Armut Kaç Kilo? : ");
        double armutKG = girdi.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        double elmaKG = girdi.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        double domatesKG = girdi.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        double muzKG = girdi.nextDouble();
        System.out.print("Patlican Kaç Kilo? : ");
        double patlicanKG = girdi.nextDouble();
        double tutar = armutKG*armutBF+elmaKG*elmaBF+domatesKG*domatesBF+muzKG*muzBF+patlicanKG*patlicanBF;
        System.out.print("Toplam Tuar: " + tutar + " TL");


    }
}
