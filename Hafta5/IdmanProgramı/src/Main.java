import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Idman Oluşturma Programı
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Programına Hoşgeldiniz...");
        String idmanlar = "Geçerli Hareketler...\n"
                + "Burpee\n"
                +"Pushup(Şınav)\n"
                +"Situp(Mekik)\n"
                +"Squat";
        Idman idman1 = new Idman(20,20,20,20);
        while(idman1.idmanBittiMi() == false) {
            System.out.println(idmanlar);
            System.out.println("Hangi hareketi yapmak istiyorsunuz : ");
            String hareketTuru = scanner.nextLine();
            System.out.println("Bu hareketten kaç adet yapacaksınız : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman1.hareketYap(hareketTuru,sayi);
        }
        System.out.println("Programını başarıyla tamamladın! Tebrikler!");
    }
}
