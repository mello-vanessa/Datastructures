package linked_list_simplified;

/**
 *
 * @author vanessadeoliveiramello
 */
public class LinkedListS {
    public int listSize;
    public Node head;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node currentNode = head;
            while(currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = newNode;
        }
        listSize++;
    }

    public boolean deleteNode(int data){ 
        Node previousNode = head;
        Node currentNode = head.nextNode;
        while(currentNode != null){
            if(currentNode.data == data){
                previousNode.nextNode = currentNode.nextNode;
                listSize--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public boolean searchNode(int data){
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.data == data){
                return true;
            }
            currentNode = currentNode.nextNode;
        }
        return false;
    }
   
    public void printList(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data+" ");
            currentNode = currentNode.nextNode;
        }
    }
}
