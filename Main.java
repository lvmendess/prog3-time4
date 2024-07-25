import java.io.IOException;
/**
 * Classe que chama os métodos
 */
public class Main{
    public static void main(String[] args) throws IOException{
        ReadTxt reader = new ReadTxt();
        reader.Read("dataset\\English_Twitter_sentiment.csv");
    }
}