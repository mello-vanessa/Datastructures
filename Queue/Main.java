package Queue;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.queue(10);
        queue.queue(20);
        queue.queue(30);
        //return queue overflow
        queue.queue(40);
        System.out.println("Print queue:");
        queue.printQueue();
        //remove value 10
        System.out.println("Remove first value.");
        queue.dequeue();
        System.out.println("Print queue:");
        queue.printQueue();
    }
}
