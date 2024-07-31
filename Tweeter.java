import java.util.Arrays;

public class Tweeter {

    private ListSETL tweetList;
    private int annotatorId;
    private String[] languages = new String[15];
    private Tweeter next;

    public Tweeter(int annotatorId, String language){
        this.annotatorId = annotatorId;
        tweetList = new ListSETL();
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

    public int getAnnotatorId() {
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

    public void addTweet(Tweet t){
        tweetList.insertAtStart(t);
    }

    

    /*TODO: metodo getTweetList */
}
    

