public class OneList{ /*one list to rule them all, one list to find them, one list to bring them all and in the darkness bind them */
    ListSETL first;
    
    public boolean empty(){
        return first==null;
    }

    public void insertAtStart(ListSETL t){
        t.setNext(first);
        first = t;
        
    }
    
    public ListSETL getFirst() {
        return first;
    }

    public void setFirst(ListSETL first) {
        this.first = first;
    }

    public void print(){
        ListSETL aux = first;
        if(empty()){
            System.out.println("OneList is empty!");
        }else {
            while (aux != null) {
                System.out.println(aux.getLanguage()+": "+aux.getAllTweets());
                aux = aux.getNext();
            }
        }
    }
}