

public class MyCircularList<E> {
    private int size;
    private MyCircularNode<E> elem;
    private MyCircularNode<E> firstNode;
    private MyCircularNode<E> lastNode;

    MyCircularList() {

    }

    MyCircularList(E element) {
        this.size = 1;
        MyCircularNode<E> first = new MyCircularNode<E>(element);
        this.setFirstNode(first);
    }

    public void add(int index, E element) {

    }

    @Override
    public int size() {
        return size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public E getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(MyCircularNode<E> firstNode) {
        this.firstNode = firstNode;
    }

    public E getLastNode() {
        return lastNode;
    }

    public void setLastNode(MyCircularNode<E> lastNode) {
        this.lastNode = lastNode;
    }

    class CircularIterator<E> {
        private MyCircularNode<E> nextNode;
        private MyCircularNode<E> previousNode;
        private int index;
        CircularIterator() {

        }
        CircularIterator(int index){

    }
    class CircularListIterator<E>{
        private MyCircularNode<E> nextNode;
        private MyCircularNode<E> previousNode;
        private int nextIndex;

        CircularListIterator(){
        }

            public E next(){

            }
        }
    }

}