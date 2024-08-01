public class OneList{ /*one list to rule them all, one list to find them, one list to bring them all and in the darkness bind them */
    ListSETL first;

    public boolean empty(){
        return first==null;
    }

    public void insertAtStart(ListSETL t){
        t.setNext(first);
        first = t;

    }

    public ListSETL getFirst() {
        return first;
    }

    public void setFirst(ListSETL first) {
        this.first = first;
    }

    public void printAll(){
        ListSETL aux = first;
        if(empty()){
            System.out.println("OneList is empty!");
        }else {
            while (aux != null) {
                System.out.println(aux.getLanguage()+": "+aux.getAllTweets());
                aux = aux.getNext();
            }
        }
    }

    public void getVolumeByLang(){
        ListSETL aux = first;
        while (aux != null) {
            System.out.println("Total volume of " + aux.getLanguage() +" tweets:" + aux.getAllTweets());
            aux = aux.getNext();
        }
    }
    
    public void getPositiveVolume(){
        ListSETL aux = first;
        int cont_pos = 0;
        while (aux != null) {
            cont_pos += aux.getContPos();
            System.out.println("Total volume " + aux.getLanguage() +" of positive tweets:" + aux.getContPos());
            aux = aux.getNext();
        }
        System.out.println("Total volume of positive tweets:" + cont_pos);
    }

    public void getNegativeVolume(){
        ListSETL aux = first;
        int cont_neg = 0;
        while (aux!= null) {
            cont_neg += aux.getContNeg();
            System.out.println("Total volume " + aux.getLanguage() +" of negative tweets:" + aux.getContNeg());
            aux = aux.getNext();
        }
        System.out.println("Total volume of negative tweets:" + cont_neg);
    }
    

    public void getMostPosLang() {
        ListSETL aux = first;
        int maior = 0;
        String lang = "";
        while (aux.getNext() != null) {
            if (aux.getContPos() > maior) {
                maior = aux.getContPos();
                lang = aux.getLanguage();
            }
            aux = aux.getNext();
        }
        System.out.println("The language with the biggest volume of positive tweets is: " + lang + " with " + maior + " tweets");
    }

    public void getMostNegLang() {
        ListSETL aux = first;
        int cont_neg = 0;
        String lang = "";
        while (aux.getNext() != null) {
            if (aux.getContNeg() > cont_neg) {
                cont_neg = aux.getContNeg();
                lang = aux.getLanguage();
            }
            aux = aux.getNext();
        }
        System.out.println("The language with the biggest volume of negative tweets is: " + lang + " with " + cont_neg+ " tweets");
    }
}