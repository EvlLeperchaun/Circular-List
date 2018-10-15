import org.junit.Test;

import static org.junit.Assert.*;

public class CircularListTest<E> {
    @Test
    public void addElement() {
        CircularList list = new CircularList();
        int test=1;
        list.add(1,test);
        assertEquals(test, list.get(1));
    }

    @Test
    public void addMultipleElements(){
        CircularList list = new CircularList();
        list.add(1,"a");
        list.add(2,"b");
        list.add(3,"c");
        list.add(2, "d");

        assertEquals(4,list.getSize());
        assertEquals("b",list.get(2));
        assertEquals("c",list.get(3));
        assertEquals("c",list.getLastNode());

    }

}