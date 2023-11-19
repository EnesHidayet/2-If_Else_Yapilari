import java.util.Scanner;

public class Runner_Ornek_If_Else_7 {
    public static void main(String[] args) {

        /**
         * Girilen sayýlarýn tek mi çift mi olduðunu bulan bir yapý kuralým.
         */

        System.out.println("Lütfen bir sayý giriniz...");
        int in=new Scanner(System.in).nextInt();

        if (in%2==0){
            System.out.println("Sayý çifttir.");
        }else System.out.println("Sayý tektir.");

    }
}
