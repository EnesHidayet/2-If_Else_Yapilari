import java.util.Scanner;

public class Runner_Ornek_If_Else_10 {
    public static void main(String[] args) {

        /**
         * Girilen say�n�n asal say� olup olmad���n� bulan uygulamay� yazal�m.
         */

        System.out.println("L�tfen asal olup olmad���n� kontrol etmek istedi�iniz say�y� giriniz...");
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
            System.out.println(sayi+" asald�r.");
        }else System.out.println(sayi+" asal de�ildir.");

    }
}
