public class Analysis {
    OneList list;
    TweeterList tweeterList;

    public Analysis() {
        list = new OneList();
        tweeterList = new TweeterList();
    }

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

    public void populateTweeterList(){
        ListSETL listLang = list.getFirst(); //first list
        //listLang.print();
       while(listLang!=null){ //iterates through lists
           Tweet tweet = listLang.getFirst(); //first tweet
            
           while(tweet!=null){ //iterates through tweets inside of a list

                if(tweeterList.empty()){ //empty list
                    Tweeter tweeter = new Tweeter(tweet.getAnnotatorId(), tweet.getLanguage());
                    tweeterList.insertAtStart(tweeter);
        
                }else{ //list isn't empty 
                    if(tweeterList.getTweeter(tweet.getAnnotatorId())==null){ //user doesn't exist yet
                        Tweeter tweeter = new Tweeter(tweet.getAnnotatorId(), tweet.getLanguage());
                       tweeterList.insertAtStart(tweeter);
                    }
                }
                tweet = tweet.getNext();
            }
            listLang = listLang.getNext();
        }
    }

    public void totalVolByLanguage(){ //1. Qual o volume de tweets para cada idioma?
        list.getVolumeByLang();
    }

    public void totalVolPositive(){ //2.1. Qual o volume total de tweets positivos?
        list.getPositiveVolume();
    }

    public void totalVolNegative(){ //2.2. E qual o volume total de tweets negativos?
        list.getNegativeVolume();
    }

    public void mostNegativeLanguage(){ //3.1. Qual o idioma com mais tweets negativos?
        list.getMostNegLang();
    }

    public void mostPositiveLanguage(){ //3.2. Qual o idioma com mais tweets positivos?
        list.getMostPosLang();
    }

    public void ranking(){ //3.3. É possível fazer um ranking dos idiomas?
        list.createRankPositive();
        list.createRankNegative();
    }

    public void multilingualTweeters(){ //4.1 & 4.2

    }

    public OneList getList() {
        return list;
    }

    public void setList(OneList list) {
        this.list = list;
    }

    public TweeterList getTweeterList() {
        return tweeterList;
    }

    public void setTweeterList(TweeterList tweeterList) {
        this.tweeterList = tweeterList;
    }

    
}
