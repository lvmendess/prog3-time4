import java.io.IOException;
/**
 * Classe que chama os métodos
 */
public class Main{
    public static void main(String[] args) throws IOException{
        Analysis analysis = new Analysis();
        analysis.initialize();
        analysis.CompareLists();
        analysis.list.getVolume();
        analysis.list.getMostPosLang();
        analysis.list.getMostNegLang();
    }
}