package linked_list;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Node {
    private int data;
    private Node nextNode;
    
    public Node(int data){
        this.data = data;
        this.nextNode = null;
    }
    public Node(int data, Node nextNode){
        this.data = data;
        this.nextNode = nextNode;
    }
    
    public int getData(){
        return this.data;
    }
    
    public Node getNextNode(){
        return this.nextNode;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
}
