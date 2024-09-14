import java.io.BufferedReader;
import java.io.FileReader;
import java.text.Normalizer;

public class ReadTxt{

    public ReadTxt(){}

    public void read(String filepath, BinaryTree t){
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

    public static String[] removerAcentoseCaracteres(String[] strs) {
        String[] result = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            result[i] = Normalizer.normalize(strs[i], Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replace("\"", "").replace(",","").replace("!","").replace(".","").replace(":","").replace("'", "").replace("`", "").replace("-","").replace(")", "").replace("(", "");
        }
        return result;
    }
    public void DivideLine(String line, int lineNum, BinaryTree t) {
        String [] fields = removerAcentoseCaracteres(line.split(" "));
        for (String field : fields) {
            if (!fields[0].equals("")) {
                Word word = new Word(field, lineNum);
                t.insert(word);
            }
        }
    }
}

