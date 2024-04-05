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
            leitor.readLine();
            for (int i = 0; i < 200; i++){
              DivideLinha(leitor.readLine().trim());
            }
            leitor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Segrega os campos contidos na String, remove caracteres desnecessários e instancia o objeto com as informações presentes na String
     * @param linha
     */
    public void DivideLinha(String linha){
        String [] campos = linha.split(",");
        for(int i=0; i<campos.length; i++){
            campos[i] = campos[i].replace("\"", "");
        }
        if(campos.length==9){
            Usuario usuario = new Usuario(Ferramentas.ConverterParaInt(campos[0]), campos[1], campos[2], (campos[3]+","+campos[4]), Ferramentas.MultiplicadorInt(campos[5]), Ferramentas.MultiplicadorLong(campos[6]), Ferramentas.MultiplicadorInt(campos[7]), Ferramentas.ConverterEngajamento(campos[8]));
            usuario.imprimirTudo();
        }else{
            Usuario usuario = new Usuario(Ferramentas.ConverterParaInt(campos[0]), campos[1], campos[2], campos[3], Ferramentas.MultiplicadorInt(campos[4]), Ferramentas.MultiplicadorLong(campos[5]), Ferramentas.MultiplicadorInt(campos[6]), Ferramentas.ConverterEngajamento(campos[7]));
            usuario.imprimirTudo();
        }


    }
}
