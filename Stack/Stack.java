/**
 *
 * @author vanessadeoliveiramello
 */
package Stack;
/**
 *
 * @author vanessadeoliveiramello
 */
    /*
    push: empilhar
    pop:  desempilhar
    */
public class Stack {
    private final int maxSize;
    private int indexTopOfStack;
    private final int[] elements;
    
    public Stack(int maxSize){
        this.maxSize = maxSize;
        /* Será usado como indice no array, ao adicionar o primeiro elemento na 
        pilha, o array ficará elements[0], depois [1]...
        */
        this.indexTopOfStack = -1;
        this.elements = new int[maxSize];
    }
    
    public void push(int value){
        /* 
        Por exemplo, se o tamanho foi dado como 10 e tiver 10 elementos na pilha,
        o index estará como 9, então tem que ser -1 para não estourar
        */
        if (indexTopOfStack < maxSize - 1) {
            //incrementa antes de acessar, entao na primeira vez fica como 0, senão ficaria como -1 e apresentaria 
            // out of range -1
            elements[++indexTopOfStack] = value;
        } else {
            System.out.println(value + "Stack overflow: ");
        }        
    }
    
    public void pop(){
        if(indexTopOfStack >=0 ){
            System.out.println(elements[indexTopOfStack]+" removed from stack.");
            indexTopOfStack--;
        }
        else{
            System.out.println("Empty stack.");
        }
    }
    
    public void printStack(){
        if(indexTopOfStack == -1 ){
            System.out.println("Empty stack.");
        }
        else{
            System.out.println("Stack:");
            for(int i=0; i<=indexTopOfStack;i++){
                System.out.println(elements[i]);
            }
        }
    }
}


