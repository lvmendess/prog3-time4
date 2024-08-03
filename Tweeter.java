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

    public int getLangNum(){
        int cont = 1;
        for(int i=1; i<languages.length; i++){
            if(languages[i]!=null){
                cont++;
            }
        }
        return cont;
    }

    public Tweeter getNext() {
        return next;
    }

    public void setNext(Tweeter next) {
        this.next = next;
    }

    public int getTweetCount(){
        return tweetCount;
    }
    
    public void getTweetList(){
        tweetList.print();
    }

    public void print(){
        System.out.println("Id: "+this.getAnnotatorId()+"; nº languages: "+getLangNum()+"; languages: "+getLanguages());
    }
}
    

