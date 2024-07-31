import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Classe com métodos para ler o arquivo .txt e manipular linhas retiradas deste 
 */
public class ReadTxt{
    /**
     * Lê o arquivo .txt
     * @param filepath
     * @param langugage
     */
    ListSETL tweetList;
    public ReadTxt(){}

    public ListSETL Read(String filepath, String language){
        tweetList = new ListSETL();
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
     * Segrega os campos contidos na String, remove caracteres desnecessários e instancia o objeto com as informações presentes na String
     * @param line 
     * @param langugage
     */
    public void DivideLine(String line, String language){

        String [] fields = line.split(",");
        for(int i=0; i<fields.length; i++){
            fields[i] = fields[i].replace("\"", "");
        }
        Tweet tweet = new Tweet(fields[0], fields[1], Tools.toInt(fields[2]), language);
        tweetList.insertAtStart(tweet);
    }
}
