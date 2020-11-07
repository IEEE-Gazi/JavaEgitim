
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        // while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.
        Scanner in = new Scanner(System.in);
        String sys_kullanici_adi = "yigiter";
        String sys_kullanici_sifre = "123456";
        System.out.println("********************");
        System.out.println("Kullanıcı girişine hoşgeldiniz!");
        System.out.println("********************");
        int giris_hakki = 3;
        while(true) {
            System.out.println("Kullanıcı Adı : ");
            String kullanici = in.nextLine();
            System.out.println("Şifre : ");
            String sifre = in.nextLine();
            if(kullanici.equals(sys_kullanici_adi) && sifre.equals(sys_kullanici_sifre)) {
                System.out.println("Hoşgeldiniz : " + kullanici);
                break;
            }
            else if(kullanici.equals(sys_kullanici_adi) && !sifre.equals(sys_kullanici_sifre)) {
                System.out.println("Şifreniz yanlış!");
                giris_hakki--;
                System.out.println("Kalan giriş hakkınız : " + giris_hakki);
            }
            else if(!kullanici.equals(sys_kullanici_adi) && sifre.equals(sys_kullanici_sifre)) {
                System.out.println("Kullanıcı adınız hatalı!");
                giris_hakki--;
                System.out.println("Kalan giriş hakkınız : " + giris_hakki);
            }
            else if(!kullanici.equals(sys_kullanici_adi) && !sifre.equals(sys_kullanici_sifre)) {
                System.out.println("Kullanıcı adınız ve şifreniz hatalı!");
                giris_hakki--;
                System.out.println("Kalan giriş hakkınız : " +giris_hakki);
            }
            if(giris_hakki == 0) {
                System.out.println("Giriş hakkınız bitti!");
                System.out.println("Programdan çıkılıyor!");
                break;
            }
        }

        
    }
}
