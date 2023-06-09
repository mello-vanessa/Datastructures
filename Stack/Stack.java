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
        Por isso uso -1 para iniciar a pilha.
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
            System.out.println("Stack overflow: "+value);
        }        
    }
    
    public void pop(){
        if(this.isEmpty()) System.out.println("Empty stack.");
        else{
            System.out.println(elements[indexTopOfStack]+" removed from stack.");
            indexTopOfStack--;
        }
    }
    
    public void reverseStack(){
        //Verifico se está vazia
        if(this.isEmpty()){
            System.out.println("Empty stack.");
        }
        else{
            Stack auxStack = new Stack(this.maxSize);
            for(int i = indexTopOfStack; i>=0; i--){
                auxStack.push(elements[i]);
            }
            auxStack.printStack();
        }
    }
    
    public void printStack(){
        if(this.isEmpty()){
            System.out.println("Empty stack.");
        }
        else{
            for(int i=0; i<=indexTopOfStack;i++){
                System.out.println(elements[i]);
            }
        }
    }
    
    public boolean isEmpty(){
        if(indexTopOfStack == -1 ){
            return true;
        }
        else return false;
    }
    
    public int size(){
        return this.indexTopOfStack+1;
    }
    
    /*
    Peek: The top element can be inspected without removing it from the stack 
    using a peek operation.
    */
    public int peek(){
        if(this.isEmpty()){
            System.out.println("Empty stack.");
            return -1;
        }
        else{
            return elements[indexTopOfStack];
        }
    }
    
}


