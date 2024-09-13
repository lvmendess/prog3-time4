public class Word {
    String value;
    Word left,right;
    ListaSEL wordLines;
    public Word(String value, int lineNum) {
        this.value = value;
        wordLines=new ListaSEL();
        addLineAtList(lineNum);
    }

    public void addLineAtList(int line){
        Lines l= new Lines(line);
        wordLines.insert(l);
    }
}
