import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a expressão completa: ");
        String expression = scanner.nextLine();

        String [] teste = expression.split(" ");
        for (String each:teste){
            System.out.println(each);
            Tools tool= new Tools();
            System.out.println(tool.toDouble(each));
        }

    }
}
