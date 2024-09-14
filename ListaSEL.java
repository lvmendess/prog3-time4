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
            insertAtStart(l);
        }else{
            Lines aux=first;
            if(l.getLine()<aux.getLine()){
                insertAtStart(l);
            }else{
                Lines aux2=aux.getNext();
                if(aux.getNext()==null){
                    insertAtEnd(l);
                }else{
                    while (l.getLine()>aux.getLine()&&l.getLine()>aux2.getLine()&&aux2.getNext()!=null) {
                        aux=aux.getNext();
                        aux2=aux2.getNext();
                    }
                    if(l.getLine()>aux2.getLine()){
                        aux2.setNext(l);
                    }else{
                        aux.setNext(l);
                        l.setNext(aux2);
                    }
                }
            }
            
        }
       
    }
    /**
     * Insere um elemento no início da lista.
     * 
     * @param l elemento a ser inserido
     */
    private void insertAtStart(Lines l){
        l.setNext(first);
        first=l;
    }
    private void insertAtEnd(Lines l){
        if(empty()){
            first=l;
        }else{
            Lines aux = first;
            while (aux.getNext()!=null) {
                aux=aux.getNext();
            }
            aux.setNext(l);
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

