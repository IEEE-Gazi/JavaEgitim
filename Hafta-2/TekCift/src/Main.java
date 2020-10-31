import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    int mod = a % 2;
	    if(mod == 0) {
            System.out.println("Sayımız Çifttir.");
        }
	    else {
            System.out.println("Sayımız Tektir.");
        }

    }
}
