public class Abstraction {
    public static void main(String[] args) {
//        Animal2 an = new Animal2(); // error, cuz abstract method needs the body here.

        Pig2 myPig = new Pig2();
        myPig.animalSound();
        myPig.sleep();
    }
}

abstract class Animal2 {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Sleep");
    }
}

class Pig2 extends Animal2 {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

// Data abstraction is the process of hiding certain details and showing only essential information to the user.
// Abstraction can be achieved with either abstract classes or interfaces
// The abstract keyword is a non-access modifier, used for classes and methods:
// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).