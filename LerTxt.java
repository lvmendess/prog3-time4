import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Classe com métodos para ler o arquivo .txt e manipular linhas retiradas deste 
 */
public class LerTxt{
    /**
     * Lê o arquivo .txt
     * @param nomeDoArquivo
     */
    public void LeitorTxt(String nomeDoArquivo){
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeDoArquivo));
            for (int i = 0; i <= 200; i++){
                //System.out.println(leitor.readLine().trim());
                DivideLinha(leitor.readLine().trim());
            }
            leitor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Segrega os campos contidos na String e remove caracteres desnecessários
     * @param linha
     */
    public void DivideLinha(String linha){
        Ferramentas ferramentas = new Ferramentas();
        String [] campos = linha.split(",");
        for(int i=0; i<campos.length; i++){
            campos[i] = campos[i].replace("\"", "");
        }
    }
}
