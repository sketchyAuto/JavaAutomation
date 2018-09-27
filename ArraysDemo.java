package BasicsStarter;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args){
        //One way of defining an Array
        int[] myIntArray1;
        myIntArray1 = new int[10];

        myIntArray1[0] = 100;
        myIntArray1[1] = 90;

        System.out.println("0 index is: "+ myIntArray1[0]);
        System.out.println("1st index is: " + myIntArray1[1]);
        System.out.println();


        //Another way to define Array
        String[] myStringArray1 = {"Bmw","Benz","Honda"};
        System.out.println("0 index is: "+ myStringArray1[0]);
        System.out.println("1st index is: " + myStringArray1[1]);
        System.out.println("0 index is: "+ myStringArray1[2]);

        //Find the Length of an Array
        int len1 = myIntArray1.length;
        int len2 = myStringArray1.length;

        System.out.println("Int array length is: "+len1);
        System.out.println("String array length is: "+len2);

        for(int i=0; i< len1; i++){
            System.out.println("The array is "+myIntArray1[i]);
        }
        Arrays.sort(myIntArray1);

    }
}
