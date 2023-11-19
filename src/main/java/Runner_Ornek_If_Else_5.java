import java.util.Scanner;

public class Runner_Ornek_If_Else_5 {
    public static void main(String[] args) {

        /**
         * Geçme notu 50 olan dersten geçip geçmediðinizi söyleyen programý oluþturalým.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ders için 1. sýnav notunuzu giriniz...");
        int not1=scanner.nextInt();
        System.out.println("Ders için 2. sýnav notunuzu giriniz...");
        int not2=scanner.nextInt();

        int ortalama=(not1+not2)/2;

        if (ortalama>50){
            System.out.println("Dersi geçtiniz...");
        }else System.out.println("Üzgünüz kaldýnýz...");

    }
}
