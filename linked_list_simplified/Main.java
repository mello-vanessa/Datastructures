package linked_list_simplified;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Main {
    public static void main(String[] args) {
        LinkedListS list = new LinkedListS();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.printList();
        System.out.println("List size: "+list.listSize);
        boolean del = list.deleteNode(2);
        System.out.println("List size: "+list.listSize);
        if(del){
            System.out.println("Node deleted.");
        }
        else{
            System.out.println("Error deleting node.");
        }
        list.printList();
        boolean search = list.searchNode(2);
        if(search){
            System.out.println("Found one node.");
        }
        else{
            System.out.println("Node not found.");
        }
    }
}
