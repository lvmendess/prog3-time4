/**
 * Operator class that extends from Cell
 */
public class Operator extends Cell {
    private String op;

    /**
     * The class constructor receives a string parameter to set the Operator object
     * @param op a string that will be the operator
     */
    public Operator(String op) {
        this.op = op;
    }

    /**
     *Method will get and return the operator
     * @return operator
     */
    public String getOp() {
        return op;
    }

    /**
     * Method will set the operator
     * @param op parameter that will be set as operator
     */
    public void setOp(String op) {
        this.op = op;
    }

}
