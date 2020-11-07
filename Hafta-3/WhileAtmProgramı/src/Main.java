
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*

        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.
        
        İşlemler 
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q
        
        */
        int bakiye = 1000;
        Scanner in = new Scanner(System.in);
        String islemler = "***İşlemler***\n" + "1.İşlem : Bakiye Öğrenme\n" + "2.İşlem : Para Çekme\n" + "3.İşlem : Para Yatırma\n" + "Çıkış için q'ya basınız";
        System.out.println("****************");
        System.out.println(islemler);
        System.out.println("****************");
        System.out.println("İşlemi Seçiniz : ");
        while(true) {

            String islem = in.nextLine();
            if(islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor!");
                break;
            }
            else if(islem.equals("1")) {
                System.out.println("Bakiyeniz görüntüleniyor!");
                System.out.println("Bakiyeniz : " + bakiye);
            }
            else if(islem.equals("2")) {
                System.out.println("Çekeceğiniz miktari giriniz : ");
                int cekilecek_miktar = in.nextInt();
                in.nextLine();
                if(cekilecek_miktar > bakiye) {
                    System.out.println("Bakiyeniz yetersiz!");
                    System.out.println("Bu miktarda para çekemezsiniz!");
                }
                else {
                    bakiye -= cekilecek_miktar;
                    System.out.println("Paranız çekildi!");
                    System.out.println("Güncel Bakiyeniz : " + bakiye);
                }
            }
            else if(islem.equals("3")) {
                System.out.println("Yatırılacak miktarı giriniz : ");
                int yatirilacak_miktar = in.nextInt();
                in.nextLine();
                bakiye += yatirilacak_miktar;
                System.out.println("Paranız yatırıldı!");
                System.out.println("Güncel Bakiyeniz : " + bakiye);
            }
            else {
                System.out.println("Yanlış bir değer girdiniz!");
                System.out.println("Lütfen doğru bir değer giriniz!");
            }
        }
        
        
    }
}
