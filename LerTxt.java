import java.io.BufferedReader;
import java.io.FileReader;

public class LerTxt{
    
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

    public void DivideLinha(String linha){
        Ferramentas ferramentas = new Ferramentas();
        String [] campos = linha.split(",");
        for(int i=0; i<campos.length; i++){
            campos[i] = campos[i].replace("\"", "");
        }
        Usuario usuario = new Usuario(Ferramentas.ConverterParaInt(campos[0]), campos[1], campos[2], campos[3], Ferramentas.Multiplicador(campos[4]), Ferramentas.Multiplicador(campos[5]), Ferramentas.Multiplicador(campos[6]), Ferramentas.ConverterParaDouble(campos[7]));
        usuario.imprimirTudo();
    }
}
