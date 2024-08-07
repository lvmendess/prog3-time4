import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Conversion c = new Conversion();

        System.out.println("Digite a expressão completa: ");
        String expression = scanner.nextLine();
        //c.split(expression);
        c.pushStack(expression);
        c.printStack();

        scanner.close();

    }
}
