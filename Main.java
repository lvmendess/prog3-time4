import java.io.IOException;
/**
 * Classe que chama os métodos
 */
public class Main{
    public static void main(String[] args) throws IOException{
        Analysis analysis = new Analysis();
        analysis.initialize();
        analysis.mostNegativeLanguage();
        analysis.mostPositiveLanguage();

    }
}