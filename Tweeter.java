import java.util.Arrays;

public class Tweeter {

    private ListSETL tweetList;
    private String annotatorId;
    private String[] languages = new String[15];
    private Tweeter next;
    private int tweetCount;

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

    public String getAnnotatorId() {
        return annotatorId;
    }

    public String getLanguages() {
        return Arrays.toString(languages);
    }

    public void addLanguages(String language) {
        for(int i = 0; i<languages.length; i++){
            if(languages[i]==null){
                languages[i] = language;
            }
        }
    }

    public Tweeter getNext() {
        return next;
    }

    public void setNext(Tweeter next) {
        this.next = next;
    }

    public void addTweet(Tweet t){ /*BUG: somehow, it isn't inserting the tweet into the list */
        tweetList.insertAtStart(t);
        tweetCount++;
    }

    public int getTweetCount(){
        return tweetCount;
    }
    
    public void getTweetList(){
        tweetList.print();
    }
}
    

