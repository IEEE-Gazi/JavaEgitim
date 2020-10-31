
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan Alınan 3 Sayıdan En Büyük Sayıyı Bulma
        Scanner in = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = in.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = in.nextInt();
        System.out.println("Üçüncü sayıyı giriniz : ");
        int c = in.nextInt();
        int maks = -1;
        if(a > b && a > c) {
            maks = a;
        }
        else if(b > a && b > c) {
            maks = b;
        }
        else if(c > a && c > b) {
            maks = c;
        }
        System.out.println("Maksimum Değer : " + maks);
        
    }
    
}
