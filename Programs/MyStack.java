import java.util.Stack;

class MyStack {
    public static void main(String[] args) {
        Stack<Integer> new_stack = new Stack<Integer>();
        new_stack.add(1);
        new_stack.add(2);
        int x = new_stack.pop();
        System.out.print(x);
    }
}
