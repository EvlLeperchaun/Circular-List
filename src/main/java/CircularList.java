import java.util.Iterator;
import java.util.ListIterator;

public class CircularList<E> extends java.util.AbstractSequentialList<E> {
    private int size;
    private E elem;
    private CircularNode<E> firstNode;
    private CircularNode<E> lastNode;

    CircularList() {
        this.size = 0;
    }

    public void add(int index, E element) {
        if (this.size == 0) {
            this.firstNode = new CircularNode<E>(element, this.firstNode, this.lastNode);
            this.lastNode = new CircularNode<E>(element, this.firstNode, this.lastNode);
            this.size++;
        } else if (index == this.size + 1) {
            CircularNode<E> newNode = new CircularNode<E>(element, this.lastNode.getPreviousNode(), this.firstNode);
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

    public CircularNode<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(CircularNode<E> first) {
        this.firstNode = first;
    }

    public CircularNode<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(CircularNode<E> lastNode) {
        this.lastNode = lastNode;
    }

    public CircularList.CircularListIterator iterator() {
        return new CircularListIterator(1);
    }

    public int size() {
        return 0;
    }

    public CircularList.CircularListIterator listIterator(int index) {
        return new CircularListIterator(index);
    }


    class CircularListIterator implements ListIterator<E> {
        private CircularNode<E> nextNode;
        private CircularNode<E> previousNode;
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

        public boolean hasPrevious() {
            return false;
        }

        public E previous() {
            return null;
        }

        public int nextIndex() {
            return 0;
        }

        public int previousIndex() {
            return 0;
        }

        public void remove() {

        }

        public void set(E e) {

        }

        public void add(E e) {

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
