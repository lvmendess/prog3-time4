public class TweeterList {
    private Tweeter first;

    public TweeterList() {
        first = null;
    }

    public Tweeter getFirst() {
        return first;
    }

    public void setFirst(Tweeter first) {
        this.first = first;
    }

    public boolean empty(){
        return first==null;
    }

    public void insertAtStart(Tweeter t){
        t.setNext(first);
        setFirst(t);
    }

    public void print(){
        Tweeter aux = first;
        if(empty()){
            System.out.println("list is empty!");
        }else {
            while (aux != null) {
                System.out.println(aux.getAnnotatorId());
                aux = aux.getNext();
            }
        }
    }

    public Tweeter getTweeter(int id){
        Tweeter aux = first;
        if(empty()){return null;}
        else {
            while (aux != null && aux.getAnnotatorId()!=id) {
                aux = aux.getNext();
            }
            return aux;
        }
    }

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
