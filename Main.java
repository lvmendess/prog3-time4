import java.util.Scanner;

public class Main {
    /**
     * Method used to receive an expression and direct it to the pushStack method of the Conversion class and calls the print method of conversion
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Conversion c = new Conversion();

        System.out.println("Enter the complete expression: ");
        String expression = scanner.nextLine();
    
        c.pushStack(expression.trim());
        c.print();

        scanner.close();

    }
}