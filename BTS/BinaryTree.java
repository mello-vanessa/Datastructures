package BTS;

/**
 *
 * @author vanessadeoliveiramello
 */


    /* Binary tree
                1
             /    \
            2      3
           / \    / \
          4   5  6   7
    */
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        this.root = null;
    }

    private Node addRecursive(Node current, int data){
        if(current == null){
            Node newNode = new Node(data);
            return newNode;
        }
        else{
            //se o valor for menor que o existente, vai pra esquerda
            if(data < current.data){
                current.left = this.addRecursive(current.left, data);
            }
            else{
            //se for > ou =, vai pra direita    
                current.right = this.addRecursive(current.right, data);
            }
        }
        return current;
    }
    
    public void addNode(int data){
        root = this.addRecursive(root, data);
    }
    
    //inOrder: em ordem numerica ascendente: esquerda, nó atual, direita
    //preOrder: nó atual, esquerda, direita. É considerada pré porque visita o pai
    //antes dos filhos.
    //postOrder: passa pelos filhos e depois pai, então nó esq, direito e depois nó atual
    
    private void inOrder(Node node){
        if(node != null){
            this.inOrder(node.left);
            System.out.println(node.data);
            this.inOrder(node.right);
        }
    }
    public void traverseInOrder(){
        this.inOrder(root);
    }
    
    private void preOrder(Node node){
        if(node != null){
            System.out.println(node.data);
            this.preOrder(node.left);
            this.preOrder(node.right);
        }
    }
    
        public void drawTree() {
        drawTreeRecursive(root, "");
    }

    private void drawTreeRecursive(Node node, String prefix) {
        if (node != null) {
            System.out.println(prefix + "└── " + node.data);
            drawTreeRecursive(node.left, prefix + "    ");
            drawTreeRecursive(node.right, prefix + "    ");
        }
    }
}