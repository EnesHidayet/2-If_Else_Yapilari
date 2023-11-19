import java.util.Scanner;

public class Runner_Ornek_If_Else_6 {
    public static void main(String[] args) {

        /**
         * Elimizde bir sosyal medya sitesine giriþ için gerekli olan kullanýcý bilgileri olsun doðru bilgilerin
         * girilip girilmediðini kontrol edelim.
         */

        String userName="eha";
        String password="135790";

        Scanner scanner=new Scanner(System.in);

        System.out.println("Kullanýcý adýnýzý giriniz...");
        String kullaniciAdi=scanner.nextLine();
        System.out.println("Þifrenizi giriniz...");
        String sifre=scanner.nextLine();

        if (kullaniciAdi.equals(userName) && sifre.equals(password)){
            System.out.println("Giriþ baþarýlý.");
        } else if (kullaniciAdi.equals(userName) || sifre.equals(password)) {
            System.out.println("Bir bilgi doðru ancak diðer bilgi yanlýþ.");
        }else System.out.println("Ýki bilgide yanlýþ.");


    }
}
