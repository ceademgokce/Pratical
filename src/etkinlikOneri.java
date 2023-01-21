import java.util.Scanner;
public class etkinlikOneri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        double derece=input.nextDouble();


        if ((derece)<5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if ((5<=(derece)) && ((derece)<15)) {
            System.out.print("Sinemaya gidebilirsiniz.");
        } else if ((15<=(derece)) && ((derece)<25)) {
            System.out.print("Piknik yapabilirsiniz.");
        } else if (25<= derece) {
            System.out.print("Yüzebilirsiniz.");
        }
        else {
        }
    }

    }

