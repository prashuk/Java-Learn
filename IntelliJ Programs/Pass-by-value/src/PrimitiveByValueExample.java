public class PrimitiveByValueExample {
    public static void main(String[] args) {
        int prashukAge = 30;
        changePrashukAge(30);
        System.out.println(prashukAge); // 30
    }

    public static void changePrashukAge(int prashukAge) {
        prashukAge = 25;
    }
}

/*
    It’s 30 because (again) Java passes object parameters by value.
    The number 30 is just a copy of the value, not the real value.
    Primitive types are allocated in the stack memory, so only the local value will be changed.
    In this case, there is no object reference.
*/