import java.util.Scanner;

public class Runner_Ornek_If_Else_1 {
    public static void main(String[] args) {

        /**
         * Girilen 5 sayýdan hangisinin büyük olduðunu ekrana yazdýralým.
         */

        Scanner scanner=new Scanner(System.in);
        int []sayilar = new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Lütfen "+(i+1)+". sayýyý giriniz...");
            sayilar[i]=scanner.nextInt();

        }

        int max=sayilar[0];


        for (int sayi:sayilar){
            if (sayi>max){
                max=sayi;
            }
        }
        System.out.println("En büyük sayý...:"+max);

    }
}
