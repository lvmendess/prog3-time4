/**
 * Classe de métodos que podem ser utilizados pelas outras classes para converter e formatar valores contidos em Strings
 * @author Lívia Mendes
 * @version 03/04/2024 
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
     * Formata uma String que contém um valor precedido por "K" ou "M", converte e multiplica pela potência representada pela letra
     * @param numero 
     * @return numeroConvertido
     */
    public static int Multiplicador(String numero){
        int numeroProcessado = 0;
        numero = numero.replace(".", "");
        if(numero.contains("K")){
            numero = numero.replace("K", "");
            numeroProcessado = ConverterParaInt(numero);
            numeroProcessado *= 100;
        }else if(numero.contains("M")){
            numero = numero.replace("M", "");
            numeroProcessado = ConverterParaInt(numero);
            numeroProcessado *= 100000;
        }
        return numeroProcessado;
    }
}
