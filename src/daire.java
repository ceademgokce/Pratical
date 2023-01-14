

import java.util.Scanner;
public class daire {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String birim;
            System.out.print("Birim giriniz: ");
            birim = input.nextLine();
            double r, alfa, alan;
            System.out.print("Parcanin yari capi: ");
            r = input.nextDouble();
            System.out.print("Parcanin acisini girin: ");
            alfa=input.nextDouble();
            alan = (3.14*(r*r)*alfa)/360.0;
            System.out.print("Parcanin alani: " + alan + " "+ birim + "kare");




    }
}
