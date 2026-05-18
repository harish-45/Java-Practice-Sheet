import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        // Stack is made using Dynamic Array Data Structure
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack : " + stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }   
}
