import java.util.Scanner;
public class burcSorgulama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int gun;
        String burc=null, ay;
        boolean isError=false;

        System.out.print("Ay Giriniz: ");
        ay=inp.nextLine();
        System.out.print("Gun Giriniz: ");
        gun=inp.nextInt();

        if (ay.equals("1") || ay.equals("Ocak")) {
            if ((1<=gun)&&(gun<=31)){
                if (gun<=21){
                burc = "Oglak";}
                else {
                burc = "Kova";
                }
            } else {
                isError=true;
            }
        }
        else
            isError=true;

if (isError) {
    System.out.print("Hatalı bir giriş yaptınız.");
}else
    System.out.print("Burcunu:" + burc);







    }
}
