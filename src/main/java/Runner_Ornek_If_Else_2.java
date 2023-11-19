import java.util.Scanner;

public class Runner_Ornek_If_Else_2 {
    public static void main(String[] args) {

        /**
         * V�cut Kitle �ndeksi De�erleri
         * V�cut kitle endeksi, yeti�kin bireyler i�in belirli de�er aral�klar�n� i�erir.
         * Beden kitle indeksi hesapland�ktan sonra sonu�lar ki�inin sa�l��� i�in �e�itli fikirler verir.
         *
         *  hesaplama = kilo/(boy*boy);
         *
         * 18,5 kg/m2 ve daha d���k de�erler = Zay�f
         * 18,5 ve 24,9 kg/m2 aras�ndaki de�erler = Normal a��rl�kta
         * 25,0 ve 29,9 kg/m2 aras�ndaki de�erler = Kilolu
         * 30,0 ve 34,9 kg/m2 aras�ndaki de�erler = 1. derece obezite
         * 35,0 ve 39,9 kg/m2 aras�ndaki de�erler = 2. derece obezite
         * 40 kg/m2 ve �zerindeki de�erler = 3. derece obezite
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("L�tfen v�cut kitle indeksinizin hesaplanabilmesi i�in kilonuzu kg cinsinden giriniz.");
        double kilo=scanner.nextDouble();
        System.out.println("L�tfen v�cut kitle indeksinizin hesaplanabilmesi i�in boyunuzu metre cinsinden giriniz.");
        double boy=scanner.nextDouble();

        double index=kilo/(boy*boy);


        if (index<18.5){
            System.out.println("Zay�fs�n�z...");
        } else if (index<24.9) {
            System.out.println("Normal a��rl�ktas�n�z...");
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
