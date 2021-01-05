import java.util.Scanner;

public class Main {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir() {
        System.out.println("\t0-İşlemleri Görüntüle");
        System.out.println("\t1-Şarkıcıları Görüntüle");
        System.out.println("\t2-Şarkıcı Ekle");
        System.out.println("\t3-Şarkıcı Güncelle");
        System.out.println("\t4-Şarkıcı Sil");
        System.out.println("\t5-Şarkıcı Ara");
        System.out.println("\t6-Uygulamadan Çık");

    }
    public static void sarkicilari_goruntule() {
        sarkicilar.sarkicilari_bastir();
    }
    public static void sarkici_ekle() {
        System.out.print("Eklemek İstediğiniz Şarkıcının İsmi : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_guncelle() {
        System.out.print("Güncellemek istediğiniz pozisyon(1,2,3,4,...) : ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Yeni isim : ");
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeni_isim,pozisyon);
    }
    public static void sil() {
        System.out.print("Silmek istediğiniz pozisyon(1,2,3,...) : ");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon);
    }
    public static void ara() {
        System.out.print("Aramak istediğiniz şarkıcı : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }
    public static void main(String[] args) {
        System.out.println("\tŞarkıcı Uygulamasına Hoşgeldiniz...");
        islemleri_bastir();
        boolean cikis = false;
        int islem;
        while (!cikis) {
            System.out.print("Bir İşlem Seçiniz : ");
            islem = scanner.nextInt();
            scanner.nextLine();
            switch (islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkicilari_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
                default:
                    System.out.println("Yanlış İşlem Girdiniz!");
                    System.out.println("Lütfen doğru bir işlem seçiniz!");
                    islemleri_bastir();
            }
        }

    }

}
