/**
 * Classe de métodos que podem ser utilizados pelas outras classes para converter e formatar valores contidos em Strings 
*/
public class Tools {
    /**
     * Converte uma String em Int
     * @param number 
     * @return valor convertido ou -1
     */
    public static int toInt(String number){
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {
            return -1;
        }
    }
    /**
     * Converte uma String em Long
     * @param numero
     * @return valor convertido ou -1
     */
    public static long toLong(String number){
        try {
            return Long.parseLong(number);
        } catch (Exception e) {
            return -1;
        }
    }
    /**
     * Converte uma String em Double
     * @param numero
     * @return valor convertido ou -1
     */
    public static double toDouble(String number){
        try {
            return Double.parseDouble(number);
        } catch (Exception e) {
            return -1;
        }
    }
    /**
     * Formata uma String que contém um valor acompanhado pela letra "M", converte e multiplica por 1000000
     * No caso de ausência da letra "M", apenas converte para long
     * @param numero 
     * @return numero convertido e/ou multiplicado
     * @deprecated
     */
    public static long MultiplyLong(String number){
        long convertedNum = 0;
        if(number.contains("M")){
            number = number.replace("M", "");
            double aux = toDouble(number)*1000000;
            convertedNum = (long)(aux);
        }else{
            convertedNum = toLong(number);
        }
        return convertedNum;
    }
    /**
     * Formata uma String que contém um valor acompanhado pela letra "K", converte para double, multiplica por 1000 e converte para int
     * No caso de ausência da letra "K", apenas converte para int
     * @param numero 
     * @return numero convertido e/ou multiplicado
     * @deprecated
     */
    public static int MultiplyInt(String number){
        int convertedNum = 0;
        if(number.contains("K")){
            number = number.replace("K", "");
            double aux = toDouble(number)*1000;
            convertedNum = (int)(aux);
        }else{
            convertedNum = toInt(number);
        }
        return convertedNum;
    }
    /**
     * Remove o caractere "%" da String correspondente ao campo 'Engajamento' e converte para double
     * @param numero
     * @return numero convertido em double
     * @deprecated
     */
    public static double ConverterEngajamento(String number) {
        number = number.replace("%", "");
        return toDouble(number);
    }

}
