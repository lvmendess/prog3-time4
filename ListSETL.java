public class ListSETL {
    Tweet first;
    ListSETL next;
    int contPos;
    int contNeg;
    int contNeutral;
    String language;

    public ListSETL(){
        first=null;
        contPos=0;
        contNeg=0;
        contNeutral=0;
    }
    
    public Tweet getFirst() {
        return first;
    }

    public void setFirst(Tweet first) {
        this.first = first;
    }

    public ListSETL getNext() {
        return next;
    }

    public void setNext(ListSETL next) {
        this.next = next;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean empty(){
        return first==null;
    }

    public void insertAtStart(Tweet t){
        setContHandLabel(t);
        t.setNext(first);
        first = t;
    }

    public void print(){
        Tweet aux = first;
        if(empty()){
            System.out.println("list is empty!");
        }else {
            while (aux != null) {
                System.out.println(aux.getTweetId() + " " + aux.gethandLabel() + " " + aux.getAnnotatorId());
                aux = aux.getNext();
            }
        }
    }

    public void setContHandLabel(Tweet t){
        if(t.gethandLabel().equals("Negative")){
            contNeg++;
        } else if (t.gethandLabel().equals("Positive")) {
            contPos++;
        }else{
            contNeutral++;
        }
    }

    public int getAllTweets(){
        return contPos+contNeg+contNeutral;
    }

    public int getContPos(){return contPos;}

    public int getContNeg() {return contNeg;}

    public int getContNeutral() {return contNeutral;}
}

