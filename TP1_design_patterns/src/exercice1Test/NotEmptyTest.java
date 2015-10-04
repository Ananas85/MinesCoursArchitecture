package exercice1Test;

import exercice1.List;
import exercice1.NotEmpty;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class NotEmptyTest {

    @Test
    public void testIsEmpty() throws Exception {
        NotEmpty notEmpty = new NotEmpty<Integer>(8);
        assertEquals(false, notEmpty.isEmpty());
    }

    @Test
    public void testLength() throws Exception {
        NotEmpty notEmpty = new NotEmpty<Integer>(5);
        assertEquals(notEmpty.length(), 1);
    }

    @Test
    public void testPutLast() throws Exception {
        List notEmpty = new NotEmpty<Integer>(6).putLast(7).putLast(8).putLast(9);

        ArrayList testNotEmpty = new ArrayList<Integer>();
        testNotEmpty.add(6);
        testNotEmpty.add(7);
        testNotEmpty.add(8);
        testNotEmpty.add(9);
        assertEquals(notEmpty.toArrayList(), testNotEmpty);
        List reversedEmptyList = notEmpty.reverse();
        Collections.reverse(testNotEmpty);
        assertEquals(reversedEmptyList.toArrayList(), testNotEmpty);
    }

    @Test
    public void testReverse() throws Exception {

    }
}