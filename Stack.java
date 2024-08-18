/**
 * Class responsible for creating the Stack used in the project
 */
public class Stack {
    private Cell top;

    /**
     * Constructor class that set top to null
     */
    public Stack(){
        top = null;
    }

    /**
     * Method that checks whether the stack is empty or not
     * @return a boolean(true or false)
     */
    public boolean isEmpty(){
        return (top == null);
    }

    /**
     *This method adds an element to the top of the stack.
     * @param element parameter that will be added to the top of the queue
     */

    public void push(Cell element){
        element.setNext(top);
        top = element;

    }

    /**
     * This method removes the element from the top of the stack.
     * @return returns the removed element
     * @throws Exception in order to not deal with this error for now
     */

    public Cell pop() throws Exception{
        if(isEmpty( )){
            throw new Exception("Error: Stack is empty! ");
        }else{
            Cell aux = top;
            top = top.getNext();
            aux.setNext(null);
            return aux;
        }
    }

    

}