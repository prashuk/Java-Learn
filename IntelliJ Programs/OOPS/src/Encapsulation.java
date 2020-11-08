public class Encapsulation {

    public static void main(String[] args) {
        Person p = new Person();
//        p.name = "John"; // error

        p.setName("John");
        p.getName();
    }

}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


// The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
// declare class variables/attributes as private provide public get and set methods
// to access and update the value of a private variable