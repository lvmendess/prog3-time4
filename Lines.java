/**
 * Classe Lines usada na Lista de linhas. Representa linha onde a palavra aparece.
 * 
 */
public class Lines {

    /**
     * Valor da linha.
     */
    private int line;

    /**
     * Referência para a próxima linha.
     */
    private Lines next;

    /**
     * Construtor da classe Lines.
     * 
     * @param line valor da linha
     */
    public Lines(int line) {
        this.line = line;
    }

    /**
     * Retorna o valor da linha.
     * 
     * @return valor da linha
     */
    public int getLine() {
        return line;
    }

    /**
     * Retorna a próxima linha.
     * 
     * @return próxima linha
     */
    public Lines getNext() {
        return next;
    }

    /**
     * Define a próxima linha.
     * 
     * @param next próxima linha
     */
    public void setNext(Lines next) {
        this.next = next;
    }

    /**
     * Define o valor da linha.
     * 
     * @param line valor da linha
     */
    public void setLine(int line) {
        this.line = line;
    }
}