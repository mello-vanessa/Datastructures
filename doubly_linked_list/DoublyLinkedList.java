package doubly_linked_list;

/**
 *
 * @author vanessadeoliveiramello
 */
public class DoublyLinkedList {
    public int listSize;
    public Node head;
    public Node tail;
    
    public void addNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.previousNode = null;
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            newNode.previousNode = tail;
            tail = newNode;
        }
        listSize++;
    }
    public void printList(){
        if(head == null){
            System.out.println("Empty list.");
        } 
        else{
            Node currentNode = head;
            System.out.println("Doubly Linked List: ");
            while(currentNode != null){
                System.out.println(currentNode.data+ " ");
                currentNode = currentNode.nextNode;
            }
        }
    } 
    public void printReverseList(){
        if(head == null){
            System.out.println("Empty list.");
        }
        else{
            Node currentNode = tail;
            System.out.println("Doubly Linked List - Reverse Mode: ");
            while(currentNode != null){
                System.out.println(currentNode.data+" ");
                currentNode = currentNode.previousNode;
            }
        }
    }
}
