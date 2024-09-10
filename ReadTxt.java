import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTxt{
    public ReadTxt(){}
    public void read(String filepath){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while( (line=reader.readLine())!=null){
                DivideLine(line.trim().toLowerCase());
            }
            reader.close();
        }
        catch (Exception e){
        }
    }

    public void DivideLine(String line) {
        String [] fields = line.replace("\"", "").replace(",","").replace("!","").replace(".","").replace(":","").replace("-","").split(" ");
        for(int i=0; i<fields.length; i++){
            if(!fields[0].equals("")){
                System.out.println(fields[i]);
                //ENVIAR PARA ONDE DEVE SER ENVIADO  -- Só coloquei pra printar para verificar :))
            }
        }
    }
}

