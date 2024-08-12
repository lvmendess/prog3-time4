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
}
