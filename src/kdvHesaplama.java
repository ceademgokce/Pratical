//Kdv oranı %18

import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Ücret Giriniz: ");
    double ucret = input.nextDouble();
    double kdvli = ucret * 1.18;
    double kdvsiz= ucret * 1.00;

    System.out.println("Kdvli fiyat: "+kdvli);
    System.out.print("Kdvsiz fiyat: "+kdvsiz);

    }
}
