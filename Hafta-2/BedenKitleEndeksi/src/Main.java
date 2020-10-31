import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
        Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini hesaplayın ve şu kurallara göre ekrana şu yazıları yazdırın.

            Beden Kitle İndeksi: Kilo / Boy(m) *  Boy(m)

            BKİ 18.5'un altındaysa -------> Zayıf

            BKİ 18.5 ile 25 arasındaysa ------> Normal

            BKİ 25 ile 30 arasındaysa --------> Fazla Kilolu

            BKİ 30'un üstündeyse -------------> Obez
        */
        Scanner in = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz : (m)");
        double boy = in.nextDouble();
        System.out.println("Kilonuzu Giriniz : ");
        double kilo = in.nextDouble();
        double bki = kilo / (boy*boy);
        if(bki < 18.5) {
            System.out.println("Beden Kitle İndeksi : " + bki);
            System.out.println("Beden Kitle İndeksinize Göre Zayıfsınız.");
        }
        else if(18.5 < bki && bki < 25) { // &&(ve-and) ||(veya-or)
            System.out.println("Beden Kitle İndeksi : " + bki);
            System.out.println("Beden Kitle İndeksinize Göre Normalsiniz");
        }
        else if(25 < bki && bki < 30) {
            System.out.println("Beden Kitle İndeksi : " + bki);
            System.out.println("Beden kitle indeksinize göre fazla kilolusunuz");
        }
        else if(bki > 30) {
            System.out.println("Beden Kitle İndeksi : " + bki);
            System.out.println("Obez kategorisine giriyorsunuz.");
            System.out.println("Sağlık Kuruluşlarına başvurun.");
        }
        
    }
}
