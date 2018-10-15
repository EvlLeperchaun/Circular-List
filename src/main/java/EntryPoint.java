import java.util.Iterator;

public class EntryPoint {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.add(1,"a");
        //System.out.println(list.getSize());
        list.add(2,"b");
        //System.out.println(list.getSize());
        list.add(3,"c");
        //System.out.println(list.getSize());
        list.add(2,"d");
/*
        for (int i =1; i<list.getSize();i++){
            System.out.println(list.get(i));
        }*/

        System.out.println("position 1");
        System.out.println(list.get(1));
        System.out.println("position 4");
        System.out.println(list.get(4));
        /*System.out.println("first");
        System.out.println(list.getFirstNode().getDataElement());
        System.out.println("last");
        System.out.println(list.getLastNode().getDataElement());
        */
        //System.out.println(list.getSize());

    }
}
