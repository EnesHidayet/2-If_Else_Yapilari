import java.util.Scanner;

public class Runner_Ornek_If_Else_7 {
    public static void main(String[] args) {

        /**
         * Girilen say�lar�n tek mi �ift mi oldu�unu bulan bir yap� kural�m.
         */

        System.out.println("L�tfen bir say� giriniz...");
        int in=new Scanner(System.in).nextInt();

        if (in%2==0){
            System.out.println("Say� �ifttir.");
        }else System.out.println("Say� tektir.");

    }
}
