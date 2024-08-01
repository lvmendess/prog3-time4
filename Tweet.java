public class Tweet{
    private String tweetId;
    private String handLabel;
    private String annotatorId;
    private Tweet next;
    private String language;

    public Tweet(String tweetId, String handLabel, String annotatorId, String language) {
        this.tweetId = tweetId;
        this.handLabel = handLabel;
        this.annotatorId = annotatorId;
        this.language = language;
        next = null;
    }

    public String getTweetId() {
        return tweetId;
    }

    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }

    public Tweet getNext() {
        return next;
    }

    public void setNext(Tweet next) {
        this.next = next;
    }

    public String gethandLabel() {
        return handLabel;
    }

    public void sethandLabel(String handLabel) {
        this.handLabel = handLabel;
    }

    public String getAnnotatorId() {
        return annotatorId;
    }

    public void setAnnotatorId(String annotatorId) {
        this.annotatorId = annotatorId;
    }

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

}