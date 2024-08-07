public class Queue {
    Cell front;
    Cell back;
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
        //System.out.print(element instanceof Variable?((Variable)element).getVariable():((Operator)element).getOp());

    }
    public Cell remove() throws Exception{
        Cell item=null;
        if(isEmpty()){
            throw new Exception("Error:queue is empty");
        }
        item = front.getNext();
        front.setNext(item.getNext());
        item.setNext(null);
        if(back==item){
            back=front;
        }
        return item;
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
