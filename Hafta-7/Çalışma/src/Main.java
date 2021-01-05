import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	    //Arrayler
        /*Scanner scan = new Scanner(System.in);
        int boyut = scan.nextInt();
        String[] cars = new String[boyut];
        cars[0] = "Opel";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Mazda";
        cars[4] = "Ferrari";
        System.out.println(cars[0]);
        System.out.println(cars.length);*/
        //String[] cars = {"Volvo","BMW","Ford","Mazda"};
        /*for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }*/
        /*for(String a: cars) {
            System.out.println(a);
        }*/
        //Çok Boyutlu Arrayler
        //int[][] nums = {{1,2,3,4},{5,6,7}};
        /*int x = nums[1][2];
        System.out.println(x);*/
        /*for(int i = 0; i< nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }*/
        //ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //System.out.println(cars.get(0));
        //cars.set(0,"Opel");
        //System.out.println(cars.get(0));
        //cars.remove(0);
        //System.out.println(cars);
        //cars.clear();
        /*System.out.println(cars.get(0));
        System.out.println(cars.size());*/
        /*for(int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }*/
        /*for(String i: cars) {
            System.out.println(i);
        }
        System.out.println("************");
        Collections.sort(cars);
        for(String i: cars) {
            System.out.println(i);
        }*/
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(33);
        nums.add(30);
        nums.add(37);
        nums.add(45);
        nums.add(60);
        nums.add(15);
        for(int i: nums) {
            System.out.println(i);
        }
        System.out.println("***************");
        Collections.sort(nums);
        for(int i: nums) {
            System.out.println(i);
        }


    }
}
