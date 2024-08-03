public class TweeterList {
    private Tweeter first;

    public TweeterList() {
        this.first = null;
    }

    public Tweeter getFirst() {
        return first;
    }

    public void setFirst(Tweeter t) {
        this.first = t;
    }

    public boolean empty(){
        return first==null;
    }

    public void insertAtStart(Tweeter tw){
        tw.setNext(first);
        setFirst(tw);
    }

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
        /*}else{
            while(aux!=null){
                if(!(aux.getAnnotatorId().equals(id))){
                    aux = aux.getNext();
                }
                return aux;
            }
        }
        /*else if(aux.getAnnotatorId().equals(id)){
            return aux;
        }else {
            //aux = aux.getNext();
            while(aux!=null){
                if(!(aux.getAnnotatorId().equals(id))){
                    aux = aux.getNext();
                }
            }*/
            return aux;
    }

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

    public void getMultilingual(){
        Tweeter t = first;
        while(t != null){
            if(t.getLangNum()>1){
                t.print();
            }
            t = t.getNext();
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
