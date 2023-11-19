import java.util.Scanner;

public class Runner_Ornek_If_Else_2 {
    public static void main(String[] args) {

        /**
         * Vücut Kitle Ýndeksi Deðerleri
         * Vücut kitle endeksi, yetiþkin bireyler için belirli deðer aralýklarýný içerir.
         * Beden kitle indeksi hesaplandýktan sonra sonuçlar kiþinin saðlýðý için çeþitli fikirler verir.
         *
         *  hesaplama = kilo/(boy*boy);
         *
         * 18,5 kg/m2 ve daha düþük deðerler = Zayýf
         * 18,5 ve 24,9 kg/m2 arasýndaki deðerler = Normal aðýrlýkta
         * 25,0 ve 29,9 kg/m2 arasýndaki deðerler = Kilolu
         * 30,0 ve 34,9 kg/m2 arasýndaki deðerler = 1. derece obezite
         * 35,0 ve 39,9 kg/m2 arasýndaki deðerler = 2. derece obezite
         * 40 kg/m2 ve üzerindeki deðerler = 3. derece obezite
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen vücut kitle indeksinizin hesaplanabilmesi için kilonuzu kg cinsinden giriniz.");
        double kilo=scanner.nextDouble();
        System.out.println("Lütfen vücut kitle indeksinizin hesaplanabilmesi için boyunuzu metre cinsinden giriniz.");
        double boy=scanner.nextDouble();

        double index=kilo/(boy*boy);


        if (index<18.5){
            System.out.println("Zayýfsýnýz...");
        } else if (index<24.9) {
            System.out.println("Normal aðýrlýktasýnýz...");
        }else if (index<29.9) {
            System.out.println("Kilolusunuz...");
        }else if (index<34.9) {
            System.out.println("1. derece obezitesiniz...");
        }else if (index<39.9) {
            System.out.println("2. derece obezitesiniz...");
        }else{
            System.out.println("3. derece obezitesiniz...");
        }


    }
}
