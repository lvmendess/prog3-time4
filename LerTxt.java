import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class LerTxt{
    
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

    public void DivideLinha(String linha){
        Ferramentas ferramentas = new Ferramentas();

        String [] campos = linha.split(",");
        for(int i=0; i<campos.length; i++){
            campos[i] = campos[i].replace("\"", "");
            System.out.println(campos.length);
        }

        //Não sei se esta visiualmente bonito, mas funciona
        if(campos.length==9){
            Usuario usuario = new Usuario(Ferramentas.ConverterParaInt(campos[0]), campos[1], campos[2], (campos[3]+","+campos[4]), Ferramentas.Multiplicador(campos[5]), Ferramentas.Multiplicador(campos[6]), Ferramentas.Multiplicador(campos[7]), Ferramentas.ConverterEngajamento(campos[8]));
            usuario.imprimirTudo();
        }else{
            Usuario usuario = new Usuario(Ferramentas.ConverterParaInt(campos[0]), campos[1], campos[2], campos[3], Ferramentas.Multiplicador(campos[4]), Ferramentas.Multiplicador(campos[5]), Ferramentas.Multiplicador(campos[6]), Ferramentas.ConverterEngajamento(campos[7]));
            usuario.imprimirTudo();
        }


    }
}
