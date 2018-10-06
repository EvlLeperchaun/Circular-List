import java.util.AbstractSequentialList;
import java.util.Iterator;

public class MyCircularList<E> extends java.util.AbstractSequentialList<E> {
    private int size;
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
        int j = 0;
        Iterator<E> i = this.iterator(index);
        while (j != index) {
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
        this.lastNode = lastNode;
    }

    public MyCircularList.CircularListIterator<E> iterator() {
        return new CircularListIterator();
    }

    public int size() {
        return 0;
    }

    public MyCircularList.CircularListIterator<E> listIterator(int index) {
        return new CircularListIterator();
    }


    class CircularListIterator implements Iterator<E> {
        private MyCircularNode<E> nextNode;
        private MyCircularNode<E> previousNode;
        private int nextIndex;

        CircularListIterator(int index) {
            this.nextIndex = index;
        }

        public boolean hasNext() {
            return true;
        }

        public E next() {
            return firstNode.getDataElement();
        }

        public void remove() {

        }
    }

    public int nextIndex() {
        return this.nextIndex;
    }

    public int previousIndex() {
        return this.nextIndex - 1;
    }

    public void remove() {

    }
}
