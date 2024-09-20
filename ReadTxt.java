import java.io.BufferedReader;
import java.io.FileReader;
import java.text.Normalizer;
/**
 * Uma classe para ler e processar arquivos de texto.
 */
public class ReadTxt{
    /**
     * Construtor padrão
     */
    public ReadTxt(){}
    /**
     * Lê um arquivo de texto e insere seu conteúdo em uma árvore binária.
     * 
     * @param filepath o caminho para o arquivo de texto
     * @param t a árvore binária para inserir as palavras
     */
    public void read(String filepath, BalancedBinaryTree t){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            int lineNumber = 1;
            while( (line=reader.readLine())!=null){
                DivideLine(line.trim().toLowerCase(), lineNumber, t);
                lineNumber++;
            }
            reader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Remove acentos e caracteres especiais de um array de strings.
     * 
     * @param strs o array de strings para processar
     * @return um novo array de strings com acentos e caracteres especiais removidos
     */
    public static String[] removeAccentsAndCharacters(String[] strs) {
        String[] result = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            result[i] = Normalizer.normalize(strs[i], Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replace("\"", "").replace(",","").replace("!","").replace(".","").replace(":","").replace("'", "").replace("`", "").replace("-","").replace(")", "").replace("(", "");
        }
        return result;
    }
    /**
     * Divide uma linha de texto em palavras individuais e as insere em uma árvore binária.
     * 
     * @param line a linha de texto para processar
     * @param lineNum o número da linha no arquivo
     * @param t a árvore binária para inserir as palavras
     */
    public void DivideLine(String line, int lineNum, BalancedBinaryTree t) {
        String [] fields = removeAccentsAndCharacters(line.split(" "));
        for (String field : fields) {
            if (!fields[0].equals("")) {
                Word word = new Word(field, lineNum);
                t.insert(word);
            }
        }
    }
}

