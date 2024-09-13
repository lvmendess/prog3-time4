import java.io.BufferedReader;
import java.io.FileReader;

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

    public void DivideLine(String line, int lineNum, BinaryTree t) {
        String [] fields = line.replace("\"", "").replace(",","").replace("!","").replace(".","").replace(":","").replace("-","").split(" ");
        for(int i=0; i<fields.length; i++){
            if(!fields[0].equals("")){
                Word word = new Word(fields[i], lineNum);
                t.insert(word);
            }
        }
    }
}

