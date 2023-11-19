import java.util.Scanner;

public class Runner_Ornek_If_Else_9 {
    public static void main(String[] args) {

        /**
         * Motor hacmine göre ötv vergili fiyatýný hesaplayalým.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen aracýnýzýn motor hacmini giriniz.Örneðin 1580");
        double hacim=scanner.nextDouble();
        System.out.println("Lütfen aracýnýzýn fiyatýný giriniz.");
        double fiyat=scanner.nextDouble();

        if (hacim<1600){
            if (fiyat<184_000){
                fiyat=fiyat*1.45;
            } else if (fiyat<220_000) {
                fiyat=fiyat*1.5;
            } else if (fiyat<250_000) {
                fiyat=fiyat*1.6;
            } else if (fiyat<280_000) {
                fiyat=fiyat*1.7;
            }else fiyat=fiyat*1.8;

        } else if (hacim<2000) {
            if (fiyat<170_000){
                fiyat=fiyat*2.3;
            }else fiyat=fiyat*2.5;
            
        }else fiyat=fiyat*3.2;


    }
}
