package Basics1;
/**
 * Created ...

 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2 + 2;
        assertEquals("2+2=4",4,answer);

    }

    @Test
    public  void integerExploration(){
        /**
         * Because integer is a class, this is called instantiating a class and the variable is an object
         */
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());

        Integer six = 6;
        assertEquals("Assigned number is 6",6, six.intValue());

        assertTrue(four.equals(five)); //This should fail has it is not true
    }

    @Test
    /**
     * EXERCISE: Convert an int to Hex:
     * Write an @Test annotated method which uses toHexString and asserts:
     * that 11 becomes b
     * that 10 becomes a
     * that 3 becomes 3
     * that 21 becomes 15
     */
    public void canConvertToHex(){
        assertEquals("Hex 11 is b","b",Integer.toHexString(11));
        assertEquals("Hex 10 is a","a",Integer.toHexString(10));

    }

    @Test
    /**
     * Exercise: Confirm MAX and MIN Integer
     * sizes:
     * Write an @Test annotated method to assert that:
     * • Integer.MIN_VALUE equals -2147483648
     * • Integer.MAX_VALUE equals 2147483647
     */
    public void MaxAndMin(){
        int minimumInt = -2147483648;
        int maximumInt = 2147483647;

        assertEquals("integer min", minimumInt, Integer.MIN_VALUE);
        assertEquals("integer max", maximumInt, Integer.MAX_VALUE);

    }

    //Working with Our own classes


}
