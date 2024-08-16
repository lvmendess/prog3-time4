public class Queue {
    private Cell front;
    private Cell back;
    public Queue(){
        front = new Variable(-1);
        back=front;
        front.setNext(null);
    }
    public boolean isEmpty(){
        return(front==back);
    }

    public void add(Cell element){
        back.setNext(element);
        back=back.getNext();
        back.setNext(null);

    }
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
