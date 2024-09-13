public class ListaSEL {
    private Lines first;

    public ListaSEL(){
        first=null;
    }

    private boolean empty(){
        return first==null;
    }
    
    public void insert(Lines l){
        if(empty()){
            insertAtStart(l);
        }else{
            Lines aux=first;
            if(l.line<aux.line){
                insertAtStart(l);
            }else{
                Lines aux2=aux.next;
                if(aux.next==null){
                    insertAtEnd(l);
                }else{
                    while (l.line>aux.line&&l.line>aux2.line&&aux2.next!=null) {
                        aux=aux.next;
                        aux2=aux2.next;
                    }
                    if(l.line>aux2.line){
                        aux2.next=l;
                    }else{
                        aux.next=l;
                        l.next=aux2;
                    }
                }
            }
            
        }
       
    }
    private void insertAtStart(Lines l){
        l.next=first;
        first=l;
    }
    private void insertAtEnd(Lines l){
        if(empty()){
            first=l;
        }else{
            Lines aux = first;
            while (aux.next!=null) {
                aux=aux.next;
            }
            aux.next=l;
        }
    }

    public String printAll(){
        String resultLine = null;
        Lines aux = first;
        if (first == null){
            return resultLine;
        }else{
            while (aux != null) {
                if (aux == first){
                    resultLine = String.valueOf(aux.line);        
                }
                else{
                    resultLine += ", " + aux.line;
                }
                aux = aux.next; 
            }
            return resultLine;
        }
    }

    public int getSingleLine(){
        return first.getLine();
    }
}

