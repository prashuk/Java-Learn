public class Challenge {
    public static void main(String[] args) {
        StringBuilder profession = new StringBuilder("Software ");
        String name = "Prashuk ";

        changeMethod(profession, name);

        System.out.println(name + " " + profession.toString()); // Prashuk  Software Engineer
    }

    public static void changeMethod(StringBuilder profession, String name) {
        profession.append("Engineer");
        name = name + "Ajmera";

        name = null;
        profession = null;
    }
}

/*
    String will not cha ge because it is immutable. The real object will never change, only the copy changes.
    StringBuilder will change because it is mutable.  The real object will change.

    Finally, we pass null to the variables here, but not to the objects.
    The objects will remain the same as long as they are still accessible externally
    in this case through the main method. And, although the local variables will be null,
    nothing will happen to the objects.
*/

/*
    What to remember:

    Java always passes parameter variables by value.
    Object variables in Java always point to the real object in the memory heap.
    A mutable object’s value can be changed when it is passed to a method.
    An immutable object’s value cannot be changed, even if it is passed a new value.
    “Passing by value” refers to passing a copy of the value.
    “Passing by reference” refers to passing the real reference of the variable in memory.
*/