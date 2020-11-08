public class MutableObjectReference {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Prashuk ");
        addLastName(name);
        System.out.println(name.toString()); // Prashuk Ajmera
    }

    public static void addLastName(StringBuilder name) {
        name.append("Ajmera");
    }
}

/*
    Unlike String, most objects in the JDK are mutable, like the StringBuilder class.

    In this case, because we’re working with a mutable object, the output will be “Prashuk Ajmera”
    You could expect the same behaviour from any other mutable object in Java.

    You’ve already learned that Java variables are passed by value, meaning that a copy of the value is passed.
    Just remember that the copied value points to a real object in the Java memory heap.
    Passing by value still changes the value of the real object.
*/