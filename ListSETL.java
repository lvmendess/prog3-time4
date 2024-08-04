public class ListSETL {
    private Tweet first;
    private ListSETL next;
    private int contPos;
    private int contNeg;
    private int contNeutral;
    private String language;

    /**
     * no args constructor
     * initializes list of tweets by language
     */
    public ListSETL(){
        first=null;
        contPos=0;
        contNeg=0;
        contNeutral=0;
    }
    
    /**
     * @return first tweet of the list
     */
    public Tweet getFirst() {
        return first;
    }

    /**
     * sets first tweet
     * @param first
     */
    public void setFirst(Tweet first) {
        this.first = first;
    }

    /**
     * @return next tweet
     */
    public ListSETL getNext() {
        return next;
    }

    /**
     * sets next tweet
     * @param next
     */
    public void setNext(ListSETL next) {
        this.next = next;
    }

    /**
     * @return language of the list
     */
    public String getLanguage() {
        return language;
    }

    /**
     * sets language of the list
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return if the list is empty
     */
    public boolean empty(){
        return first==null;
    }

    /**
     * inserts tweets at the start of the list
     * @param t
     */
    public void insertAtStart(Tweet t){
        setContHandLabel(t);
        t.setNext(first);
        first = t;
    }

    /**
     * prints every tweet's id, handLabel and annotatorId
     */
    public void print(){
        Tweet aux = first;
        if(empty()){
            System.out.println("list is empty!");
        }else {
            while ( aux != null) {
                System.out.println(aux.getTweetId() + " " + aux.gethandLabel() + " " + aux.getAnnotatorId());
                aux = aux.getNext();
            }
        }
    }

    /**
     * sets handlabel counter
     * @param t
     */
    public void setContHandLabel(Tweet t){
        if(t.gethandLabel().equals("Negative")){
            contNeg++;
        } else if (t.gethandLabel().equals("Positive")) {
            contPos++;
        }else{
            contNeutral++;
        }
    }

    /**
     * @return sum of positive, negative and neutral tweets
     */
    public int getAllTweets(){
        return contPos+contNeg+contNeutral;
    }

    /**
     * @return sum of positive tweets
     */
    public int getContPos(){return contPos;}

    /**
     * @return sum of negative tweets
     */
    public int getContNeg() {return contNeg;}

    /**
     * @return sum of neutral tweets
     */
    public int getContNeutral() {return contNeutral;}
}

