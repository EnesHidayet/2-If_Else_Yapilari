import java.util.Scanner;

public class Runner_Ornek_If_Else_8 {
    public static void main(String[] args) {

        /**
         * Kan grubuna göre kimlerden kan alýp kimlere verebildiðinizi yazdýran bir uygulama yazalým.
         */

        System.out.println("Lütfen kan grubunuzu giriniz...");
        String kan=new Scanner(System.in).nextLine();

        if (kan.toUpperCase().equals("A")){
            System.out.println("A ve 0 grubundan kan alabilir - A ve AB grubuna kan verebilir.");
        } else if (kan.toUpperCase().equals("B")) {
            System.out.println("B ve 0 gurubundan kan alabilir - B ve AB grubuna kan verebilir.");
        } else if (kan.toUpperCase().equals("AB")) {
            System.out.println("Genel alýcý tüm kan gruplarýndan kan alabilir - AB grubuna kan verebilir.");
        } else if (kan.toUpperCase().equals("0")){
            System.out.println("0 grubundan kan alabilir - Genel verici tüm kan gruplarýna kan verebilir.");
        }else System.out.println("Geçersiz kan grubu girdiniz.");
            


    }
}
