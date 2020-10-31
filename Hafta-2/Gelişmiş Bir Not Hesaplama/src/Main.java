
import java.util.Scanner;
public class Main {
    /*
    Kullanıcıdan Vize1,Vize2  ve Final notunu alarak bir harf hesaplama sistemi yapmaya çalışın. 



    Vize1 toplam notun %30'una etki edecek.

    Vize2 toplam notun %30'una etki edecek.

    Final toplam notun %40'ına etki edecek.


    Toplam Not >=  90 -----> AA

    Toplam Not >=  85 -----> BA

    Toplam Not >=  80 -----> BB

    Toplam Not >=  75 -----> CB

    Toplam Not >=  70 -----> CC

    Toplam Not >=  65 -----> DC

    Toplam Not >=  60 -----> DD

    Toplam Not >=  55 -----> FD

    Toplam Not <  55 -----> FF

    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vize1 notunuzu giriniz : ");
        double vize1 = in.nextDouble();
        System.out.println("Vize2 notunuzu giriniz : ");
        double vize2 = in.nextDouble();
        System.out.println("Final notunuzu giriniz : ");
        double final_not = in.nextDouble();
        double toplam_not = ((vize1*3)/10) + ((vize2*3)/10) + ((final_not*4)/10);
        if(toplam_not >= 90) {
            System.out.println("Notunuz : " + toplam_not);
            System.out.println("Harf Notunuz : AA");
        }
        else if(toplam_not >= 85) {
            System.out.println("Notunuz : " + toplam_not);
            System.out.println("Harf Notunuz : BA");
        }
        else if(toplam_not >= 80) {
            System.out.println("Notunuz : " + toplam_not);
            System.out.println("Harf Notunuz : BB");
        }
        else if(toplam_not >= 75) {
            System.out.println("Notunuz : " + toplam_not);
            System.out.println("Harf Notunuz : CB");

        }
        else if(toplam_not >= 70) {
            System.out.println("Notunuz : " + toplam_not);
            System.out.println("Harf Notunuz : CC");
        }
        else if(toplam_not >= 65) {
            System.out.println("Notunuz : " + toplam_not);
            System.out.println("Harf Notunuz : DC");
        }
        else if(toplam_not >= 60) {
            System.out.println("Notunuz : " + toplam_not);
            System.out.println("Harf Notunuz : DD");
        }
        else {
            System.out.println("Notunuz : " + toplam_not);
            System.out.println("Harf Notunuz : FF");
            System.out.println("Malesef dersten kaldınız.");
        }
    }
}
