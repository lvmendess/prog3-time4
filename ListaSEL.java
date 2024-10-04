/**
 * Classe lista de linhas ordenadas. lista simplesmente encadeada.Representa as linhas onde a palavra aparece.
 */
public class ListaSEL {
    /**
     * Primeiro elemento da lista.
     */
    private Lines first;

    /**
     * Construtor da classe ListaSEL.
     */
    public ListaSEL(){
        first=null;
    }

    /**
     * Verifica se a lista está vazia.
     * 
     * @return true se a lista estiver vazia, false caso contrário
     */
    private boolean empty(){
        return first==null;
    }
    
    /**
     * Insere um elemento (do tipo Lines) na lista de forma ordenada.
     * 
     * @param l elemento a ser inserido
     */

    public void insert(Lines l){
        if(empty()){
            first=l;
        }else{
            Lines aux=first;
            while(aux.getNext()!=null){
                aux=aux.getNext();
            }
            if(l.getLine()!=aux.getLine()){
                aux.setNext(l);

            }
        }

    }

    /**
     * Retorna uma string com todas as linhas da lista.
     * 
     * @return string com as linhas
     */
    public String printAll(){
        String resultLine = null;
        Lines aux = first;
        if (first == null){
            return resultLine;
        }else{
            while (aux != null) {
                if (aux == first){
                    resultLine = String.valueOf(aux.getLine());        
                }
                else{
                    resultLine += ", " + aux.getLine();
                }
                aux = aux.getNext(); 
            }
            return resultLine;
        }
    }

    /**
     * Retorna a primeira linha da lista.
     * 
     * @return primeira linha
     */
    public int getSingleLine(){
        return first.getLine();
    }
}

