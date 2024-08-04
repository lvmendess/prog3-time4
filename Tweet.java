public class Tweet{
    private String tweetId;
    private String handLabel;
    private String annotatorId;
    private Tweet next;
    private String language;

    /**
     * Creates Tweet object
     * @param tweetId
     * @param handLabel
     * @param annotatorId
     * @param language
     */
    public Tweet(String tweetId, String handLabel, String annotatorId, String language) {
        this.tweetId = tweetId;
        this.handLabel = handLabel;
        this.annotatorId = annotatorId;
        this.language = language;
        next = null;
    }

    /**
     * @return tweetId
     */
    public String getTweetId() {
        return tweetId;
    }

    /**
     * sets tweetId
     * @param tweetId
     */
    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }

    /**
     * @return next tweet
     */
    public Tweet getNext() {
        return next;
    }

    /**
     * sets next tweet
     * @param next
     */
    public void setNext(Tweet next) {
        this.next = next;
    }

    /**
     * @return sentiment
     */
    public String gethandLabel() {
        return handLabel;
    }

    /**
     * sets sentiment
     * @param handLabel
     */
    public void sethandLabel(String handLabel) {
        this.handLabel = handLabel;
    }

    /**
     * @return annotatorId
     */
    public String getAnnotatorId() {
        return annotatorId;
    }

    /**
     * sets annotatorId
     * @param annotatorId
     */
    public void setAnnotatorId(String annotatorId) {
        this.annotatorId = annotatorId;
    }

    /**
     * @return tweet's language
     */
    public String getLanguage(){
        return language;
    }

    /**
     * sets tweet's language
     * @param language
     */
    public void setLanguage(String language){
        this.language = language;
    }

}