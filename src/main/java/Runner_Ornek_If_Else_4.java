import java.util.Scanner;

public class Runner_Ornek_If_Else_4 {
    public static void main(String[] args) {

        /**
         * �stenilen kadar girilen say�dan ka��n�n 50 den k���k oldu�unu bulal�m.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ka� adet say� girmek istedi�inizi belirtiniz...");
        int adet=scanner.nextInt();
        int sayac=0;
        for (int i=0;i<adet;i++){
            System.out.println((i+1)+". say�y� giriniz...");
            int sayi=scanner.nextInt();
            if (sayi<50){
                sayac++;
            }
        }

        System.out.println("Girilen say�lar aras�nda 50 den k���k "+sayac+" adet say� var.");

    }
}
