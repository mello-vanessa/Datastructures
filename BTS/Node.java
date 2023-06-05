package BTS;

/**
 *
 * @author vanessadeoliveiramello
 */

public class Node {
    int data;
    Node right;
    Node left;
    
    public Node(int data){
        this.data = data;
        this.right = this.left = null;
    }
}
