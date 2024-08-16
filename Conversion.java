/**
 *  Conversion  converts and assembles the expression in addition to calculating the result of the expression
 */
public class Conversion {
    private Stack polonaiseStack;
    private Stack infixStack;
    private Tools tool;
    private Operator operator;
    private Queue queue;

    public Conversion(){
        polonaiseStack = new Stack();
        infixStack = new Stack();
        tool=new Tools();
        queue= new Queue();
        operator=null;
    }

    /**
     * This method splits each space forming an array of characters
     * @param expression the expression that comes from the scanner of the main class
     * @return character array of the expression
     */
    public String[] split(String expression){
        return expression.split(" ");
    }

    /**
     *This method adds the characters from the array to a stack, differentiating them as Variable or Operator.
     * It also calls other methods so that they can work.
     * @param stackExpression the expression that comes from the scanner of the main class
     * @throws Exception in order to not deal with this error for now
     */

    public void pushStack(String stackExpression) throws Exception{
        String[] arr = split(stackExpression);
        Cell caracter;
        for(String each:arr){
            if(tool.toDouble(each)!=null){
                caracter= new Variable(tool.toDouble(each));
            }else{
                caracter = new Operator(each);
            }
            polonaiseStack.push(caracter);
        }
        createInfixExpression(polonaiseStack.pop());
        infixStackToQueue();
        calculate(arr);
    }

    /**
     *This method is recursive and is responsible for filling another stack with the infix expression.
     * @param n It's an instance of Cell
     * @throws Exception in order to not deal with this error for now
     */
    public void createInfixExpression(Cell n) throws Exception{
        if(n instanceof Variable){
            infixStack.push(n);
        }else{
            infixStack.push(new Operator(")"));
            createInfixExpression(polonaiseStack.pop());
            infixStack.push(n);
            createInfixExpression(polonaiseStack.pop());
            infixStack.push(new Operator("("));
        }
    }

    /**
     * This method converts the infix expression contained in a stack to a queue.
     * @throws Exception in order to not deal with this error for now
     */
    public void infixStackToQueue() throws Exception{
       while(!infixStack.isEmpty()){
           queue.add(infixStack.pop());
       }
    }

    /**
     *This method generates the result of the expression entered the scanner of the main class.
     * @param exp the parameter is the array that comes from the split method call
     * @throws Exception in order to not deal with this error for now
     */
    public void calculate(String[] exp) throws Exception{
        Stack result = new Stack();
        for (String token : exp) {
            Cell x;
            Variable b;
            Variable a;
            double r;
            switch (token) {
                case "+":
                    b = new Variable(((Variable)result.pop()).getVariable());
                    a = new Variable(((Variable)result.pop()).getVariable());
                    r = b.getVariable()+a.getVariable();
                    x = new Variable(r);
                    result.push(x);
                    break;
                case "-":
                    b = new Variable(((Variable)result.pop()).getVariable());
                    a = new Variable(((Variable)result.pop()).getVariable());
                    r = a.getVariable()-b.getVariable();
                    x = new Variable(r);
                    result.push(x);
                    break;
                case "*":
                    b = new Variable(((Variable)result.pop()).getVariable());
                    a = new Variable(((Variable)result.pop()).getVariable());
                    r = b.getVariable()*a.getVariable();
                    x = new Variable(r);
                    result.push(x);
                    break;
                case "/":
                    b = new Variable(((Variable)result.pop()).getVariable());
                    a = new Variable(((Variable)result.pop()).getVariable());
                    r = a.getVariable()/b.getVariable();
                    x = new Variable(r);
                    result.push(x);
                    break;
                default:
                    x = new Variable(Double.parseDouble(token));
                    result.push(x);
                    break;
            }
        }
        queue.add(new Operator("="));
        queue.add(new Variable(((Variable)result.pop()).getVariable()));
    }

    /**
     * This method is called by the main class to show the queue containing the expression in conventional notation and its result.
     */
    public void print(){
        queue.print();
    }
}
