import java.util.Scanner;

public class Runner_Ornek_If_Else_3 {
    public static void main(String[] args) {

        /**
         * Bir maddenin asit veya alkali de�erini anlamak i�in kulland���m�z �l��ye pH (potansiyel hidrojen) denir.
         * Maddenin i�indeki asit nitelikli hidrojen iyonlar�n�n yo�unlu�una g�re �l��m yap�l�r.
         * pH cetveli 0 � 14 aras�d�r. 0 a��r� asit, 14 de a��r� alkali demektir.
         *
         * 7 n�tr, 0-3 aras� a��r� asit ve 11-14 aras� a��r� alkali kabul edelim...
         * girilen pH de�erine g�re ekrana hangi gruba ait oldu�unuz yazd�ral�m.
         */

        System.out.println("L�tfen sorgulamak istedi�iniz pH de�erini giriniz...");
        double ph=new Scanner(System.in).nextDouble();

        if (ph==7){
            System.out.println("pH de�eri n�tr kategorisinde yer almaktad�r.");
        } else if (ph>7 && ph<11){
            System.out.println("pH de�eri alkali kategorisinde yer almaktad�r.");
        } else if (ph>=11) {
            System.out.println("pH de�eri a��r� alkali kategorisinde yer almaktad�r.");
        } else if (ph<7 && ph>3) {
            System.out.println("pH de�eri asit kategorisinde yer almaktad�r.");
        } else if (ph<=3) {
            System.out.println("pH de�eri a��r� asit kategorisinde yer almaktad�r.");
        }else
            System.out.println("Ge�ersiz pH de�eri girdiniz 0 ile 14 aras�nda olmal�d�r.");

    }
}
