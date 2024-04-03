public class Ferramentas {
    
    public static int ConverterParaInt(String numero){
        try {
            return Integer.parseInt(numero);
        } catch (Exception e) {
            return -1;
        }
    }

    public static double ConverterParaDouble(String numero){
        try {
            return Double.parseDouble(numero);
        } catch (Exception e) {
            return -1;
        }
    }

    public static int Multiplicador(String numero){
        int numeroConvertido = 0;
        numero = numero.replace(".", "");
        if(numero.contains("K")){
            numero = numero.replace("K", "");
            numeroConvertido = ConverterParaInt(numero);
            numeroConvertido *= 100;
        }else if(numero.contains("M")){
            numero = numero.replace("M", "");
            numeroConvertido = ConverterParaInt(numero);
            numeroConvertido *= 100000;
        }
        return numeroConvertido;
    }
}
