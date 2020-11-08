// A singleton class is a class that can have only one instance (object) of a class at a time.
class Singleton {
    public static void main(String[] args) {
        SingletonClass object1 = SingletonClass.getInstance();
        SingletonClass object2 = SingletonClass.getInstance();
        
        object1.s = object1.s.toUpperCase();
        
        System.out.println(object2.s);
        System.out.println(object1.s);
        System.out.println(object2.s);
    }
}

class SingletonClass {

    // Step 1
    private static SingletonClass obj = new SingletonClass(); // why this is static because the method getInstance is static so we need static object

    // Step 2
    public String s;
    private SingletonClass() {
        s = "I am singleton class";
    }

    // Step 3
    public static SingletonClass getInstance() {
        return obj;
    }
}

// Static - we cant change the value of static variable or from static method for different instances (object). So for every instance the value should be same for that static variable. 

// A static method belongs to the class rather than object of a class.

// static method can access static data member and can change the value of it.

// Eg. if we want to print LinkedList then this method should be static because for every instance (object or list) we want to print that, simple pass the head node. Also, Math lib. all methods in math are static we can call all the methods with the class name itself.