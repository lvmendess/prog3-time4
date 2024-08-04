import java.io.IOException;
/**
 * Invokes methods of Analysis to answer each question
 */
public class Main{
    public static void main(String[] args) throws IOException{
        Analysis analysis = new Analysis();
        analysis.initialize();

        System.out.println("1. Qual o volume de tweets para cada idioma?");
        analysis.totalVolByLanguage();

        System.out.println();

        System.out.println("2.1. Qual o volume total de tweets positivos?");
        analysis.totalVolPositive();

        System.out.println();

        System.out.println("2.2. E qual o volume total de tweets negativos?");
        analysis.totalVolNegative();

        System.out.println();

        System.out.println("3.1. Qual o idioma com mais tweets negativos?");
        analysis.mostNegativeLanguage();

        System.out.println();

        System.out.println("3.2. Qual o idioma com mais tweets positivos?");
        analysis.mostPositiveLanguage();

        System.out.println();

        System.out.println("3.3. É possível fazer um ranking dos idiomas?");
        analysis.ranking();

        System.out.println();

        System.out.println("4.1. Algum tweeter teve registro em mais de um idioma?\n4.2. Qual, quais e/ou quantos?");
        analysis.multilingualTweeters();
    }
}