import java.util.Scanner;

public class sinifiGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fiz, tur, kim, mzk, ort;
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextDouble();
        System.out.print("Fizik notunuzu giriniz: ");
        fiz = input.nextDouble();
        System.out.print("Türkçe notunuzu giriniz: ");
        tur = input.nextDouble();
        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextDouble();
        System.out.print("Müzik notunuzu giriniz: ");
        mzk = input.nextDouble();
        if ((0 > mat) || (mat > 100)) {
            System.out.print("Geçerli bir değer giriniz.");
        } else if ((0 > fiz) || (fiz > 100)) {
            System.out.print("Geçerli bir değer giriniz.");
        } else if ((0 > tur) || (tur > 100)) {
            System.out.print("Geçerli bir değer giriniz.");
        } else if ((0 > kim) && (kim > 100)) {
            System.out.print("Geçerli bir değer giriniz.");
        } else if ((0 > mzk) || (mzk > 100)) {
            System.out.print("Geçerli bir değer giriniz.");
        } else {
            ort = (mat + fiz + tur + kim + mzk) / 5;
            if (ort < 50) {
                System.out.print("Ortalamanız: " + ort + " Kaldınız Seneye tekrar gorusuruz.");
            } else {
                System.out.print("Ortalamanız: " + ort + " Tebrikler geçtiniz.");
            }
        }
    }
}
