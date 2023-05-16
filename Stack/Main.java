package Stack;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        //return stack overflow:
        stack.push(40);
        System.out.println("Stack:");
        stack.printStack();
        //remove value 30
        stack.pop();
        System.out.println("Stack:");        
        stack.printStack();
        System.out.println("Reverse stack:");
        stack.reverseStack();
    }
}
