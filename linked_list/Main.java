package linked_list;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.printList();
        boolean delete = list.deleteNode(2);
        if(delete){
            System.out.println("Apagado com sucesso.");
        }
        else{
            System.out.println("Erro ao deletar, node inexistente.");
        }
        boolean search = list.searchNode(3);
        if(search){
            System.out.println("Node encontrado.");
        }
        else{
            System.out.println("Node não encontrado na lista");
        }
        list.printList();
        System.out.println("Tamanho da lista: "+list.getListSize());
    }
}
