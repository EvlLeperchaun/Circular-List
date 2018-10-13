import java.util.Iterator;

public class EntryPoint {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.add(1,1);
        //System.out.println(list.getSize());
        list.add(2,2);
        //System.out.println(list.getSize());
        list.add(3,3);
        //System.out.println(list.getSize());
        list.add(3,4);
        System.out.println("position 3");
        System.out.println(list.get(3));
        System.out.println("first");
        System.out.println(list.getFirstNode().getDataElement());
        System.out.println("last");
        System.out.println(list.getLastNode().getDataElement());
        //System.out.println(list.getSize());
    }
}
