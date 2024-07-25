public class Tweet{
    private String tweetId;
    private String handLabel;
    private int annotatorId;

    public Tweet(String tweetId, String handLabel, int annotatorId) {
        this.tweetId = tweetId;
        this.handLabel = handLabel;
        this.annotatorId = annotatorId;
    }

    public String getTweetId() {
        return tweetId;
    }

    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }

    public String gethandLabel() {
        return handLabel;
    }

    public void sethandLabel(String handLabel) {
        this.handLabel = handLabel;
    }

    public int getAnnotatorId() {
        return annotatorId;
    }

    public void setAnnotatorId(int annotatorId) {
        this.annotatorId = annotatorId;
    }

}