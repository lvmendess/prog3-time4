public class Tweeter {

    private ListSETL tweeterList;
    private String annotatorId;
    private String[] languages = new String[15];

    public Tweeter(String annotatorId, String language){
        this.annotatorId = annotatorId;
        tweeterList = new ListSETL();
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

    /*TODO: metodo getTweeterList */
}
    

