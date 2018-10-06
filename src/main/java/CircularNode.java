public class CircularNode<E> {
    private CircularNode<E> previousNode;
    private CircularNode<E> nextNode;
    private E elem;

    CircularNode() {

    }

    CircularNode(E element, CircularNode<E> prev, CircularNode<E> next) {
        this.previousNode = prev;
        this.nextNode = next;
        this.elem=element;
    }

    public E getDataElement() {
        return elem;
    }

    public CircularNode<E> getPreviousNode() {
        return this.previousNode;
    }

    public void setPreviousNode(CircularNode<E> previousNode) {
        this.previousNode = previousNode;
    }

    public CircularNode<E> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(CircularNode<E> nextNode) {
        this.nextNode = nextNode;
    }

    public E getElement() {
        return this.elem;
    }

    public void setElement(E element) {
        this.elem = element;
    }
}