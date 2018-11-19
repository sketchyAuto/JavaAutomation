package LearnzAndHomez;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearn {
    public static void main(String[] args){

        /*If you don't know how many items are going to be held in your array, you may be better off using something
        called an ArrayList. An ArrayList is a dynamic data structure, meaning items can be added and removed
        from the list.
         */
        ArrayList listTest = new ArrayList();

        //To add elements
        listTest.add("First item");
        listTest.add("second item");
        listTest.add("third item");
        listTest.add(7);
        listTest.add("test item");
        listTest.add("sectech item");
        listTest.add("match item");

        //To access the list
        System.out.println(listTest.get(2));

        //To remove an item
        listTest.remove(2);
        listTest.remove("First item");
        System.out.println(listTest);

        //To go through eact item in the ArrayList, use Iterator.
        //This sets up a new iterator object called it
        //The reason for using an Iterator object is because it has methods called next and hasNext.

        Iterator it = listTest.iterator();

        /*The method hasNext returns a Boolean value. The value will be false if there are no more items in the ArrayList.
        The next method can be used to go through all the items in the list
         */

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
