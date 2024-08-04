public class OneList { /*
                        * one list to rule them all, one list to find them, one list to bring them all
                        * and in the darkness bind them
                        */
    ListSETL first;

    /**
     * @return if list has no element yet
     */
    public boolean empty() {
        return first == null;
    }

    /**
     * Inserts list at the start
     * @param t
     */
    public void insertAtStart(ListSETL t) {
        t.setNext(first);
        setFirst(t);
    }

    /**
     * @return instance of the list which occupies the top of the list at the moment
     */
    public ListSETL getFirst() {
        return first;
    }

    /**
     * sets first list of the list
     * @param first
     */
    public void setFirst(ListSETL first) {
        this.first = first;
    }

    /**
     * prints all tweets of all languages
     * @deprecated
     */
    public void printAll() {
        ListSETL aux = first;
        if (empty()) {
            System.out.println("OneList is empty!");
        } else {
            while (aux != null) {
                System.out.println(aux.getLanguage() + ": " + aux.getAllTweets());
                aux = aux.getNext();
            }
        }
    }

    /**
     * prints total volume of tweets in each language
     */
    public void getVolumeByLang() {
        ListSETL aux = first;
        while (aux != null) {
            System.out.println("Total volume of " + aux.getLanguage() + " tweets:" + aux.getAllTweets());
            aux = aux.getNext();
        }
    }

    /**
     * prints total volume of positive tweets over all languages
     */
    public void getPositiveVolume() {
        ListSETL aux = first;
        int cont_pos = 0;
        while (aux != null) {
            cont_pos += aux.getContPos();
            aux = aux.getNext();
        }
        System.out.println("Total volume of positive tweets:" + cont_pos);
    }

    /**
     * prints total volume of negative tweets over all languages
     */
    public void getNegativeVolume() {
        ListSETL aux = first;
        int cont_neg = 0;
        while (aux != null) {
            cont_neg += aux.getContNeg();
            aux = aux.getNext();
        }
        System.out.println("Total volume of negative tweets:" + cont_neg);
    }

    /**
     * prints which language has the bigger amount of positive tweets and its amount of which
     */
    public void getMostPosLang() {
        ListSETL aux = first;
        int cont_pos = 0;
        String lang = "";
        while (aux != null) {
            if (aux.getContPos() > cont_pos) {
                cont_pos = aux.getContPos();
                lang = aux.getLanguage();
            }
            aux = aux.getNext();
        }
        System.out.println("The language with the biggest volume of positive tweets is: " + lang + " with " + cont_pos+ " tweets");
    }

    /**
     * prints which language has the bigger amount of negative tweets and its amount of which
     */
    public void getMostNegLang() {
        ListSETL aux = first;
        int cont_neg = 0;
        String lang = "";
        while (aux != null) {
            if (aux.getContNeg() > cont_neg) {
                cont_neg = aux.getContNeg();
                lang = aux.getLanguage();
            }
            aux = aux.getNext();
        }
        System.out.println("The language with the biggest volume of negative tweets is: " + lang + " with " + cont_neg + " tweets");
    }

    /**
     * Ranks languages by its amounts of positive tweets
     */
    public void createRankPositive() {
        int cont_pos = 0;
        ListSETL aux = first;
        String lang = "";
        int contPosTop = 0;
        while (aux.getNext() != null) {
            if (aux.getContPos() > contPosTop) {
                contPosTop = aux.getContPos();
                lang = aux.getLanguage();
            }
            aux = aux.getNext();
        }
        int contRank = 1;
        cont_pos = 0;
        aux = first;
        while (contRank <= 15) {
            if (contRank == 1){
                System.out.println("Ranking of languages by positive tweets: ");
                System.out.println(contRank + ". " + lang + " " + contPosTop);
                contRank++;
            }
            while (aux != null) {
                if (aux.getContPos() < contPosTop && aux.getContPos() > cont_pos) {
                    cont_pos = aux.getContPos();
                    lang = aux.getLanguage();

                }
                aux = aux.getNext();
            }
            contPosTop = cont_pos;
            cont_pos = 0;
            System.out.println(contRank + ". " + lang + " " + contPosTop);
            contRank++;
            aux = first;
        }
    }

    /**
     * Ranks languages by its amounts of negative tweets
     */
    public void createRankNegative() {
        int cont_neg = 0;
        ListSETL aux = first;
        String lang = "";
        int contNegTop = 0;
        while (aux != null) {
            if (aux.getContNeg() > contNegTop) {
                contNegTop = aux.getContNeg();
                lang = aux.getLanguage();
            }
            aux = aux.getNext();
        }
        int contRank = 1;
        cont_neg = 0;
        while (contRank <= 15) {
            if (contRank == 1){
                System.out.println("Ranking of languages by negative tweets: ");
                System.out.println(contRank + ". " + lang + " " + contNegTop);
                contRank++;
            }
            aux = first;
            while (aux != null) {
                if (aux.getContNeg() < contNegTop && aux.getContNeg() > cont_neg) {
                    cont_neg = aux.getContNeg();
                    lang = aux.getLanguage();

                }
                aux = aux.getNext();
            }
            contNegTop = cont_neg;
            cont_neg = 0;
            System.out.println(contRank + ". " + lang + " " + contNegTop);
            contRank++;
            aux = first;
        }
    }
}
