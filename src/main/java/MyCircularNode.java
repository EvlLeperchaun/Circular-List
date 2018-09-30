public class MyCircularNode<E> extends java.lang.Object {
    private MyCircularNode<E> previousNode;
    private MyCircularNode<E> nextNode;
    private E element;

    MyCircularNode() {
    }

    MyCircularNode(E elem, MyCircularNode<E> prev, MyCircularNode<E> next) {
    }

    public MyCircularNode<E> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(MyCircularNode<E> previousNode) {
        this.previousNode = previousNode;
    }

    public MyCircularNode<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyCircularNode<E> nextNode) {
        this.nextNode = nextNode;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}