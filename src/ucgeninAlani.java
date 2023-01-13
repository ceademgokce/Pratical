import java.util.Scanner;
public class ucgeninAlani {
    public static void main(String[] args) {

        int a,b,c; double u,Alan;

        Scanner girdiler= new Scanner(System.in);
        System.out.print("1. KENARI GIRINIZ: ");
        a = girdiler.nextInt();
        System.out.print("2. KENARI GIRINIZ: ");
        b = girdiler.nextInt();
        System.out.print("3. KENARI GIRINIZ: ");
        c = girdiler.nextInt();

        u = (a+b+c)/2.0;
        Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("UCGENIN ALANI: " + Alan+ "m²");

    }
}