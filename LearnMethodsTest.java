package LearnzAndHomez;

import LearnzAndHomez.LearnMethods;

public class LearnMethodsTest {
    public static void main(String[] args){
        /*Methods don't do anything until you call them into action
        Any variable set up inside of a method can't be accessed outside of that method.
        It's known as a local variable - it's local to the method.
         */

        LearnMethods test = new LearnMethods();
        int aTotal = test.total(15);
        System.out.println(aTotal);

        test.printText("James");

        int a_Value = test.total();
        System.out.println(a_Value);

        int aTotal2 = test.total(30);
        System.out.println("Method results= "+aTotal2);

        test.printText("James",90);

    }
}
