public class Conversion {
    private Stack stack;
    
    public Conversion(){
        stack = new Stack();
    }
    
    public String[] split(String expression){ //sanzio 
        String []teste = expression.split(" ");
        return teste;
    }

    public Stack pushStack(String stackString){
        String[] arr = split(stackString);
        for(int i = 0; i<arr.length; i++){
            Cell cellForPush = new Cell(arr[i]);
            stack.push(cellForPush);
            System.out.println(cellForPush.getValue());
        }
        /*while (stackString.length()>0) {
            cellForPush.setValue(stackString.charAt(stackString.length()-1));
            stack.push(cellForPush);
        }*/
        return stack;
    }

    public void printStack() throws Exception{
        stack.print();
    }
}
