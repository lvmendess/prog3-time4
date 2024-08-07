public class Stack {
        private Cell top;
        private int stackElements;
        
        public Stack(){
            top = null;
            stackElements = 0; 
        }

        public Cell getTop() {
            return top;
        }

        public void setTop(Cell top) {
            this.top = top;
        }

        public int getStackElements() {
            return stackElements;
        }

        public void setStackElements(int stackElements) {
            this.stackElements = stackElements;
        }

        public boolean isEmpty(){
            return (top == null);
        }

        public void push(Cell element){
            element.setNext(top);
            top = element;
            stackElements++;
        }

        public void pop() throws Exception{
            if(isEmpty( )){
                throw  new Exception("Error: Stack is empty! ");
            }else{
                Cell aux = top;
                top = top.getNext();
                aux.setNext(null);
                stackElements--;
            }
        }

        public void emptyStack( ){
            top = null;
        }

        public void print() throws Exception{
            if(isEmpty())
                throw  new Exception("Error: Stack is empty! ");
            else{
                Cell aux = top;
                while(aux != null){
                    System.out.println("Element = "+aux.getValue());
                    aux = aux.getNext();
                }
            }
        }
    

}
