import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Class responsible for reading .txt file and manipulate lines taken from it 
 */
public class ReadTxt{
    ListSETL tweetList;
    TweeterList tweetersList;

    public ReadTxt(){}

    /**
     * Reads .txt file
     * @param filepath
     * @param language
     */
    public ListSETL Read(String filepath, String language){
        tweetList = new ListSETL();
        tweetersList = new TweeterList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while( (line=reader.readLine())!=null){
                DivideLine(line.trim(), language);
            }
            reader.close();

            return tweetList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Segregates fields contained in the String, remove unnecessary characters and instantiates object with the information given
     * @param line 
     * @param language
     */
    public void DivideLine(String line, String language){

        String [] fields = line.split(",");
        if(fields[0].equals("TweetID")){
            return;
        }
            for(int i=0; i<fields.length; i++){
                fields[i] = fields[i].replace("\"", "");
            }
            Tweet tweet = new Tweet(fields[0], fields[1], fields[2], language); //creates tweet
            tweetList.insertAtStart(tweet); //inserts tweet into list which will be given to the ListSETL constructor through the Analysis class
    }
    
}
