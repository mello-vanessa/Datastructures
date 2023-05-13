package linked_list;

/**
 *
 * @author vanessadeoliveiramello
 */
public class LinkedList {
    private Node head;
    private int listSize;
    
    public LinkedList(){
    }
    
    public LinkedList(Node head, int listSize){
        this.head = head;
        this.listSize = listSize;
    }
    
    public Node getHead(){
        return this.head;
    }
    
    public int getListSize(){
        return this.listSize;
    }
    
    public void setHead(Node head){
        this.head = head;
    }
    
    public void setListSize(int listSize){
        this.listSize = listSize;
    }
    /*
    addNode(data:int): void
    Adicionar um novo node: preciso percorrer a lista, para poder achar a última
    referência ao próximo node, que estará nula. Apontarei esta referência para
    o novo node.
    Se o primeiro node, chamado de cabeça, estiver vazio, eu sei que não 
    precisarei percorrer a lista, pois ela está vazia. Inclusive este é o caso base
    se criássemos este método como recursivo.
    1. Cria o novo Node com o valor passado por parâmetro
    2. Verifica se a cabeça(primeiro node) está vazia
        2.a) Se sim -> a cabeça recebe o novo Node
        2.b) Se não, vai para o passo 3.
    3. Cria o Node nodeAtual, recebendo a cabeça (que é o primeiro node de uma 
    lista encadeada), que vai entrar em um loop  percorrendo a lista visando passar
    pelo encadeamento até chegar no apontamento de próximo node sendo igual a null. 
        3.a) O nodeAtual sempre vai recebendo neste loop o parâmetro do próximo 
    node, ou seja nodeAtual = nodeAtual.proximoNode até que o próximo node esteja
    null.
            no anterior  no atual  no atual.proximo
            | |  x |  -> | | x | -> | | x |
    
        3.b) Apontamento de próximo node == null? Então  a variável do tipo Node 
    do próximo node vai receber o novo node, ele será o último node desta 
    lista encadeada
            no anterior  no atual  no atual.proximo
            | |  x |  -> | | x | -> null
    
            no anterior  no atual  no atual.proximo
             | |  x |  -> | | x | -> |novoNode |
    
    Por fim, incrementa o tamanho da lista
    */
    public void addNode(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }
        else{
            Node currentNode = this.head;
            while(currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
            this.listSize++;
        }
    }
    /*
    searchNode(data:int): boolean
    Procurar um valor na lista, se não encontra, retorna false, se encontrar,
    retorna true:
    1. Cria o Node nodeAtual para percorrer a lista recebendo cabeça (primeiro nó)
    2. Percorre verificando se algum node.data é igual a data passada por 
    parâmetro no método. Percorre até que o node atual seja null (ponto de parada)
        2.a) Para passar pro próximo node, o atual recebe o próximo
        2.b) Se sim, retorna true
        2.c) Se não encontrou, retorna false
    */
    public boolean searchNode(int data){
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.getData() == data){
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }
    /*
    deleteNode(data:int): boolean
    Remover o node, precisa alterar o apontamento:
            no anterior  no atual  no atual.proximo
            | |  x |  -> | | x | ->   | | x | 
    
    Alteração:
            no anterior    no atual(apagado)          no atual.proximo
            | |  x |  |         | | x |        | ->     | | x | 
                      |________________________|
    */
    public boolean deleteNode(int data){
        Node previousNode = head;
        Node currentNode = head.getNextNode();
        
        while(currentNode != null){
            if(currentNode.getData() == data){
                previousNode.setNextNode(currentNode.getNextNode());
                this.listSize--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        return false;
    }
    
    /*
    imprimir(): void
    1. Cria o node atual recebendo cabeça
    2. Enquanto o no atual foi diferente de null, imprime o dado do nó
    */
    public void printList(){
        Node current = head;
        while(current != null){
        System.out.println(current.getData()+ " ");
        current = current.getNextNode();
        }
    }
}   
