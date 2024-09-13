import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTxt{
    BinaryTree tree;

    public ReadTxt(){
        tree = new BinaryTree();
    }

    public void read(String filepath){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            int lineNumber = 1;
            while( (line=reader.readLine())!=null){
                DivideLine(line.trim().toLowerCase(), lineNumber);
                lineNumber++;
            }
            reader.close();
        }
        catch (Exception e){
        }
    }

    public void DivideLine(String line, int lineNum) {
        String [] fields = line.replace("\"", "").replace(",","").replace("!","").replace(".","").replace(":","").replace("-","").split(" ");
        for(int i=0; i<fields.length; i++){
            /*if(!fields[0].equals("")){
                System.out.println(fields[i]);
                //ENVIAR PARA ONDE DEVE SER ENVIADO  -- Só coloquei pra printar para verificar :))
            }*/
            Word w = new Word(fields[i], lineNum);
            
        }
    }
}

