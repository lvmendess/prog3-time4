public class Stack {
        Cell top;
        int stackElements;
        public Stack(){
            top = null;
            stackElements = 0; 
        }
        public boolean isEmpty( ){
            return (top == null);
        }
        public void push(Cell element){
            element.next = top;
            top = element;
            stackElements++;
        }
        public void pop()throws Exception{
            if(isEmpty( )){
                throw  new Exception("Error: Stack is empty! ");
            }else{
                Cell aux = top;
                top = top.next;
                aux.next = null;
                stackElements--;
            }
        }
        public void emptyStack( ){
            top = null;
        }
        public void print() throws Exception{
            if(isEmpty( ))
                throw  new Exception("Error: Stack is empty! ");
            else{
                Cell aux = top;
                while(aux != null){
                    System.out.println("Element = "+aux.value);
                    aux = aux.next;
                }
            }
        }
    

}
