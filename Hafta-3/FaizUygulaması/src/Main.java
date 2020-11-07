
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
        
        Faiz Oranı : %6

        */
        Scanner in = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz!");
        double anapara,vade;
        System.out.println("Anapara değerini giriniz : ");
        anapara = in.nextDouble();
        System.out.println("Kaç yıl yatırmak istiyorsunuz : ");
        vade = in.nextDouble();
        double toplamPara = anapara;
        double faizOrani = 0.06;
        for(int i = 1 ; i<=vade ; i++) {
            toplamPara = (toplamPara*faizOrani) + toplamPara;
            System.out.println(i + ". yılın sonunda toplam para: " + toplamPara);
        }
        
        
        
    }
}
