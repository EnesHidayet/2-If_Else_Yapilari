import java.util.Scanner;

public class Runner_Ornek_If_Else_5 {
    public static void main(String[] args) {

        /**
         * Ge�me notu 50 olan dersten ge�ip ge�medi�inizi s�yleyen program� olu�tural�m.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ders i�in 1. s�nav notunuzu giriniz...");
        int not1=scanner.nextInt();
        System.out.println("Ders i�in 2. s�nav notunuzu giriniz...");
        int not2=scanner.nextInt();

        int ortalama=(not1+not2)/2;

        if (ortalama>50){
            System.out.println("Dersi ge�tiniz...");
        }else System.out.println("�zg�n�z kald�n�z...");

    }
}
