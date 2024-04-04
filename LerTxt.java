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
        String [] campos = linha.split(",");
        //printando varias vezes
        for(int i=0; i<1; i++){
            campos[i] = campos[i].replace("\"", "");
            Usuario usuario = new Usuario(Ferramentas.ConverterParaInt(campos[0]), campos[1], campos[2], campos[3], Ferramentas.Multiplicador(campos[4]), Ferramentas.Multiplicador(campos[5]), Ferramentas.Multiplicador(campos[6]), Ferramentas.ConverterPorcentagem(campos[7]));
            usuario.imprimirTudo();
        }
    }
}
