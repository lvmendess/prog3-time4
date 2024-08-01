import java.io.IOException;
/**
 * Classe que chama os métodos
 */
public class Main{
    public static void main(String[] args) throws IOException{
        Analysis analysis = new Analysis();
        analysis.initialize();
        //analysis.list.getVolumeByLang();
        //analysis.tweeterList.print(); /*BUG: printing "AnnotatorID" instead of the actual ID after it prints 47 (Spanish) and before 62 (Swedish) */
        /*analysis.mostNegativeLanguage();
        analysis.mostPositiveLanguage();
        analysis.totalVolNegative();
        analysis.totalVolPositive();*/
        //analysis.totalVolPositive();
        analysis.ranking();

    }
}