public class MyCircularNode<E> {
    private MyCircularNode<E> previousNode;
    private MyCircularNode<E> nextNode;
    private E elem;

    MyCircularNode() {

    }

    MyCircularNode(E element, MyCircularNode<E> prev, MyCircularNode<E> next) {
        this.previousNode = prev;
        this.nextNode = next;
        this.elem=element;
    }

    public E getDataElement() {
        return elem;
    }

    public MyCircularNode<E> getPreviousNode() {
        return this.previousNode;
    }

    public void setPreviousNode(MyCircularNode<E> previousNode) {
        this.previousNode = previousNode;
    }

    public MyCircularNode<E> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(MyCircularNode<E> nextNode) {
        this.nextNode = nextNode;
    }

    public E getElement() {
        return this.elem;
    }

    public void setElement(E element) {
        this.elem = element;
    }
}