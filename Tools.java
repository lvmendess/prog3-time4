/**
 * Classe de métodos que podem ser utilizados pelas outras classes para
 * converter e formatar valores contidos em Strings
 */
public class Tools {

    /**
     * Converte uma String em Double
     * 
     * @param numero
     * @return valor convertido ou -1
     */
    public Double toDouble(String number) {
        try {
            return Double.parseDouble(number);
        } catch (Exception NumberFormatException){
            return null;
        }
        
    }

}