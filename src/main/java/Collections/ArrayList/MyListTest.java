package Collections.ArrayList;

import static org.junit.Assert.assertEquals;

public class MyListTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {
        int element = 5;
        MyList list = new MyList();
        list.add(element);
        assertEquals(1, list.size());
    }

    @org.junit.Test
    public void size() {
    }

    @org.junit.Test
    public void get() {
    }

    @org.junit.Test
    public void remove() {
    }

    @org.junit.Test
    public void contains() {
    }

    @org.junit.Test
    public void getIndex() {
    }
}