public class TweeterList {
    private Tweeter first;

    /**
     * no args constructor
     * initializes list of tweeters
     */
    public TweeterList() {
        this.first = null;
    }

    /**
     * @return first tweeter
     */
    public Tweeter getFirst() {
        return first;
    }

    /**
     * sets first tweeter
     * @param t
     */
    public void setFirst(Tweeter t) {
        this.first = t;
    }

    /**
     * @return if list is empty
     */
    public boolean empty(){
        return first==null;
    }

    /**
     * inserts tweeter at the start of the list
     * @param tw
     */
    public void insertAtStart(Tweeter tw){
        tw.setNext(first);
        setFirst(tw);
    }

    /**
     * calls each tweeter's print() method
     */
    public void print(){
        Tweeter aux = first;
        if(empty()){
            System.out.println("list is empty!");
        }else {
            while (aux != null) {
                aux.print();
                aux = aux.getNext();
            }
        }
    }

    /**
     * get tweeter by id
     * @param id
     * @return Tweeter; null if not found
     */
    public Tweeter getTweeter(String id){
        Tweeter aux = first;
        if(empty()){return null;} //lista vazia
        else if(exists(id)){
            while(aux!=null){
                if(!(aux.getAnnotatorId().equals(id))){
                    aux = aux.getNext();
                }else{
                    return aux;
                }
            }
        }else{
            return null;
        }
        return aux;
    }

    /**
     * verifies wether the tweeter already exists in the list by its id
     * @param id
     * @return true if it exists, false if it doesn't
     */
    public boolean exists(String id){
        if(empty()){return false;}
        else{
            Tweeter aux = first;
            while(aux!=null){
                if(!(aux.getAnnotatorId().equals(id))){
                    aux = aux.getNext();
                }else{
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * calls tweeter's print method if it has 2 or more languages in its array
     */
    public void getMultilingual(){
        Tweeter t = first;
        while(t != null){
            if(t.getLangNum()>1){
                t.print();
            }
            t = t.getNext();
        }
    }

    /**
     * @return number of tweeters on the list
     * @deprecated
     */
    public int countTweeters(){
        int cont = 0;
        Tweeter aux = first;
        if(empty()){return 0;}
        else {
            while (aux != null) {
                cont++;
                aux = aux.getNext();
            }
            return cont;
        }
    }
}
