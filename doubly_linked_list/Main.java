package doubly_linked_list;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.printList();
        dll.printReverseList();
        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        dll.printList();
        dll.printReverseList();
        
    }
}
