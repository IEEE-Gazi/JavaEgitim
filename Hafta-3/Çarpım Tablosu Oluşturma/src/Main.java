
public class Main {
    public static void main(String[] args) {
      // İç içe for döngüsü kullanarak bir çarpım tablosu oluşturun.
      
        for(int i = 1; i<= 10; i++) {
            for(int j = 1 ; j<=10 ; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println("*****************");
        }
      
    }
}
