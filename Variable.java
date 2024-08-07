public class Variable extends Cell {
    private double variable;

    public Variable(double variable) {
        this.variable = variable;
    }

    public double getvariable() {
        return variable;
    }
    
    public void setvariable(double variable) {
        this.variable = variable;
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