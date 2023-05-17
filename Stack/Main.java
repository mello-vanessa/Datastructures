package Stack;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        System.out.println("Peek: "+stack.peek());
        System.out.println("IsEmpty? "+stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        //return stack overflow:
        stack.push(40);
        System.out.println("Stack:");
        stack.printStack();
        System.out.println("Size: "+stack.size());
        System.out.println("Peek: "+stack.peek());
        //remove value 30
        System.out.println("Remove last value.");
        stack.pop();
        System.out.println("Stack:");        
        stack.printStack();
        System.out.println("Size: "+stack.size());
        System.out.println("Reverse stack:");
        stack.reverseStack();
    }
}
