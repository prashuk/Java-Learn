public class Inheritance {
    public static void main(String[] args) {

    }
}

class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Honk");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car c = new Car();
        c.honk();
        String b = c.brand;
        String m = c.modelName;
    }
}

// In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:
// subclass (child) - the class that inherits from another class
// superclass (parent) - the class being inherited from
// To inherit from a class, use the extends keyword.