public class Tweeter {

    private ListSETL tweetList;
    private String annotatorId;
    private String[] languages = new String[15];
    private Tweeter next;
    private int tweetCount;

    /**
     * Creates a Tweeter
     * @param annotatorId
     * @param language
     */
    public Tweeter(String annotatorId, String language){
        this.annotatorId = annotatorId;
        tweetList = new ListSETL();
        this.tweetCount = 0;
        if(languages[0]==null){
            languages[0] = language;
        }else{
            int i = 0;
            while(i<languages.length){
                if(languages[i]==null){
                    languages[i] = language;
                }else{
                    i++;
                }
            }
        }
    }

    /**
     * @return annotatorId
     */
    public String getAnnotatorId() {
        return annotatorId;
    }

    /**
     * @return String of languages in which the Tweeter has tweeted
     */
    public String getLanguages() {
        String lang = "";
        for(int i=0; i<languages.length; i++){
            if(languages[i]!=null){
                lang += languages[i];
                if(languages[i+1]!=null){
                    lang +=", ";
                }
            }
        }
        return lang;
    }

    /**
     * Adds languages to the Tweeter's arrays of languages
     * @param t
     */
    public void addLanguages(Tweet t) {
        int i = 0;
        while(languages[i]!=null && i<languages.length){
            if(languages[i].equals(t.getLanguage())){
                break;
            }else{
                i++;
            }
        }
        languages[i] = t.getLanguage();
    }

    /**
     * 
     * @return number of tweeted languages
     */
    public int getLangNum(){
        int cont = 1;
        for(int i=1; i<languages.length; i++){
            if(languages[i]!=null){
                cont++;
            }
        }
        return cont;
    }

    /**
     * @return next
     */
    public Tweeter getNext() {
        return next;
    }

    /**
     * @param next
     */
    public void setNext(Tweeter next) {
        this.next = next;
    }

    /**
     * @return number of tweets
     * @deprecated no longer needed
     */
    public int getTweetCount(){
        return tweetCount;
    }
    
    /**
     * prints list of tweets
     * @deprecated
     */
    public void getTweetList(){
        tweetList.print();
    }

    /**
     * prints the tweeter's id, number of tweeted languages and its names
     */
    public void print(){
        System.out.println("Id: "+this.getAnnotatorId()+"; nº languages: "+getLangNum()+"; languages: "+getLanguages());
    }
}
    

