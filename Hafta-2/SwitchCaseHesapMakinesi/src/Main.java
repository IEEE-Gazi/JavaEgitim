
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın.
        System.out.println("***********************************");
        String islemler = "1.Toplama\n" + "2.Çıkarma\n" + "3.Çarpma\n" + "4.Bölme";
        System.out.println(islemler);
        System.out.println("***********************************");
        System.out.println("İşleminizi giriniz(1-2-3-4) : ");
        Scanner in = new Scanner(System.in);
        int islem = in.nextInt();
        switch (islem) {
            case 1:
                System.out.println("İlk Sayıyı giriniz : ");
                int toplama_sayi1 = in.nextInt();
                System.out.println("İkinci Sayıyı giriniz : ");
                int toplama_sayi2 = in.nextInt();
                int toplam = toplama_sayi1 + toplama_sayi2;
                System.out.println("Sonuç = " + toplam);
                break;
            case 2:
                System.out.println("İlk Sayıyı giriniz : ");
                int cikarma_sayi1 = in.nextInt();
                System.out.println("İkinci Sayıyı giriniz : ");
                int cikarma_sayi2 = in.nextInt();
                int cikarma = cikarma_sayi1 - cikarma_sayi2;
                System.out.println("Sonuç = " + cikarma);
                break;
            case 3:
                System.out.println("İlk Sayıyı giriniz : ");
                int carpma_sayi1 = in.nextInt();
                System.out.println("İkinci Sayıyı giriniz : ");
                int carpma_sayi2 = in.nextInt();
                int carpma = carpma_sayi1 * carpma_sayi2;
                System.out.println("Sonuç = " + carpma);
                break;
            case 4:
                System.out.println("İlk Sayıyı giriniz : ");
                double bolme_sayi1 = in.nextDouble();
                System.out.println("İkinci Sayıyı giriniz : ");
                double bolme_sayi2 = in.nextDouble();
                double bolme = bolme_sayi1/bolme_sayi2;
                System.out.println("Sonuç = " + bolme);
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz!");
                break;
        }
    }
}
