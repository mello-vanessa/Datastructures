package BTS;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
  
    /* Binary tree
                5
             /    \
            3      8
           / \    / \
          2   4  7   9
    */
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(8);
        tree.addNode(2);
        tree.addNode(4);
        tree.addNode(7);
        tree.addNode(9);
        //tree.traverseInOrder();
        tree.drawTree();
    } 
}
