import java.util.Arrays;

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
    
    public String[] split(String expression){ //sanzio 
        return expression.split(" ");
    }

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
        double result = calculate(arr);
        Cell op = new Operator("=");
        queue.add(op);
        Cell res = new Variable(result);
        queue.add(res);
    }


    public void createInfixExpression(Cell n) throws Exception{
        if(n instanceof Variable){
            infixStack.push(n);
        }else{
            infixStack.push(new Operator(")")); //inverti logica operadores
            createInfixExpression(polonaiseStack.pop());
            infixStack.push(n);
            createInfixExpression(polonaiseStack.pop());
            infixStack.push(new Operator("("));  //inverti logica operadores
        }
    }
    public void infixStackToQueue() throws Exception{
       while(!infixStack.isEmpty()){
           queue.add(infixStack.pop());
       }
    }

    public void print() throws Exception {
        queue.print();
    }

    public double calculate(String[] exp) throws Exception{
        Stack result = new Stack();
        for (String token : exp) {
            Cell x;
            Variable y;
            Variable z;
            double r;
            switch (token) {
                case "+":
                    y = new Variable(((Variable)result.pop()).getVariable());
                    z = new Variable(((Variable)result.pop()).getVariable());
                    r = y.getVariable()+z.getVariable();
                    x = new Variable(r);
                    result.push(x);
                    break;
                case "-":
                    y = new Variable(((Variable)result.pop()).getVariable());
                    z = new Variable(((Variable)result.pop()).getVariable());
                    r = z.getVariable()-y.getVariable();
                    x = new Variable(r);
                    result.push(x);
                    break;
                case "*":
                    y = new Variable(((Variable)result.pop()).getVariable());
                    z = new Variable(((Variable)result.pop()).getVariable());
                    r = y.getVariable()*z.getVariable();
                    x = new Variable(r);
                    result.push(x);
                    break;
                case "/":
                    y = new Variable(((Variable)result.pop()).getVariable());
                    z = new Variable(((Variable)result.pop()).getVariable());
                    r = z.getVariable()/y.getVariable();
                    x = new Variable(r);
                    result.push(x);
                    break;
                default:
                    x = new Variable(Double.parseDouble(token));
                    result.push(x);
                    break;
            }
        }
        Variable y = new Variable(((Variable)result.pop()).getVariable());
        return y.getVariable();
    }
}
