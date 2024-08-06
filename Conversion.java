public class Conversion {
    private Stack stack;
    
    public Conversion(){
        stack = new Stack();
    }
    
    public String[] split(String expression){ //sanzio 
        String []teste = expression.split(" ");
        return teste;
    }

    private Stack pushStack(String stackString){
        Cell cellForPush = new Cell("");
        while (stackString.length()>0) {
            cellForPush.value = stackString.charAt(stackString.length()-1);
            stack.push(cellForPush);
        }
        return stack;
    }
}
