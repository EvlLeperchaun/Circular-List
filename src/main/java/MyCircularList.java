import java.util.ListIterator;

public class MyCircularList<E> extends java.util.AbstractSequentialList<E> {
    private int size;
    private MyCircularList<E> firstNode;
    private MyCircularList<E> lastNode;

    MyCircularList(){

    }
    public void add(int index, E element){

    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return super.listIterator();
    }

    @Override
    public int size() {
        return 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyCircularList<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(MyCircularList<E> firstNode) {
        this.firstNode = firstNode;
    }

    public MyCircularList<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(MyCircularList<E> lastNode) {
        this.lastNode = lastNode;
    }


    class CircularIterator<E>{

}
}