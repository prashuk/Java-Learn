public class ObjectReferenceExample {
    public static void main(String[] args) {
        Prashuk prashuk = new Prashuk();
        changeToHomer(prashuk);
        System.out.println(prashuk.name); // Ajmera
    }

    public static void changeToHomer(Prashuk prashuk) {
        prashuk.name = "Ajmera";
    }
}

class Prashuk {
    String name;
}

/*
    All object references in Java are passed by value.
    This means that a copy of the value will be passed to a method.
    But the trick is that passing a copy of the value also changes the real value of the object.
    The reason is that Java object variables are simply references that point to real objects in the memory heap.
    Therefore, even though Java passes parameters to methods by value, if the variable points to an object reference,
    the real object will also be changed.
*/