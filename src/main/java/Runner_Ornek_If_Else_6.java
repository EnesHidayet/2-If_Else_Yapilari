import java.util.Scanner;

public class Runner_Ornek_If_Else_6 {
    public static void main(String[] args) {

        /**
         * Elimizde bir sosyal medya sitesine giri� i�in gerekli olan kullan�c� bilgileri olsun do�ru bilgilerin
         * girilip girilmedi�ini kontrol edelim.
         */

        String userName="eha";
        String password="135790";

        Scanner scanner=new Scanner(System.in);

        System.out.println("Kullan�c� ad�n�z� giriniz...");
        String kullaniciAdi=scanner.nextLine();
        System.out.println("�ifrenizi giriniz...");
        String sifre=scanner.nextLine();

        if (kullaniciAdi.equals(userName) && sifre.equals(password)){
            System.out.println("Giri� ba�ar�l�.");
        } else if (kullaniciAdi.equals(userName) || sifre.equals(password)) {
            System.out.println("Bir bilgi do�ru ancak di�er bilgi yanl��.");
        }else System.out.println("�ki bilgide yanl��.");


    }
}
