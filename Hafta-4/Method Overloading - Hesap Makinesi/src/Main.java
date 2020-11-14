
import java.util.Scanner;


public class Main {
    /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya çalışın.
    Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.

    */   
    public static int cikarma(int a,int b) {
        return (a-b);
    }
    public static double bolme(int a,int b) {
        return ((double)a/b);
    }//4 ==> 4.0, 15 ==> 15.0
    public static int toplama(int a,int b) {
        return (a+b);
    }
    public static int toplama(int a,int b,int c) {
        return (a+b+c);
    }
    public static int carpma(int a,int b) {
        return (a*b);
    }
    public static int carpma(int a,int b,int c) {
        return(a*b*c);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String islemler = "1.Toplama İşlemi\n" + "2.Çıkarma İşlemi\n" + "3.Çarpma İşlemi\n" + "4.Bölme İşlemi\n" + "Çıkış için q'ya basınız!";
        System.out.println("***********************");
        System.out.println("Hesap Makinesi");
        System.out.println(islemler);
        System.out.println("***********************");

        while(true) {
            System.out.println("İşlemi Seçiniz : ");
            String islem = in.nextLine();
            if(islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor!");
                break;
            }
            else if(islem.equals("1")) {
                System.out.println("Kaç değer toplayacaksınız(2 veya 3) : ");
                int kacsayi = in.nextInt();
                if(kacsayi == 2) {
                    System.out.println("a : ");
                    int a = in.nextInt();
                    System.out.println("b : ");
                    int b = in.nextInt();
                    in.nextLine();
                    System.out.println("Girilen sayıların toplamı : " + toplama(a,b));
                }
                else if(kacsayi == 3) {
                    System.out.println("a : ");
                    int a = in.nextInt();
                    System.out.println("b : ");
                    int b = in.nextInt();
                    System.out.println("c : ");
                    int c = in.nextInt();
                    in.nextLine();
                    System.out.println("Girilen sayıların toplamı : " + toplama(a,b,c));
                }
                else {
                    System.out.println("Bunun için uygun metod bulunmuyor!");
                }
            }
            else if(islem.equals("2")) {
                System.out.println("a : ");
                int a = in.nextInt();
                System.out.println("b : ");
                int b = in.nextInt();
                in.nextLine();
                System.out.println("Girilen sayıların farkı : " + cikarma(a,b));
            }
            else if(islem.equals("3")) {
                System.out.println("Kaç değer çarpmak istiyorsunuz(2 veya 3) : ");
                int kacsayi = in.nextInt();
                if(kacsayi == 2) {
                    System.out.println("a : ");
                    int a = in.nextInt();
                    System.out.println("b : ");
                    int b = in.nextInt();
                    in.nextLine();
                    System.out.println("Girilen sayıların çarpımı : " + carpma(a,b));
                }
                else if(kacsayi == 3) {
                    System.out.println("a : ");
                    int a = in.nextInt();
                    System.out.println("b : ");
                    int b = in.nextInt();
                    System.out.println("c : ");
                    int c = in.nextInt();
                    in.nextLine();
                    System.out.println("Girilen sayıların çarpımı : " + carpma(a,b,c));
                }
                else {
                    System.out.println("Bunun için uygun metod bulunmuyor!");
                }
            }
            else if(islem.equals("4")) {
                System.out.println("a : ");
                int a = in.nextInt();
                System.out.println("b : ");
                int b = in.nextInt();
                in.nextLine();
                System.out.println("Girilen sayıların bölümü : " + bolme(a,b));
            }
            else {
                System.out.println("Yanlış işlem!");
            }
        }
        
        
    }
}
