public class Operator extends Cell {
    private String op;

    public Operator(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    @Override
    public Cell getNext() {
        return next;
    }

    @Override
    public void setNext(Cell next) {
        this.next = next;
    }

}
