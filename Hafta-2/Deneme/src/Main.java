import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*int a = 5;
        int b = 10;*/
        /*if(a > b) {
            System.out.println("Gazi Üniversitesi");
        }*/
        /*if(20<18) {
            System.out.println("20 büyüktür 18");

        }
        else {
            System.out.println("18 20'den büyük değildir");
            System.out.println("Gazi Üniversitesi");
        }*/
        /*int time = 25;
        if(time < 18) {
            System.out.println("Good Day");
        }
        else if (time > 30) {
            System.out.println("Not good day");
        }
        else {
            System.out.println("Good Evening");
        }*/
        /*int time = 20;
        String result = (time<18) ? "Good Day" : "Good Evening";
        System.out.println(result);*/
        Scanner in = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int number = in.nextInt();

        switch (number) {
            case 1:
                System.out.println("Sayı 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break;
            case 3:
                System.out.println("Sayı 3");
                break;
            case 4:
                System.out.println("Sayı 4");
                break;
            default:
                System.out.println("Girdiniğiz sayı farklı bir sayı");
                break;
        }
    }
}
