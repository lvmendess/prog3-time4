public class Stack {
        private Cell top;

        public Stack(){
            top = null;
        }

        public boolean isEmpty(){
            return (top == null);
        }

        public void push(Cell element){
            element.setNext(top);
            top = element;

        }

        public Cell pop() throws Exception{
            if(isEmpty( )){
                throw new Exception("Error: Stack is empty! ");
            }else{
                Cell aux = top;
                top = top.getNext();
                aux.setNext(null);
                return aux;
            }
        }

    

}