/*comparar listas, fazer ranking, responder perguntas */
public class Analysis {
    OneList list;

    public Analysis() {
        list = new OneList();
    }

    public void initialize(){
        String[] lang = new String[] {"Albanian", "Bosnian", "Bulgarian", "Croatian", "English",
                                    "German", "Hungarian", "Polish", "Portuguese", "Russian", "Serbian",
                                    "Slovak", "Slovenian", "Spanish", "Swedish"};
        ReadTxt reader = new ReadTxt();

        for(int i=0; i<lang.length; i++){
            ListSETL list1 = reader.Read("prog3-time4\\dataset\\"+lang[i]+"_Twitter_sentiment.csv");
            list1.setLanguage(lang[i]);
            list.insertAtStart(list1);
        }
    }
    
    public void CompareLists(){
        list.print();
    } /*sanzio e josé*/
}
