import java.util.Iterator;

public class EntryPoint {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.add(1,1);
        list.add(2,2);
        list.add(3,3);
        list.add(2,4);
        System.out.println(list.get(2));
    }
}
