/*class Second {
    int x = 10;
}*/
public class Main {
    //int x;
    /*static void myStaticMethod() {
        System.out.println("Static methodlar nesne oluşturulmadan çağırılabilir");
    }
    public void myPublicMethod() {
        System.out.println("Public methodlar nesneler oluşturularak çağırılmalıdır.");
    }*/
    /*public void fullThrottle() {
        System.out.println("Araba son hız gidiyor!");
    }
    public void speed(int maxSpeed){
        System.out.println("Arabanın son hızı : " + maxSpeed);
    }*/
    String modelName = "Ford Mustang";
    int modelYear;
    public Main(int modelYear,String modelName) {
        this.modelName = modelName;
        this.modelYear = modelYear;
    }
    public static void main(String[] args) {
        /*Second myObj = new Second();
        Second myObj2 = new Second();
        System.out.println(myObj.x);
        System.out.println(myObj2.x);*/
        /*myStaticMethod();
        Main myObj = new Main();
        myObj.myPublicMethod();*/
        /*Main myObj = new Main();
        myObj.fullThrottle();
        myObj.speed(220);*/
        /*Main myObj = new Main();
        System.out.println(myObj.x);*/
        Main myCar = new Main(1969,"Ford Mustang");
        Main myCar2 = new Main(2010,"Toyota Corolla");
        System.out.println(myCar.modelYear);
        System.out.println(myCar.modelName);
        System.out.println(myCar2.modelYear);
        System.out.println(myCar2.modelName);
    }
}
