import java.util.Scanner;
public class notHesaplama {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        int mat,fizik,kimya,bio,turkce;

        System.out.print("Matematik Notunuzu Girin: ");
        mat=girdi.nextInt();

        System.out.print("Fizik Notunuzu Girin: ");
        fizik=girdi.nextInt();

        System.out.print("Kimya Notunuzu Girin: ");
        kimya=girdi.nextInt();

        System.out.print("Biyoloji Notunuzu Girin: ");
        bio=girdi.nextInt();

        System.out.print("Türkçe Notunuzu Girin: ");
        turkce=girdi.nextInt();

        double ortalama = ((mat+fizik+kimya+bio+turkce)/5.0);

        boolean deger=(ortalama>=50);  //Burada geçme-kalma durumunu irdeledim.
        String yorum = deger ? "Harika!! Gectin, Notun: ":"Maalesef :(( Kaldın, Notun: ";
        System.out.print(yorum + ortalama);
//Bu kadar

    }

    }
