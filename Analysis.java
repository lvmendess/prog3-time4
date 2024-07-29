/*comparar listas, fazer ranking, responder perguntas */
public class Analysis {
    ListaSETL alList;
    ListaSETL boList;
    ListaSETL buList;
    ListaSETL crList;
    ListaSETL enList;
    ListaSETL gerList;
    ListaSETL hunList;
    ListaSETL poList;
    ListaSETL ptList;
    ListaSETL ruList;
    ListaSETL seList;
    ListaSETL slkList;
    ListaSETL slvList;
    ListaSETL spList;
    ListaSETL swList;

    public Analysis() {
    }

    public void initialize(){
        ReadTxt reader = new ReadTxt();
        alList = reader.Read("prog3-time4\\dataset\\Albanian_Twitter_sentiment.csv");
        boList = reader.Read("prog3-time4\\dataset\\Bosnian_Twitter_sentiment.csv");
        buList = reader.Read("prog3-time4\\dataset\\Bulgarian_Twitter_sentiment.csv");
        crList = reader.Read("prog3-time4\\dataset\\Croatian_Twitter_sentiment.csv");
        enList = reader.Read("prog3-time4\\dataset\\English_Twitter_sentiment.csv");
        gerList = reader.Read("prog3-time4\\dataset\\German_Twitter_sentiment.csv");
        hunList = reader.Read("prog3-time4\\dataset\\Hungarian_Twitter_sentiment.csv");
        poList = reader.Read("prog3-time4\\dataset\\Polish_Twitter_sentiment.csv");
        ptList = reader.Read("prog3-time4\\dataset\\Portuguese_Twitter_sentiment.csv");
        ruList = reader.Read("prog3-time4\\dataset\\Russian_Twitter_sentiment.csv");
        seList = reader.Read("prog3-time4\\dataset\\Serbian_Twitter_sentiment.csv");
        slkList = reader.Read("prog3-time4\\dataset\\Slovak_Twitter_sentiment.csv");
        slvList = reader.Read("prog3-time4\\dataset\\Slovenian_Twitter_sentiment.csv");
        spList = reader.Read("prog3-time4\\dataset\\Spanish_Twitter_sentiment.csv");
        swList = reader.Read("prog3-time4\\dataset\\Swedish_Twitter_sentiment.csv");
    }
    
    public void CompareLists(){
        System.out.println( alList.getAllTweets());
        System.out.println(ptList.getAllTweets());
    } /*sanzio e josé*/
}
