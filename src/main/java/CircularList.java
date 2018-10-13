import java.util.Iterator;
import java.util.ListIterator;

public class CircularList<E> extends java.util.AbstractSequentialList<E> {
    private int size;
    private E elem;
    private CircularNode<E> firstNode;
    private CircularNode<E> lastNode;

    CircularList() {
        this.size = 0;
        this.firstNode = new CircularNode<E>();
        this.lastNode = new CircularNode<E>();
        this.firstNode.setNextNode(this.lastNode);
        this.lastNode.setNextNode(this.firstNode);
        this.firstNode.setPreviousNode(this.lastNode);
        this.lastNode.setPreviousNode(this.firstNode);
    }

    public void add(int index, E element) {
        if (this.size == 0) {
            this.firstNode.setElement(element);
            this.lastNode.setElement(element);
            this.firstNode.setNextNode(this.lastNode);
            this.lastNode.setNextNode(this.firstNode);
            /*
            System.out.println("first");
            System.out.println(this.firstNode.getDataElement());
            System.out.println("last");
            System.out.println(this.lastNode.getDataElement());
            */

        } else if (index == this.size + 1) {
            CircularNode<E> temp = this.lastNode;
            CircularNode<E> newNode = new CircularNode<E>(element, this.lastNode, this.firstNode);
            temp.setPreviousNode(newNode);
            this.lastNode = newNode;
            this.lastNode.setPreviousNode(temp);
            /*
            System.out.println("first");
            System.out.println(this.firstNode.getDataElement());
            System.out.println("last");
            System.out.println(this.lastNode.getDataElement());
            */

        } else if (index > 0) {
            int i = 0;
            CircularListIterator iter = this.iterator(index);
            while (i < index) {
                E e = iter.next();
                i++;
            }
            CircularNode<E> newNode = new CircularNode<E>(element, iter.previousNode, iter.nextNode);
/*
            System.out.println("previous");
            System.out.println(iter.previousNode.getDataElement());
            System.out.println("next");
            System.out.println(iter.nextNode.getDataElement());
*/
            iter.nextNode.setPreviousNode(newNode);
            iter.previousNode.setNextNode(newNode);

        }
        this.size++;
    }

    public E get(int index) {
        int i = 0;
        E e = null;
        CircularListIterator iter = this.iterator();
        while (i < index) {
            e = iter.next();
            i++;
        }
        return e;
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

    public CircularList.CircularListIterator iterator(int index) {
        return new CircularListIterator(index);
    }

    public int size() {
        return 0;
    }

    public CircularList.CircularListIterator listIterator(int index) {
        return new CircularListIterator(index);
    }


    private class CircularListIterator implements ListIterator<E> {
        private CircularNode<E> nextNode;
        private CircularNode<E> previousNode;
        private int nextIndex;

        CircularListIterator(int index) {
            CircularNode<E> n = firstNode;
            for (int i = 1; i < index; i++) {
                n = n.getNextNode();
            }
            this.nextNode = n.getNextNode();
            this.previousNode = n;
            this.nextIndex = index;
        }

        public boolean hasNext() {
            return true;
        }

        public E next() {
            return this.nextNode.getDataElement();
        }

        public boolean hasPrevious() {
            return false;
        }

        public E previous() {
            return null;
        }

        public int nextIndex() {
            return this.nextIndex;
        }

        public int previousIndex() {
            return this.nextIndex - 1;
        }

        public void remove() {

        }

        public void set(E e) {

        }

        public void add(E e) {

        }
    }

}
