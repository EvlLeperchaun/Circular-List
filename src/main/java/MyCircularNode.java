public class MyCircularNode<E> {
    private MyCircularNode<E> previousNode;
    private MyCircularNode<E> nextNode;
    private E elem;
    private int index;

    MyCircularNode() {
    }
    MyCircularNode(E element){
        this.elem=element;
        this.index=1;
    }

    MyCircularNode(E elem, MyCircularNode<E> prev, MyCircularNode<E> next) {
        this.previousNode=prev;
        this.nextNode=next;
        this.previousNode=prev;
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