public class Analysis {
    OneList list;
    TweeterList tweeterList;

    /**
     * no args constructor
     */
    public Analysis() {
        list = new OneList();
        tweeterList = new TweeterList();
    }

    /**
     * Initializes the class by reading sentiment data for various languages and populating the list.
     * Invokes the Reader for each language through an array which contains every language present in the
     * dataset and, once read, creates a list, defines its language and inserts it into the OneList list.
     * Calls the populateTweeterList() method 
     */
    public void initialize(){
        String[] lang = new String[] {"Albanian", "Bosnian", "Bulgarian", "Croatian", "English",
                                    "German", "Hungarian", "Polish", "Portuguese", "Russian", "Serbian",
                                    "Slovak", "Slovenian", "Spanish", "Swedish"};
        ReadTxt reader = new ReadTxt();

        for(int i=0; i<lang.length; i++){
            /*list by language */
            ListSETL list1 = reader.Read("dataset\\"+lang[i]+"_Twitter_sentiment.csv", lang[i]);
            list1.setLanguage(lang[i]);
            list.insertAtStart(list1);
        }

        populateTweeterList();
    }

    /**
     * Iterates through a list of lists and, in each list, its tweets to either create a user (Tweeter) - if
     * it doesn't already exist - or add a new language to the user's array of languages.
     */
    public void populateTweeterList(){
        ListSETL listLang = list.getFirst(); //first list
        while(listLang!=null){ //iterates through lists
           Tweet tweet = listLang.getFirst(); //first tweet  
           Tweeter tweeter = null;
           while(tweet!=null){ //iterates through tweets inside of a list
                if(tweeterList.getTweeter(tweet.getAnnotatorId())!=null){
                    tweeter = tweeterList.getTweeter(tweet.getAnnotatorId());
                }else{
                    tweeter = new Tweeter(tweet.getAnnotatorId(), tweet.getLanguage());
                    tweeterList.insertAtStart(tweeter);
                }
                tweeter.addLanguages(tweet);
                tweet = tweet.getNext();
            }
            listLang = listLang.getNext();
        }
    }

    /**
     * Total volume of tweets in each language
     */
    public void totalVolByLanguage(){ //1. Qual o volume de tweets para cada idioma?
        list.getVolumeByLang();
    }

    /**
     * Total amount of positive tweets in all languages
     */
    public void totalVolPositive(){ //2.1. Qual o volume total de tweets positivos?
        list.getPositiveVolume();
    }

    /**
     * Total amount of negative tweets in all languages
     */
    public void totalVolNegative(){ //2.2. E qual o volume total de tweets negativos?
        list.getNegativeVolume();
    }

    /**
     * Language with the bigger amount of negative tweets
     */
    public void mostNegativeLanguage(){ //3.1. Qual o idioma com mais tweets negativos?
        list.getMostNegLang();
    }

    /**
     * Language with the bigger amount of positive tweets
     */
    public void mostPositiveLanguage(){ //3.2. Qual o idioma com mais tweets positivos?
        list.getMostPosLang();
    }

    /**
     * Ranks languages by its amounts of positive and negative tweets
     */
    public void ranking(){ //3.3. É possível fazer um ranking dos idiomas?
        list.createRankPositive();
        System.out.println();
        list.createRankNegative();
    }

    /**
     * Id, number of languages and which languages the same user tweeted in at least once
     */
    public void multilingualTweeters(){ //4.1 & 4.2
        tweeterList.getMultilingual();
    }

    /**
     * @return list
     */
    public OneList getList() {
        return list;
    }

    /**
     * sets list of type OneList
     * @param list
     */
    public void setList(OneList list) {
        this.list = list;
    }

    /**
     * @return tweeterList
     */
    public TweeterList getTweeterList() {
        return tweeterList;
    }

    /**
     * sets list of type TweeterList
     * @param tweeterList
     */
    public void setTweeterList(TweeterList tweeterList) {
        this.tweeterList = tweeterList;
    }

    
}
