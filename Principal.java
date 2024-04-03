import java.io.IOException;

public class Principal{
    public static void main(String[] args) throws IOException{
        LerTxt leitor = new LerTxt();
        leitor.LeitorTxt("data.txt");
    }
}