public class StringValueChange {
    public static void main(String[] args) {
        String name = "Prashuk";
        changeToAjmera(name);
        System.out.println(name); // Prashuk
    }

    public static void changeToAjmera(String name) {
        name = "Ajmera";
    }
}

/*
    The JDK contains many immutable classes.
    Examples include the wrapper types Integer, Double, Float, Long, Boolean, BigDecimal,
    and of course the very well known String class.

    That happens because a String object is immutable,
    which means that the fields inside the String are final and can’t be changed.

    Also note that we’re not changing an attribute of the String class; instead,
    we’re simply assigning a new String value to it. In this case, the “Ajmera” value will
    be passed to name in the changeToAjmera method.
    The String “Ajmera” will be eligible to be garbage collected as soon as the changeToAjmera method completes
    execution. Even though the object can’t be changed, the local variable will be.
*/