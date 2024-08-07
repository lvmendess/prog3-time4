public class Conversion {
    private Stack stack;
    private Tools tool;
    private Operator operator;
    private Queue queue;

    public Conversion(){
        stack = new Stack();
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
            stack.push(caracter);
        }
        createInfixExpression(stack.pop());
    }


    public Cell createInfixExpression(Cell n) throws Exception{
        Cell number;
//        if(stack.isEmpty()){
//            return number;
//        }
        if(n instanceof Variable){
            return n;
        }else{
            operator= (Operator)n;
            queue.add(new Operator("("));
            number= createInfixExpression(stack.pop());
            queue.add(((Variable)number));
            queue.add(operator);
            number= createInfixExpression(stack.pop());
            queue.add(((Variable)number));
            queue.add(new Operator(")"));
        }
        return createInfixExpression(stack.pop());

    }
    public void printStack() throws Exception{
        stack.print();
        queue.print();
    }
}
