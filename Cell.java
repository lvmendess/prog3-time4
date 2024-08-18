/**
 * Abstract class in which other classes will inherit the present methods
 */
public abstract class Cell {

    protected Cell next;

    /**
     * Method that will get the next element
     * @return the next element
     */
    public  Cell getNext(){
        return this.next;
    };

    /**
     * Method that will set the next element
     * @param next parameter that will be set as next
     */
    public  void setNext(Cell next){
        this.next=next;
    }

    

}