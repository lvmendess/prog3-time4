import java.io.IOException;
/**
 * Classe que chama os métodos
 */
public class Principal{
    public static void main(String[] args) throws IOException{
        LerTxt leitor = new LerTxt();
        leitor.LeitorTxt("prog3-time4-TP1-Instagram/data.txt");
    }
}