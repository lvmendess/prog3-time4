public class Main {
    public static void main(String args[]){
        Control control = new Control();

        control.initialize("dataset\\faroeste.txt");
        control.printTree();
        control.saveTreeToTxt("saida_faroeste.txt");

        System.out.println();

        control.initialize("dataset\\brasil.txt");
        control.printTree();
        control.saveTreeToTxt("saida_brasil.txt");
    }
}
