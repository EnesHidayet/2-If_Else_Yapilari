import java.util.Scanner;

public class Runner_Ornek_If_Else_10 {
    public static void main(String[] args) {

        /**
         * Girilen sayýnýn asal sayý olup olmadýðýný bulan uygulamayý yazalým.
         */

        System.out.println("Lütfen asal olup olmadýðýný kontrol etmek istediðiniz sayýyý giriniz...");
        int sayi=new Scanner(System.in).nextInt();
        boolean check=true;

        if (sayi==2){
            check=true;
        } else if (sayi==1) {
            check=false;
        }else
        for (int i=2;i<=sayi/2;i++){
            if (sayi%i==0){
                check=false;
                break;
            }
        }
        if (check==true){
            System.out.println(sayi+" asaldýr.");
        }else System.out.println(sayi+" asal deðildir.");

    }
}
