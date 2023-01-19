import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, soru, password2;
        System.out.print("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        password = input.nextLine();
        if ((username.equals("patika123")) && (password.equals("java123"))) {
            System.out.print("Girişiniz yapıldı.");
        }else{
            System.out.print("Şifreniz hatalı.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz?");
            soru = input.nextLine();
            if (soru.equals("Evet")){
                System.out.print("Yeni sifrenizi giriniz.");
                System.out.print("Yeni sifre: ");
                password2 = input.nextLine();
                if (password2.equals("java123")) {
                    System.out.print("Şifreniz oluşturulamadı.Lütfen başka şifre giriniz.");
                }else{
                    System.out.print("Sifreniz olusturuldu.");}
            } else {
                System.out.print("Ayrıldınız.");}
        }
        }
    }

