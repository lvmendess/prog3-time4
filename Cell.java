
public class Cell {
    Object value;
    Cell next;

    public Cell(Object value){
       this.value = value;
       next = null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

};
