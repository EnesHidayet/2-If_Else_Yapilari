import java.util.Scanner;

public class Runner_Ornek_If_Else_3 {
    public static void main(String[] args) {

        /**
         * Bir maddenin asit veya alkali deðerini anlamak için kullandýðýmýz ölçüye pH (potansiyel hidrojen) denir.
         * Maddenin içindeki asit nitelikli hidrojen iyonlarýnýn yoðunluðuna göre ölçüm yapýlýr.
         * pH cetveli 0 – 14 arasýdýr. 0 aþýrý asit, 14 de aþýrý alkali demektir.
         *
         * 7 nötr, 0-3 arasý aþýrý asit ve 11-14 arasý aþýrý alkali kabul edelim...
         * girilen pH deðerine göre ekrana hangi gruba ait olduðunuz yazdýralým.
         */

        System.out.println("Lütfen sorgulamak istediðiniz pH deðerini giriniz...");
        double ph=new Scanner(System.in).nextDouble();

        if (ph==7){
            System.out.println("pH deðeri nötr kategorisinde yer almaktadýr.");
        } else if (ph>7 && ph<11){
            System.out.println("pH deðeri alkali kategorisinde yer almaktadýr.");
        } else if (ph>=11) {
            System.out.println("pH deðeri aþýrý alkali kategorisinde yer almaktadýr.");
        } else if (ph<7 && ph>3) {
            System.out.println("pH deðeri asit kategorisinde yer almaktadýr.");
        } else if (ph<=3) {
            System.out.println("pH deðeri aþýrý asit kategorisinde yer almaktadýr.");
        }else
            System.out.println("Geçersiz pH deðeri girdiniz 0 ile 14 arasýnda olmalýdýr.");

    }
}
