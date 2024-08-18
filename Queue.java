/**
 * Class responsible for creating the Queue used in the project
 */
 class Queue {
    private Cell front;
    private Cell back;

    /**
     * Class constructor that initializes front as a new variable (-1) and back which is equal to front
     */
    public Queue(){
        front = new Variable(-1);
        back=front;
        front.setNext(null);
    }

    /**
     * Method that checks whether the queue is empty or not
     * @return a boolean(true or false)
     */
    public boolean isEmpty(){
        return(front==back);
    }

    /**
     * This method adds an element to the queue
     * @param element parameter that will be added to the queue
     */
    public void add(Cell element){
        back.setNext(element);
        back=back.getNext();
        back.setNext(null);

    }

    /**
     * This method is responsible for showing the queue
     */
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            Cell aux = front.getNext();
            while (aux!=null) {
                if(aux instanceof Variable){
                    System.out.print(((Variable)aux).getVariable()+" ");
                }else{
                    System.out.print(((Operator)aux).getOp()+" ");    
                }
                aux = aux.getNext();
                
            }
        }
    }
}
