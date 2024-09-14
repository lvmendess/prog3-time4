/**
 * Classe palavra na árvore binária.
 * 
 */
public class Word {
    
    /**
     * Valor da palavra (string).
     */
    private String value;
    
    /**
     * Nó esquerdo da árvore.
     */
    private Word left;
    
    /**
     * Nó direito da árvore.
     */
    private Word right;
    
    /**
     * Lista de linhas onde a palavra aparece.
     */
    private ListaSEL wordLines;

    /**
     * Construtor da classe Word.
     * 
     * @param value valor da palavra
     * @param lineNum número da linha onde a palavra aparece
     */
    public Word(String value, int lineNum) {
        this.value = value;
        wordLines = new ListaSEL();
        addLineAtList(lineNum);
    }

    /**
     * Adiciona uma linha à lista de linhas da palavra.
     * 
     * @param line número da linha
     */
    public void addLineAtList(int line) {
        Lines l = new Lines(line);
        wordLines.insert(l);
    }

    /**
     * Retorna o número de linhas onde a palavra aparece.
     * 
     * @return número de linhas
     */
    public int getLines() {
        return wordLines.getSingleLine();
    }

    /**
     * Retorna o valor da palavra.
     * 
     * @return valor da palavra
     */
    public String getValue() {
        return value;
    }

    /**
     * Define o valor da palavra.
     * 
     * @param value novo valor da palavra
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Retorna o nó esquerdo da árvore.
     * 
     * @return nó esquerdo
     */
    public Word getLeft() {
        return left;
    }

    /**
     * Define o nó esquerdo da árvore.
     * 
     * @param left novo nó esquerdo
     */
    public void setLeft(Word left) {
        this.left = left;
    }

    /**
     * Retorna o nó direito da árvore.
     * 
     * @return nó direito
     */
    public Word getRight() {
        return right;
    }

    /**
     * Define o nó direito da árvore.
     * 
     * @param right novo nó direito
     */
    public void setRight(Word right) {
        this.right = right;
    }

    /**
     * Retorna a lista de linhas da palavra.
     * 
     * @return lista de linhas
     */
    public ListaSEL getWordLines() {
        return wordLines;
    }

    /**
     * Define a lista de linhas da palavra.
     * 
     * @param wordLines nova lista de linhas
     */
    public void setWordLines(ListaSEL wordLines) {
        this.wordLines = wordLines;
    }
}