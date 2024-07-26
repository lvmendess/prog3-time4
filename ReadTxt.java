import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Classe com métodos para ler o arquivo .txt e manipular linhas retiradas deste 
 */
public class ReadTxt{
    /**
     * Lê o arquivo .txt
     * @param filepath
     */
    ListaSETL tweetList;
    public ReadTxt(){
       tweetList = new ListaSETL();
    }
    public void Read(String filepath){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            reader.readLine();
            for (int i = 0; i < 200; i++){
              DivideLine(reader.readLine().trim());
            }
            tweetList.print();
            System.out.println("Quantidade total de tweets: "+tweetList.getAllTweets());
            System.out.println("Quantidade total de tweets Negativos: "+tweetList.getContNeg());
            System.out.println("Quantidade total de tweets Positivos: "+tweetList.getContPos());
            System.out.println("Quantidade total de tweets Neutros: "+tweetList.getContNeutral());
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Segrega os campos contidos na String, remove caracteres desnecessários e instancia o objeto com as informações presentes na String
     * @param line
     */
    public void DivideLine(String line){

        String [] fields = line.split(",");
        for(int i=0; i<fields.length; i++){
            fields[i] = fields[i].replace("\"", "");
        }
        Tweet tweet = new Tweet(fields[0], fields[1], Tools.toInt(fields[2]));
        tweetList.insertAtStart(tweet);


        //System.out.println(tweet.getTweetId()+" "+tweet.gethandLabel()+" "+tweet.getAnnotatorId());

    }
}
