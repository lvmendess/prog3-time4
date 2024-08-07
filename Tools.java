
public class Tools {
    public Double toDouble(String number) {
        try {
            return Double.parseDouble(number);
        } catch (Exception NumberFormatException){
            return null;
        }
        
    }

}