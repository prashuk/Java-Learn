public class Polyphorism {
    public static void main(String[] args) {

    }
}

class Animal {
    public void animalSound() {
        System.out.println("Animal Sound");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Pig sound");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Dog sound");
    }
}

// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
// Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
// Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.