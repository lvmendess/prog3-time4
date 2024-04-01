import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ler_txt{
    public static void main(String[] args) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader("data.txt"));
        for (int i = 0; i <= 200; i++){
            System.out.println(leitor.readLine().trim());
        }
        leitor.close();
    }
}
