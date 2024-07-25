public class ListaSE{
    Cell first;

    public ListaSE() {
        this.first = null;
    }

    public boolean empty(){
        return first==null;
    }

    public void insertAtStart(Cell c){
        c.setNext(first);
        first = c;
    }

    public void print(){
        Cell aux = first;
        while(aux!=null){
            System.out.println("Value = "+aux.getValue());
            aux = aux.getNext();
        }
    }

    public void insertAtEnd(Cell c){
        if(empty()){first = c;}
        else{
            Cell aux = first;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(c);
        }
    }

    public void insertOrdered(Cell c){
        if(empty()){first = c;} //empty list

        else{
            Cell aux = first;
            Cell aux2 = first.getNext();

            if(aux.getValue()>=c.getValue()){insertAtStart(c);} //accepts duplicate entries

            /*list w/ one element */
            else if(aux2==null){ 
                insertAtEnd(c);
            }
            
            /*list w/ 2+ elements */
            else{
                while(aux.getNext().getNext()!=null && aux.getValue()<c.getValue() && aux2.getValue()<c.getValue()){
                    aux = aux2;
                    aux2 = aux.getNext();
                }
                if(aux2.getNext()==null && aux2.getValue()<c.getValue()){
                    insertAtEnd(c);
                }else{
                    aux.setNext(c);
                    c.setNext(aux2);
                }
            }
            
        }
    }

    public Cell search(int v) {
        if(empty()){return null;}
        else{
            Cell aux = first;
            while(aux != null && aux.getValue() != v){
                aux = aux.getNext();
            }
            return aux;
        }
    }

    public boolean removeAtStart() {
        if(empty()){return false;}
        else{
            Cell aux = first;
            if (aux.getNext() == null) {
                first = null;
            } else {
                first = aux.getNext();
                aux.setNext(null);
            }
            return true;
        }
    }

    public boolean removeAtEnd(){
        if(empty()){return false;}
        else{
            Cell ant = first;
            Cell current = first.getNext();
            if(current != null){
                while(current.getNext() != null){
                    ant = current;
                    current = current.getNext();
                }
                ant.next = null;
            }else{
                current = first;
                first = null;
            }
            return true;
        }
    }

    public boolean removeAtEnd2(){ /*exercise 2: remove w/ one aux reference*/
        if(empty()){return false;}
        else{
            Cell aux = first;
            while(aux.getNext().getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(); /*sets next to null*/
            return true;
        }
    }

    public boolean removeSpecific(int v){ /*exercise 3*/
        if(empty()){return false;}
        else{
            Cell aux = first;
            while(aux.getNext().getValue()!=v){
                aux = aux.getNext();
            }
            aux.setNext(aux.getNext().getNext());
            return true;
        }
    }
    
}