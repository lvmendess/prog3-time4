public class Tweeter {

    private ListaSEIL tweeterList;
    public String annotatorId;

    public Tweeter(String annotatorId, String languuage){
        this.annotatorId = annotatorId;
        tweeterList = new ListaSEIL();
        this.language = language;
    }
    public String getAnnotatorId() {
        return annotatorId;
    }
}
    

