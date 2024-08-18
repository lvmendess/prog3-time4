/**
 * Variable class that extends from Cell
 */
public class Variable extends Cell {
    private double variable;
    /**
     * The class constructor receives a double as a parameter to set the Variable object
     * @param variable a double that will be the variable
     */
    public Variable(double variable) {
        this.variable = variable;
    }
    /**
     *Method will get and return the variable
     * @return variable
     */
    public double getVariable() {
        return this.variable;
    }
    /**
     * Method will set the variable
     * @param variable parameter that will be set as variable
     */
    public void setVariable(double variable) {
        this.variable = variable;
    }

}