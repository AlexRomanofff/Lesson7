package lesson7.NewStack;

public class Demo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("fas");
        stack.push("sasd");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
