import java.util.Iterator;

public class MyCircularList<E> {
    protected int size;
    private E elem;
    private MyCircularNode<E> firstNode;
    private MyCircularNode<E> lastNode;

    MyCircularList() {
        this.size = 0;
    }

    public void add(int index, E element) {
        if (this.size == 0) {
            this.firstNode = new MyCircularNode<E>(element, this.firstNode, this.lastNode);
            this.lastNode = new MyCircularNode<E>(element, this.firstNode, this.lastNode);
            this.size++;
        } else if (index == this.size + 1) {
            MyCircularNode<E> newNode = new MyCircularNode<E>(element, this.lastNode.getPreviousNode(), this.firstNode);
            this.lastNode.setNextNode(newNode);
            this.lastNode = newNode;
        }
    }

    public E get(int index) {
        int j =0;
        Iterator<E> i = this.iterator(index);
        while (j !=index){
            return i.next();
            j++;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyCircularNode<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(MyCircularNode<E> first) {
        this.firstNode = first;
    }

    public MyCircularNode<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(MyCircularNode<E> lastNode) {
        MyCircularNode<E> last = new MyCircularNode<E>(lastNode);
        this.lastNode = last;
    }

    public Iterator<E> iterator(int i,MyCircularList<E> l) {
        return new CircularListIterator(i);
    }

    class CircularListIterator implements Iterator<E> {
        private MyCircularNode<E> nextNode;
        private MyCircularNode<E> previousNode;
        private MyCircularList<E> circ;
        private int nextIndex;

        CircularListIterator(int index,MyCircularList<E> l) {
            this.nextIndex = index;
            this.circ=l;

        }

        public boolean hasNext() {
            return true;
        }

        public E next() {
            int i=1;
            if (i==this.nextIndex) {
                return nextNode.getElement();
            }else{
                i++;
                return this.nextNode.getDataElement();
            }
        }

        public int nextIndex(){
            return this.nextIndex;
        }

        public int previousIndex(){
           return this.nextIndex-1;
        }

        public void remove() {

        }
    }

}