

/*class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuuut tuuut");
    }
}
class Car extends Vehicle {
    private String modelName = "Mustang";

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}*/
/*class Animal {
    public void animalSound() {
        System.out.println("This animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void animalSound() {
        super.animalSound();
    }
}*/
class OuterClass {
    int x = 10;
    class InnerClass {
        int y = 5;
    }
}
public class Main {
    public static void main(String[] args) {
        /*Araba araba = new Araba("Mustang");
        System.out.println(araba.getIsim());
        araba.setIsim("Toyota Corolla");
        System.out.println(araba.getIsim());*/
        /*Car car = new Car();
        car.honk();
        System.out.println(car.brand + " " + car.getModelName());*/
        /*Animal animal = new Animal();
        animal.animalSound();
        Dog dog = new Dog();
        dog.animalSound();*/
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner =  outer.new InnerClass();
        System.out.println(outer.x + inner.y);

    }
}
