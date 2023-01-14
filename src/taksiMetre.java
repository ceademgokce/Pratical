import java.util.Scanner;
class taksiMetre {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double Mesafe,Tutar,deger;
        System.out.print("KM mesafeyi girin: ");
        Mesafe = girdi.nextDouble();
        System.out.println("Hesaplaniyor Lutfen Bekleyiniz... ");

        Tutar = Mesafe*2.20;

        Tutar = (20>= Tutar) ? 20 : Tutar+10 ;
        System.out.println(" ");
        System.out.println("Odenecek Tutar: "+ Tutar);

    }
}