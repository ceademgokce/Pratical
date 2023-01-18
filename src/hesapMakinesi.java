import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int n2 = input.nextInt();
        System.out.print("Yapacağınız işlemi giriniz.\n1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n");
        int islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.print("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma: " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.print("Bir sayı sıfıra bölünemez.");
                        break;
                    default:
                        System.out.print("Bölme: " + (n1 / n2));
                }
                break;
            default:
                System.out.print("Geçerli bir işlem seçiniz!");
        }
    }
}
