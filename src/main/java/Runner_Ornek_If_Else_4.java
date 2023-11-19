import java.util.Scanner;

public class Runner_Ornek_If_Else_4 {
    public static void main(String[] args) {

        /**
         * Ýstenilen kadar girilen sayýdan kaçýnýn 50 den küçük olduðunu bulalým.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç adet sayý girmek istediðinizi belirtiniz...");
        int adet=scanner.nextInt();
        int sayac=0;
        for (int i=0;i<adet;i++){
            System.out.println((i+1)+". sayýyý giriniz...");
            int sayi=scanner.nextInt();
            if (sayi<50){
                sayac++;
            }
        }

        System.out.println("Girilen sayýlar arasýnda 50 den küçük "+sayac+" adet sayý var.");

    }
}
