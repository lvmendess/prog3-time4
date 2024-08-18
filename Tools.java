/**
 * Class that provides methods that will assist other methods
 */
public class Tools {
    /**
     * This method receives a string as a parameter and the intention is to convert this string to double
     * @param number string to be converted
     * @return string converted to double
     */
    public Double toDouble(String number) {
        try {
            return Double.parseDouble(number);
        } catch (Exception NumberFormatException){
            return null;
        }
        
    }

}