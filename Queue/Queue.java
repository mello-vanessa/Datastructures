package Queue;

/**
 *
 * @author vanessadeoliveiramello
 */
public class Queue {
    int queueSize;
    int indexEndOfQueue;
    int[] elements;
    
    public Queue(int queueSize){
        this.queueSize = queueSize - 1;
        this.indexEndOfQueue = 0;
        this.elements = new int[queueSize];
    }
    
    public void queue(int value){
        if(indexEndOfQueue<=queueSize){
            elements[indexEndOfQueue] = value;
            indexEndOfQueue++;
        }
        else{
            System.out.println("Queue overflow: "+value);
        }
    }
    
    public void dequeue(){
        if(indexEndOfQueue>0){
            for(int i=0;i<indexEndOfQueue-1;i++){
                //i+1: aumenta mas não altera o valor de i
                elements[i] = elements[i+1];
            }
            indexEndOfQueue--;
        }
        else{
            System.out.println("Empty queue.");
        }
    }
    
    public void printQueue(){
        if(indexEndOfQueue>=0){
            for(int i=0;i<indexEndOfQueue;i++){
                System.out.println(elements[i]);
            }    
        }
        else {
            System.out.println("Empty queue.");
        }
    }
}
