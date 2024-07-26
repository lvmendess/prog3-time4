public class ListaSETL {
    Tweet first;
    int contPos;
    int contNeg;
    int contNeutral;
    public ListaSETL(){
        first=null;
        contPos=0;
        contNeg=0;
        contNeutral=0;
    }
    public boolean empty(){
        return first==null;
    }
    public void insertAtStart(Tweet t){
        t.setNext(first);
        first = t;
        setContHandLabel(t);
    }
    public void print(){
        Tweet aux = first;
        if(empty()){
            System.out.println("Twitter List is empty!");
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

    public int getContNeutral() {return  contNeutral;}
}

