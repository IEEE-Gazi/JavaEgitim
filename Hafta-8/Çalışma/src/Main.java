/*class OuterClass {
    int x = 10;
    static class InnerClass {
        int y = 5;
    }
}*/
/*abstract class Animal {
    public abstract void AnimalSound();
    public void sleep() {
        System.out.println("zzzzzzzz");
    }
}
class Cat extends Animal {
    @Override
    public void AnimalSound() {
        System.out.println("Cat says : meowww");
    }
    @Override
    public void sleep() {
        super.sleep();
    }
}*/
/*interface Animal {
    public void AnimalSound();
    public void sleep();
    //public void run();
}
interface Canli {
    public void yasa();
}
class Cat implements Animal,Canli {
    @Override
    public void AnimalSound() {
        System.out.println("Cat says : meowww");
    }

    @Override
    public void yasa() {

    }

    @Override
    public void sleep() {
        System.out.println("zzzzzzzz");
    }
}*/
enum Level {
    LOW,
    MEDIUM,
    HIGH
}
public class Main {

    public static void main(String[] args) {
	    //OuterClass outerClass = new OuterClass();
        //OuterClass.InnerClass innerClass = outerClass.new InnerClass();
	    /*OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        System.out.println(innerClass.y);*/
        /*Cat cat = new Cat();
        cat.AnimalSound();
        cat.sleep();*/
        /*Level myVar = Level.LOW;
        System.out.println(myVar);*/
        for(Level a : Level.values()) {
            System.out.println(a);
        }
    }
}
