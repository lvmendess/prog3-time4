/**
 * Classe de métodos que podem ser utilizados pelas outras classes para converter e formatar valores contidos em Strings 
*/
public class Ferramentas {
    /**
     * Converte uma String em Int
     * @param numero 
     * @return valor convertido ou -1
     */
    public static int ConverterParaInt(String numero){
        try {
            return Integer.parseInt(numero);
        } catch (Exception e) {
            return -1;
        }
    }
    /**
     * Converte uma String em Long
     * @param numero
     * @return valor convertido ou -1
     */
    public static long ConverterParaLong(String numero){
        try {
            return Long.parseLong(numero);
        } catch (Exception e) {
            return -1;
        }
    }
    /**
     * Converte uma String em Double
     * @param numero
     * @return valor convertido ou -1
     */
    public static double ConverterParaDouble(String numero){
        try {
            return Double.parseDouble(numero);
        } catch (Exception e) {
            return -1;
        }
    }
    /**
     * Formata uma String que contém um valor acompanhado pela letra "M", converte e multiplica por 1000000
     * No caso de ausência da letra "M", apenas converte para long
     * @param numero 
     * @return numero convertido e/ou multiplicado
     */
    public static long MultiplicadorLong(String numero){
        long numeroConvertido = 0;
        if(numero.contains("M")){
            numero = numero.replace("M", "");
            double aux = ConverterParaDouble(numero)*1000000;
            numeroConvertido = (long)(aux);
        }else{
            numeroConvertido = ConverterParaLong(numero);
        }
        return numeroConvertido;
    }
    /**
     * Formata uma String que contém um valor acompanhado pela letra "K", converte para double, multiplica por 1000 e converte para int
     * No caso de ausência da letra "K", apenas converte para int
     * @param numero 
     * @return numero convertido e/ou multiplicado
     */
    public static int MultiplicadorInt(String numero){
        int numeroConvertido = 0;
        if(numero.contains("K")){
            numero = numero.replace("K", "");
            double aux = ConverterParaDouble(numero)*1000;
            numeroConvertido = (int)(aux);
        }else{
            numeroConvertido = ConverterParaInt(numero);
        }
        return numeroConvertido;
    }
    /**
     * Remove o caractere "%" da String correspondente ao campo 'Engajamento' e converte para double
     * @param numero
     * @return numero convertido em double
     */
    public static double ConverterEngajamento(String numero) {
        numero = numero.replace("%", "");
        return ConverterParaDouble(numero);
    }

}
