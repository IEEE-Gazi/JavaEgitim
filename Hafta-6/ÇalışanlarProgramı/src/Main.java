public class Main {
    public static void main(String[] args) {
        /*
        Çalışanlar Programı
        
        Calisan Sınıfı Şeklinde Bir Üst Sınıf
        
        Calisan Sınıfından Türeyen Yazilimci adında Bir Alt Sınıf
        Calisan Sınıfından Türeyen Yonetici adında Bir Alt Sınıf
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz");
        String islemler = "İşlemler...\n" + "1.Yazılımcı İşlemleri\n" + "2.Yönetici İşlemleri\n" + "Çıkış q'ya basınız";
        System.out.println(islemler);
        while(true) {
            System.out.print("İşlemi seçiniz : ");
            String islem = scanner.nextLine();
            if(islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if(islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Ahmet Buğra","Yiğiter",191,"Java");
                String yazilimci_islem = "1.Format At\n" + "2.Bilgileri Göster\n" + "Çıkış q'ya basın.";
                System.out.println(yazilimci_islem);
                System.out.println("Bir işlem seçiniz : ");
                String y_islem = scanner.nextLine();
                while (true) {
                    if(y_islem.equals("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if(y_islem.equals("1")) {
                        System.out.println("İşlem Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if(y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }
                }
            }
            else if(islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Musa","Yıldız",123,300);
                String yonetici_islem = "Yönetici İşlemleri\n" + "1.Zam Yap\n" + "2.Bilgileri Goster\n" + "Çıkış için q'ya basınız";
                System.out.println(yonetici_islem);
                while(true) {
                    System.out.println("İşlemi Seçiniz : ");
                    String yon_islem = scanner.nextLine();
                    if(yon_islem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if(yon_islem.equals("1")) {
                        System.out.println("Zam Miktarı : ");
                        int zamMiktarı = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktarı);
                    }
                    else if(yon_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz yönetici işlemi...");
                    }
                }
            }
        }

    }
}
