import java.util.Scanner;

public class Runner_Ornek_If_Else_8 {
    public static void main(String[] args) {

        /**
         * Kan grubuna g�re kimlerden kan al�p kimlere verebildi�inizi yazd�ran bir uygulama yazal�m.
         */

        System.out.println("L�tfen kan grubunuzu giriniz...");
        String kan=new Scanner(System.in).nextLine();

        if (kan.toUpperCase().equals("A")){
            System.out.println("A ve 0 grubundan kan alabilir - A ve AB grubuna kan verebilir.");
        } else if (kan.toUpperCase().equals("B")) {
            System.out.println("B ve 0 gurubundan kan alabilir - B ve AB grubuna kan verebilir.");
        } else if (kan.toUpperCase().equals("AB")) {
            System.out.println("Genel al�c� t�m kan gruplar�ndan kan alabilir - AB grubuna kan verebilir.");
        } else if (kan.toUpperCase().equals("0")){
            System.out.println("0 grubundan kan alabilir - Genel verici t�m kan gruplar�na kan verebilir.");
        }else System.out.println("Ge�ersiz kan grubu girdiniz.");
            


    }
}
